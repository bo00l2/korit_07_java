package ch13_inheritance;
/*
    Animal 클래스를 상속 받고
    생성자 및 getter/setter 를 사용하여
    Animal 클래스의 move() 메서드를 오버라이딩하여
    "사람이 두 발로 걷습니다."만 출력하도록 '재정의' 한다.

    Main에서
    human1 객체를 생성(기본 생성자)
    setter를 통해 이름과 나이를 입력
    getter를 활용하여
    안녕하세요, 제 이름은 ㅇㅇ이고 나이는 몇살입니다."
    내년에는 +1살이 됩니다.
    출력

     또한 Human 클래스의 고유 메서드인 read("자바의 기초")를
     정의하여 콘솔에 다음과 같이 출력

     이름이 자바의 기초를 읽는 중입니다.

     실행 예
     사람 객체가 생성되었습니다.
     사람이 두 발로 걷습니다.
     안녕하세요, 제 이름은 ㅇㅇ이고 나이는 몇살입니다.
     내년에는 살이 됩니다.
     이름이 자바의 기초를 읽는 중입니다.
 */
public class Human extends Animal{
    // 고유 메서드
    public void read(String book){
        System.out.println(getAnimaLName() + "은 " + book + "를 읽는 중입니다.");
    }

    public Human() {
        System.out.println("사람 객체가 생성되었습니다.");
    }

    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }
}
