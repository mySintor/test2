package com.universe.study.utils;
import tk.mybatis.mapper.common.*;

/**
 * @author Sin
 * @date 2019/4/3/16:59
 */
public interface MyBaseMapper<T> extends BaseMapper<T>, MySqlMapper<T>, IdsMapper<T>, ConditionMapper<T>, ExampleMapper<T> {

}
