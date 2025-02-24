
class Human{
    private String name;
    private int age;


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
        obj.setName("omar");
        obj.setAge(23);

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
