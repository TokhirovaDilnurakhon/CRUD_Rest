package springRestCrud.springRestCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springRestCrud.springRestCrud.Student.Student;

@SpringBootApplication
public class SpringRestCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestCrudApplication.class, args);
	}
}
