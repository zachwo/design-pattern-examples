/**
 * 建造者模式：
 * 原理参考：https://www.runoob.com/design-pattern/design-pattern-tutorial.html
 * 原理参考：https://www.cnblogs.com/java-my-life/archive/2012/04/07/2433939.html
 *
 * 手机由，CPU，内存，电池，屏幕4个必须部件，以及摄像头，GPS，指纹识别，NFC，4个可选部件组成。
 * 基于不同部件可以组装出不同类型手机。
 * 例如，P1为适合最简功能的老年机，仅需要基本部件即可；P2适合拍照爱好者；P3为旗舰版，等等。
 * 手机为抽象的，手机类型为具体的。在增加新手机类型时，无需创建新组装线。
 */
public class Client {
    public static void main(String[] args) {
        Phone p1 = new Phone
                .Builder("MediaTek G90T","4GB","3000mAh","4.7 inch LCD; 1280*720")
                .build();
        System.out.println("老年机配置：\n"+p1+"\n");

        Phone p2 = new Phone
                .Builder("Qualcomm SnapDragon 730G","6GB","4000mAh","6.41 inch OLED; 2340*1080")
                .camera("10800万像素超高清镜头+2000万像素超广角摄像头+1200万像素人像镜头+500万像素超长焦镜头+微距镜头")
                .build();
        System.out.println("拍照手机配置：\n"+p2+"\n");

        Phone p3 = new Phone
                .Builder("Apple A13","8GB","4200mAh","6.8inch OLED; 3040*1440")
                .camera("1200万广角摄像头+1200万超广角摄像头+1200万长焦摄像头")
                .gps("GPS+北斗导航定位系统")
                .fingerPrintSensor("超声波屏下指纹")
                .nfc("全功能NFC")
                .build();
        System.out.println("旗舰机配置：\n"+p3+"\n");
    }
}
