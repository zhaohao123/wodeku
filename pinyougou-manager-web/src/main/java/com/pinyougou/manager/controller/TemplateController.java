package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbTypeTemplate;
import com.pinyougou.sellergoods.service.TemplateService;
import entity.PageResult;
import entity.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 89524 on 2018/9/6.
 */
@RestController
@RequestMapping("template")
public class TemplateController {
    @Reference
    private TemplateService templateService;

    /*
    * 分页条查
    * */
    @RequestMapping("search")
    public PageResult search(@RequestBody TbTypeTemplate template, int page, int rows){
        return templateService.search(template,page,rows);
    }

    /*
    * 新增
    * */
    @RequestMapping("add")
    public Result add(@RequestBody TbTypeTemplate template){
        try {
            templateService.add(template);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    /*
    * 修改回显
    * */
    @RequestMapping("findOne")
    public TbTypeTemplate findOne(Long id){
        return templateService.findOne(id);
    }

    /**
     * 修改
     * @param
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody TbTypeTemplate template){
        try {
            templateService.update(template);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(Long [] ids){
        try {
            templateService.delete(ids);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }

}
