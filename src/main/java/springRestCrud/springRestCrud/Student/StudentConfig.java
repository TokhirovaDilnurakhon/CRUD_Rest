package springRestCrud.springRestCrud.Student;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    30
            );

            Student bob = new Student(
                    "Bob",
                    "bob@gmail.com",
                    31
            );

            repository.saveAll(List.of(alex, bob));
        };
    }
}
