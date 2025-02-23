package array;

public class Arrays {
    public static void main(String a[]){
        int arr[][] = new int[3][];

        arr[0] = new int[4];
        arr[1] = new int[5];
        arr[2] = new int[6];


        for(int n[] : arr){
            for(int m:n){
                m = (int)(Math.random()*10);
                System.out.print(m + " ");
            }

            System.out.println(" ");
        }

        for(int i=0; i<3; i++){

            for(int j=0; j<4; j++){
                arr[i][j] = (int)(Math.random()*10);
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }



    }
}
