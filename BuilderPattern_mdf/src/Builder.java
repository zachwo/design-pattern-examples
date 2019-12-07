public interface Builder {
    void buildCPU();
    void buildRAM();
    void buildBattery();
    void buildScreen();
    void buildCamera();
    void buildGPS();
    void buildFingerPrintSensor();
    void buildNFC();

    Phone getPhone();
}
