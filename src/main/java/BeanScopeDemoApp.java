import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach AlphaCoach = context.getBean("myCoach", Coach.class);

        boolean result = (theCoach == AlphaCoach);

        System.out.println("\n pointing to the same object? "+ result);
        System.out.println("\n Memory location for theCoach"+ theCoach);
        System.out.println("\n Memory location for AlphaCoach"+ AlphaCoach);

        context.close();
    }
}


