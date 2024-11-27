package challenge.level2;

public class InputException extends Exception {
    public InputException(String type) {
        super("잘못된 입력입니다. " + type + " 입력해주세요. ");
    }
}
