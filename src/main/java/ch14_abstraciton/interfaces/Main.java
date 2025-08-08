package ch14_abstraciton.interfaces;
/*
    VolumeDownButton / VolumeUpButton 클래스를 생성하고
    얘를 TvRemoteController의 필드에 추가하고
    onPressedVolumeDownButton() / onDownVolumeDownButton()
    onPressedVolumeUpButton() / onUpVolumeUpButton() 메서드 정의
    Main에서
    음량을 한 칸 내립니다.
    음량을 계속 내립니다.
    음량을 한 칸 올립니다.
    음량을 계속 올립니다.
    음량을 계속 올립니다.
 */
public class Main {
    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        ChannelDownButton channelDownButton = new ChannelDownButton();
//        ChannelUpButton channelUpButton = new ChannelUpButton();
//
//
//        TvRemoteController tvRemoteController = new TvRemoteController(
//                powerButton, channelDownButton, channelUpButton
//        );
//
//        powerButton.onPressed();
//        tvRemoteController.onPressedPowerButton();

        // 굳이 별개의 버튼 객체들을 만들지 않고  TvRemoteController 객체를
        // 생성하는 방법
        TvRemoteController tvRemoteController = new TvRemoteController( // 객체 생성
            new PowerButton(), new ChannelDownButton(), new ChannelUpButton(),
            new VolumeUpButton(), new VolumeDownButton()
            // tvRemoteController 라는 객체 안에 버튼 3개의 이름 없는 객체도 생성
        );
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();

        tvRemoteController.onPressedChannelUpButton();
        // # 1에 대한 Main에서의 실행 방법
        System.out.println(tvRemoteController.onUpChannelUpButton1());
        // # 2
        tvRemoteController.onUpChannelUpButton2();

        System.out.println();

        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeDownButton();
        tvRemoteController.onPressedVolumeUpButton();

        System.out.println(tvRemoteController.onUpVolumeUpButton1());
        tvRemoteController.onUpVolumeUpButton2();

        // 에어컨 --------------------------------------------------
        System.out.println();

        AirConditionerController airConditionerController1 = new AirConditionerController();
        AirConditionerController airConditionerController2 = new AirConditionerController(new TemperatureDownButton(), new TemperatureUpButton(),
                new ModeChangeButton(), new AirPowerButton());

        airConditionerController2.onPressedPowerButton();

        // 온도 down
        airConditionerController2.onPressedTemperatureDown();
        airConditionerController2.onDownTemperatureDown();

        // 온도 up
        airConditionerController2.onPressedTemperatureUp();
        System.out.println(airConditionerController2.onUpTemperatureUp());

        // 모드체인지
        airConditionerController2.onPressedModeChange();
        airConditionerController2.onPressedModeChange();

        airConditionerController2.onPressedPowerButton();
    }
}
