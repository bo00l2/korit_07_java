package ch07_loops;
/*
    1 2 3 4 ... 10
    11 12 13 ... 20
    ...100

    1. 반복문을 100번 돌리기
    2. 반복문을 10번 돌리기
 */
public class Loop02 {
    public static void main(String[] args) {
        // 1. 반복문 100번 돌린 방법
        int i = 0;
        while (i < 100) {
            if ( i % 10 == 0) {
                System.out.println();
            }
            i++;
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        // 2. 반복문 10번 돌린 방법
        // 힌트 : 1 ... 10 의 출력을 한 번으로 반복
        int j = 1;
        while ( j < 101) {
            System.out.println(j + " " + (j+1) + " " + (j+2) + " " + (j+3) + " " + (j+4)
            + " " + (j+5) + " " + (j+6) + " " + (j+7) + " " + (j+8) + " " + (j+9));
            j+=10;
        }

    }
}
