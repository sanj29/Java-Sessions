package Oops;

public class Student {

    int rolNum;
    String Name;
    static String  schoolName="KV";
    double mobileNum;

    public Student(int rol, String name, double mNum) {
        this.rolNum=rol;
        this.Name=name;
        this.mobileNum=mNum;
    }

    public void getStudentDetails(){
        System.out.println("name:: "+Name);
        System.out.println("Rollnum:: "+ rolNum);
        System.out.println("Schoolname:: "+ schoolName);
        System.out.println("Mobile num:: " + mobileNum);

    }
    public static void main(String[] args) {
        Student st = new Student(123,"Sanjya",1234567890);
        st.getStudentDetails();
        System.out.println(Student.schoolName);

    }
}


