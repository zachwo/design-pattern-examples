public class WorkerObserver extends Observer {

    public WorkerObserver(Factory message) {
        this.message = message;
        this.message.attach(this);
    }

    @Override
    public void update() {
        System.out.println("错误代码："+message.getState()+"，工人开始核查");
    }
}
