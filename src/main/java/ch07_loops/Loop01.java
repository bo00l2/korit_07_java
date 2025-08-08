package ch07_loops;
/*
    while 반복문
    형식 :
    while(조건식) {
        반복실행문
    }
    while 뒤에 나오는 (조건식)을 봤을 때 if(조건식) 형태와 유사
    즉, while() 내의 조건식이 true일 때, {} 내의 실행문이
    '반복적으로' 이루어집니다.

    그래서 주의할 점
    while 내부의 조건식이 특정 시점에 false가 되도록
    미리 설계를 해둘 필요가 있다.

    false가 되는 시점을 지정해주지 않는다면 계속 true 상태가 유지되어
    반복 실행문이 무한히 계속되기 때문에
    무한 루프라는 표현을 씀
 */
public class Loop01 {
    public static void main(String[] args) {
        // 1부터 100까지 출력하는 예시
//        int i = 0;
//        while(i < 101){
//            System.out.println(i++);
//            i++;            // i를 증가시켜서 24번 라인이
//                            // 특정 시점에 조건이 false가 되도록 지정

//        }

//        System.out.println("최종 i의 결과값 : " + i);

//        int j = 0;
//        while (j < 100){
//            System.out.println(++j);
//        }

        // 1부터 10까지의 합을 구하는 방식
        int num1 = 0;
        int sum =0;
        // 1부터 100까지의 합을 구하시오
        // 풀이는 다양함. for문 사용 x
        while (num1 < 101) {
            sum += num1;
            num1++;
        }
        System.out.println("1부터 100까지의 합 : " + sum);

        int total = (100 * 101) / 2;
        System.out.println("등차수열의 합계 공식 이용 : " + total);

        /*
            사실 1부터 1씩 증가하는 합 공식은 while 반복문을 쓰는 것 자체가
            오히려 비효율적이라는 사실을 이상의 48-49 라인에서 확인할 수 있음

            하지만 while문 자체는 Java 문법이고, if에서와 동일하게
            중첩적으로 사용 가능함
            그리고 while문 내부에 if문이 들어가는 등의 응용도 가능

            예를 들어, '공차가 2이고 a1이 0인 수열의 a50까지의 합을 구하시오'
            와 같은 문제가 나온다고 가정했을 때, 그때는 48번 라인의 공식 적용이
            불가능하고, 우리는 공차가 2인 등차수열의 합 공식같은 건
            몇년 전에 까먹잖슴
         */
        int j = 0;
        int sum2 = 0;
        // 정석 버전
//        while (j < 101) {
//            if (j % 2 == 0){
//                sum2 += j;
//            }
//            j++;
//        }
//        while ( j< 101){
//            sum2 += j;
//            j+=2;
//        }
//
//        System.out.println(sum2);

        /*
            1부터 100까지
            1 2 3 4 5 ... 100 출력하시오
         */
        int k = 1;
        while (k < 101){
            System.out.print(k++ + " ");
        }

    }
}
