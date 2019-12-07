/**
 * 具体工厂类
 */
public class P2Factory extends PhoneFactory {
    private P2 cameraPhone = null;

    //生产线
    private String cpu = "Qualcomm SnapDragon 730G";
    private String ram = "6GB";
    private String battery = "4000mAh";
    private String screen = "6.41 inch OLED; 2340*1080";
    private String camera = "10800万像素超高清镜头+2000万像素超广角摄像头+1200万像素人像镜头+500万像素超长焦镜头+微距镜头";


    @Override
    Phone assemble() {
        cameraPhone = new P2(this.cpu,this.ram,this.battery,this.screen,this.camera);
        return cameraPhone;
    }
}
