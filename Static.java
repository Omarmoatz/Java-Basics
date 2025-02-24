
class Mobile{
    
    // instance variable
    int id;
    static String brand;
    String name;

    static{
        brand = "Samsung";
        System.out.println("in static");
    }
    
    // constructor
    Mobile(){
        id = 145;
        name = "Samsung S25";
        System.out.println("in constructor");
    } 

    // instance method encapsulation
    public void show(){

        // local variable
        int a;

        System.out.println(id + " : " + brand + " : " + name);
    }

    public static void show_data(Mobile obj){
        System.out.println(obj.id + " : " + brand + " : " + obj.name);
    }

}



public class Static {
    public static void main(String a[]){

        Mobile m1 = new Mobile();
        m1.id = 1;
        m1.name = "Galaxy S24";


        Mobile m2 = new Mobile();
        m2.id = 2;
        // m2.brand = "Samsung mini";
        m2.name = "Galaxy S25";


        m1.show();
        m2.show();


        Mobile.show_data(m1);
    }
    
}
