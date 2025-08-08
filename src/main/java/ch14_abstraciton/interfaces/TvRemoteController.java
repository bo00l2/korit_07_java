package ch14_abstraciton.interfaces;

public class TvRemoteController {
    // 필드 선언
    // PowerButton 클래스의 powerButton 객체 선언
    private PowerButton powerButton;    // 접근지정자 클래스명 객체명 -> 여태까지의 작성방법과 다르다.
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    // AllArgsConstructor 생성자 
    public TvRemoteController(PowerButton powerButton,
                              ChannelDownButton channelDownButton,
                              ChannelUpButton channelUpButton,
                              VolumeUpButton volumeUpButton,
                              VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }

    // 이제 이상에서 선언한 필드(객체)의 메서드를 호출하는 방법
    // 메서드를 호출하기 위해 메서드를 만들어서 호출함
    public void onPressedPowerButton(){
        powerButton.onPressed();
    }

    public void onPressedChannelDownButton(){
        channelDownButton.onPressed();
    }

    public void onDownChannelDownButton(){
        channelDownButton.onDown();
    }

    // onPressedChannelUpButton() 메서드 / onUpChannelUpButton() 메서드 구현
    // Main에서 실행하여
    // 실행 예
    // 채널을 한 칸 올립니다.
    // 채널을 계속 올립니다.

    public void onPressedChannelUpButton(){
        channelUpButton.onPressed();
    }

    // 여기서 두 가지 풀이법으로 갈린다.
    // # 1 자료형이 있는 메서드를 호출하는 방법
    public String onUpChannelUpButton1(){
        return channelUpButton.onUp();  // onUp();의 결과값이 return "채널을 계속 " + super.onUp();
        // 메서드를 여기서 리턴해주고 출력은 Main에서 하는 방법
    }

    // # 2
    public void onUpChannelUpButton2(){
        System.out.println(channelUpButton.onUp());
        // 결국, 출력을 해야하는 것이기 때문에 출력문을 작성하라는 말임
    }

    // 볼륨 관련 메서드
    // Down
    public void onPressedVolumeDownButton(){
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton(){
        volumeDownButton.onDown();
    }

    // Up
    public void onPressedVolumeUpButton(){
        volumeUpButton.onPressed();
    }

    // # 1
    public String onUpVolumeUpButton1(){
        return volumeUpButton.onUp();
    }
    // # 2
    public void onUpVolumeUpButton2(){
        System.out.println(volumeUpButton.onUp());
    }
}
