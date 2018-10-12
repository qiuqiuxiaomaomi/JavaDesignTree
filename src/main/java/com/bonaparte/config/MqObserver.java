package com.bonaparte.config;

import com.bonaparte.bean.ChargeMoneyBean;
import org.springframework.context.annotation.Configuration;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by yangmingquan on 2018/10/12.
 * 观察者
 */
@Configuration
public class MqObserver implements Observer {

    public void update(Observable o, Object arg) {
        ChargeMoneyBean chargeMoneyBean = (ChargeMoneyBean)arg;
        System.out.println(chargeMoneyBean.getMoney());
    }
}
