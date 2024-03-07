package com.pan.domain.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SessionWebUserDto {

    @ApiModelProperty(value = "昵称")
    private String nickName;

    @ApiModelProperty(value ="用户ID")
    private String userId;

    @ApiModelProperty(value = "是否为管理员")
    private Boolean isAdmin;

    @ApiModelProperty(value = "头像")
    private String avatar;


}
