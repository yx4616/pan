package com.pan.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 分享信息
 *
 */
@TableName(value = "file_share")
@Data
public class FileShare implements Serializable {
    @ApiModelProperty(value = "分享ID")
    @TableId(value = "share_id")
    private String shareId;

    @ApiModelProperty(value = "文件ID")
    @TableField(value = "file_id")
    private String fileId;

    @ApiModelProperty(value = "用户ID")
    @TableField(value = "user_id")
    private String userId;

    @ApiModelProperty(value = "有效期类型 0:1天 1:7天 2:30天 3:永久有效")
    @TableField(value = "valid_type")
    private Integer validType;

    @ApiModelProperty(value = "失效时间")
    @TableField(value = "expire_time")
    private LocalDateTime expireTime;

    @ApiModelProperty(value = "分享时间")
    @TableField(value = "share_time")
    private LocalDateTime shareTime;

    @ApiModelProperty(value = "提取码")
    @TableField(value = "code")
    private String code;

    @ApiModelProperty(value = "浏览次数")
    @TableField(value = "show_count")
    private Integer showCount;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
