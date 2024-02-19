package com.neusoft.tijiancmsserver.service.impl;

import com.neusoft.tijiancmsserver.mapper.DoctorMapper;
import com.neusoft.tijiancmsserver.po.Doctor;
import com.neusoft.tijiancmsserver.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService{

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public Doctor getDoctorByCodeByPass(Doctor doctor) {
        return doctorMapper.getDoctorByCodeByPass(doctor);
    }
}