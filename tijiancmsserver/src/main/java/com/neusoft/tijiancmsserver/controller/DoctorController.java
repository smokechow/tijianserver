package com.neusoft.tijiancmsserver.controller;

import com.neusoft.tijiancmsserver.po.Doctor;
import com.neusoft.tijiancmsserver.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    /**
     * 登录
     * @param doctor
     * @return
     */
    @RequestMapping("/getDoctorByCodeByPass")
    public Doctor getDoctorByCodeByPass(@RequestBody Doctor doctor) {
        return doctorService.getDoctorByCodeByPass(doctor);
    }
}
