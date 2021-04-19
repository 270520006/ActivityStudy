package com.zsp.entity;

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
public class ActHiComment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
    private String id;

    @TableField("TYPE_")
    private String type;

    @TableField("TIME_")
    private Date time;

    @TableField("USER_ID_")
    private String userId;

    @TableField("TASK_ID_")
    private String taskId;

    @TableField("PROC_INST_ID_")
    private String procInstId;

    @TableField("ACTION_")
    private String action;

    @TableField("MESSAGE_")
    private String message;

    @TableField("FULL_MSG_")
    private Blob fullMsg;


}
