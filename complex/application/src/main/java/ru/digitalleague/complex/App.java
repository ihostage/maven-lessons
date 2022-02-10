package ru.digitalleague.complex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.digitalleague.library.Welcomer;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Welcomer w = new Welcomer(args.length > 0 ? args[0] : "Anonymous");
        logger.info(w.sayHello());
    }
}
