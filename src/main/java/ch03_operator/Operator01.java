package ch03_operator;
/*
    Camel case -> Java 상에서의 변수 표기법(JS에서도 씀)
    Snake case -> Java에서 쓸 일 없음. 근데 전체 상수 사용시에 비슷한 표기법이 적용됨
    Pascal case -> 첫 번째 문자가 대문자고 나머지는 소문자로 가다가 두 번째 단어의 첫 번째 문자는 또 대문자
        ex) 한 단어 짜리 : Operator01
        ex) 복수 단어 : OperatorTestResult  -> Pascal Case는 클래스 명명 규칙에 해당
 */
public class Operator01 {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int i = 10;

        // 이전 단계에서 자료형, 변수명, 데이터에 대해 학습함
        // 이번에는 '=' 학습
        /*
            대입 연산자 = : = 왼쪽과 오른쪽이 같다는 의미가 아니라
                = 오른쪽에 있는 데이터를 = 왼쪽에 있는 변수에 '대입'한다는 의미

            그렇다면 왼쪽과 오른쪽이 같은 값이다, 라고 표시할 때는?
         */

        // 일반 연산자
        /*
                + : 더하기
                - : 빼기
                * : 곱하기
                / : 나누기
                % : 나머지
         */
        int a = 5;
        int b = 2;
        double result = (double) a /b; // (double)은 강제 '형변환' 개념
        System.out.println(a/b);    // 2
        System.out.println(result); // 2.5
        // 그래서 생각보다 코딩할 때도 얘네가 멍청해서 하나하나 잘 지정해야합니다.
        // 즉 개발자는 뭐다?
        // 컴퓨터가 잘 작동할 수 있도록 잘 명령을 내리는 사람이다, 라고 생각
        // 어르고 달래고 해라
        
        /*
            복합 대입 연산자
            1) +=
            2) -=
            3) *=
            4) /=
         */
        int num1 = 1;
        System.out.println(num1);
        num1 += 2;          // num1 = num1 + 2;라는 의미
        System.out.println(num1);
        num1 -= 1;
        System.out.println(num1);
        num1 *= 10;
        System.out.println(num1);
        num1 /= 5;
        System.out.println(num1);

        int j = 10;
        System.out.println(j);
        System.out.println(j++);    // 변수명++ : 코드를 실행시킨 후에 j에 1을 더함 / 그래서 10 출력
        System.out.println(j);      // 위에 코드가 실행되고 +1 됐기 때문에 11 출력
        System.out.println(++j);    // ++변수명 : 코드를 실행시키기 전에 j에 1을 더함 / 그래서 12 출력
        System.out.println(j);      // 위와 동일하게 12
        System.out.println(j--);    // 12
        System.out.println(j);  // 11
        System.out.println(--j); //
        System.out.println(j);
        // 변수명-- : 코드를 실행시킨 후에 j에 1 감함
        // --변수명 : 코드를 실행시키기 전에 j에 1 감함

        int age = 10;
        System.out.println("제 나이는 " + age + "살입니다.");
        System.out.println("내년에는 " + (age + 1) + "살이 됩니다.");
        // Operator02 생성
    }
}

