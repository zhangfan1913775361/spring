package hello;

import org.springframework.stereotype.Component;

/**
 *
 * 打印机
 */

@Component
public class MessagePrinter {
    public MessagePrinter() {
        super();
        System.out.println("MessagePrinter...");
    }

    //因为要用MP调用MS的功能，所以把MS类作为MP的成员变量,才能建立MP和MS的关联关系
    private MessageService service;

    public void setService(MessageService service) {
        this.service = service;
    }

    public void printMessage(){
        System.out.println(this.service.getMessage());

    }

}
