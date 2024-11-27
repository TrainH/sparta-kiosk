package required.level3;
// 유효하지 않은 입력에 대해 오류 메시지를 출력
public class InputException extends Exception {
    public InputException(String type) {
        super("잘못된 입력입니다. " + type + " 입력해주세요. ");
    }
}
