package com.nut.service.impl;

import com.nut.dao.AdministratorDao;
import com.nut.dao.impl.AdministratorDaoImpl;
import com.nut.entity.Administrator;
import com.nut.service.AdministratorService;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-12 11:52
 */
public class AdministratorServiceImpl implements AdministratorService
{
    private final AdministratorDao administratorDao = new AdministratorDaoImpl();

    //查询Administrator
    @Override
    public Administrator queryAdministrator(Administrator administrator)
    {
        return administratorDao.queryAdministrator(administrator);
    }
}
