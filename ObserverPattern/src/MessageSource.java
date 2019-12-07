/**
 * 消息源
 */

public class MessageSource extends MessageFactory {
    private String message;

    public String getMessage() {
        return message;
    }

    public void change(String newMessage){
        this.message = newMessage;
        System.out.println("新消息："+message);
        notify(message);
    }


}
