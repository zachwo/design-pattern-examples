public class ConcreteBuilder implements Builder {
    private Phone  phone = new Phone();


    @Override
    public void buildCPU() {
        phone.setCpu("Qualcomm SnapDragon 855");

    }

    @Override
    public void buildRAM() {
        phone.setRam("12GB");
    }

    @Override
    public void buildBattery() {
        phone.setBattery("4300mAh");

    }

    @Override
    public void buildScreen() {

        phone.setScreen("6.8inch AMOLED; 3040*1440");

    }

    @Override
    public void buildCamera() {
        phone.setCamera("主摄S5K2L4+长焦S5K3M5+超广角S5K3P9+ToFIMX316");


    }

    @Override
    public void buildGPS() {
        phone.setGps("GPS+北斗导航定位系统");

    }

    @Override
    public void buildFingerPrintSensor() {
        phone.setFingerPrintSensor("超声波屏下指纹");

    }

    @Override
    public void buildNFC() {
        phone.setNfc("全功能NFC");
    }

    @Override
    public Phone getPhone() {
        return phone;
    }


}
