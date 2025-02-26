class Abstract {
    public static void main(String a[]){

        Car obj = new OuterClass();  // you can't create a new object of an abstract class
        obj.drive();
        obj.stop();
        obj.owner();


        // calling inner class
        OuterClass obj1 = new OuterClass();
        OuterClass.InnerClass obj2 = obj1.new InnerClass();
        obj2.display();

        // calling static inner class
        OuterClass.StaticInnerClass obj4 = new OuterClass.StaticInnerClass();
        obj4.show();


        C objC = new C(){
            public void stop() {             
                super.stop();
                System.out.println("override stopping.......");
            }     
        };
        objC.stop();
    }    
}


abstract class Car{

    public abstract void drive();
    public abstract void stop();

    final void owner(){
        System.out.println("omar is the owner");
    }

}


abstract class B extends Car{
    public void drive(){
        System.out.println("driving ....");
    }
}

class OuterClass extends B{
    public void stop(){
        System.out.println("stopping ....");
    }

    class InnerClass{
        void display(){
            System.out.println("in InnerClass");
        }
    }
    static class StaticInnerClass{
        void show(){
            System.out.println("in StaticInnerClass");
        }
    }
}


class C {
    public void stop(){
        System.out.println("stopping ....");
    }
}