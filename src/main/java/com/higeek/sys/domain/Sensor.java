package com.higeek.sys.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author Mike
 * @since 2020-12-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("808_sensor")
public class Sensor implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer temperature;

    private Integer humidity;

    private Date date;


}
