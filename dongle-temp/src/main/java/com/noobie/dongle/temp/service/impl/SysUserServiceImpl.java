package com.noobie.dongle.temp.service.impl;

import com.noobie.dongle.temp.entity.SysUser;
import com.noobie.dongle.temp.mapper.SysUserMapper;
import com.noobie.dongle.temp.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright (c) 2016-2019, Guangzhou Noobie Technologies Co., Ltd. All rights reserved.
 * <http://www.noobie.com.cn/>
 * ------------------------------------------------------------------------------
 *
 * @author liz
 * @Product lajitong
 * @Description
 * @Date 2019-05-20
 **/
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> listUser(){
        return sysUserMapper.listUser();
    }
}
