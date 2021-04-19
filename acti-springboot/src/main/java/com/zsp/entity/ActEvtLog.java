package com.zsp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.sql.Blob;
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
public class ActEvtLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "LOG_NR_", type = IdType.AUTO)
    private Long logNr;

    @TableField("TYPE_")
    private String type;

    @TableField("PROC_DEF_ID_")
    private String procDefId;

    @TableField("PROC_INST_ID_")
    private String procInstId;

    @TableField("EXECUTION_ID_")
    private String executionId;

    @TableField("TASK_ID_")
    private String taskId;

    @TableField("TIME_STAMP_")
    private Date timeStamp;

    @TableField("USER_ID_")
    private String userId;

    @TableField("DATA_")
    private Blob data;

    @TableField("LOCK_OWNER_")
    private String lockOwner;

    @TableField("LOCK_TIME_")
    private Date lockTime;

    @TableField("IS_PROCESSED_")
    private Integer isProcessed;


}
