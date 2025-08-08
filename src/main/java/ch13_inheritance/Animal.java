package ch13_inheritance;

public class Animal {
    // 필드 영역
    private String animaLName;
    private int animalAge;

    // 생성자 기본 생성자 하나 매개변수 생성자 하나짜리 두 개

    public Animal() {
    }

    public Animal(String animaLName) {
        this.animaLName = animaLName;
    }

    public Animal(int animalAge) {
        this.animalAge = animalAge;
    }

    public Animal(String animaLName, int animalAge) {
        this.animaLName = animaLName;
        this.animalAge = animalAge;
    }

    // Getter / Setter 생성

    public String getAnimaLName() {
        return animaLName;
    }

    public void setAnimaLName(String animaLName) {
        this.animaLName = animaLName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public void move(){
        System.out.println("움직입니다.");
    }
}
