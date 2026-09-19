class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Getter for name
    public String getName() {
        return name;
    }
    // Getter for age
    public int getAge() {
        return age;
    }
    void displayPersonInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
    class Doctor extends Person{
        private String specialization;
        private double salary;
        public Doctor(String name, int age, String specialization, double salary){
            super(name, age);
            this.specialization = specialization;
            this.salary = salary;
        }
        void displayDoctorInfo(){
            displayPersonInfo();
            System.out.println("Specialization: "+specialization);
            System.out.println("Salary: "+salary);
        }
    }
public class HospitalManagment {
    public static void main(String[] args){

        Doctor Dr = new Doctor("Dr Pawan", 21, "MBBS",60000);
        Dr.displayDoctorInfo();
    }
}
