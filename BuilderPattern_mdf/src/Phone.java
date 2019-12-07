public class Phone {
    private String cpu;
    private String ram;
    private String battery;
    private String screen;
    private String camera;
    private String gps;
    private String fingerPrintSensor;
    private String nfc;

    public Phone() {
    }

    public Phone(String cpu, String ram, String battery, String screen) {
        this.cpu = cpu;
        this.ram = ram;
        this.battery = battery;
        this.screen = screen;
    }

    public Phone(String cpu, String ram, String battery, String screen, String camera) {
        this.cpu = cpu;
        this.ram = ram;
        this.battery = battery;
        this.screen = screen;
        this.camera = camera;
    }

    public Phone(String cpu, String ram, String battery, String screen, String camera, String gps, String fingerPrintSensor, String nfc) {
        this.cpu = cpu;
        this.ram = ram;
        this.battery = battery;
        this.screen = screen;
        this.camera = camera;
        this.gps = gps;
        this.fingerPrintSensor = fingerPrintSensor;
        this.nfc = nfc;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
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
        return "\t\t手机配置信息：\n"+
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
