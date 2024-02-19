package com.neusoft.tijiancmsserver.service.impl;

import com.neusoft.tijiancmsserver.mapper.SetmealMapper;
import com.neusoft.tijiancmsserver.po.Setmeal;
import com.neusoft.tijiancmsserver.service.SetmealService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetmealServiceImpl implements SetmealService{

    @Autowired
    private SetmealMapper setmealMapper;

    @Override
    public List<Setmeal> listSetmeal() {
        return setmealMapper.listSetmeal();
    }
}
