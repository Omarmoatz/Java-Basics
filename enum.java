class Demo {
    public static void main(String a[]){

        Status obj = Status.Failed;
        System.out.println(obj);

        Status objs[] = Status.values();

        for(Status s : objs)
            System.out.println(s + " : " + s.ordinal());
        

        switch(obj){
            case Completed:
                System.out.println(" very good");
                break;

            case Pending:
                System.out.println(" in progress.....");
                break;
            
            case Failed:
                System.out.println(" Try again");
                break;
            
            default:
                System.out.println(" enter a valid status");
        }       


        for(Cars car : Cars.values()){
            System.out.println(car + " : " + car.getPrice());
        }

    }
}



enum Status{
    Completed, Pending, Failed;
}


enum Cars{
    Bmw(), Mercedes(6030), Porch(90500), Ferrari(10200);

    private int price;

    Cars(){
        price = 800;
    }

    Cars(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}


