package ch09_classes;

public class Car {
    String color;
    int speed;

    void drive(){
        System.out.println(color + " 자동차가 주행중입니다.");
    }

    void brake(){
        System.out.println(color + " 자동차가 멈췄습니다.");
    }

    void displayInfo(){
        System.out.println("이 차의 색깔은 "+ color + "색이고,");
        System.out.println("최고 속도는 "+ speed + "km/h입니다.");
    }
    /*
        Car의 인스턴스인 myCar 객체 생성
        color 빨강, speed 160
        yourCar 객체 생성
        color 노랑, speed 180
        myCar drive() 호출
        yourCar brake() 호출
        myCar, yourCar() displayInfo() 호출
     */
}
