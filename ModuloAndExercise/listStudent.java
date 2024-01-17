import java.util.ArrayList;

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
        Student a = new Student("Nguyen Van A", 10, "5D4");
        Student b = new Student("Nguyen Van B", 9, "4C3");
        Student c = new Student("Nguyen Van C", 8, "3B2");
        Student d = new Student("Nguyen Van D", 7, "2A1");

        //tao mang
        ArrayList<Student> list = new ArrayList<>();

        //them sinh vien vao mang
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);

        //in toan bo danh sach sinh vien ra man hinh
        System.out.println("Danh sach sinh vien la:");
        for(Student x:list){
            System.out.println(x.getName() + " " + x.getAge() + " " + x.getLop());
        }
        
        System.out.println();
        //tim kiem sinh vien Nguyen Van A va in ra man hinh
        System.out.println("Thong tin sinh vien Nguyen Van A:");
        for(Student x:list){
            if(x.getName().equals("Nguyen Van A")){
                System.out.println(x.getName() + " " + x.getAge() + " " + x.getLop());
            }
        }

        System.out.println();
        //tim sinh vien nhieu tuoi nhat va in ra man hinh
        System.out.println("Sinh vien nhieu tuoi nhat la:");
        int p1 = 0;
        for(Student x:list){
            if(x.getAge() > p1){
                p1 = x.getAge();
            }
        }
        for(Student x:list){
            if(x.getAge() == p1){
                System.out.println(x.getName() + " " + x.getAge() + " " + x.getLop());
            }
        }
        System.out.println();

        //tim sinh vien it tuoi nhat va in ra man hinh
        System.out.println("Thong tin sinh vien it tuoi nhat la:");
        int p2 = 1000;
        for(Student x :list){
            if(x.getAge() < p2) p2 = x.getAge();
        }
        for(Student x:list){
            if(x.getAge() == p2){
                System.out.println(x.getName() + " " + x.getAge() + " " + x.getLop());
            }
        }
        System.out.println();

        //doi cho sinh vien co chi so 0 va  chi so 3 va in ra man hinh
        System.out.println("Danh sach sinh vien sau khi doi cho la:");
        Student temp = list.get(0);
        list.set(0, list.get(3));
        list.set(3,temp);
        for(Student x : list){
            System.out.println(x.getName() + " " + x.getAge() + " " + x.getLop());
        }
    }
}
