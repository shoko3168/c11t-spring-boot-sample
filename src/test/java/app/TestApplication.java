package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * User: makotan
 * Date: 14/12/08
 * Time: 12:37
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.example.c11t"})
@ImportResource("mirageContext.xml")
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
