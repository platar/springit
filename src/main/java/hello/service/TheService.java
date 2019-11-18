package hello.service;

import hello.repo.TheRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheService {

    @Autowired
    private TheRepo theRepo;

    public String greet() {
        return theRepo.greet();
    }
}
