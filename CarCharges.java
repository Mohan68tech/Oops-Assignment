public class CarCharges {
    private String Carname;
    private int rentalDays;
    private int rentPerDay;

    public CarCharges(String Carname, int rentalDays, int rentPerDay){
        this.Carname = Carname;
        this.rentalDays = rentalDays;
        this.rentPerDay = rentPerDay;

    }
    public int CalulateTotalental(){
        return rentalDays * rentPerDay;
    }
    void displayDetails(){
        System.out.println("*******  Car rental center ******");
        System.out.println("Car name is: "+Carname);
        System.out.println("Car rental days : "+rentalDays);
        System.out.println("Car rent per days : "+rentPerDay);
        System.out.println("Car total rental charges :  "+CalulateTotalental());
        System.out.println(" ");
    }
    public static void main(String[] args){
        CarCharges  Cr = new CarCharges("Swift dz68", 5, 100);
        Cr.displayDetails();

        CarCharges  Cr2 = new CarCharges("Thar", 6, 500);
        Cr2.displayDetails();

    }
}
