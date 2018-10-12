package com.bonaparte.config;

import com.bonaparte.bean.ChargeMoneyBean;
import org.springframework.context.annotation.Configuration;

import java.util.Observable;

/**
 * Created by yangmingquan on 2018/10/12.
 * 被观察者
 */
@Configuration
public class MqObservable extends Observable {

    @Override
    public void notifyObservers() {
        //生成数据
        ChargeMoneyBean chargeMoneyBean = new ChargeMoneyBean();
        chargeMoneyBean.setAddress("成都");
        chargeMoneyBean.setName("bonaparte");
        chargeMoneyBean.setUid(1);
        chargeMoneyBean.setMoney(23.0);
        setChanged();
        super.notifyObservers(chargeMoneyBean);
    }
}
