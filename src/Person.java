import java.lang.reflect.Array;

public class Person {

    private String name;
    public String getName(){
        return name;
    };
    public void setName(String name){
        this.name = name;
    };
    public void sayHello(){
        System.out.println("Hello from " + this.name);
    };
    //constructors
    Person(String nameExt){
        this.name = nameExt;
    }



    public static void main(String[] args) {
        Person per = new Person("Jacob");
        per.sayHello();
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }
}