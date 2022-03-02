package com.phat.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.phat.entity.Employee;

@Controller
@RequestMapping("/connect")
public class Connect {
	@Autowired
	SessionFactory sessionFactory;

	@GetMapping
	@Transactional
	public String Default() {
			Session session = sessionFactory.getCurrentSession();
			String sql = " from employeee";
			List<Employee> list = session.createQuery(sql).getResultList();
			for(Employee e : list) {
				System.out.println("name employee: +" +e.getName());
			}
		return "QuerysFirst";
	}
}
