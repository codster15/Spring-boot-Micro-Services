package in.deepak.Spring_jpa_Repositiory;

import in.deepak.Spring_jpa_Repositiory.Entity.Employee;
import in.deepak.Spring_jpa_Repositiory.JpaRepositiory.JpaRepositiory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJpaRepositioryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringJpaRepositioryApplication.class, args);

		JpaRepositiory bean = run.getBean(JpaRepositiory.class);

//		Employee e1 = new Employee();
//		e1.setId(1);
//		e1.setName("john");
//		e1.setGender("Male");
//		e1.setSalary(35000);
//		e1.setDepartment("sales");
//		Employee save = bean.save(e1);
//		if(save.getId() > 0 ){
//			System.out.println("dat Inserted");
//		}




	}

}
