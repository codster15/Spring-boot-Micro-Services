package in.jpa_profiles;

import in.jpa_profiles.Entity.Devlopers;
import in.jpa_profiles.jpa.devRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ProfileConceptApplication {

	public static void main(String[] args) {

				ConfigurableApplicationContext ctxt = SpringApplication.run(ProfileConceptApplication.class, args);

				devRepo bean = ctxt.getBean(devRepo.class);

//		Hibernate:
//		create table developers (
//		dev_id integer not null,
//		country varchar(255),
//		domain varchar(255),
//		name varchar(255),
//		primary key (dev_id)
//		)
//		engine=InnoDB

				Devlopers devlopers1 = new Devlopers(101,"Smith","Devops","Australia");
				Devlopers devlopers2 = new Devlopers(102,"Ashok","cloud","India");
				Devlopers devlopers3 = new Devlopers(103,"Alice","AI","IreLand");
				Devlopers devlopers4 = new Devlopers(104,"Rani","FUllstack","India");
				Devlopers devlopers5 = new Devlopers(105,"Chris","DataScience","USA");

				List<Devlopers> list = Arrays.asList(devlopers1, devlopers2, devlopers3, devlopers4, devlopers5);

				try{
					bean.saveAll(list);
					System.out.println("Data got Inserted");
				}catch(Exception e){
					System.out.println("Data Not Inserted - " + e.getMessage());
				}

	}


}
