package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbSpecification;
import entity.PageResult;
import entity.Specification;

import java.util.List;
import java.util.Map;

/**
 * Created by 89524 on 2018/9/5.
 */
public interface SpecificationService {

    /*
    *分页加条查
    * */
    public PageResult search(TbSpecification specification,int page,int rows);

    /**
     * 批量删除
     * @param ids
     */
    public void delete(Long [] ids);

    /**
     * 增加
     */
    public void add(Specification specification);

    /**
     * 根据ID获取实体
     * @param id
     * @return
     */
    public Specification findOne(Long id);

    /**
     * 修改
     */
    public void update(Specification specification);

    /**
     * 品牌下拉框数据
     */
    List<Map> selectOptionList();
}
