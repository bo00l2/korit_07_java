package ch12_arrays;

import java.util.Scanner;

/*
    몇 명의 학생을 등록하시겠습니까 >>> 5
    1 번 학생의 이름을 등록하세요 >>> 김일
    김일 번 학생의 점수를 입력하세요 >>> 4.5
    2 번 학생의 이름을 등록하세요 >>> 김일
    김이 번 학생의 점수를 입력하세요 >>> 4.5
    3 번 학생의 이름을 등록하세요 >>> 김일
    김삼 번 학생의 점수를 입력하세요 >>> 4.5
    4 번 학생의 이름을 등록하세요 >>> 김일
    김사 번 학생의 점수를 입력하세요 >>> 4.5
    5 번 학생의 이름을 등록하세요 >>> 김일
    김오 번 학생의 점수를 입력하세요 >>> 4.5
 */
public class Array03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int human = 0;
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        human = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[human];
        double[] scores = new double[human];
        double sum = 0;

        // 하나의 반복문 내에서 두 개의 배열에 데이터를 대입할 필요가 있음
        for(int i=0; i<names.length; i++){
            System.out.print((i+1) + " 번의 이름을 등록하세요 >>> ");
            names[i] = scanner.nextLine();
            System.out.print( names[i] + " 학생의 점수를 입력하세요 >>> ");
            scores[i] = scanner.nextDouble();
            scanner.nextLine();     // 바로 위에 nextDouble() 다음에 i++
                                    // 이후 nextLine()이 배치되 예정이라 배리어 위치가 여기
            sum += scores[i];
        }
        System.out.println();
        // 각 배열의 element를 출력하는 반복문 작성할 필요 -> names 출력 후에 개행이 이루어지고 그 다음 scores가 출력
        for (int i=0; i< names.length; i++){
            System.out.print(names[i] + " ");
        }
        System.out.println();
        for (int i=0; i< scores.length; i++){
            System.out.print(scores[i] + " ");
        }

        System.out.println();
        System.out.println("학생들의 점수 총합은 " + sum + "점입니다.");
    }
}
