package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan//扫描所有有component的注解，才能由spring容器自动创建对象
public class Applicationspring {
    public static void main(String[] args) {
        System.out.println("applicationspring");

//        MessageService service = new MessageService();
//        MessagePrinter printer = new MessagePrinter();
//
//        //设置打印机属性
//        printer.setService(service);
//
//        //打印属性
//        printer.printMessage();

        //基于注解，用spring容器创建对象，下面的实现类的参数写注解下面一行的类名。
        ApplicationContext context = new AnnotationConfigApplicationContext(Applicationspring.class);


    }
}

