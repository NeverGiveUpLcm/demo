package com.itcast.demo.day09.dao;

import com.itcast.demo.day09.entity.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

/**
 * dao接口
 *
 * @author lichunmiao
 * @date 2020/6/2
 */
@Controller
@Repository("EmployeeMapper")
@Scope("singleton")
public interface EmployeeMapper {

    Employee selectById(int id);

    /**
     * propagation - Propagation. 事务的传播行为
     * 传播行为:(事务的传播 + 事务的行为)
     *      如果有多个事务进行嵌套运行,子事务是否要和大事务共用一个事务
     *  REQUIRED: 如果有事务在运行,当前的方法就在这个事务内运行,否则就启动一个新的事务,并在自己的事务内运行
     *  REQUIRES_NEW:当前的方法必须启动新事务,并在它自己的事务内运行,如果有事务正在运行,应该将它挂起
     *  SUPPORTS: 如果有事务在运行,当前的方法就在这个事务内运行,否则它可以不运行在事务中
     *  NOT_SUPPORTED:当前的方法不应该运行在事务中,如果有运行的事务,将它挂起
     *  MANDATORY: 当前的方法必须运行在事务内部,如果没有正在运行的事务,就抛出异常
     *  NEVER: 当前的方法不应该运行在事务中,如果有运行的事务,就抛出异常
     *  NESTED: 如果有事务在运行,当前的方法就应该在这个事务的嵌套事务内运行,否则就启动一个新的事务,并在它自己的事务内运行
     *
     *  如果是REQUIRED,那么子事务的属性都是继承于大事务的(比如timeout,readonly这些属性),在子事务内配置这些属性是没有用的
     *  如果是REQUIRES_NEW,那么可以在自己的事务内调整这些属性
     *
     *  REQUIRED:将之前事务用的connection传递给这个方法使用
     *  REQUIRES_NEW:这个方法直接使用新得connection
     *
     *  本类事务方法之前的调用就只是一个事务。
     *
     *  MulServiceProxy.mulTx(){
     *      bookServiceProxy.checkout();
     *      bookServiceProxy.updatePrice();
     *  }
     *
     *  bookServiceProxy.mulTx(){
     *      checkout();
     *      updatePrice();
     *  }
     *
     *  事务的操作是由代理类来操作的,所以在MulServiceProxy中,因为bookServiceProxy的存在,可以进行事务的传播
     *  而在bookServiceProxy调用两个两个事务方法,本身还是bookServiceProxy类中的方法,所以是无法进行事务操作的
     */
    @Transactional(propagation = Propagation.NESTED)
    int updateEmp(Employee employee);

    int deleteEmp(int id);

    int insert(Employee employee);

    List<Employee> selectAll();

    Map<String,Object> selectReturnMap(int id);
    @MapKey("name")
    Map<String,Employee> selectListReturnMap();


}
