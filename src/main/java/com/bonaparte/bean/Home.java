package com.bonaparte.bean;

/**
 * Created by yangmingquan on 2018/10/12.
 */
public class Home {
    Bed bed = new Bed();
    Desk desk = new Desk();

    public void describeHome(){
        bed.bedClear();
        desk.deskClear();
    }
}
