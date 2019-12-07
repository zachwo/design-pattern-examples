public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }


    public void construct(){
        builder.buildCPU();
        builder.buildRAM();
        builder.buildBattery();
        builder.buildScreen();
        builder.buildCamera();
        builder.buildGPS();
        builder.buildFingerPrintSensor();
        builder.buildNFC();
    }
}
