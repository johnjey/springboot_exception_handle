package com.cotx.usermanager.service.impl;

import com.cotx.usermanager.dao.SysUserMapper;
import com.cotx.usermanager.model.SysUser;
import com.cotx.usermanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public SysUser login(String username, String password) {
        return null;
    }

    @Override
    public List<SysUser> listAll() {
        return null;
    }

    @Override
    public List<SysUser> listByAgeLargeThan(int age) {
        return null;
    }
}
