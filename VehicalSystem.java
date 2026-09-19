class  Van {
    private String brand;
    private int speed;

    public Van(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayVaninfo() {
        System.out.println(" Brand :" + brand);
        System.out.println(" speed :" + speed);
    }
}
    class motorcar extends Van {
        String fuelType;
        public motorcar(String brand, int speed, String fuelType) {
            super(brand, speed);
            this.fuelType = fuelType;
        }

        void displayCarInfo() {
            displayVaninfo();
            System.out.println("Fuel type: " + fuelType);
        }
    }

public class VehicalSystem{
    public static void main(String[] args){
        motorcar car = new motorcar("Thar", 120, "Petrol");
     //   car.displayVaninfo();
        car.displayCarInfo();

    }
}


