package hello;

public class Application {
    public static void main(String[] args) {
        System.out.println("application");

        MessageService service = new MessageService();
        MessagePrinter printer = new MessagePrinter();

        //设置打印机属性
        printer.setService(service);

        //打印属性
        printer.printMessage();


    }
}

