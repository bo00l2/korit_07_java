package ch14_abstraciton.interfaces;
/*
    PowerButton 포함시킬 것
    TemperatureDownButton
    TemperatureUpButton
    ModeChangeButton -> 버튼 한 번 누를 때마다 모드가 변환되어야 함
    냉방 -> 난방    boolean
        : Press 버튼을 활용하여 한 번 누르면 그 다음 모드로 이동해야 함.
        (PowerButton의 로직을 활용하여 메서드 작성)
    AllArgsConstructor를 정의하고,

    실행 예
    에어컨 리모컨 객체가 생성되었습니다.
    전원을 켭니다.
    온도를 한 칸 내립니다.
    온도를 계속 내립니다.
    온도를 한 칸 올립니다.
    온도를 계속 올립니다.
    난방으로 바뀝니다.
    냉방으로 바뀝니다.
    전원을 끕니다.
 */
public class AirConditionerController {
    private TemperatureDownButton temperatureDownButton;
    private TemperatureUpButton temperatureUpButton;
    private ModeChangeButton modeChangeButton;
    private AirPowerButton airPowerButton;


    public AirConditionerController() {
        System.out.println("에어컨 리모컨 객체가 생성되었습니다.");
    }

    public AirConditionerController(TemperatureDownButton temperatureDownButton, TemperatureUpButton temperatureUpButton, ModeChangeButton modeChangeButton, AirPowerButton airPowerButton) {
        this.temperatureDownButton = temperatureDownButton;
        this.temperatureUpButton = temperatureUpButton;
        this.modeChangeButton = modeChangeButton;
        this.airPowerButton = airPowerButton;
//        System.out.println("에어컨 리모컨 객체가 생성되었습니다.");
    }

    public void onPressedPowerButton(){
        airPowerButton.onPressed();
    }

    public void onPressedTemperatureDown(){
        temperatureDownButton.onPressed();
    }

    public void onDownTemperatureDown(){
        temperatureDownButton.onDown();
    }

    public void onPressedTemperatureUp(){
        temperatureUpButton.onPressed();
    }

    public String onUpTemperatureUp(){
       return temperatureUpButton.onUp();
    }

    public void onPressedModeChange(){
        modeChangeButton.onPressed();
    }

}
