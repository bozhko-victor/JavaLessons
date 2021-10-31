package guru.qa.lesson2;

public enum Button {
    OK("Кнопка ok"),
    CANCEL("Кнопка cancel"),
    APPLY("Кнопка apply");

    private String buttonName;

    Button(String buttonName) {
        this.buttonName = buttonName;
    }

    public String getButtonName() {
        return buttonName;
    }
}
