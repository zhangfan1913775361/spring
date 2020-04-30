package hello;

/**
 * 打印服务
 */


public class MessageService {
    //无参构造方法用ctrl+o选择object快捷生成
    public MessageService(){
        super();
        System.out.println("MessageService...");
    }

    public String getMessage(){
        return "hello world";
    }
}

