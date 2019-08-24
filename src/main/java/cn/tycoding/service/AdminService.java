package cn.tycoding.service;

import cn.tycoding.pojo.Admin;

public interface AdminService {

    Admin login(String a_name);// 登录

    void insert(Admin admin); // 注册

    Admin findByName(String a_name); //查找用户
}
