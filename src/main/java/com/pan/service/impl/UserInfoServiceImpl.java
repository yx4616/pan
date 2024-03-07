package com.pan.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pan.component.RedisComponent;
import com.pan.domain.config.AppConfig;
import com.pan.domain.dto.SessionWebUserDto;
import com.pan.domain.dto.UserSpaceDto;
import com.pan.domain.enums.UserStatusEnum;
import com.pan.domain.po.FileInfo;
import com.pan.domain.po.UserInfo;
import com.pan.exception.BusinessException;
import com.pan.mapper.FileInfoMapper;
import com.pan.service.UserInfoService;
import com.pan.mapper.UserInfoMapper;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Admin
 * @description 针对表【user_info(用户信息)】的数据库操作Service实现
 * @createDate 2024-03-07 19:12:21
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {
    @Resource
    private UserInfoMapper userInfoMapper;
    @Resource
    private AppConfig appConfig;
    @Resource
    private FileInfoMapper fileInfoMapper;
    @Resource
    private RedisComponent redisComponent;

    @Override
    public SessionWebUserDto login(String email, String password) {
        UserInfo userInfo = this.userInfoMapper.selectOne(new LambdaQueryWrapper<UserInfo>().eq(UserInfo::getEmail, email));
        if (null == userInfo || !userInfo.getPassword().equals(password)) {
            throw new BusinessException("账号或者密码错误");
        }
        if (UserStatusEnum.DISABLE.getStatus().equals(userInfo.getStatus())) {
            throw new BusinessException("账号已禁用");
        }
        //修改最后登录时间
        userInfo.setLastLoginTime(LocalDateTime.now());

        userInfoMapper.updateById(userInfo);

        SessionWebUserDto sessionWebUserDto = BeanUtil.copyProperties(userInfo, SessionWebUserDto.class);

        sessionWebUserDto.setIsAdmin(ArrayUtils.contains(appConfig.getAdminEmails().split(","), email));

        //用户使用空间
        UserSpaceDto userSpaceDto = BeanUtil.copyProperties(userInfo, UserSpaceDto.class);
        //用户文件
        List<FileInfo> fileInfoList = fileInfoMapper
          .selectList(new LambdaQueryWrapper<FileInfo>()
            .select(FileInfo::getFileSize)
            .eq(FileInfo::getUserId, userInfo.getUserId()));
        //写入使用空间
        userSpaceDto.setUseSpace(fileInfoList.size() == 0 ? 0 : fileInfoList.stream().mapToLong(FileInfo::getFileSize).sum());
        redisComponent.saveUserSpaceUse(userInfo.getUserId(), userSpaceDto);
        return sessionWebUserDto;
    }
}




