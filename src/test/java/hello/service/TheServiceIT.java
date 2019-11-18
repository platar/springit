package hello.service;

import hello.app.TestApp;
import hello.repo.TheRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApp.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class TheServiceIT {

    @Autowired
    private TheService theService;


    @MockBean
    private TheRepo theRepo;


    @Test
    public void test() {
        Mockito.when(theRepo.greet()).thenReturn("kurwa");

        assertThat(theService.greet(), equalTo("Greetings from Spring Boot!"));
    }
}
