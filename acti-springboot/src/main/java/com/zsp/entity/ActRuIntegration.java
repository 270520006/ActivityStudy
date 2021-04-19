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
public class ActRuIntegration implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
    private String id;

    @TableField("EXECUTION_ID_")
    private String executionId;

    @TableField("PROCESS_INSTANCE_ID_")
    private String processInstanceId;

    @TableField("PROC_DEF_ID_")
    private String procDefId;

    @TableField("FLOW_NODE_ID_")
    private String flowNodeId;

    @TableField("CREATED_DATE_")
    private Date createdDate;


}
