public class Student {

    private String name;
    private int age;
    private String lop;
    
    public Student(String name, int age, String lop){
        this.name = name;
        this.age = age;
        this.lop = lop;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getLop(){
        return lop;
    }

    public void setLop(String lop){
        this.lop = lop;
    }
    public static void main(String[] args) {
        Student a = new Student("Nguyễn Văn A", 6, "1A3");

        System.out.println("Name: " + a.getName() + " - Age: " + a.getAge() + " - Class: " + a.getLop());

        a.setLop("1a7");
        System.out.println("Sinh viên đã chuyển sang lớp: " + a.getLop());

        a = null;
        System.out.println("Dữ liệu của sinh viên đã bị xóa.");
        
    }
}
