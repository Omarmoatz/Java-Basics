
class Human{
    private String name;
    private int age;


    Human(){    // Default Constructor  
        name = "omar";
        age = 23;

        System.out.println("----object created----");
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

    void showData(){
        System.out.println(this.getName() + " : " + this.getAge());
    }
}




class Encapsulation {
    public static void main(String a[]){


        Human obj = new Human();
        Human obj1 = new Human("mohamed");
        Human obj2 = new Human(80, "Ali");

        obj2.showData();
        obj1.showData();


        obj.setName("ahmad");
        obj.setAge(30);
        obj.showData();


        new Human().showData();  // anonymous object
        new Human().showData();  // anonymous object

    }
}
