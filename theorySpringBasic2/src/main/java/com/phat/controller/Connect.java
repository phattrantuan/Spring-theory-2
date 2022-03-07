package com.phat.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.phat.entity.Employee;
import com.phat.entity.Goods;
import com.phat.entity.Staff;

@Controller
@RequestMapping("/connect")
public class Connect {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("ioC.xml");
	SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
	
	

	@GetMapping
	@Transactional
	public String Default() {
			Session session;
			try {
			    session = sessionFactory.getCurrentSession();
			    
			} catch (HibernateException e) {
			    session = sessionFactory.openSession();
			   
			}
			
			//String sql = " from employeee";
			/*List<Employee> list = session.createQuery(sql).getResultList();
			for(Employee e : list) {
				System.out.println("name employee: +" +e.getName());
			}*/
		/*Employee employee = new Employee();
			employee.setAge(45);
			employee.setName("Hung 45");
			//employee.setIdemployeee(7);
			session.save(employee);
			*/
	//	
			
			/*Goods goods = new Goods();
			goods.setGoodsname("pig");
			
			Employee employee = new Employee();
			employee.setName("phatck");
			employee.setAge(22);
			
			goods.setEmployee(employee);
			session.save(goods);*/
			
		
			
		/*	Employee employee2 = (Employee)session.get(Employee.class, 1);
			employee2.setName("phatck");
			session.update(employee2);*/
			
			
			
			
			/* Query query = session.createQuery("update User set userName =:userName where userId = :userName ");
	         query.setString("userName", userName);  
	         query.setString(userName, userName);  */
			
			
			
			//delete 
			
			/*Employee employee = new Employee();
			employee.setIdemployeee(7);
			session.delete(employee);*/
		
		/*	Employee persistentInstance = session.load(Employee.class, 7);
			if (persistentInstance != null) {
			    session.delete(persistentInstance);
			}
			*/
			
			//onetoone
			Goods goods = new Goods();
			goods.setGoodsname("piga");
			
			Goods goods1 = new Goods();
			goods1.setGoodsname("pig2");
			
			Goods goods2 = new Goods();
			goods2.setGoodsname("pig3");
			
			
			 
		//one to one	goods.setEmployee(employee);
			
			Set<Goods> goodscollect = new HashSet<Goods>();
			goodscollect.add(goods2);
			goodscollect.add(goods1);
			goodscollect.add(goods);
			
			Employee employee = new Employee();
			employee.setName(" phataaaack1");
			employee.setGoods(goodscollect);
			employee.setAge(222);
			
			
		session.save(employee);
		
		return "QuerysFirst";
	}
}


