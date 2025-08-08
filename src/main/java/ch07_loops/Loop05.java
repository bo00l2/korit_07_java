package ch07_loops;

import java.util.Scanner;

/*
    중첩 for문
    for (int i=0; i< 100; i++){
        반복실행문1-a
        for (int j=0; j< 100; j++) {
            반복실행문2
        }
        반복실행문1-b
     }
     for문을 활용하여 1일차 1교시입니다. ~ 5일차 3교시입니다. 까지 출력
 */
public class Loop05 {
    public static void main(String[] args) {

//        for (int i=1; i<6; i++){
//            for (int j=1; j<4; j++){
//                System.out.println(i + "일차 " + j + "교시입니다.");
//            }
//        }

        // 구구단
//        for (int i=2; i<10; i++){
//            for(int j=1; j<10; j++){
//                System.out.println(i + " X " + j + " = " + (i*j));
//            }
//        }

        /*
            1 2 3 4 5
            ... 100
         */

        // 방법 1
//        for (int i=1; i< 101; i++){
//            if (i % 10 == 1){
//                System.out.println();
//            }
//            System.out.print(i + " ");
//        }

        // 방법 2
//        for (int j=1; j<101; j+=10){
//            System.out.println(j + " " + (j+1) + " " + (j+2) + " " + (j+3) + " " + (j+4)
//                    + " " + (j+5) + " " + (j+6) + " " + (j+7) + " " + (j+8) + " " + (j+9));
//
//        }

        /*
            숫자를 입력 받아서 n까지 더하는 반복문 for문
            예
            1부터 몇까지 더하시겠습니까? >>> 10
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
        System.out.println("1부터 " + n + "까지의 합은 " + sum +"입니다.");


        // 짝수의 합
        int total=0;
        for (int j=0; j<n+1; j+=2){
            total+=j;
        }
//       강사풀이
//        for (int j=1; j<n+1; j++){
//            if(j % 2 == 0){
//                total+=j;
//            }
//        }
        System.out.println("1부터 " + n + "까지의 짝수의 합은 " + total +"입니다.");

        // 홀수의 합
        int total2=0;
        for(int k=1; k<n+1; k++){
            if( k % 2 == 1){
                total2+=k;
            }
        }
        System.out.println("1부터 " + n + "까지의 홀수의 합은 " + total2 +"입니다.");
    }
}
