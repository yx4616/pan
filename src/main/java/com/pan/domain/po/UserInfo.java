package com.pan.domain.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 用户信息
 */
@TableName(value ="user_info")
@Data
public class UserInfo implements Serializable {

    @ApiModelProperty(value ="用户ID")
    @TableId(value = "user_id")
    private String userId;

    @ApiModelProperty(value = "昵称")
    @TableField(value = "nick_name")
    private String nickName;

    @ApiModelProperty(value = "邮箱")
    @TableField(value = "email")
    private String email;

    @ApiModelProperty(value = "qqOpenID")
    @TableField(value = "qq_open_id")
    private String qqOpenId;

    @ApiModelProperty(value = "")
    @TableField(value = "password")
    private String password;

    @ApiModelProperty(value = "加入时间")
    @TableField(value = "join_time")
    private LocalDateTime joinTime;

    @ApiModelProperty(value = "最后登录时间")
    @TableField(value = "last_login_time")
    private LocalDateTime lastLoginTime;

    @ApiModelProperty(value = "0:禁用 1:正常")
    @TableField(value = "status")
    private Integer status;

    @ApiModelProperty(value = "使用空间单位byte")
    @TableField(value = "use_space")
    private Long useSpace;

    @ApiModelProperty(value = "总空间")
    @TableField(value = "total_space")
    private Long totalSpace;

    @ApiModelProperty(value = "头像")
    @TableField(value = "avatar")
    private String avatar;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
