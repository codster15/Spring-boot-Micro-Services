package in.deepak.SpringBoot_jpa_crudRepository;

import in.deepak.SpringBoot_jpa_crudRepository.Entity.book_Entity;
import in.deepak.SpringBoot_jpa_crudRepository.Repo.BooksRepositiory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringBootJpaCrudRepositoryApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctxt = SpringApplication.run(SpringBootJpaCrudRepositoryApplication.class, args);

		BooksRepositiory repo = ctxt.getBean(BooksRepositiory.class);


		Iterable<book_Entity> all = repo.findAll();

		for (book_Entity book : all){

			if(book.getBookAvailabilityStatus().equals("yes")  ){
				System.out.println("book - " + book.getBookID());
				System.out.println("book - " + book.getBookName());
				System.out.println("book - " + book.getBookPrice());
				System.out.println("book - " + book.getBookAvailabilityStatus());

				System.out.println();
				System.out.println("===============================================================");
				System.out.println();
			}


		}
	}

}
