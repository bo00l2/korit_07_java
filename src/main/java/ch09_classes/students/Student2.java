package ch09_classes.students;

public class Student2 {
    int studentCode;
    String name;
    double score;

    // default 생성자는
    public Student2() {
        System.out.println("기본 생성자로 객체를 생성했습니다.");
    }

    // 좌상단 햄버거(메뉴바) -> 코드(Code) -> 생성
    // alt + insert

    public Student2(int studentCode) {
        this.studentCode = studentCode;
        System.out.println("int 매개변수 생성자로 객체를 생성했습니다.");
    }

    public Student2(String name) {
        this.name = name;
        System.out.println("String name 매개변수 생성자로 객체를 생성했습니다.");
    }

    public Student2(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
        System.out.println("int, String 매개변수 생성자로 객체를 생성했습니다.");
    }

    public Student2(int studentCode, String name, double score) {
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
        System.out.println("int, String, double 매개변수 생성자로 객체를 생성했습니다.");
    }

}
