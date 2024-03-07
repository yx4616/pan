package com.pan.domain.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SessionShareDto {
    private String shareUserId;

    @ApiModelProperty(value = "分享ID")
    @TableId(value = "share_id")
    private String shareId;

    @ApiModelProperty(value = "用户ID")
    @TableField(value = "user_id")
    private String userId;

    @ApiModelProperty(value = "失效时间")
    @TableField(value = "expire_time")
    private LocalDateTime expireTime;

    @ApiModelProperty(value = "文件ID")
    @TableField(value = "file_id")
    private String fileId;
}
