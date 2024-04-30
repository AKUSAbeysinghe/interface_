 interface Bike {
    void changeGear(int a);
    void speedUp(int a);
    void applyBreaks(int a);

}

class Bicycle implements Bike{
    int speed;
    int gear;
    @Override
    public void changeGear(int newGear) {
        gear=newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed=speed+increment;
    }

    @Override
    public void applyBreaks(int decrement) {
        speed=speed-decrement;
    }

    public void print(){
        System.out.println("Speed: "+speed+"  Gear: "+gear);
    }
}

class MotorBike implements Bike{
    int speed;
    int gear;
    @Override
    public void changeGear(int newGear) {
        gear=newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed=speed+increment;
    }

    @Override
    public void applyBreaks(int decrement) {
        speed=speed-decrement;
    }

    public void print(){
        System.out.println("Speed: "+speed+"    Gear: "+gear);
    }
}

class Test4{
    public static void main(String[] args) {
        Bicycle b=new Bicycle();
        b.changeGear(2);
        b.speedUp(10);
        b.applyBreaks(5);
        System.out.println("Bicycle present status: ");
        b.print();

        MotorBike mb=new MotorBike();
        mb.changeGear(4);
        mb.speedUp(30);
        mb.applyBreaks(18);
        System.out.println("MotorBike present status: ");
        mb.print();
    }
}
