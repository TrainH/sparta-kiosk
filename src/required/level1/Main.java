package required.level1;
import java.util.Scanner;
/**
 * <h1>Lv1.기본적인 키오스크 프로그램</h1>
 * <p>이 프로그램은 햄버거 키오스크의 간단한 흐름을 구현합니다.
 * 사용자가 메뉴를 선택하고, 특정 입력에 따라 프로그램을 종료할 수 있습니다.</p>
 *
 *
 * <h2>요구사항</h2>
 * <ol>
 *     <li>햄버거 메뉴 출력 및 선택하기</li>
 *     <li>Scanner를 사용하여 메뉴를 입하고 사용자 입력을 처리합니다.</li>
 *     <li>입력받은 숫자에 따라 다른 로직을 실행합니다.</li>
 *     <li>반복문을 사용하여 특정 번호가 입력되면 프로그램을 종료합니다.</li>
 * </ol>
 *
 * <h2>사용 기술</h2>
 * <ul>
 *     <li>Scanner 클래스</li>
 *     <li>do while 문</li>
 * </ul>
 *
 * @author 한교범
 * @version 1.0
 * @date 2024-11-22
 */

public class Main {
    public static void main(String[] args) {
        // 스트링 배열 선언 및 값입력
        String[] strArr = new String[6];
        strArr[0] = "[ SHAKESHACK MENU ]";
        strArr[1] = "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거";
        strArr[2] = "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거";
        strArr[3] = "3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거";
        strArr[4] = "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거";
        strArr[5] = "0. 종료      | 종료";

        // Scanner 선언
        Scanner sc = new Scanner(System.in);

        // do while(조건)으로 조건을 만족시키지않으면(false) 프로그램 종료
        do {
            // 반복문을 활용해 스트링 배열값을 하나씩 출력
            for (String s : strArr) {
                System.out.println(s);
            }
        } while (!sc.next().equals("0")); // 입력된 값이 "0"이 아니면 계속 실행하고 0이면 종료
        System.out.println("프로그램을 종료합니다. ");
    }
}
