package com.nut.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-10 21:27
 */
public class DateConverter implements Converter<String, Date>
{
    public Date convert(String dateStr)
    {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try
        {
            date = format.parse(dateStr);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        return date;
    }
}
