import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeLifeCycleDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-LifeCycle-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());


        context.close();
    }
}


