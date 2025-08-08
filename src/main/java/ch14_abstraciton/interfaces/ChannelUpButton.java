package ch14_abstraciton.interfaces;

public class ChannelUpButton extends Button{
    @Override
    public void onPressed() {
        // 추상 클래스 Button을 상속 받아 메서드 오버라이딩 및 재정의
        System.out.println("채널을 한 칸 올립니다.");
    }

    @Override
    public String onUp() {
        return "채널을 계속 " +  super.onUp();
    }
}
// 현재까지의 작성 방안에서는 채널 올려주는 버튼 / 내려주는 버튼 / 전원 버튼이 각각 있는 것이다.
// 각각 따로 있는 버튼들을 하나로 모아주는 클래스를 작성할 예정
// 현재 여기서는 문제가 되는 것이 있다.

// TvRemoteController 일반 클래스 생성