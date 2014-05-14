package es.unileon.schoolSpring.example01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TechShop {
	public static void main(String[] args){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./context.xml");
		Computer brokenComputer = new Computer();
		Engineer engineer = (Engineer) applicationContext.getBean("engineer");
		// engineer.setTool(tool);
		engineer.repair(brokenComputer);
	}
}
