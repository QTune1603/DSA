import java.util.LinkedList;
import java.util.Queue;

public class Student {

    private String name;
    private int age;
    private String lop;

    public Student(String name, int age, String lop) {
        this.name = name;
        this.age = age;
        this.lop = lop;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public static void main(String[] args) {
        Student a = new Student("Nguyen Van A", 10, "5D4");
        Student b = new Student("Nguyen Van B", 9, "4C3");
        Student c = new Student("Nguyen Van C", 8, "3B2");
        Student d = new Student("Nguyen Van D", 7, "2A1");

        Queue<Student> qe = new LinkedList<>();

        //them lan luot sinh vien vao queue
        qe.add(a);
        qe.add(b);
        qe.add(c);
        qe.add(d);

        System.out.println("Danh sach sinh vien da duoc them vao queue:");
        for(Student x:qe){
            System.out.println("Name: " + x.name + " " + " Age: " + x.age + " " + " Class: " + x.lop);
        }
        
        //lan luot xoa cac sinh vien ra khoi hang doi
        while(!qe.isEmpty()){
            qe.remove();
        }
    
        System.out.println("Queue sau khi xoa cac sinh vien khoi hang doi: " + qe.size());
    }

    
}

