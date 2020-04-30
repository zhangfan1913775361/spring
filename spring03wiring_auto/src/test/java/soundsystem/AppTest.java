package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//用spring内部的解决方案进行的单元测试。
@ContextConfiguration(classes=AppConfig.class)
public class AppTest {

    @Autowired
    private CDPlayer player;

    @Test
    public void testPlay(){
        player.play();
    }
}
