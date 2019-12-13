public interface Builder {
    void buildCPU();
    void buildRAM();
    void buildBattery();
    void buildScreen();
    void buildCamera();
    void buildGPS();
    void buildFingerPrintSensor();
    void buildNFC();

    P1 getElderPhone();
    P2 getCameraPhone();
    P3 getFlagshipPhone();
}
