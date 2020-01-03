package se.lexicon.henric.SpringDemoAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        //not doing it the way l2c did it bc f that shizzle. Using CompentScanConfig class to config
               AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
               TennisCoach tCoach = context.getBean(TennisCoach.class);
               System.out.println(tCoach.getDailyWorkout());
               context.close();
    }

}
