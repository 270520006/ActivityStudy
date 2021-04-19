package com.zsp.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author zsp
 * @since 2021-04-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ActHiAttachment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
    private String id;

    @TableField("REV_")
    private Integer rev;

    @TableField("USER_ID_")
    private String userId;

    @TableField("NAME_")
    private String name;

    @TableField("DESCRIPTION_")
    private String description;

    @TableField("TYPE_")
    private String type;

    @TableField("TASK_ID_")
    private String taskId;

    @TableField("PROC_INST_ID_")
    private String procInstId;

    @TableField("URL_")
    private String url;

    @TableField("CONTENT_ID_")
    private String contentId;

    @TableField("TIME_")
    private Date time;


}
