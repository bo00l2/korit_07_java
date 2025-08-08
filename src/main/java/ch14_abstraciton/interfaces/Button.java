package ch14_abstraciton.interfaces;
/*
    클래스는 단일 상속만 가능합니다. 그 키워드는 -> extends
    인터페이스는 다중 상속이 가능하다. 그 키워드는 -> implements
 */
public abstract class Button implements Press, Up, Down{
    @Override
    public void onDown() {}      // 일반 메서드지만 메서드 본문에 아무것도 작성 안함

    @Override
    public abstract void onPressed();

    @Override
    public String onUp() {
        return "올립니다.";
    }
}