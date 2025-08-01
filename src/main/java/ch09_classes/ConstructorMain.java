package ch09_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        // 기본 생성자를 통한 객체 생성
        Constructor constructor1 = new Constructor();

        // int 매개변수를 생성자를 통한 객체 생성자
        Constructor constructor2 = new Constructor(1);
        // 여기서 number : 1에 해당하는 것은 argument이다.
        // 그리고 new Constructor(1); 부분에서 Constructor에
        // ctrl + enter 키를 누르게 되면
        // 매개변수 생성자로 넘어가게 됩니다.
        // 거기에 있는 Constructor(int number){}에 해당되는 부분에서
        // (int number) 부분을 매개변수라고 부른다.

        // 9번 라인에서 객체를 생성하게 됐을 때 argument로 들어간
        // 1이라는 int data는 매개변수 생성자를 통해서
        // int number = 1;로 초기화되고
        // System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
        //        this.num = number;
        // 에서 constructor2.num = number; 대입이 일어나게 된다.
        // 그럼 최종 결과는
        // constructor2.num = number = 1;이 됨

        Constructor constructor3 = new Constructor("김보영");
        System.out.println(constructor3.name);
    }
}
