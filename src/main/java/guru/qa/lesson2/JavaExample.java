package guru.qa.lesson2;

import guru.qa.lesson2.Button;

public class JavaExample {
    public static void main(String[] args) {
        Button[] buttons = Button.values();
        for (Button button : buttons) {
            System.out.println(button.name());
            System.out.println(button.getButtonName());
        }
    }
}
