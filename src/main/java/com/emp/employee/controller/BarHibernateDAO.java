package com.emp.employee.controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BarHibernateDAO {
	 @Autowired
	    private SessionFactory sessionFactory;
}
