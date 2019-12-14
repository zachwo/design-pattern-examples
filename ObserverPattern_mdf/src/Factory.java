import java.util.ArrayList;
import java.util.List;

public class Factory {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;//状态


    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }
    //添加观察者
    public void attach(Observer observer){
        observers.add(observer);
    }
    //移除观察者
    public void remove(Observer observer){
        observers.remove(observer);
    }
    //通知观察者
    private void notifyAllObservers() {
        for (Observer observer : observers){
            observer.update();
        }
    }

}
