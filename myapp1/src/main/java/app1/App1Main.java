package app1;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import base.Base;

@SpringBootApplication
public class App1Main {
  public static void main(String... args) {
    SpringApplication.run(App1Main.class, args);
  }

  @PostConstruct
  private void postConstruct() {
    System.out.println("from app1:"+new Base().sayHello());
  }
}