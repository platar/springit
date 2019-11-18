package hello.repo;

import org.springframework.stereotype.Repository;

@Repository
public class TheRepo {

    public String greet() {
        return "Greetings from Spring Boot!";
    }
}
