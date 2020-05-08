package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {

//    @Autowired
    private compactDisc cd;

//    @Autowired
    private Power power;

    //使用alt+insert构建set方法


//    @Autowired
//    public void setCd(compactDisc cd) {
//        this.cd = cd;
//    }
//
//    @Autowired
//    public void setPower(Power power) {
//        this.power = power;
//    }

    @Autowired
    public void prepare(compactDisc cd,Power power){
        this.cd = cd;
        this.power = power;
    }

    public CDPlayer() {
        super();
        System.out.println("CDPlayer的无参构造函数");
    }

    //怎么创建compactDisc和CDPlayer的关联关系呢？答：创建一个有参构造函数！！！并且还要写AutoWired自动装配注解
    //使用alt+insert选择constructor，如下所示
//    @Autowired
//    public CDPlayer(compactDisc cd) {
//        this.cd = cd;
//        System.out.println("CDPlayer的有参构造函数。。。。");
//    }


    @Autowired
    public CDPlayer(compactDisc cd, Power power) {
        this.cd = cd;
        this.power = power;
        System.out.println("CDPlayer的多参数构造函数。。。。");
    }

    public void play(){
        power.supply();
        System.out.println("调用了CDPlayer的play方法。。。。");
        cd.play();
    }
}
