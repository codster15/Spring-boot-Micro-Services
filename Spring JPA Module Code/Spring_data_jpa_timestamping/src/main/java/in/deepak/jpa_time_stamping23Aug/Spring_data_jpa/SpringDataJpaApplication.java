package in.deepak.jpa_time_stamping23Aug.Spring_data_jpa;

import in.deepak.jpa_time_stamping23Aug.Spring_data_jpa.Entity.Products;
import in.deepak.jpa_time_stamping23Aug.Spring_data_jpa.Repositiory.PerformOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaApplication.class, args);
		PerformOperation bean = ctx.getBean(PerformOperation.class);

		Products p = new Products("table" , 3500 , 18);


		Products save = bean.save(p);
		
		System.out.println(save);


//
//		Products p1 = new Products("Tonic", 750, 200);
//		Products p2 = new Products("Apple", 150, 300);
//		Products p3 = new Products("Shirt", 450, 400);
//		Products p4 = new Products("Jeans", 1750, 500);
//		Products p5 = new Products("Bike", 95000, 600);
//		List<Products> list = Arrays.asList(p1, p2, p3, p4, p5);

		// to delete
//
//		Products p7 =new Products();
//		p7.setId(7);
//
//		Products p8 =new Products();
//		p7.setId(8);
//
//		Products p9 =new Products();
//		p7.setId(9);
//
//		Products p10 =new Products();
//		p7.setId(10);
//
//
//
//
//		bean.deleteAllById(Arrays.asList(7, 8, 9, 10));


		//find method
//		List<Products> all = bean.findAll();
//		all.forEach(System.out::println);

	}
}
