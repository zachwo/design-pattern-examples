/**
 * 具体工厂类
 */
public class P3Factory extends PhoneFactory{
    private P3 flagshipPhone = null;

    //生产线
    private String cpu = "Apple A13";
    private String ram = "8GB";
    private String battery = "4200mAh";
    private String screen = "6.8inch OLED; 3040*1440";
    private String camera = "1200万广角摄像头+1200万超广角摄像头+1200万长焦摄像头";
    private String gps = "GPS+北斗导航定位系统";
    private String fingerPrintSensor = "超声波屏下指纹";
    private String nfc = "全功能NFC";



    @Override
    Phone assemble() {
        flagshipPhone = new P3(this.cpu,this.ram,this.battery,this.screen,
                this.camera,this.gps, this.fingerPrintSensor,this.nfc);
        return flagshipPhone;
    }
}
