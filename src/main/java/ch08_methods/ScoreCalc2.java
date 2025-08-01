package ch08_methods;

import java.util.Scanner;

public class ScoreCalc2 {
    // 메서드 정의
    // call1() 유형으로 작성할 것
    public static void calcSumandAvg(){
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avg = 0;
        int numOfSubs = 0;

        System.out.print("몇 과목의 점수를 입력하시겠습니까? >>> ");
        numOfSubs = scanner.nextInt();

        for(int i=0; i<numOfSubs; i++){
            System.out.print((i+1) + " 과목의 점수를 입력하세요 >>> ");
            sum += scanner.nextDouble();
        }
        avg = sum / numOfSubs;
        System.out.println("총합은 " + sum +"이며, 평균은 " + avg + "입니다.");
    }

    public static void main(String[] args) {
        calcSumandAvg();
    }
}
