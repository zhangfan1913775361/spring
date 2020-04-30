package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {

    private compactDisc cd;

    public CDPlayer() {
        super();
        System.out.println("CDPlayer的无参构造函数");
    }

    //怎么创建compactDisc和CDPlayer的关联关系呢？答：创建一个有参构造函数！！！并且还要写AutoWired自动装配注解
    //使用alt+insert选择constructor，如下所示
    @Autowired
    public CDPlayer(compactDisc cd) {
        this.cd = cd;
        System.out.println("CDPlayer的有参构造函数。。。。");
    }

    public void play(){
        System.out.println("调用了CDPlayer的play方法。。。。");
        cd.play();
    }
}