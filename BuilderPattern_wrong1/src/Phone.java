public abstract class Phone {
    //必须部件
    private String cpu;
    private String ram;
    private String battery;
    private String screen;

    public Phone() {
    }

    //手机基本配置构造器
    public Phone(String cpu, String ram, String battery, String screen) {
        this.cpu = cpu;
        this.ram = ram;
        this.battery = battery;
        this.screen = screen;
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


}
