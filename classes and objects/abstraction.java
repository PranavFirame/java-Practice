public class abstraction{
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.properties();
        c1.printdata();
    }
}

abstract class ancestors{
    abstract void printdata();
}

interface Animal{
    void properties();
}

class Cat extends ancestors implements Animal{
    String name;
    Cat(){
        this.name = "Cat";
    }
    public void properties(){
        System.out.println(this.name + " walks on 4 legs");
    }
    void printdata(){
        System.out.println(this.name);
    }
}