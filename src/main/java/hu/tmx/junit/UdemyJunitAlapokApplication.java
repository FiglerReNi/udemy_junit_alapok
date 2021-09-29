package hu.tmx.junit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class UdemyJunitAlapokApplication {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(UdemyJunitAlapokApplication.class);
    }

}
