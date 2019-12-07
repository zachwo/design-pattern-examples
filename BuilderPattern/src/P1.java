public class P1 extends Phone {
    public P1() {
    }

    public P1(String cpu, String ram, String battery, String screen) {
        super(cpu, ram, battery, screen);
    }

    @Override
    public String toString() {
        return "老年机基本配置：\n"+
                "处理器：\t"+getCpu()+"\n"+
                "内存：\t"+getRam()+"\n"+
                "电池：\t"+getBattery()+"\n"+
                "屏幕：\t"+getScreen();
    }
}
