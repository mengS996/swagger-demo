package com.ms.swagger.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author     ：孟老师
 * @date       ：Created in 2021/4/1 15:33
 * @description：
 * @modified By：
 * @version: $
 */
@ApiModel("用户实体类")
public class User {
    @ApiModelProperty("用户名")
    private String name;
    @ApiModelProperty("密码")
    private String password;

    public String getName() {
        return name;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
}
