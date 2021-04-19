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
public class ActReModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
    private String id;

    @TableField("REV_")
    private Integer rev;

    @TableField("NAME_")
    private String name;

    @TableField("KEY_")
    private String key;

    @TableField("CATEGORY_")
    private String category;

    @TableField("CREATE_TIME_")
    private Date createTime;

    @TableField("LAST_UPDATE_TIME_")
    private Date lastUpdateTime;

    @TableField("VERSION_")
    private Integer version;

    @TableField("META_INFO_")
    private String metaInfo;

    @TableField("DEPLOYMENT_ID_")
    private String deploymentId;

    @TableField("EDITOR_SOURCE_VALUE_ID_")
    private String editorSourceValueId;

    @TableField("EDITOR_SOURCE_EXTRA_VALUE_ID_")
    private String editorSourceExtraValueId;

    @TableField("TENANT_ID_")
    private String tenantId;


}
