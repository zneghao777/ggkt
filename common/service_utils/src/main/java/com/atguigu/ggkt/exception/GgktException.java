package com.atguigu.ggkt.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor   //有参构造器
@NoArgsConstructor    //无参构造器
public class GgktException extends RuntimeException{
    private Integer code;
    private String msg;


}
