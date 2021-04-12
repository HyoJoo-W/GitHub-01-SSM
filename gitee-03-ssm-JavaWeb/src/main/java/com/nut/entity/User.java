package com.nut.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.text.SimpleDateFormat;
import java.util.Date;

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
    private Date date;
    private float money;

    public String getDateString()
    {
        if (date != null)
        {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            return sdf.format(date);
        }
        return "";
    }

}
