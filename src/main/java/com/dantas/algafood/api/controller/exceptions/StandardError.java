package com.dantas.algafood.api.controller.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
public class StandardError implements Serializable {
	
	private static final long serialVersionUID = 1L;

    private Integer status;
    private String msg;
    private LocalDateTime timeStamp;
    private String getMessager;

    public StandardError(Integer status, String msg, LocalDateTime timeStamp) {
        this.status = status;
        this.msg = msg;
        this.timeStamp = timeStamp;
    }

}
