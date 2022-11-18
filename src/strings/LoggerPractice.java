package src.strings;

import java.util.logging.Logger;

public class LoggerPractice {
    public static void main(String[] args) {
         Logger logger = Logger.getLogger(LoggerPractice.class.getName());

         int x=55;
         logger.info("The int value is :"+x);
        System.out.println("Int x = : "+x);

    }
}
