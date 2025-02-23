class IfElse {
    public static void main(String a[]){
        int x = 10;
        int y = 20;
        int z = 30;

        if(x > y & x >= 10){
            System.out.println(x);
            System.out.println("x is greater");
        }
        else if(y>x && y>z){
            System.out.println(y);
            System.out.println("y is greater");
        }
        else
            System.out.println("z is greater");


        // ternary operator ( ? : )
        int n = 6;
        int result =  n%2==0 ? 10 : 20; 

        System.err.println("ternary operator result: " + result);
    }
}
