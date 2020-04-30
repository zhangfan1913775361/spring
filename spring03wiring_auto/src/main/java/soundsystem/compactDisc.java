package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class compactDisc {
    public compactDisc() {
        super();
        System.out.println("compact Disc的无参构造方法");
    }
    public void play(){
        System.out.println("调用了CompactDisc的play方法");
    }
}
