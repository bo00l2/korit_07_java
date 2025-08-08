package ch09_classes.students;
/*
    1. Student 클래스의 필드를 정의해라
        1) int studentCode
        2) String name
        3) double score

    2. 기본 생성자를 정의하고, 객체를 생성했을 때,
    "기본 생성자로 객체를 생성했습니다." 라고 출력되도록 코드 작성
    3. int StudentCode를 매개변수로 하는 매개변수 생성자를 정의,
        "int 매개변수 생성자로 객체를 생성했습니다."라고 출력되도록 작성
    4. String name를 매개변수로 하는 매개변수 생성자를 정의,
        "String name 매개변수 생성자로 객체를 생성했습니다."라고 출력되도록 작성
    5.studentCode, name을 매개변수로 하는 매개변수 생성자를 정의,
        "int, String 매개변수 생성자로 객체를 생성했습니다."라고 출력되도록 작성
    6. studentCode, name, score를 매개변수로 하는 매개변수 생성자를 정의,
        "int, String, double 매개변수 생성자로 객체를 생성했습니다."라고 출력되도록 작성

    7. StudentMain 클래스에, 해당 객체명과 속성명을 가질 수 있도록 작성
        1) student1 2025001 / 김일 / 4.5 -> 기본생성자
        1) student 2025001 / 김이 / 100 -> int 매개변수 생성자
        1) student 2025001 / 김일 / 95.8 -> String 매개변수 생성자
        1) student 2025001 / 김일 / 4.0 -> int, String 매개변수 생성자
        1) student 2025001 / 김일 / 80.7 -> int, String, double 매개변수 생성자

    8. 학생의 정보가 출력될 수 있도록 하는 showInfo() 메서드를 call1() 타입으로 정의

    9. 실행 예
        "기본 생성자로 객체를 생성했습니다."
        "int 매개변수 생성자로 객체를 생성했습니다."
        "String name 매개변수 생성자로 객체를 생성했습니다."
        "int, String 매개변수 생성자로 객체를 생성했습니다."
        "int, String, double 매개변수 생성자로 객체를 생성했습니다."

        김일 학생의 정보입니다.
        학번 :
        이름 :
        점수 :

        김이 학생의 정보입니다.
        ...
 */
public class Student {
    int studentCode;
    String name;
    double score;

    // 기본 생성자
    Student() {
        System.out.println("기본 생성자로 객체를 생성했습니다.");
    }

    // int 매개변수 생성자
    Student(int StudentCode){
        this.studentCode = StudentCode;
        System.out.println("int 매개변수 생성자로 객체를 생성했습니다.");
    }

    // String 매개변수 생성자
    Student(String name){
        this.name = name;
        System.out.println("String name 매개변수 생성자로 객체를 생성했습니다.");
    }

    // int, String 매개변수 생성자
    Student(int StudentCode, String name){
        this.studentCode = StudentCode;
        this.name = name;
        System.out.println("int, String 매개변수 생성자로 객체를 생성했습니다.");
    }

    // int, String, double 매개변수 생성자
    Student(int StudentCode, String name, double score){
        this.studentCode = StudentCode;
        this.name = name;
        this.score = score;
        System.out.println("int, String, double 매개변수 생성자로 객체를 생성했습니다.");
    }

    // 정보 출력 메서드
    void showInfo(){
        System.out.println();
        System.out.println(name + "학생의 정보입니다.\n" +
                "학번 : " + studentCode + "\n이름 : " + name + "\n점수 : " + score );
    }
}
