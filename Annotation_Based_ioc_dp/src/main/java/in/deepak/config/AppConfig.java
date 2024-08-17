package in.deepak.config;

import in.deepak.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = "in.deepak")
public class AppConfig {


    public AppConfig() {
        System.out.println("AppConfig :: Constructor");
    }
@Bean
    public Engine getEngine (){
        Engine eng = new Engine();
        return eng;
    }
}
