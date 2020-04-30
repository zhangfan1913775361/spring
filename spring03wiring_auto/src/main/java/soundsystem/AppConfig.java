package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 为什么要写配置类呢?因为有的时候并不是从mian类里启动的，有可能是浏览器，移动端等终端启动
 * 但是这样的话，@ComponentScan就没地方放了，这个注解要和主类解耦，所以我们要用配置类。
 */
@ComponentScan
@Configuration//表明当前是个配置类
public class AppConfig {
}
