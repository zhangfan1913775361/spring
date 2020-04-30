package soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);//从APP里扫描组件构建spring容器
        CDPlayer player = context.getBean(CDPlayer.class);//从上下文中获取对象，而对象在CDPlayer里的对象
        player.play();
    }
}
