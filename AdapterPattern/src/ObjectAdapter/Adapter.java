package ObjectAdapter;

public class Adapter implements TypeC{
    private Micro micro;

    public Adapter(Micro micro) {
        this.micro = micro;
    }


    @Override
    public void fastCharge() {
        System.out.println("开始进行快速充电");
    }

    @Override
    public void io() {
        this.micro.io();
    }

    public void normalCharge(){
        this.micro.normalCharge();
    }
}
