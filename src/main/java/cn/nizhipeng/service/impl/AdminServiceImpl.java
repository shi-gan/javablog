package cn.nizhipeng.service.impl;

import cn.nizhipeng.dao.AdminMapper;
import cn.nizhipeng.domain.Admin;
import cn.nizhipeng.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author TyCoding
 * @date 18-4-27上午7:09
 */
@Service    //注解   xml中的bean不用配置了即  <bean id="AdminService" class="cn.nizhipeng.service.impl.AdminServiceImpl" </bean>
public class AdminServiceImpl implements AdminService {

    /**
     * 注入service层    dao
     */
    @Autowired
    private AdminMapper adminMapper;
    // 这部分使用的是 自动注入
    // 不需要以下方式    //创建容器
    //                  ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//    即不需要通过类似applicationContext.xml以下方式往service层注入 dao
//        <bean id="accountService" class="com.itheima.service.impl.AccountServiceImpl">
//        <!--构造方法注入，set方法注入--><!--pojo类型-->
//        <property name="accountDao" ref="accountDao"></property>


    /**
     * 登录的功能
     *
     * @param a_name 输入的用户名
     * @return 返回查询到的该用户名对应的密码
     */
    public Admin login(String a_name) {
        return adminMapper.login(a_name);
    }

    /**
     * 注册功能
     *
     * @param admin 注册的信息
     * @return 返回影响的行数
     */
    public void insert(Admin admin) {
        adminMapper.insert(admin);
    }

    /**
     * 根据用户名查询
     *
     * @param a_name 用户名
     * @return 返回影响的行数
     */
    public Admin findByName(String a_name) {
        return adminMapper.findByName(a_name);
    }
}
