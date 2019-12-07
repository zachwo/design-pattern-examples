public class ConcreteBuilder implements Builder {
    private P1 elderPhone = new P1();
    private P2 cameraPhone = new P2();
    private P3 flagshipPhone = new P3();



    @Override
    public void buildCPU() {
        elderPhone.setCpu("MediaTek G90T");
        cameraPhone.setCpu("Qualcomm SnapDragon 730G");
        flagshipPhone.setCpu("Apple A13");
    }

    @Override
    public void buildRAM() {
        elderPhone.setRam("4GB");
        cameraPhone.setRam("6GB");
        flagshipPhone.setRam("8GB");
    }

    @Override
    public void buildBattery() {
        elderPhone.setBattery("3000mAh");
        cameraPhone.setBattery("4000mAh");
        flagshipPhone.setBattery("4200mAh");

    }

    @Override
    public void buildScreen() {
        elderPhone.setScreen("4.7 inch LCD; 1280*720");
        cameraPhone.setScreen("6.41 inch OLED; 2340*1080");
        flagshipPhone.setScreen("6.8inch OLED; 3040*1440");

    }

    @Override
    public void buildCamera() {
        cameraPhone.setCamera("10800万像素超高清镜头+2000万像素超广角摄像头+1200万像素人像镜头+500万像素超长焦镜头+微距镜头");
        flagshipPhone.setCamera("1200万广角摄像头+1200万超广角摄像头+1200万长焦摄像头");

    }

    @Override
    public void buildGPS() {
        flagshipPhone.setGps("GPS+北斗导航定位系统");

    }

    @Override
    public void buildFingerPrintSensor() {
        flagshipPhone.setFingerPrintSensor("超声波屏下指纹");

    }

    @Override
    public void buildNFC() {
        flagshipPhone.setNfc("全功能NFC");
    }

    @Override
    public P1 getElderPhone() {
        return elderPhone;
    }

    @Override
    public P2 getCameraPhone() {
        return cameraPhone;
    }

    @Override
    public P3 getFlagshipPhone() {
        return flagshipPhone;
    }
}
