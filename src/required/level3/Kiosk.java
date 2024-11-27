package required.level3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * <h2>Kiosk 클래스 생성하기</h2>
 * <ol>
 *     <li> 설명: 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스</li>
 *     <li> MenuItem을 관리하는 리스트가 필드로 존재 </li>
 *     <li> main 함수에서 관리하던 입력과 반복문 로직은 이제 start 함수를 만들어 관리</li>
 *     <li> List<MenuItem> menuItems 는 Kiosk 클래스 생성자를 통해 값을 할당 </li>
 *     <li> List를 선언하여 여러 MenuItem을 추가 </li>
 *     <li> Kiosk 객체를 생성하고 사용하는 main 함수에서 객체를 생성할 때 값을 넘겨줍 </li>
 * </ol>
 */

//1. 설명: 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스
public class Kiosk {
    // 2. MenuItem을 관리하는 리스트가 필드로 존재
    //
    private final List<MenuItem> menuItems;


    public Kiosk(){
        // 4. List<MenuItem> menuItems 는 Kiosk 클래스 생성자를 통해 값을 할당
        // 5. List를 선언하여 여러 MenuItem을 추가
        // 6. Kiosk 객체를 생성하고 사용하는 main 함수에서 객체를 생성할 때 값을 넘겨줍
        this.menuItems = Arrays.asList(
                new MenuItem( "ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                new MenuItem( "SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
                new MenuItem( "Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
                new MenuItem( "Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
        );
    }

    // 3. main 함수에서 관리하던 입력과 반복문 로직은 이제 start 함수를 만들어 관리
    public void start() {
        String NUMBER_REG = "^[0-9]*$";

        // Scanner 선언
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("[ HAMBURGER MENU ]");

            for (int i = 0; i < this.menuItems.size(); i++) {
                MenuItem menuItem = this.menuItems.get(i);
                System.out.println((i + 1) + ". " + menuItem.getName() + "| W " + menuItem.getPrice() + " | " + menuItem.getDescription());
            }
            System.out.println("0. 종료  | 종료");

            String firstInput = sc.nextLine();
            if (firstInput.equals("0")) {
                break;
            } else if (Pattern.matches(NUMBER_REG, firstInput)) {
                System.out.println(" ");
            } else{
                try {
                    throw new InputException("숫자를");
                } catch (InputException e) {
                    System.out.println(e.getMessage());
                }
            }
        };
        System.out.println("프로그램을 종료합니다. ");
    }
}
