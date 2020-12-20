package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Fire
 * @email Fire@qq.com
 * @date 2020-12-17 14:44:37
 */
@Mapper
public interface CategoryMapper extends BaseMapper<CategoryEntity> {
	
}
