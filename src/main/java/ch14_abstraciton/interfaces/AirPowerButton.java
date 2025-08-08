package ch14_abstraciton.interfaces;

public class AirPowerButton extends Button{
    private boolean status;
    @Override
    public void onPressed() {
        if(status){
            status = false;
            System.out.println("전원을 끕니다.");
        } else {
            status = true;
            System.out.println("전원을 켭니다.");
        }
    }
}
