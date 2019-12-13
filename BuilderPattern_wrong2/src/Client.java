/**
 * 建造者模式：
 * 原理参考：https://www.cnblogs.com/java-my-life/archive/2012/04/07/2433939.html
 *
 * 手机由，CPU，内存，电池，屏幕4个必须部件，以及摄像头，GPS，指纹识别，NFC，4个可选部件组成。
 * 基于不同部件可以组装出不同类型手机。
 * 例如，P1为适合最简功能的老年机，仅需要基本部件即可；P2适合拍照爱好者；P3为旗舰版，等等。
 * 手机为抽象的，手机类型为具体的。在增加新手机类型时，无需创建新组装线。
 */
public class Client {
    public static void main(String[] args) {
        ConcreteBuilder p1Builder = new ConcreteBuilder();
        Director p1Director = new Director(p1Builder);
        p1Director.constructP1();
        Phone P1 = p1Builder.getPhone();

        ConcreteBuilder p2Builder = new ConcreteBuilder();
        Director p2Director = new Director(p2Builder);
        p2Director.constructP2();
        Phone P2 = p2Builder.getPhone();

        ConcreteBuilder p3Builder = new ConcreteBuilder();
        Director p3Director = new Director(p3Builder);
        p3Director.constructP3();
        Phone P3 = p3Builder.getPhone();


        System.out.println("\t\t老年机配置信息");
        System.out.println(P1);
        System.out.println("\t\t拍照手机配置信息");
        System.out.println(P2);
        System.out.println("\t\t旗舰机配置信息");
        System.out.println(P3);
    }
}
