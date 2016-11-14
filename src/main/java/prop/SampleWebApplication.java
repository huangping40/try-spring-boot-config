package prop;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@SpringBootApplication
@ComponentScan
public class SampleWebApplication  {
	
	public static void main(String[] args) {
	  ConfigurableApplicationContext context = new SpringApplicationBuilder(SampleWebApplication.class).run(args);

	  SampleProperty sp = context.getBean(SampleProperty.class);
	  
	  System.out.println(sp);
	  System.exit(2);
	}
}
