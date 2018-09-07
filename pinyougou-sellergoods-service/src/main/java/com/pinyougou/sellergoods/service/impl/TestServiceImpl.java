package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.sellergoods.service.TestService;

/**
 * Created by 89524 on 2018/9/4.
 */
@Service
public class TestServiceImpl implements TestService{

    @Override
    public String test() {
        return "hello";
    }
}
