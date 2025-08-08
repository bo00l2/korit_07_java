package ch13_inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();
        Animal animal4 = new Animal();

        System.out.println(animal1.getAnimaLName());

        // Tiger 객체 생성
        Tiger tiger1 = new Tiger();
        tiger1.setAnimaLName("푸바오");
        tiger1.setAnimalAge(3);
        String tigerName = tiger1.getAnimaLName();
        int tigerAge = tiger1.getAnimalAge();
        System.out.println("이 호랑이의 이름은 " + tigerName);
        System.out.println(tigerAge + " 살입니다.");

        tiger1.hunt();
        tiger1.hunt("물고기");
        tiger1.move();      // 재정의된 move() 호출
        animal1.move();     // 부모 method 원본 그대로 호출
        System.out.println();

        Human human = new Human();
        human.move();
        human.setAnimaLName("김보영");
        human.setAnimalAge(22);
        System.out.println("안녕하세요, 제 이름은 " + human.getAnimaLName() + "이고, 나이는 " +
                human.getAnimalAge() + "살입니다.");
        System.out.println("내년에는 " + (human.getAnimalAge()+1) + "살이 됩니다.");
        human.read("자바의 기초");
    }
}
