package com.lph.app.core.common;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class HibernateTemplate extends HibernateDaoSupport{

    @Autowired
    public void anyMethodName(SessionFactory sessionFactory){
	setSessionFactory(sessionFactory);
    }
}
