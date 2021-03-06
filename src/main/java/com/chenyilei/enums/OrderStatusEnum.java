package com.chenyilei.enums;

import lombok.Data;
import lombok.Getter;
import org.springframework.util.StringUtils;

@Getter
public enum  OrderStatusEnum implements CodeEnum<Integer>{

    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消");

    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String msg){
        this.code= code;
        this.message = msg;
    }

}
