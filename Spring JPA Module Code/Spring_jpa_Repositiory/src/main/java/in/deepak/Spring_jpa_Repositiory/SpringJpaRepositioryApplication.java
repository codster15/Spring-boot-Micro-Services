package in.deepak.Spring_jpa_Repositiory;

import in.deepak.Spring_jpa_Repositiory.Entity.Employee;
import in.deepak.Spring_jpa_Repositiory.JpaRepositiory.JpaRepositiory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

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
//================================================================================================================
//		Employee e1 = new Employee(2,"miller",21000,"Male" , "devops");
//		Employee e2 = new Employee(3,"Chales",51000,"Male" , "Sales");
//		Employee e3 = new Employee(4,"Priya",79000,"Female" , "Marketing");
//		Employee e4 = new Employee(5,"Robert",47000,"Male" , "Admin");
//		Employee e5 = new Employee(6,"Cathy",86000,"Female" , "HR");
//		Employee e6 = new Employee(7,"Dravid",38000,"Male" , "Developer");
//		Employee e7 = new Employee(8,"alice",98000,"Female" , "Manager");
//
//
//		List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5,e6,e7);
//
//		bean.saveAll(list);
//		System.out.println("Data Got Inserted");
////-==================================================================================================================================
//		List<Employee> all = bean.findAll();
//		all.forEach(e-> System.out.println(e.getId() + "   " + e.getName() + "  " + e.getSalary() + "  " + e.getGender() + "  " + e.getDepartment()));
////-----------------------------------------------
//		List<Employee> female = bean.findByGender("female");
//		female.forEach(e-> System.out.println(e.getName()));

		//pagination concept =============================================================
//		int page = 3;
//
//		PageRequest pageRequest = PageRequest.of(page - 1, 3);
//
//		Page<Employee> all = bean.findAll(pageRequest);
//		List<Employee> content = all.getContent();
//		content.forEach(System.out::println);



		
		//======================================================================================
		//Query By Example
//		Employee e = new Employee();
//		e.setGender("male");
//		e.setDepartment("sales");
//
//		Example<Employee> employeeExample = Example.of(e);
//
//		List<Employee> all = bean.findAll(employeeExample);
//		all.forEach(System.out::println);

	}

}
