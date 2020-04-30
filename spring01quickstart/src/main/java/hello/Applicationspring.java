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
//        //设置打印机属性(这一步不能缺，否则会发生空指针。因为printMessage里有service)
//        printer.setService(service);
//
//        //打印属性
//        printer.printMessage();

        //基于注解，用spring容器创建对象，下面的实现类的参数写注解下面一行的类名。
        ApplicationContext context = new AnnotationConfigApplicationContext(Applicationspring.class);

        //获取bean对象。
        // 想获取由spring容器创建的对象，使用context就可以啦~（肯定不能用new，都已经创建好了，new它干嘛）

        //因为在setService方法上加入了AutoWired注解，所以可以自动调用setService方法了，所以下面注释的三行都可以不写了
//        MessageService service = context.getBean(MessageService.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
//        System.out.println(printer);
//        printer.setService(service);
        printer.printMessage();


    }
}

