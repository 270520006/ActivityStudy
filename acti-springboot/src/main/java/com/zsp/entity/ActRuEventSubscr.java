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
public class ActRuEventSubscr implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
    private String id;

    @TableField("REV_")
    private Integer rev;

    @TableField("EVENT_TYPE_")
    private String eventType;

    @TableField("EVENT_NAME_")
    private String eventName;

    @TableField("EXECUTION_ID_")
    private String executionId;

    @TableField("PROC_INST_ID_")
    private String procInstId;

    @TableField("ACTIVITY_ID_")
    private String activityId;

    @TableField("CONFIGURATION_")
    private String configuration;

    @TableField("CREATED_")
    private Date created;

    @TableField("PROC_DEF_ID_")
    private String procDefId;

    @TableField("TENANT_ID_")
    private String tenantId;


}
