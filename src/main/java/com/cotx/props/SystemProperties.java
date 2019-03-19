package com.cotx.props;

import com.cotx.usermanager.model.SysUser;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.Valid;
import java.util.List;

@ConfigurationProperties(prefix = "sys")  //prefix等价于value="sys"
public class SystemProperties {
    @NotEmpty
    @Valid
    private List<SysUser> users;

    public List<SysUser> getUsers() {
        return users;
    }

    public void setUsers(List<SysUser> users) {
        this.users = users;
    }
}
