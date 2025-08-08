package ch07_loops;

import java.util.Scanner;

/*
    for 반복문 (for loop)
    : 대부분의 경우 명확한 횟수가 고정되어 있을 때 사용하는 반복문
    (근데 아까 while에 반복횟수를 고정시킨 상태로 시작했었는데
    아까까지 했던 과제의 경우 사실 for문으로 작성하는 것이 더 편리

    형식 :
    for(시작값 ; 종료값; 증감값) {
        반복실행문
    {
 */
public class Loop04 {
    public static void main(String[] args) {
        //1부터 100까지 출력하는 for문
//        for(int i=1; i<101; i++){
//            System.out.println(i);
//        }
        // 1부터 100까지의 합을 구하고 한 번만 출력
//        int sum=0;
//        for (int i=1; i<101; i++){
//            sum+=i;
//        }
//        System.out.println("1~100까지의 합 : "+sum);

        // 1부터 100까지 중 홀수의 합을 구하는 for문
        // 1. for 내부에 if문
        // 증값값을 수정
//        int sum = 0;
//        for (int i=1; i<101; i++) {
//            if (i % 2 == 1) {
//                sum += i;
//            }
//        }
//        System.out.println("홀수의 합 : " + sum);

        // 2. 증감값 수정
//        int sum2 = 0;
//        for (int i=1; i<101; i+=2){
//            sum2 += i;
//        }
//        System.out.println("홀수의 합 : " + sum2);

        /*
            숫자를 입력받아서 1부터 n까지 더하는 반복문

            실행 예
            1부터 몇까지 더하시겠습니까? >>>
            1부터 10까지의 합은 55입니다.
         */

        int n;
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 몇까지 더하시겠습니까? >>> ");
        n = scanner.nextInt();

        for(int i=1; i<n+1; i++){
            sum+=i;
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");


    }
}
