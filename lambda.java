class Lambda {
    public static void main(String a[]){

        App obj = new App(){
            public void config(){
                System.out.println("  in obj app");
            } 
        };
        obj.config();

        // using lambda
        App obj2 = () -> System.out.println("in lambda");
        obj2.config();

        //-----using lambda with parameters------
        // App2 objApp = (num) -> System.out.println("in lambda parameters " + num);
        // App2 objApp = num -> System.out.println("in lambda parameters " + num);
        // App2 objApp = num -> {
        //     int r = num *100 ;
        //     System.out.println("in lambda parameters " + r);
        // };
        App2 objApp = (num, num2) -> num + num2 *100;

        int r = objApp.config(50, 100);
        System.out.println(r);
    }
}

// FunctionalInterface:means an interface that have only one method
@FunctionalInterface // used the annotation to ensure that the interface only have one method
interface App{
    void config();
}


@FunctionalInterface 
interface App2{
    int config(int num, int num2);
}




