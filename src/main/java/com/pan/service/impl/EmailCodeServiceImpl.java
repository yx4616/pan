package com.pan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pan.domain.po.EmailCode;
import com.pan.service.EmailCodeService;
import com.pan.mapper.EmailCodeMapper;
import org.springframework.stereotype.Service;

/**
* @author Admin
* @description 针对表【email_code(邮箱验证码)】的数据库操作Service实现
* @createDate 2024-03-07 19:12:21
*/
@Service
public class EmailCodeServiceImpl extends ServiceImpl<EmailCodeMapper, EmailCode>
    implements EmailCodeService{

}




