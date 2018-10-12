package com.bonaparte.service;

import com.bonaparte.interfacet.ChargeMoneyInterface;
import org.springframework.stereotype.Service;

/**
 * Created by yangmingquan on 2018/10/12.
 * 微信支付
 */
@Service
public class WeixinChargeMoneyService implements ChargeMoneyInterface {
    public void chargeMoney(String data) {
        //微信收费
    }
}
