import java.util.Stack;

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

        //tao stack va dua vao danh sach sinh vien
        Stack<Student> st = new Stack<>();
        
        st.push(a);
        st.push(b);
        st.push(c);
        st.push(d);

        System.out.println("Danh sach sinh vien trong stack: ");
        for(Student x : st){
            System.out.println("Name: " + x.name + " " + " Age: " + x.age + " " + " Class: " + x.lop);
        }

        //lan luot xoa cac sinh vien ra khoi stack
        while(!st.isEmpty()){
            st.pop();
        }
        System.out.println("Stack sau khi xoa lan luot cac sinh vien: " + st.size());
    }

    
}

