public class ManagerObserver extends Observer {
    public ManagerObserver(Factory message) {
        this.message = message;
        this.message.attach(this);
    }

    @Override
    public void update() {
        System.out.println("错误代码："+message.getState()+"，质管员开始记录");
    }
}
