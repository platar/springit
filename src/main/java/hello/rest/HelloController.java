package hello.rest;

import hello.service.TheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @Autowired
    private TheService theService;

    @RequestMapping("greet")
    public String index() {
        return theService.greet();
    }

}