package com.fatto.server;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by fattoliu on 2017/3/24.
 */
public class FattoAction extends ActionSupport {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login() {
        System.out.println("username--->" + username + "\npassword--->" + password);
        return null;
    }
}
