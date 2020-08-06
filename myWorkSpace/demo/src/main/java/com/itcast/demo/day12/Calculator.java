package com.itcast.demo.day12;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lichunmiao
 * @date 2020/7/1
 */
@Component
public class Calculator{

    /**
     *  rollbackFor 運行期異常默認是回滾的
     *  編譯器異常默認是不會滾的,如果是編譯器異常拋出,我們就要指定特定的異常進行回滾
     *  加了事務的實現類,ioc容器中保存的還是代理對象,因為事務是通過aop來實現的,只有代理對象可以進行增強操作
     *
     */
    @Transactional(timeout = 3,readOnly = true,propagation = Propagation.REQUIRED)
    public int add(int a, int b) {
        System.out.println("计算结果为:" + (a + b));
        return a + b;
    }
}
