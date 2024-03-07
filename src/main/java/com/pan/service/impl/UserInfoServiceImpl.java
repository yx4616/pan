package com.pan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pan.domain.po.UserInfo;
import com.pan.service.UserInfoService;
import com.pan.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author Admin
* @description 针对表【user_info(用户信息)】的数据库操作Service实现
* @createDate 2024-03-07 19:12:21
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService{

}




