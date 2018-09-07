package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pinyougou.mapper.TbTypeTemplateMapper;
import com.pinyougou.pojo.TbTypeTemplate;
import com.pinyougou.pojo.TbTypeTemplateExample;
import com.pinyougou.sellergoods.service.TemplateService;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by 89524 on 2018/9/6.
 */
@Service
public class TemplateServiceImpl implements TemplateService{

    @Autowired
    private TbTypeTemplateMapper templateMapper;

    @Override
    public PageResult search(TbTypeTemplate template, int page, int rows) {
        PageHelper.startPage(page,rows);
        TbTypeTemplateExample example = new TbTypeTemplateExample();
        TbTypeTemplateExample.Criteria criteria = example.createCriteria();
        if(template!=null){
            if(template.getName()!=null&&template.getName().length()>0){
                criteria.andNameLike("%"+template.getName()+"%");
            }
        }
        Page<TbTypeTemplate> p = (Page<TbTypeTemplate>) templateMapper.selectByExample(example);
        return new PageResult(p.getTotal(),p.getResult());
    }

    @Override
    public void add(TbTypeTemplate template) {
        templateMapper.insert(template);
    }

    @Override
    public TbTypeTemplate findOne(Long id) {
        TbTypeTemplate tbTypeTemplate = templateMapper.selectByPrimaryKey(id);
        return tbTypeTemplate;
    }

    @Override
    public void update(TbTypeTemplate template) {
        templateMapper.updateByPrimaryKey(template);
    }

    @Override
    public void delete(Long[] ids) {
        for(Long id:ids){
            templateMapper.deleteByPrimaryKey(id);
        }
    }


}
