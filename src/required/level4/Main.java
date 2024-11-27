package required.level4;

import java.util.Scanner;

/**
 * <h1>Lv 4. 객체 지향 설계를 적용해 음식 메뉴와 주문 내역을 클래스 기반으로 관리하기</h1>
 *
 * <h2>Menu 클래스 생성하기</h2>
 * <ol>
 *     <li> 설명 : MenuItem 클래스를 관리하는 클래스입니다.
 *              예를 들어, 버거 메뉴, 음료 메뉴 등 각 카테고리 내에 여러 MenuItem을 포함</li>
 *     <li> List<MenuItem> 은 Kiosk 클래스가 관리하기에 적절하지 않으므로 Menu 클래스가 관리하도록 변경 </li>
 *     <li> 여러 버거들을 포함하는 상위 개념 ‘버거’ 같은 카테고리 이름 필드를 갖음</li>
 *     <li> 메뉴 카테고리 이름을 반환하는 메서드가 구현되어야 </li>
 * </ol>
 *
 * <h2>사용 기술</h2>
 * <ul>
 *     <li>Scanner 클래스</li>
 *     <li>do while 문</li>
 *     <li>클래스</li>
 *     <li>List</li>
 *     <li>오류 메시지를 출력</li>
 * </ul>
 *
 * @author 한교범
 * @version 1.0
 * @date 2024-11-25
 */

public class Main {
    public static void main(String[] args) {
        Kiosk.start();
    }
}
