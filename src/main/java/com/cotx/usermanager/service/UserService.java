package com.cotx.usermanager.service;

import com.cotx.usermanager.model.SysUser;

import javax.validation.constraints.Size;
import java.util.List;

public interface UserService {

    SysUser login(String username, String password);

    List<SysUser> listAll();

    List<SysUser> listByAgeLargeThan(int age);
}
