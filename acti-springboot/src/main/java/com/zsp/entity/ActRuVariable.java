package com.zsp.entity;

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
public class ActRuVariable implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
    private String id;

    @TableField("REV_")
    private Integer rev;

    @TableField("TYPE_")
    private String type;

    @TableField("NAME_")
    private String name;

    @TableField("EXECUTION_ID_")
    private String executionId;

    @TableField("PROC_INST_ID_")
    private String procInstId;

    @TableField("TASK_ID_")
    private String taskId;

    @TableField("BYTEARRAY_ID_")
    private String bytearrayId;

    @TableField("DOUBLE_")
    private Double double;

    @TableField("LONG_")
    private Long long;

    @TableField("TEXT_")
    private String text;

    @TableField("TEXT2_")
    private String text2;


}
