package com.nut.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-11 13:32
 */

@Getter
@Setter
@ToString
public class User
{
    private int number;
    private String name;
    private String password;
    private String gender;
    private String date;
    private float money;
}
