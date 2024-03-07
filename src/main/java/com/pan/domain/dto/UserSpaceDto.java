package com.pan.domain.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户空间dto
 *
 * @author yx4616
 * @date 2024/03/07
 */
@Data
public class UserSpaceDto implements Serializable {

    @ApiModelProperty(value = "使用空间单位byte")
    private Long useSpace;

    @ApiModelProperty(value = "总空间")
    private Long totalSpace;
}
