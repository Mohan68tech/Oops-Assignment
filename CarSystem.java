class CarManagement{
    private String brand;
    private String name;
    private int year;
    boolean isrunning = false;

    public CarManagement(String brand, String name, int year){
        this.brand= brand;
        this.name= name;
        this.year= year;

    }
    void start(){
        if(!isrunning) {
            isrunning = true;
            System.out.println("Car start successfully");
        }
            else{
                System.out.println("car is already running");
            }
    }
    void stop(){
        if(isrunning){
            isrunning = false;
            System.out.println("Car stop successfully");
        }else{
            System.out.println("Car already stop");
        }
    }
    void displaydetails(String brand, String name, int year){
        System.out.println("Car brand :"+brand);
        System.out.println("Car name :"+ name);
        System.out.println("year :"+year);
        if(isrunning){
            System.out.println("Status: Running");
        }else{
            System.out.println("Status: Stop");
        }
    }
}
public class CarSystem {
    public static void main(String[] args){
        CarManagement car1 = new CarManagement("Tata", "Nexon", 2026);
        car1.displaydetails("TaTa", "Nexon", 2026);
        System.out.println(" ");
        car1.start();
        car1.displaydetails("TaTa", "Nexon", 2026);
        System.out.println(" ");
        car1.stop();
        car1.displaydetails("TaTa", "Nexon", 2026);

    }
}
