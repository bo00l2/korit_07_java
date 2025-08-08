package ch07_loops;
/*
    중첩 while(Nested - while)
    while(조건식1) {
        반복실행문1-a
        while(조건식2) {
            반복실행문2
        }
        반복실행문1-b
    }
 */
public class Loop03 {
    public static void main(String[] args) {
//        int day = 1;
        // 1일차 1교시입니다. ~ 1일차 3교시입니다.
        // 2일차 1교시입니다. ~ 2일차 3교시입니다.
        // 5일차 1교시입니다. ~ 5일차 3교시입니다.
//        while(day < 6) {
//            int lesson = 1; // 반복실행문1-a에 해당. 변수 선언 및 초기화
//            while(lesson < 4) {
//                System.out.println(day + "일차 " + lesson + "교시입니다.");    //반복실행문2
//                lesson++;
//            }
//            day++; // 반복실행문1-b
//        }

        // 변수 lesson
        // scope(범위)라는 것으로, 전역(전체영역) / 지역으로 나뉜다는 점 중요.

        /*
            이상의 코드를 활용하여
            2단에서 9단까지 출력
         */

        int dan = 2;
        while(dan < 10){
            int num = 1;
            while(num < 10){
                System.out.println(dan + " X " + num + " = " + (dan*num));
                num++;
            }
            dan++;
        }
    }
}
