package ru.digitalleague.library;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class WelcomerTest {

  @Test
  void checkWelcomer() {
    String welcome = new Welcomer(null).sayHello();
    assertThat(welcome).isEqualTo("Hello, !");
    welcome = new Welcomer(" John  ").sayHello();
    assertThat(welcome).isEqualTo("Hello, John!");
  }
}
