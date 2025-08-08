package ch10_getter_setter.univ_student;

import java.util.Scanner;

/*
    1. 클래스 설계
        name / grade(1,2,3) / score(double) 로 필드 정의
    2. 생성자
        1) 기본 생성자
        2) 이름만 받는 생성자
        3) 학년만 
        4) 이름과 학년
        5) 이름, 학년, 점수
        를 정의
    3. Setter / Getter 메서드 정의 
        각각의 필드에 대한 setter /getter 정의]
        setter 3개 / getter 3개
        1) setGrade의 범위 1-4학년
        2) setScore의 범위 0.0-4.5
        범위를 벗어날 경우 불가능한 입력입니다. 가 출력되도록 비지니스 로직을 작성
    4. UnivStudentMain에서
        student1 ->  기본생성자 김일 / 1 / 3.3
        student1 ->  기본생성자 김일 / 3 / -30 실패하고 4.0 입력
        student1 ->  기본생성자 김일 / 5  실패하고 2 / 2.7 
        student1 ->  기본생성자 김일 / 4 / 3.8
        student1 ->  기본생성자 김일 / 2 / 1.0
        으로 객체 생성
    5. 콘솔창에
        이름 : 김일
        학년 : 1학년
        점수 : 3.3
     으로 출력될 수 있도록 showInfo() 메서드 작성
 */
public class UnivStudent {
    String name;
    int grade;
    double score;

    public UnivStudent() {
    }
    public UnivStudent(String name) {
        this.name = name;
    }

    public UnivStudent(int grade) {
        this.grade = grade;
    }

    public UnivStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public UnivStudent(String name, int grade, double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        Scanner scanner = new Scanner(System.in);
        if (grade > 5 || grade < 1){
            System.out.println("불가능한 입력입니다.");
        }
        this.grade = grade;
    }

    public void setScore(double score) {
        Scanner scanner = new Scanner(System.in);
        if (score > 4.5 || score < 0.0){
            System.out.println("불가능한 입력입니다.");
            return;
        }
        this.score = score;
    }


    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public double getScore() {
        return score;
    }

    void showInfo(){
        System.out.println("\n이름 : " + name + "\n학년 : " + grade + "\n점수 : " + score);
    }
}
