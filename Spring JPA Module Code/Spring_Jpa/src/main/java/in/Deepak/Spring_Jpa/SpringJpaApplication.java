package in.Deepak.Spring_Jpa;

import in.Deepak.Spring_Jpa.Entity.Book;
import in.Deepak.Spring_Jpa.Repo.BookRepositiory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(SpringJpaApplication.class, args);

//		Book b2 = new Book();
//		b2.setBook_Price(2803.22);
//		b2.setBook_Name("AI/ML");
//		b2.setBookId(104);

		BookRepositiory Repo = ctx.getBean(BookRepositiory.class);

//		try{
//
//			Repo.save(b2);
//			System.out.println("data Got Inserted Into data Base ");
//
//		}catch (Exception e){
//			System.out.println(e);
//			System.out.println("Data Base Connection Failed Data not Inserted");
//		}


		Optional<Book> byId = Repo.findById(103);
		System.out.println(byId);
		System.out.println("-------------------------------------------------------------------------");
		System.out.println(byId.get());


	}

}
