package com.pan.domain.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 文件信息
 *
 */
@TableName(value = "file_info")
@Data
public class FileInfo implements Serializable {
    @ApiModelProperty(value = "文件ID")
    @TableId(value = "file_id")
    private String fileId;

    @ApiModelProperty(value = "用户ID")
    @TableField(value = "user_id")
    private String userId;

    @ApiModelProperty(value = "md5值，第一次上传记录")
    @TableField(value = "file_md5")
    private String fileMd5;

    @ApiModelProperty(value = "父级ID")
    @TableField(value = "file_pid")
    private String filePid;

    @ApiModelProperty(value = "文件大小")
    @TableField(value = "file_size")
    private Long fileSize;

    @ApiModelProperty(value = "文件名称")
    @TableField(value = "file_name")
    private String fileName;

    @ApiModelProperty(value = "封面")
    @TableField(value = "file_cover")
    private String fileCover;

    @ApiModelProperty(value = "文件路径")
    @TableField(value = "file_path")
    private String filePath;

    @ApiModelProperty(value = "创建时间")
    @TableField(value = "create_time")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "最后更新时间")
    @TableField(value = "last_update_time")
    private LocalDateTime lastUpdateTime;

    @ApiModelProperty(value = " 0:文件 1:目录")
    @TableField(value = "folder_type")
    private Integer folderType;

    @ApiModelProperty(value = "1:视频 2:音频  3:图片 4:文档 5:其他")
    @TableField(value = "file_category")
    private Integer fileCategory;

    @ApiModelProperty(value = "1:视频 2:音频  3:图片 4:pdf 5:doc 6:excel 7:txt 8:code 9:zip 10:其他")
    @TableField(value = "file_type")
    private Integer fileType;

    @ApiModelProperty(value = " 0:转码中 1转码失败 2:转码成功")
    @TableField(value = "status")
    private Integer status;

    @ApiModelProperty(value = "回收站时间")
    @TableField(value = "recovery_time")
    private LocalDateTime recoveryTime;

    @ApiModelProperty(value = " 删除标记 0:删除  1:回收站  2:正常")
    @TableField(value = "del_flag")
    private Integer delFlag;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
