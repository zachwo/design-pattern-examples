/**
 * 观察者模式
 * 原理参考：https://www.runoob.com/design-pattern/design-pattern-tutorial.html
 * 原理参考：https://www.cnblogs.com/java-my-life/archive/2012/05/16/2502279.html
 *
 *当生产线生产出问题部件时，发送消息通知所有关注部件质量的人，例如质管员，工人等。
 *
 * 思路：设计一个抽象的观察者，包含当收到消息时的行为；任何具体观察者决定收到消息后的行为实现。
 * 设计消息源，维护一个监听此消息源的观察者集合，提供将观察者加入/移除集合的方法，提供通知所有此消息观察者消息产生的方法。
 * 设计一个消息源工厂，封装各种消息源。即，当需要发送任何消息或订阅任何消息源监听时，通过工厂实现。
 * 当部件生产出现问题(调用一个方法模拟即可)，通知部件质量消息源错误信息，
 * 消息源通知注册在此消息源上的全部观察者事件的发生，各观察者产生不同的消息消费行为，例如质管员记录，工人核查等(均为模拟的方法)。
 *
 * 一个消息源工厂管理多个静态消息源
 *
 */
public class Test {
    public static void main(String[] args) {
        MessageSource messageSource = new MessageSource();
        Observer worker = new Worker();
        Observer qualityManager = new QualityManager();

        messageSource.add(worker);
        messageSource.add(qualityManager);
        System.out.println();

        messageSource.change("停电了");
        worker.action();
        qualityManager.action();
        System.out.println();

        messageSource.change("供电恢复");
        worker.action();
        qualityManager.action();
        System.out.println();

        //质管员移出观察者名单后，信息不再更新
        messageSource.remove(qualityManager);
        messageSource.change("停水了");
        worker.action();
        qualityManager.action();

    }
}
