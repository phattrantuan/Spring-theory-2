package com.phat.controller;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.KeyStore.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phat.entity.Manager;
import com.phat.entity.Staff;
@Controller
public class HomepageController {


	
	@RequestMapping("/")
	@ResponseBody
	public String ViewHomePage() {
		ApplicationContext context = new ClassPathXmlApplicationContext("ioC.xml");
		
		Staff staff = (Staff) context.getBean("staff");
		staff.getMessage();

		Staff staff2 = (Staff) context.getBean("staff");
		staff2.getMessage();
		
		
		
		
		
		
		
		//factory method same static
		System.out.println("---------------------------");

		Staff factorymethod = (Staff) context.getBean("factorymethod");
		factorymethod.getMessage();
		
		
		
		
		//constructor bean
		System.out.println("---------------------------");
		

		Staff constructor = (Staff) context.getBean("constructor");
		constructor.getMessage();
		
		
		//constructor references bean
		System.out.println("--------------------------- references bean" );
		

		Staff constructorref = (Staff) context.getBean("constructorref");
		System.out.println(constructorref.getManager().getFunction()+ " "+constructorref.getManager().getStaffname());
		System.out.println("--------------------------- references bean" );
		//same same
		Manager manager = new Manager("manager","phat","qn");
		Staff staffm = new Staff(manager);
		System.out.println(staffm);
		
		
		//Collection data basic
		Staff list = (Staff) context.getBean("list");
		for (String value : list.getList()) {
			System.out.println(value);
		}
		
		
		//Collection data object 
		Staff listobject = (Staff) context.getBean("listobject");
		for (Manager value : listobject.getListobject()) {
			System.out.println(value.getFunction());
		}
		
		
		System.out.println("Map tesst");
		//Collection data object (Map)
		Staff Map = (Staff) context.getBean("map");
		System.out.println(Map.getMap().get("key1"));
	//	System.out.println(Map.getMap().get("key2").toString());
 
		
		for(java.util.Map.Entry<String, Object> entry : Map.getMap().entrySet() ) {
			System.out.println("\n" +entry.getKey() + "- " +entry.getValue() );
		}
		
		
		
		
		//Properties
		System.out.println("\nProperties\n");
		Staff properties = (Staff) context.getBean("properties");
		System.out.println(properties.getProperties().get("jdbc")); 
		
		
		
		
		
		
		//inner bean
		System.out.println("--------------------------- Innerbean \n");
		
		Staff innerbean = (Staff) context.getBean("innerbean");
		System.out.println(innerbean.getManager().getFunction()+ " "+innerbean.getManager().getStaffname());
		
		
		
		
		//spring scope
		System.out.println("--------------------------- scopesingleton \n");
		
		Staff scopesingleton = (Staff) context.getBean("scopesingleton");
		scopesingleton.setStaffname("phat singleton");
		System.out.println("name staff"+	scopesingleton.getStaffname() + "1");
		
		

		Staff scopesingleton2 = (Staff) context.getBean("scopesingleton");
		
		System.out.println("name staff"+	scopesingleton2.getStaffname() + "2");
		
		
		
		//auto writing
		System.out.println("--------------------------- autowriting \n");
		//auto Resource example
	/*	URL url;
		try {
			url = new URL("");
			try {
				HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
				connection.connect(); 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/ 
		
		
	
		Resource resource = context.getResource("classpath:resource.txt");
			//Resource resource = context.getResource("https://test.");
		try {
			InputStream inputStream = resource.getInputStream();//open connect to 1 file, it return 1 inputstream
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);//read stream receive into
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);//read text from stream into.   receive reader
			String line ="";//data per line
			StringBuilder data = new StringBuilder(); //save data per line  when  data overlay up old data
			while((line = bufferedReader.readLine())!=null)
			{
				 data.append(line+ "\n") ;//append of string builder to it string concatenation each other
				 
			}
			bufferedReader.close();
			inputStreamReader.close();
			inputStream.close();
			System.out.println(data.toString());//here is 1 string builder so we need type conversion,
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		

		//Class individual
		
		CustomLoader customLoader = new CustomLoader(); //initialize a custom loader, it will understand the application context as a resource loader
		
		customLoader.setResourceLoader(context);
		
		Resource resource2 =customLoader.getResource("classpath:resource.txt")  ;
		//Resource resource = context.getResource("https://test.");
	try {
		InputStream inputStream = resource2.getInputStream();//open connect to 1 file, it return 1 inputstream
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);//read stream receive into
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);//read text from stream into.   receive reader
		String line ="";//data per line
		StringBuilder data = new StringBuilder(); //save data per line  when  data overlay up old data
		while((line = bufferedReader.readLine())!=null)
		{
			 data.append(line+ "\n") ;//append of string builder to it string concatenation each other
			 
		}
		bufferedReader.close();
		inputStreamReader.close();
		inputStream.close();
		System.out.println(data.toString());//here is 1 string builder so we need type conversion,
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
	
		
		
		
		//
	//Class bean
	
	CustomLoader customLoader1 = (CustomLoader) context.getBean("customloader"); //initialize a custom loader, it will understand the application context as a resource loader
	
	
	Resource resource3 =customLoader1.getResource("classpath:resource.txt")  ;
	//Resource resource = context.getResource("https://test.");
try {
	InputStream inputStream = resource3.getInputStream();//open connect to 1 file, it return 1 inputstream
	InputStreamReader inputStreamReader = new InputStreamReader(inputStream);//read stream receive into
	BufferedReader bufferedReader = new BufferedReader(inputStreamReader);//read text from stream into.   receive reader
	String line ="";//data per line
	StringBuilder data = new StringBuilder(); //save data per line  when  data overlay up old data
	while((line = bufferedReader.readLine())!=null)
	{
		 data.append(line+ "\n") ;//append of string builder to it string concatenation each other
		 
	}
	bufferedReader.close();
	inputStreamReader.close();
	inputStream.close();
	System.out.println(data.toString());//here is 1 string builder so we need type conversion,

} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 


	
	
		
		
		
		
		((ClassPathXmlApplicationContext)context).close();///when convert application context then it lose method close so  "type conversion" 
		//((ClassPathXmlApplicationContext)context).registerShutdownHook();;
			return "homepage";
	}
	@RequestMapping("/login")

	public String ViewHomePage1() {
		return "homepage";
	
}}
