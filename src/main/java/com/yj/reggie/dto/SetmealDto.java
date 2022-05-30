package com.yj.reggie.dto;


import com.yj.reggie.entity.Setmeal;
import com.yj.reggie.entity.SetmealDish;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.util.List;

@Data
@ApiModel("套餐Dto")
public class SetmealDto extends Setmeal {

    @ApiModelProperty("套餐菜品关系")
    private List<SetmealDish> setmealDishes;

    @ApiModelProperty("分类名称")
    private String categoryName;
}
