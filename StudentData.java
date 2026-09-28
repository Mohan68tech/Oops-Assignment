class StudInfo {
    private int rollno;
    private String name;
    private int marks;

    public void StudInfo(int rollno, String name, int marks) {
        int grade;
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;

    }
    void displayinfo(){
        System.out.println("Roll no. :"+rollno);
        System.out.println("Name :"+ name);
        System.out.println("Marks :"+ marks);
        if(100>= marks && marks >= 90){
            System.out.println("Grade A");
        }else if(marks>=80){
            System.out.println("Grade B");
        } else if (marks>=70) {
            System.out.println("Grade c");
        } else if (marks>=60) {
            System.out.println("Grade D");
        }else{
            System.out.println("Fail");
        }

    }
}
public class StudentData {
    public static void main(){
        StudInfo Sd = new StudInfo();
        Sd.StudInfo(101, "Mohan", 95);
        Sd.displayinfo();
    }
}


