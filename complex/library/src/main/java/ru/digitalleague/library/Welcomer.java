package ru.digitalleague.library;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Welcomer {

  private static final Logger logger = LoggerFactory.getLogger(Welcomer.class);

  private final String name;

  public Welcomer(String name) {
    this.name = StringUtils.trimToEmpty(name);
    logger.debug("Init a new welcomer with name: " + this.name);
  }

  public String sayHello() {
    return "Hello, " + name + "!";
  }
}
