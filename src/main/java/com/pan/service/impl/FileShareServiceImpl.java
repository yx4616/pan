package com.pan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pan.domain.po.FileShare;
import com.pan.service.FileShareService;
import com.pan.mapper.FileShareMapper;
import org.springframework.stereotype.Service;

/**
* @author Admin
* @description 针对表【file_share(分享信息)】的数据库操作Service实现
* @createDate 2024-03-07 19:12:21
*/
@Service
public class FileShareServiceImpl extends ServiceImpl<FileShareMapper, FileShare>
    implements FileShareService{

}




