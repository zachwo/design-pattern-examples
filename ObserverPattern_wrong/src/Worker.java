/**
 * 具体观察者：工人
 */
public class Worker implements Observer {
    private String occupation = "工人";
    private String gotMessage;


    @Override
    public void update(String message) {
        //更新获取的状态信息
        this.gotMessage = message;
        System.out.println("工人此时获取到的状态信息："+this.gotMessage);
    }

    @Override
    public void action() {
        System.out.println("工人开始进行核查"+gotMessage+"这一事件原因");
    }

    @Override
    public String toString() {
        return this.occupation;
    }
}
