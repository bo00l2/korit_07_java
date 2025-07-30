package ch06_condition;
// 논리 연산자 이용 풀이 ( 윤년 문제 )
import java.util.Scanner;

public class Condition09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("연도를 입력하세요 >>> ");
        int year = scanner.nextInt();
        String years = "";

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            years = "윤년";
        } else {
            years = "윤년이 아님";
        }

        System.out.println(year + "년은 " + years);
    }
}
