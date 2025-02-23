package array;

class Students{
    int id;
    String name;
    int marks;
}



class ArrayOfObjects{
    public static void main(String a[]){


        Students std1 = new Students();
        std1.id = 1;
        std1.name = "omar";
        std1.marks = 99;

        Students std2 = new Students();
        std2.id = 2;
        std2.name = "ahmad";
        std2.marks = 56;


        Students std3 = new Students();
        std3.id = 3;
        std3.name = "ezzat";
        std3.marks = 86;


        Students students[] = new Students[3];
        students[0] = std1;
        students[1] = std2;
        students[2] = std3;

        for (Students std: students){
            System.out.println(std.name + std.marks);
        }

    }
}