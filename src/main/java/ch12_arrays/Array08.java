package ch12_arrays;

public class Array08 {
    // 접근지정자 / return 자료형 / 메서드명(매개변수) { 구현부가 어떤식으로 이루어질지 return }
    public int calcSum(int[] scores){
        int sum = 0;
        // method. 내부의 로직은 배열의 element를 탐색하는 것부터 시작
        for(int i=0; i< scores.length; i++){
            sum += scores[i];
        }
        return sum;
    }

    // 평균을 구하는 메서드를 정의
    public double calcAvg(int[] scores){
        double avg = 0;
        avg = (double)calcSum(scores) / scores.length;
        return avg;
    }

    public static void main(String[] args) {
        // 위에 정의한 method 호출하기 위해 객체 생성함
        Array08 array08 = new Array08();
        int[] scores = { 100, 97, 55, 24, 49, 60, 20, 77, 89};

        // 이상의 예시 배열을 argument로 하는 총합을 구하는 method calcSum,
        // 평균을 구하는 calcAvg method를 정의하는데, call4() 유형으로 만드시오.
//        int sum = array08.calcSum(scores);     // sum, avg 로 출력도 가능
//        double avg = array08.calcAvg(scores);


        System.out.println("총합 : " + array08.calcSum(scores) + "점");
        System.out.println("평균 : " + array08.calcAvg(scores) + "점");
    }
}
