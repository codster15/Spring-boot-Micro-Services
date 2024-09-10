package in.deepak;

import in.deepak.Interface.ProductInterface;
import in.deepak.entity.ProductEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class EmbeddedDatabseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(EmbeddedDatabseApplication.class, args);

		ProductInterface bean = run.getBean(ProductInterface.class);
		Optional<ProductEntity> byId = bean.findById(1);
		System.out.println(byId.get());

	}


}
