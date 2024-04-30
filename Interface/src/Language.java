interface Language {
    void getName(String name); //interface wala thiyena methods aniwarayen class eka athule override wiya yutumi

}

class ProgrammingLanguage implements Language{

    @Override
    public void getName(String name) {
        System.out.println("Programing Language "+name);
    }
}

class Test1{
    public static void main(String[] args) {
       Language l=new ProgrammingLanguage();  //ProgrammingLanguage pl=new ProgrammingLanguage
       l.getName("Java");
    }
}
