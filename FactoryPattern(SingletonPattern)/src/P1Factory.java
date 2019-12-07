/**
 * 具体工厂类
 */
public class P1Factory extends PhoneFactory {
    private P1 elderPhone = null;

    //生产线
    private String cpu = "MediaTek G90T";
    private String ram = "4GB";
    private String battery = "3000mAh";
    private String screen = "4.7 inch LCD; 1280*720";

    @Override
    Phone assemble() {
        elderPhone = new P1(this.cpu,this.ram,this.battery,this.screen);
        return elderPhone;
    }
}
