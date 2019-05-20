package com.noobie.dongle.temp.mapper;

import com.noobie.dongle.temp.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

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
public interface SysUserMapper {
    List<SysUser> listUser();
}
