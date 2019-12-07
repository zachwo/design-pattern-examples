/**
 * #### 工厂模式/单例模式
 * 原理参考：https://www.cnblogs.com/java-my-life/archive/2012/03/28/2418836.html
 * 原理参考：https://www.cnblogs.com/java-my-life/archive/2012/03/31/2425631.html
 *
 * 部件由部件生产线提供，手机由组装线组装。
 * 在增加新零部件时，仅需增加新生产线及生成方法，而无需修改原实现。
 */
public class Client {
    public static void main(String[] args) {
        P1Factory p1Factory = new P1Factory();
        P2Factory p2Factory = new P2Factory();
        P3Factory p3Factory = new P3Factory();

        P1 elderPhone = (P1)p1Factory.assemble();
        P2 cameraPhone = (P2)p2Factory.assemble();
        P3 flagshipPhone = (P3)p3Factory.assemble();

        System.out.println(elderPhone);
        System.out.println();
        System.out.println(cameraPhone);
        System.out.println();
        System.out.println(flagshipPhone);
    }
}
