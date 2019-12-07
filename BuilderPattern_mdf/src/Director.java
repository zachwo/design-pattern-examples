public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }


    public void constructP1(){
        builder.buildCPU();
        builder.buildRAM();
        builder.buildBattery();
        builder.buildScreen();

    }
    public void constructP2(){
        builder.buildCPU();
        builder.buildRAM();
        builder.buildBattery();
        builder.buildScreen();
        builder.buildCamera();

    }
    public void constructP3(){
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
