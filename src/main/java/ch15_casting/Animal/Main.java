package ch15_casting.Animal;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.makeSound();
        dog1.fetch();

        Animal animal1 = dog1; // 업캐스팅 # 1
        // 예시
        int a = 1;
        System.out.println(a);
        System.out.println(1);
        dog1.makeSound();
        dog1.fetch();
        animal1.makeSound();        // 결과값 : 개가 짖습니다. 즉 재정의된 method가 호출됨
//        animal1.fetch();        // 이게 불가능

         Animal animal2 = new Dog();    // 이게 A a = new B(); 형태. 시험에 자주 나옴

        animal2.makeSound();         // 결과값 : 개가 짖습니다.
//        animal2.fetch();    // 불가능

        /*
            클래스A 객체명 = new 클래스B();를 통해 객체를 생성했을 경우
            1. Override가 적용된 메서드, 즉 자식 클래스의 메서드가 호출됨.
            2. 클래스B(자식 클래스)의 고유 메서드는 호출 불가능.

            그럼 어차피 재정의된 method 버전으로 호출이 될거라면 애초에
            클래스B 객체명 = new 클래스B();로 생성해버리면 재정의된 method도 호출되고 고유 method도
            호출할 수 있으니까 골치 아픈 거 아니냐
         */

        Animal animal3 = new Animal();
        animal3.makeSound();        // 결과값 : 동물이 소리를 냅니다.

        // 연산자 instanceof 사용 사례
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1);    // true

        boolean result2 = animal2 instanceof Dog;   // animal2 가 Dog를 객체로 선언함
        System.out.println(result2);    // true

        boolean result3 = animal3 instanceof Animal;
        System.out.println(result3);
        boolean result4 = animal3 instanceof Animal;
        System.out.println(result4);

        boolean result5 = animal3 instanceof Animal;
        System.out.println(result5);
        boolean result6 = animal3 instanceof Dog;
        System.out.println(result6);        // false

        System.out.println("↑ 업캐스팅 파트 - 객체명.메서드명(); 했을 때 재정의 버전이 나오는가 아닌가에 주목");
        System.out.println("↓ 다운캐스팅 파트");
        /*
            다운캐스팅은 '명시적'으로 이루어져야 한다.
            방법
            (클래스명)객체명; -> (int)2.3; 과 같은 방식. conversion의 객체 버전이라고 생각하면 된다.
            그래서 기본 자료형의 형변환에서 벗어나서 참조 자료형까지 고려해야 한다.
         */



        Dog dog2 = (Dog) animal2;
        // 다운캐스팅 방법 -> Animal animal2 = new Dog();으로 생성해서 dog2 객체명은 없다.
        dog2.makeSound();
        dog2.fetch();
        // dog2로 새로운 객체명을 선언하고 거기에 명시적 참조 자료형 캐스팅을 적용하여 Animal 클래스의
        // 인스턴스인 animal2를 downcasting했다.
        // 그 결과 원래도 되던 재정의 버전의 makeSound(); 호출은 변함이 없고,
        // Dog 클래스의 고유 메서드인 fetch();도 호출이 가능하다.
        // 여전히 B b = new B(); 로 생성하면 귀찮은 일 없지 않냐는 의문이 존재

//        Dog dog3 = (Dog) animal3;   // downcasting을 하는 과정에서 오류가 발생함.
//        dog3.makeSound();         // 얘는 지금 호출도 못해보는 상황이다.
        /*
            75번 라인에서 오류가 발생함
            즉, 애초에 animal3를 생성할 때 Animal 클래스의 생성자를 호출해서 만들었기 때문에
            (A a = new A();이기 때문에)
            하위 클래스의 인스턴스로 다운캐스팅 하는 것이 불가능하다.

            이상을 해결하기 위해서는
         */
        Animal animal4 = new Dog();
        // 형태로 선언된 클래스와 호출되는 생성자가 서로 달라야 한다.(그리고 둘은 상속관계여야 한다.)

        // 그렇다면 현재 코드라인 상에서 빨간 줄 뜨지도 않으니까 잘못 다운캐스팅이 이루어지는지에 대한
        // 확인이 불가능한 상황인데, 이를 해결하기 위한 것이 instanceof 연산자 라고 한다.

        System.out.println("animal4 검증 파트");
        if(animal4 instanceof Dog){
            Dog dog4 = (Dog) animal4;   // 다운캐스팅

            dog4.makeSound();
            dog4.fetch();
        }   else {
            System.out.println("불가능한 다운캐스팅입니다.");
        }
    }
}
