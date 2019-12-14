/**
 * 具体观察者：质管员
 */
public class QualityManager implements Observer {
    private String gotMessage;
    private String occupation = "质检员";

    @Override
    public void update(String message) {
        //更新获取的状态信息
        this.gotMessage = message;
        System.out.println("质管员此时获取到的状态信息："+this.gotMessage);
    }

    @Override
    public void action() {
        System.out.println("质管员开始记录"+gotMessage+"这一事件");
    }

    @Override
    public String toString() {
        return this.occupation;
    }
}
