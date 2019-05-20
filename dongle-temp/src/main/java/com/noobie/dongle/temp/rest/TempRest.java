package com.noobie.dongle.temp.rest;

import com.github.pagehelper.PageHelper;
import com.noobie.dongle.temp.entity.SysUser;
import com.noobie.dongle.temp.service.impl.SysUserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Copyright (c) 2016-2019, Guangzhou Noobie Technologies Co., Ltd. All rights reserved.
 * <http://www.noobie.com.cn/>
 * ------------------------------------------------------------------------------
 *
 * @author liz
 * @Product dongle
 * @Description
 * @Date 2019-05-20
 **/
@RestController
@RequestMapping("/temp")
@Api(description = "测试用户")
public class TempRest {

    @Autowired
    private SysUserServiceImpl sysUserService;
    @GetMapping()
    public String test(){
        return "test";
    }

    @GetMapping("/user")
    @ApiOperation(value = "获取用户列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码"),
            @ApiImplicitParam(name = "pageSize", value = "数目")
    })
    public List<SysUser> listUser(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return sysUserService.listUser();
    }
}
