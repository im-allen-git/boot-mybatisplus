package com.akersjiang.bootcommon.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * buyforme保存购物车
 * </p>
 *
 * @author akers.jiang
 * @since 2021-07-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="BuyformeCar对象", description="buyforme保存购物车")
public class BuyformeCar implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer userId;

    private String sessionId;

    @ApiModelProperty(value = "类型 1aliexpress, 2 taobao")
    private Integer type;

    private String pid;

    private Integer totalNum;

    private BigDecimal totalPrice;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;


}
