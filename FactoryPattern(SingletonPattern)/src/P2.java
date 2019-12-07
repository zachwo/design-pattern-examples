/**
 * 具体产品类
 */
public class P2 extends Phone {
    private String camera;

    public P2() {
    }

    //生成方法
    public P2(String cpu, String ram, String battery, String screen, String camera) {
        super(cpu, ram, battery, screen);
        this.camera = camera;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "拍照手机基本配置：\n"+
                "处理器：\t"+getCpu()+"\n"+
                "内存：\t"+getRam()+"\n"+
                "电池：\t"+getBattery()+"\n"+
                "屏幕：\t"+getScreen()+"\n"+
                "相机：\t"+getCamera();

    }
}
