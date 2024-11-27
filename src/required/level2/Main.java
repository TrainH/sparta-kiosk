package required.level2;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 * <h1>Lv2.객체 지향 설계를 적용해 햄버거 메뉴를 클래스로 관리하기</h1>
 * <p> 객체 지향 개념을 학습하고, 데이터를 구조적으로 관리하며 프로그램을 설계하는 방법을 익힙니다.
 * 햄버거 메뉴를 MenuItem 클래스와 List를 통해 관리합니다. </p>
 *
 *
 * <h2>요구사항</h2>
 * <ol>
 *     <li> MenuItem 클래스 생성하기</li>
 *     <li> MenuItem 클래스는 이름, 가격, 설명 필드를 가지며 개별 음식 항목을 관리</li>
 *     <li> main 함수에서 Menu 클래스를 활용하여 햄버거 메뉴를 출력</li>
 *     <li> MenuItem 객체 생성을 통해 이름, 가격, 설명을 세팅 </li>
 *     <li> List를 선언하여 여러 MenuItem을 추가 </li>
 *     <li> 반복문을 활용해 menuItems를 탐색하면서 하나씩 접근 </li>
 * </ol>
 *
 * <h2>사용 기술</h2>
 * <ul>
 *     <li>Scanner 클래스</li>
 *     <li>do while 문</li>
 *     <li>클래스</li>
 *     <li>List</li>
 * </ul>
 *
 * @author 한교범
 * @version 1.0
 * @date 2024-11-22
 */


public class Main {
    public static void main(String[] args) {
        // 요구사항 3, 4, 5
        //List 선언 및 초기화
        //add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        List<MenuItem> menuItems = new ArrayList<MenuItem>();
        menuItems.add(new MenuItem("ShackBurger  ", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack   ", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger ", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger    ", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // Scanner 선언
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("[ SHAKESHACK MENU ]");
            // 요구사항6. 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem menuItem = menuItems.get(i);
                System.out.println((i + 1) + ". " + menuItem.getName() + "| W " + menuItem.getPrice() + " | " + menuItem.getDescription());
            }
            System.out.println("0. 종료  | 종료");
        } while (!sc.next().equals("0")); // 입력된 값이 "0"이 아니면 계속 실행하고 0이면 종료
        System.out.println("프로그램을 종료합니다. ");
    }
}
