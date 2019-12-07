public class P3 extends Phone {

    private String camera;
    private String gps;
    private String fingerPrintSensor;
    private String nfc;

    public P3() {
    }

    public P3(String cpu, String ram, String battery, String screen, String camera, String gps, String fingerPrintSensor, String nfc) {
        super(cpu, ram, battery, screen);
        this.camera = camera;
        this.gps = gps;
        this.fingerPrintSensor = fingerPrintSensor;
        this.nfc = nfc;
    }


    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getFingerPrintSensor() {
        return fingerPrintSensor;
    }

    public void setFingerPrintSensor(String fingerPrintSensor) {
        this.fingerPrintSensor = fingerPrintSensor;
    }

    public String getNfc() {
        return nfc;
    }

    public void setNfc(String nfc) {
        this.nfc = nfc;
    }

    @Override
    public String toString() {
        return "旗舰手机基本配置：\n"+
                "处理器：\t"+getCpu()+"\n"+
                "内存：\t"+getRam()+"\n"+
                "电池：\t"+getBattery()+"\n"+
                "屏幕：\t"+getScreen()+"\n"+
                "相机：\t"+getCamera()+"\n"+
                "GPS功能：\t"+getGps()+"\n"+
                "指纹识别功能：\t"+getFingerPrintSensor()+"\n"+
                "NFC功能：\t"+getNfc();
    }
}
