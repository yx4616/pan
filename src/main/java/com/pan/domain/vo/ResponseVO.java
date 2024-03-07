package com.pan.domain.vo;

import lombok.Data;

@Data
public class ResponseVO<T> {
    private String status;
    private Integer code;
    private String info;
    private T data;

}
