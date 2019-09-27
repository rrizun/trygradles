package app2;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import base.Base;

@SpringBootApplication
public class App2Main {
  public static void main(String... args) {
    SpringApplication.run(App2Main.class, args);
  }

  @PostConstruct
  private void postConstruct() {
    System.out.println("from app2:"+new Base().sayHello());
  }
}