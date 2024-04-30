interface Animal {
    abstract void animalSound();
    abstract void sleep();

}

class Cat implements Animal{
    @Override
    public void animalSound() {
        System.out.println("Baw Baw!");
    }

    @Override
    public void sleep() {
        System.out.println("zzzz!");
    }
}

class Test{
    public static void main(String[] args) {
        Cat c=new Cat();    //Animal a=new Cat();
        c.animalSound();;
        c.sleep();
    }
}
