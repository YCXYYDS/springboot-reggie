package com.ycx.reggie.dto;

import com.ycx.reggie.entity.Setmeal;
import com.ycx.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
