package Classes_and_Objects;

class Dog{
    String name = new String();
    int age;
    void giveIntro(){
        System.out.println("My name is "+ this.name);
        System.out.println("I am "+ this.age + " yrs old");
    }
        }

public class ClassCreation {
    public static void main(String [] args){
        Dog sweety = new Dog();
        sweety.name ="Sweeeety";
        sweety.age = 10;
        sweety.giveIntro();
    }
}
