/**
 * 消息源工厂
 */

import java.util.ArrayList;
import java.util.List;

public abstract class MessageFactory {
    private List<Observer> list = new ArrayList<Observer>();

    public void add(Observer observer){
        list.add(observer);
        System.out.println(observer+"已添加至观察者");
    }

    public void remove(Observer observer){
        list.remove(observer);
        System.out.println(observer+"已移出观察者");
    }

    public void notify(String message){
        for (Observer observer: list){
            observer.update(message);
        }
    }

}