package in.deepak.Spring_jpa_Repositiory_Assignnment;

import in.deepak.Spring_jpa_Repositiory_Assignnment.repo.Jpa_Repositiory;
import jakarta.transaction.Transactional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJpaRepositioryAssignnmentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringJpaRepositioryAssignnmentApplication.class, args);


		Jpa_Repositiory bean = ctx.getBean(Jpa_Repositiory.class);

		//bean.insert(3,"LCD",48000);

		//bean.insert(3,"LCD",50000);

		bean.delete(3);

	}

}
