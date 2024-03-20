import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean2.getMessage());
        System.out.println(bean == bean2);

        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean.getMessage());
        System.out.println(catBean2.getMessage());
        System.out.println(catBean == catBean2);
    }
}