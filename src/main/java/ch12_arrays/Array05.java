package ch12_arrays;

import java.util.Scanner;

/*
    메서드를 정의해도 되고 main에 바로해도 ㄱㅊ
    String[] scores 배열에
    A / B / C / D / F element를 입력하고
    실행 예
    A+ B+ C+ D+ F
    가 되도록 작성하시오.
 */
public class Array05 {
    // 메서드 정의
    public void inputElement(String[] strArray){
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<strArray.length; i++){
            System.out.print("입력 : ");
            strArray[i] = scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        Array05 array05 = new Array05();
        // 출력하는 반복문 -> A B C D만 출력하고 거기에 + 붙일 예정
        // 맨마지막 인덱스는 그냥 출력
        String[] scores = new String[5];
        array05.inputElement(scores);

        for (int i=0; i<scores.length-1; i++){  // 마지막 인덱스인 F에는 +를 붙이지 않도록 하기 위해
                                                // scores.length-1 을 해줌
            System.out.print( scores[i] + "+ ");
        }
        System.out.println(scores[scores.length-1]);    // 마지막 인덱스인 F (scores.length-1)까지 출력
    }
}
