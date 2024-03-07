package com.pan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pan.domain.po.FileInfo;
import com.pan.service.FileInfoService;
import com.pan.mapper.FileInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author Admin
* @description 针对表【file_info(文件信息)】的数据库操作Service实现
* @createDate 2024-03-07 19:12:21
*/
@Service
public class FileInfoServiceImpl extends ServiceImpl<FileInfoMapper, FileInfo>
    implements FileInfoService{

}




