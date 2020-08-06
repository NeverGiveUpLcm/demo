package com.itcast.demo.day07;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * employee接口
 *
 * @author lichunmiao
 * @date 2020/5/31
 */
public interface EmployeeDao {
    int insert(Employee employee);
    int update(Employee employee);
    int delete(String id);
    Employee select(String id);
    Employee selectByIdAndName(@Param("id") String id, @Param("name") String name);

    List<Employee> getAllEmps();

    //列名作为key;值作为value
    Map<String,Object> getEmpByIdReturnMap(String id);

    //key就是这个记录的主键Id,value就是这个记录封装好的对象
    //把查询记录的id的值作为key封装这个map
    @MapKey("id")
    Map<String,Employee> getAllEmpsReturnMap();

    //默认mybatis自动封装结果集:
    // 1)按照列名和属性名一一对应的规则(不区分大小写)
    // 2)如果不一一对应:
    //      1)开启驼峰命名法(满足驼峰命名法规则 aaa_bbb aaaBbb)
    //      2)起别名
    Employee selectById(String id);


}
