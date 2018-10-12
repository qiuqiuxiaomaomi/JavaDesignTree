package com.bonaparte.controller;

import com.bonaparte.interfacet.AppointmentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangmingquan on 2018/10/12.
 */
@RestController
@RequestMapping("/appointment")
public class AppointmentController {
    @Autowired
    AppointmentServiceInterface appointmentServiceInterface;

    @RequestMapping("/save")
    public Object saveAppoint(String data){
        appointmentServiceInterface.saveAppointment(data);
        return "";
    }
}
