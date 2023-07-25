public class Superman implements CanFlyAble ,CanRunAble,CanSwim{


    @Override
    public void CanFly() {
        System.out.println(" Can fly");
    }

    @Override
    public void CanRun() {
        System.out.println( " Can run");

    }

    @Override
    public void swim() {
        System.out.println(" Can swim");

    }
}
