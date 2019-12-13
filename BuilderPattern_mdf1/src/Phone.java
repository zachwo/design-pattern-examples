import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Phone  {
    //必选项
    private String cpu;
    private String ram;
    private String battery;
    private String screen;
    //可选项
    private String camera;
    private String gps;
    private String fingerPrintSensor;
    private String nfc;

    private Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.battery = builder.battery;
        this.screen = builder.screen;

        this.camera = builder.camera;
        this.gps = builder.gps;
        this.fingerPrintSensor = builder.fingerPrintSensor;
        this.nfc = builder.nfc;
    }


    public static class Builder {
        // 必选项
        private String cpu;
        private String ram;
        private String battery;
        private String screen;
        //可选项
        private String camera;
        private String gps;
        private String fingerPrintSensor;
        private String nfc;

        public Builder(String cpu, String ram, String battery, String screen) {
            this.cpu = cpu;
            this.ram = ram;
            this.battery = battery;
            this.screen = screen;
        }

        public Builder camera(String camera){
            this.camera = camera;
            return this;
        }

        public Builder gps(String gps){
            this.gps = gps;
            return this;
        }

        public Builder fingerPrintSensor(String fingerPrintSensor){
            this.fingerPrintSensor = fingerPrintSensor;
            return this;
        }

        public Builder nfc(String nfc){
            this.nfc = nfc;
            return this;
        }

        public Phone build(){
            return new Phone(this);
        }
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getBattery() {
        return battery;
    }

    public String getScreen() {
        return screen;
    }

    public String getCamera() {
        return camera;
    }

    public String getGps() {
        return gps;
    }

    public String getFingerPrintSensor() {
        return fingerPrintSensor;
    }

    public String getNfc() {
        return nfc;
    }

    @Override
    public String toString() {
        return "处理器：\t"+getCpu()+"\n"+
                "内存：\t"+getRam()+"\n"+
                "电池：\t"+getBattery()+"\n"+
                "屏幕：\t"+getScreen()+"\n"+
                "相机：\t"+getCamera()+"\n"+
                "GPS功能：\t"+getGps()+"\n"+
                "指纹识别功能：\t"+getFingerPrintSensor()+"\n"+
                "NFC功能：\t"+getNfc();
    }
}
