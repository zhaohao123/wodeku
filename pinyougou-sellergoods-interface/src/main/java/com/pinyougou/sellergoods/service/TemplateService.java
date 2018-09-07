package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbTypeTemplate;
import entity.PageResult;

/**
 * Created by 89524 on 2018/9/6.
 */
public interface TemplateService {
    /*
    *分页加条查
    * */
    public PageResult search(TbTypeTemplate template, int page, int rows);

    /*
    *新增
    * */
    public void add(TbTypeTemplate template);

    /**
     * 根据ID获取实体
     * @param id
     * @return
     */
    public TbTypeTemplate findOne(Long id);

    /**
     * 修改
     */
    public void update(TbTypeTemplate template);

    /**
     * 批量删除
     * @param ids
     */
    public void delete(Long [] ids);
}
