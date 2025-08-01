package ch08_methods;

import java.util.Scanner;
/*
    별찍기 관련한 부분 메서드화 시키기
 */
public class Method02 {
    // call4() 유형으로 작성 왜냐 -> 몇 줄 짜리인지 / 어떤 유형의 별찍기인지를 main에서 받을 예정이기 때문에
    public static String getStar(int rows, int option){
        // 메서드 내에서만 사용하는 지역 변수 선언 및 초기화
        String result = "";
        // 별찍기 관련 로직
        // 주의할 점 sout이 아니라 return 타입이 고정되어있다는 점
        // 이 때문에 별찍기 로직을 그대로 가져와도 sout에서 출력해서는 안됨.
        if (option == 1){
            for(int i=0; i<rows+1; i++){
                for(int j=0; j<i; j++){
                    result += "*";
                }
                result += "\n";
            }
        } else if (option == 2){    // 오른쪽으로 치우친 별
            for(int i=0; i<rows; i++){
                for(int k=0; k<rows - (i+1); k++){
                    result += " ";
                }
                for(int j=0; j<i + 1; j++){
                    result += "*";
                }
                result += "\n";
            }
        } else if (option == 3){    // 왼쪽으로 치우친 감소하는 별
            for(int i=0; i<rows; i++){
                for(int j=rows; j>i; j--){
                    result += "*";
                }
                result += "\n";
            }
        } else if (option == 4){    // 오른쪽으로 치우친 감소하는 별
            for(int i=0; i<rows; i++){
                for(int k=0; k< i + 1; k++){
                    result += " ";
                }
                for(int j=rows; j>i; j--){
                    result += "*";
                }
                result += "\n";
            }
        } else {
            result = "해당 기능이 없습니다.";
        }

        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowOfStars = 0;
        int choice = 0;
        String starResult ="";

        System.out.print("몇 줄 짜리 별을 생성할까요? >>> ");
        rowOfStars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("선택하세요 >>> ");
        choice = scanner.nextInt();

        starResult = getStar(rowOfStars, choice);

        System.out.println(starResult);

        /*
            봐야할 개념
            영어();
            라고 되어있는 부분에서 괄호 있는 영단어/문장이 사실은 메서드였다는 점
            scanner.nextLine();
            System.out.println("특정내용");
            과 같은 식으로 저희가 여태까지 영어로 명령어를 쓰고 소괄호를 적용한 모든 것들이
            메서드와 관련된 부분이었고, 그래서 잘 쓰고 있었기 때문에
            낯설게 느끼기 보다는 원리를 이해하는 과정이다
         */
    }
}
