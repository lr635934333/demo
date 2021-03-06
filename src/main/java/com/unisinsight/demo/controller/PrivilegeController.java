package com.unisinsight.demo.controller;

import com.unisinsight.demo.service.PrivilegeSequenceInitDataService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("privilege")
public class PrivilegeController {

    @Resource
    private PrivilegeSequenceInitDataService initDataService;

    @PostMapping(value = "init/{start}/{end}")
    public void init(@PathVariable Integer start, @PathVariable Integer end){
        initDataService.execute(start, end);
    }
}
