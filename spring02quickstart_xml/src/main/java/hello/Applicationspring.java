package hello;

import org.springframework.context.ApplicationContext;
    import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Applicationspring {
    public static void main(String[] args) {
        System.out.println("applicationspring");

        //初始化spring容器  由于xml配置文件在resources根目录下，所以直接写xml文件名就够了
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessagePrinter printer = context.getBean(MessagePrinter.class);

        printer.printMessage();


    }
}

