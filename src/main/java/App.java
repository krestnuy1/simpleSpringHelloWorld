import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld helloWorld = applicationContext.getBean("helloworld", HelloWorld.class);

        Cat cat = applicationContext.getBean("catHelloWorld", Cat.class);
        Cat cat2 = applicationContext.getBean("catHelloWorld", Cat.class);

        System.out.println(helloWorld == bean);
        System.out.println(cat == cat2);
    }
}