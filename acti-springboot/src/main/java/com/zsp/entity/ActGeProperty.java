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
public class ActGeProperty implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("NAME_")
    private String name;

    @TableField("VALUE_")
    private String value;

    @TableField("REV_")
    private Integer rev;


}
