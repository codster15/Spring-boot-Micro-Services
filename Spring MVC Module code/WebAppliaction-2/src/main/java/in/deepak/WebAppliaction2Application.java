package in.deepak;

import in.deepak.Entity.book;
import in.deepak.repo.bookRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class WebAppliaction2Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext run = SpringApplication.run(WebAppliaction2Application.class, args);


	}


}
