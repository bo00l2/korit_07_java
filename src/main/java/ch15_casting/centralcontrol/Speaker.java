package ch15_casting.centralcontrol;

public class Speaker implements Power{
    @Override
    public void on() {
        System.out.println("전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("전원을 끕니다.");
    }

    public void changeEqual(){
        System.out.println("스피커의 이퀄라이저를 변경합니다.");
    }
}

// 20250811 수업 시
/*
    각 클래스들에 고유 메서드들을 정의했다.
    현재 Power를 implement한 각 객체들은 업캐스팅이 이루어진 상태로
    Power의 field인 deviceArray에 속해있습니다.

    현재 상황에서 점검해볼 것은
    고유 메서드들을 실행시키는 방식이다.
 */
