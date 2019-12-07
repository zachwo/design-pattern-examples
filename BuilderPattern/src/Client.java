/**
 * 建造者模式：https://www.cnblogs.com/java-my-life/archive/2012/04/07/2433939.html
 * 手机由，CPU，内存，电池，屏幕4个必须部件，以及摄像头，GPS，指纹识别，NFC，4个可选部件组成。
 * 基于不同部件可以组装出不同类型手机。
 * 例如，P1为适合最简功能的老年机，仅需要基本部件即可；P2适合拍照爱好者；P3为旗舰版，等等。
 * 手机为抽象的，手机类型为具体的。在增加新手机类型时，无需创建新组装线。
 */
public class Client {
    public static void main(String[] args) {
//        System.out.println("这是建造者模式的应用");
        ConcreteBuilder builder = new ConcreteBuilder();
        Director director = new Director(builder);
//        director.constructP1();
//        director.constructP2();
        director.construct();

        P1 elderPhone = builder.getElderPhone();
        P2 cameraPhone = builder.getCameraPhone();
        P3 flagshipPhone = builder.getFlagshipPhone();

        System.out.println(elderPhone);
        System.out.println();
        System.out.println(cameraPhone);
        System.out.println();
        System.out.println(flagshipPhone);
    }
}
