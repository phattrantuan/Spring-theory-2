package com.phat.controller;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.phat.entity.Employee;

@Controller
@RequestMapping("/AddDataFromForm")
public class AddDataFromForm {
	ApplicationContext context = new ClassPathXmlApplicationContext("ioC.xml");
	SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
	
	

	@PostMapping
	@Transactional
	public String addEmployee(@RequestParam String name,@RequestParam int age) {
			Session session;
			try {
			    session = sessionFactory.getCurrentSession();
			} catch (HibernateException e) {
			    session = sessionFactory.openSession();
			}
			
			
			Employee employee = new Employee();
			employee.setAge(age);
			employee.setName(name);
			session.save(employee);
			
			
			
			
		return "AddDataFromForm";
	}
	
	@GetMapping 
	public String defaults()
	{
		return "AddDataFromForm";
	}
}
