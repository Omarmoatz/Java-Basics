class Hello {
    public static void main(String a[]){
        int num = 50_0000_000;
        int num2 = 10;
        byte by = -128;     // from -128 to 127
        long long_num = 65146854611651465l;

        char character = 'o';
        String name = "omar";
        
        float decimal_num = 6848466.65146515f;
        double long_decimal_num = 561656.555f;


        boolean is_good = true;
        int result = num + num2 + by;   
        
        
        int binary_num = 0b0101;
        int hexa_num = 0x8f;
        character++; 


        int x = 258;
        byte y = (byte)x;
        


        System.out.println(is_good);
        System.out.println(y);

        System.out.println(name);
        System.out.println(character);

        System.out.println(num);

        System.out.println(long_num);
        System.out.println(result);
        System.out.println("hello omar");
    }
}