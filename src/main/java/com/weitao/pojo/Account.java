package com.weitao.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Account implements Serializable {

    private int id;
    private String name;
    private Double money;
}
