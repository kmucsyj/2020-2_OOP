import java.awt.Rectangle;

public class Example {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20, 100, 100);
        System.out.println(r1);         // Rectangle 클래스 안에 toString이 오버라이드 되어 있다.
    }
}