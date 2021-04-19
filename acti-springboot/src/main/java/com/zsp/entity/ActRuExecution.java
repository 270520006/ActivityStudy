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
public class ActRuExecution implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
    private String id;

    @TableField("REV_")
    private Integer rev;

    @TableField("PROC_INST_ID_")
    private String procInstId;

    @TableField("BUSINESS_KEY_")
    private String businessKey;

    @TableField("PARENT_ID_")
    private String parentId;

    @TableField("PROC_DEF_ID_")
    private String procDefId;

    @TableField("SUPER_EXEC_")
    private String superExec;

    @TableField("ROOT_PROC_INST_ID_")
    private String rootProcInstId;

    @TableField("ACT_ID_")
    private String actId;

    @TableField("IS_ACTIVE_")
    private Integer isActive;

    @TableField("IS_CONCURRENT_")
    private Integer isConcurrent;

    @TableField("IS_SCOPE_")
    private Integer isScope;

    @TableField("IS_EVENT_SCOPE_")
    private Integer isEventScope;

    @TableField("IS_MI_ROOT_")
    private Integer isMiRoot;

    @TableField("SUSPENSION_STATE_")
    private Integer suspensionState;

    @TableField("CACHED_ENT_STATE_")
    private Integer cachedEntState;

    @TableField("TENANT_ID_")
    private String tenantId;

    @TableField("NAME_")
    private String name;

    @TableField("START_TIME_")
    private Date startTime;

    @TableField("START_USER_ID_")
    private String startUserId;

    @TableField("LOCK_TIME_")
    private Date lockTime;

    @TableField("IS_COUNT_ENABLED_")
    private Integer isCountEnabled;

    @TableField("EVT_SUBSCR_COUNT_")
    private Integer evtSubscrCount;

    @TableField("TASK_COUNT_")
    private Integer taskCount;

    @TableField("JOB_COUNT_")
    private Integer jobCount;

    @TableField("TIMER_JOB_COUNT_")
    private Integer timerJobCount;

    @TableField("SUSP_JOB_COUNT_")
    private Integer suspJobCount;

    @TableField("DEADLETTER_JOB_COUNT_")
    private Integer deadletterJobCount;

    @TableField("VAR_COUNT_")
    private Integer varCount;

    @TableField("ID_LINK_COUNT_")
    private Integer idLinkCount;

    @TableField("APP_VERSION_")
    private Integer appVersion;


}
