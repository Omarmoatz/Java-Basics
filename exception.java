// throw == raise 
// throws : it throw the exception to the the calling class or obj    

class TryException {
    public static void main(String a[]){
        int x = 0;
        int y = 0;
        int arr[] = new int[4];


        A obj = new A();
        try{
            obj.show(); 
        }catch(ClassNotFoundException e){
            System.err.println("class not found---- " + e );
        }

        try{
            if(y==0){
                throw new CustomException("heyyyy stoppppppp you canttttt");
            }

            System.out.println(arr[1]);;
            System.out.println(arr[5]);;
            y = 50/x;

        }catch(ArithmeticException e){
            System.out.println("you cant divide by zero");
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Index out of range" + e);
        }catch(CustomException e){
            System.out.println(" --------  "+e);
        }catch(Exception e){
            System.out.println(e);
        }

        System.err.println(y);
    }
}


class CustomException extends Exception{
    public CustomException(String e){
        super(e);
    }
}


class A {
    public void show() throws ClassNotFoundException{
        Class.forName("calc");
    }
}