package ClassAdapter;

public class Adapter extends Micro implements TypeC {

    @Override
    public void fastCharge() {
        System.out.println("开始进行快速充电");
    }
}
