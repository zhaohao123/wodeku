package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.sellergoods.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 89524 on 2018/9/4.
 */
@RestController
@RequestMapping("test")
public class TestController {
    @Reference
    private TestService testService;

    @RequestMapping("haha")
    public String test(){
        return testService.test();
    }
}
