package cn.nizhipeng.dao;

import cn.nizhipeng.domain.Admin;

public interface AdminMapper {
    
    Admin login(String a_name);

    void insert(Admin admin);

    Admin findByName(String a_name);
}
