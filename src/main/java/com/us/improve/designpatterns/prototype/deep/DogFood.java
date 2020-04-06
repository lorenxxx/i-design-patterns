package com.us.improve.designpatterns.prototype.deep;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName DogFood
 * @Desciption 狗粮
 * @Author loren
 * @Date 2020/4/6 9:01 PM
 * @Version 1.0
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DogFood implements Serializable {

    private static final long serialVersionUID = 516220809987705812L;

    private String name;

}
