class Demo {
    public static void main(String a[]){

        A obj = new A();
        obj.show();
        // obj.display();

        System.out.println(Car.id );
        System.out.println(Car.brand);


        //--example-2---///////

        Rest obj1 = new RestToDefault();
        Rest obj2 = new RestoreBackup();

        App appobj = new App();
        // appobj.rest(obj1);
        appobj.rest(obj2);
        



    }
}


interface Car{

    // all variables in the interface are ( final, static )
    int id = 23;
    String brand = "BMW";

    // all methods in the interface are ( public, abstract )
    void show();
    // void display();

}

interface Wagon{
    void drive();
}

interface AdvancedCar extends Car, Wagon{
    void driveFast();
}



class A implements AdvancedCar{
    public void show(){
        System.out.println("in show");
    }
    
    public void drive(){
        System.out.println("  driving....");
    }
    
    public void driveFast(){
        System.out.println("  driving....very fast---");
    }
}

//--example-2---////////////////////////////////////////////////////////////////////////

interface Rest{
    void rest();
}


class RestToDefault implements Rest{
    public void rest(){
        System.out.println("resting to default.......");
    }
}

class RestoreBackup implements Rest{
    public void rest(){
        System.out.println(" restoring backup........");
    }
}



class App{
    public void rest(Rest obj){
        obj.rest();
    } 
}
