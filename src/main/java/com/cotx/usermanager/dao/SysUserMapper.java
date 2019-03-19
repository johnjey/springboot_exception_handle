package com.cotx.usermanager.dao;

import com.cotx.usermanager.model.SysUser;
import java.util.List;

public interface SysUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    List<SysUser> selectAll();

    int updateByPrimaryKey(SysUser record);
}