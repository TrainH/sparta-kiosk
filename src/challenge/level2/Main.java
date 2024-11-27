package challenge.level2;
/**
 * <h1> Lv 2. Enum, 람다 & 스트림을 활용한 주문 및 장바구니 관리</h1>
 *
 * <h2>요구사항이 가지는 의도</h2>
 * <ul>
 *     <li> 의도: 고급 자바 기능을 활용해 프로그램의 효율성과 코드의 가독성을 개선하는 것을 목표로 합니다.</li>
 *     <li> 목적 </li>
 *     <ul>
 *          <li> Enum을 통해 상수를 안전하게 관리하고, 프로그램 구조를 간결하게 </li>
 *          <li> 제네릭을 활용하여 데이터 유연성을 높이고, 재사용 가능한 코드를 설계 </li>
 *          <li> 스트림 API를 사용하여 데이터를 필터링하고, 간결한 코드로 동작을 구현 </li>
 *     </ul>
 * </ul>
 *
 * <h2>Enum을 활용한 사용자 유형별 할인율 관리하기</h2>
 *   <ol>
 *       <li> 사용자 유형의 Enum 정의 및 각 사용자 유형에 따른 할인율 적용</li>
 *       <ul>
 *           <li> 예시 : 군인, 학생, 일반인 </li>
 *       </ul>
 *       <li> 주문 시, 사용자 유형에 맞는 할인율 적용해 총 금액 계산 </li>
 *   </ol>
 *
 * <h2>람다 & 스트림을 활용한 장바구니 조회 기능</h2>
 *   <ol>
 *       <li> 기존에 생성한 Menu의 MenuItem을 조회 할 때 스트림을 사용하여 출력하도록 수정</li>
 *       <li> 기존 장바구니에서 특정 메뉴 빼기 기능을 통한 스트림 활용 </li>
 *       <ul>
 *           <li> 예시 : 장바구니에 SmokeShack 가 들어 있다면, stream.filter를 활용하여 특정 메뉴 이름을 가진 메뉴 장바구니에서 제거 </li>
 *       </ul>
 *   </ol>
 * <h2>사용 기술</h2>
 * <ul>
 *     <li>Scanner 클래스</li>
 *     <li>do while 문</li>
 *     <li>클래스</li>
 *     <li>List</li>
 *     <li>오류 메시지를 출력</li>
 *     <li>Enum</li>
 *     <li>람다 & 스트림</li>
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
