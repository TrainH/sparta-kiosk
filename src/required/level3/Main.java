package required.level3;

/**
 * <h1>Lv 3. 객체 지향 설계를 적용해 순서 제어를 클래스로 관리하기</h1>
 * <p> 객체 지향 개념을 학습하고, 데이터를 구조적으로 관리하며 프로그램을 설계하는 방법을 익힙니다.
 * main 함수에서 관리하던 전체 순서 제어를 Kiosk 클래스를 통해 관리합니다. </p>
 *
 *
 * <h2>Kiosk 클래스 생성하기</h2>
 * <ol>
 *     <li> 설명: 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스</li>
 *     <li> MenuItem을 관리하는 리스트가 필드로 존재 </li>
 *     <li> main 함수에서 관리하던 입력과 반복문 로직은 이제 start 함수를 만들어 관리</li>
 *     <li> List<MenuItem> menuItems 는 Kiosk 클래스 생성자를 통해 값을 할당 </li>
 *     <li> List를 선언하여 여러 MenuItem을 추가 </li>
 *     <li> Kiosk 객체를 생성하고 사용하는 main 함수에서 객체를 생성할 때 값을 넘겨줍 </li>
 * </ol>
 * <h2> 요구사항에 부합하는지 검토 </h2>
 * <ul>
 *     <li> 설명: 키오스크 프로그램을 시작하는 메서드가 구현</li>
 *     <li> 콘솔에 햄버거 메뉴를 출력 </li>
 *     <li> 사용자의 입력을 받아 메뉴를 선택하거나 프로그램을 종료</li>
 *     <li> 유효하지 않은 입력에 대해 오류 메시지를 출력 </li>
 *     <li> 0을 입력하면 프로그램이 ‘뒤로가기’되거나 ‘종료’ </li>
 * </ul>
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
        Kiosk kiosk = new Kiosk();
        kiosk.start();
    }
}
