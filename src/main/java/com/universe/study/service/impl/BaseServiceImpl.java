package com.universe.study.service.impl;

import com.universe.study.service.IBaseService;
import com.universe.study.utils.MyBaseMapper;

import java.util.List;

/**
 * @author Sin
 * @date 2019/4/3/17:09
 */
public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    protected abstract MyBaseMapper<T> getMapper();

    @Override
    public int deleteByPrimaryKey(Object o) {
        return 0;
    }

    @Override
    public int delete(T t) {
        return 0;
    }

    @Override
    public int insert(T t) {
        return 0;
    }

    @Override
    public int insertSelective(T t) {
        return 0;
    }

    @Override
    public boolean existsWithPrimaryKey(Object o) {
        return false;
    }

    @Override
    public List<T> selectAll() {
        return getMapper().selectAll();
    }

    @Override
    public T selectByPrimaryKey(Object o) {
        return null;
    }

    @Override
    public int selectCount(T t) {
        return 0;
    }

    @Override
    public List<T> select(T t) {
        return null;
    }

    @Override
    public T selectOne(T t) {
        return null;
    }

    @Override
    public int updateByPrimaryKey(T t) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(T t) {
        return 0;
    }

    @Override
    public int deleteByCondition(Object o) {
        return 0;
    }

    @Override
    public List<T> selectByCondition(Object o) {
        return null;
    }

    @Override
    public int selectCountByCondition(Object o) {
        return 0;
    }

    @Override
    public int updateByCondition(T t, Object o) {
        return 0;
    }

    @Override
    public int updateByConditionSelective(T t, Object o) {
        return 0;
    }

    @Override
    public int deleteByExample(Object o) {
        return getMapper().deleteByExample(o);
    }

    @Override
    public List<T> selectByExample(Object o) {
        return getMapper().selectByExample(o);
    }

    @Override
    public int selectCountByExample(Object o) {
        return 0;
    }

    @Override
    public T selectOneByExample(Object o) {
        return null;
    }

    @Override
    public int updateByExample(T t, Object o) {
        return 0;
    }

    @Override
    public int updateByExampleSelective(T t, Object o) {
        return 0;
    }

    @Override
    public int deleteByIds(String s) {
        return 0;
    }

    @Override
    public List<T> selectByIds(String s) {
        return null;
    }

    @Override
    public int insertList(List<? extends T> list) {
        return 0;
    }

    @Override
    public int insertUseGeneratedKeys(T t) {
        return 0;
    }
}
