package com.pan.domain.enums;


import lombok.Getter;

/**
 * 用户状态枚举
 *
 * @author yx4616
 * @date 2024/03/07
 */
@Getter
public enum UserStatusEnum {

    DISABLE(0, "禁用"),
    ENABLE(1, "启用");

    private Integer status;
    private String desc;

    UserStatusEnum(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }

}
