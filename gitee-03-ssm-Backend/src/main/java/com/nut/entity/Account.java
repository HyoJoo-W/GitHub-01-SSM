package com.nut.entity;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-10 22:33
 */
public class Account
{
    private String name;
    private double money;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getMoney()
    {
        return money;
    }

    public void setMoney(double money)
    {
        this.money = money;
    }

    @Override
    public String toString()
    {
        return "Account{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
