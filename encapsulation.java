
class Human{
    private String name;
    private int age;


    Human(){    // Default Constructor  
        name = "omar";
        age = 23;
    }

    Human( String name){    // Parametrized Constructor
        this.name = name;
        age = 25;
    }

    Human(int age, String name){    // Parametrized Constructor
        this.name = name;
        this.age = age;
    }

    int getAge(){
        return age;
    }

    void setAge(int age){
        this.age = age;
    }

    String getName(){
        return name;
    }

    void setName(String name){
        this.name = name;
    }
}




class Encapsulation {
    public static void main(String a[]){


        Human obj = new Human();
        Human obj1 = new Human("mohamed");
        Human obj2 = new Human(80, "Ali");

        System.out.println(obj1.getName() + " : " + obj1.getAge());
        System.out.println(obj2.getName() + " : " + obj2.getAge());


        obj.setName("ahmad");
        obj.setAge(30);

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
