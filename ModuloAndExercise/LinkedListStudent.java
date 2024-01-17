public class Student {

    private String name;
    private int age;
    private String lop;
    Student next;

    public Student(String name, int age, String lop) {
        this.name = name;
        this.age = age;
        this.lop = lop;
        this.next = null;
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

    static class Node {
        Student data;
        Node next;

        public Node(Student data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Student a = new Student("Nguyen Van A", 10, "5D4");
        Student b = new Student("Nguyen Van B", 9, "4C3");
        Student c = new Student("Nguyen Van C", 8, "3B2");
        Student d = new Student("Nguyen Van D", 7, "2A1");

        // tao mang
        Student head = null;

        // them sinh vien vao danh sach lien ket
        head = addStudent(head, a);
        head = addStudent(head, b);
        head = addStudent(head, c);
        head = addStudent(head, d);

        // in thong tin sinh vien dau tien
        System.out.println("Thong tin sinh vien dau tien la:");
        System.out.println("Name: " + head.name + "  Age: " + head.age + "  Class: " + head.lop);
        System.out.println();

        // in thong tin sinh vien cuoi cung
        System.out.println("Thong tin sinh vien cuoi cung la:");
        Student lastStudent = getLastStudent(head);
        System.out.println("Name: " + lastStudent.name + "  Age: " + lastStudent.age + "  Class: " + lastStudent.lop);
        System.out.println();

        // in toan bo danh sach sinh vien ra man hinh
        System.out.println("Danh sach sinh vien la:");
        Student res = head;
        while (res != null) {
            System.out.println("Name: " + res.name + "  Age: " + res.age + "  Class: " + res.lop);
            res = res.next;
        }
        System.out.println();

        // tim kiem sinh vien Nguyen Van A
        System.out.println("Thong tin sinh vien Nguyen Van A:");
        Student ans = head;
        while (ans != null) {
            if (ans.name.equals("Nguyen Van A")) {
                System.out.println("Name: " + ans.name + "  Age: " + ans.age + "  Class: " + ans.lop);
                break;
            }
            ans = ans.next;
        }
        System.out.println();

        // in ra thong tin sinh vien nhieu tuoi nhat
        System.out.println("Thong tin sinh vien nhieu tuoi nhat la:");
        Student ans2 = head;
        Student oldest = head;
        while (ans2 != null) {
            if (ans2.age > oldest.age) {
                oldest = ans2;
            }
            ans2 = ans2.next;
        }
        System.out.println("Name: " + oldest.name + "  Age: " + oldest.age + "  Class: " + oldest.lop);
        System.out.println();

        // thong tin sinh vien it tuoi nhat
        System.out.println("Thong tin sinh vien it tuoi nhat la:");
        Student ans3 = head;
        Student youngest = head;
        while (ans3 != null) {
            if (ans3.age < youngest.age) {
                youngest = ans3;
            }
            ans3 = ans3.next;
        }
        System.out.println("Name: " + youngest.name + "  Age: " + youngest.age + "  Class: " + youngest.lop);
        System.out.println();

        // doi thong tin sinh vien o index0 va index3 va in ra man hinh
        System.out.println("Danh sach sinh vien sau khi doi la:");
        head = swapStudents(head, 0, 3);
        Student current = head;
        printAllStudents(head);
    }

    private static void printAllStudents(Student head) {
        Student current = head;
        while (current != null) {
            System.out.println("Name: " + current.name + "  Age: " + current.age + "  Class: " + current.lop);
            current = current.next;
            
        }
    }

    private static Student addStudent(Student head, Student newStudent) {
        if (head == null) {
            return newStudent;
        } else {
            Student current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newStudent;
            return head;
        }
    }

    private static Student getLastStudent(Student head) {
        if(head == null) return null;
        Student current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    private static Student swapStudents(Student head, int position1, int position2) {
        if (head == null || position1 == position2) {
            return head;
        }
    
        Student prev1 = null;
        Student current1 = head;
    
        for (int i = 0; i < position1 && current1 != null; i++) {
            prev1 = current1;
            current1 = current1.next;
        }
    
        Student prev2 = null;
        Student current2 = head;
    
        for (int i = 0; i < position2 && current2 != null; i++) {
            prev2 = current2;
            current2 = current2.next;
        }
    
        if (current1 == null || current2 == null) {
            return head;
        }
    
        if (prev1 != null) {
            prev1.next = current2;
        } else {
            head = current2;
        }
    
        if (prev2 != null) {
            prev2.next = current1;
        } else {
            head = current1;
        }
    
        Student temp = current1.next;
        current1.next = current2.next;
        current2.next = temp;
    
        return head;
    }
}

