interface Vehicle {
    abstract void drive();

}

interface Car{
    abstract void moderndrive();
}

class Audi implements Vehicle,Car{
    @Override
    public void drive() {
        System.out.println("Driving!");
    }

    @Override
    public void moderndrive() {
        System.out.println("Modern Driving!");
    }
}

class Test2{
    public static void main(String[] args) {
        Audi A=new Audi();
        //vehicle v=new Audi  ,car c=new Audi

        A.drive();
        A.moderndrive();
    }
}