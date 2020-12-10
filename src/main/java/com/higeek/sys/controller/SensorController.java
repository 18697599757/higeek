package com.higeek.sys.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.higeek.sys.common.DataGridView;
import com.higeek.sys.domain.Sensor;
import com.higeek.sys.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Mike
 * @since 2020-12-09
 */
@RestController
@RequestMapping("sensor")
public class SensorController {

    @Autowired
    private SensorService sensorService;

    @RequestMapping("find")
    public DataGridView find(){
        QueryWrapper<Sensor> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("date");
        queryWrapper.last("limit 1");


        Sensor one = this.sensorService.getOne(queryWrapper);
        return new DataGridView(one);
    }
}

