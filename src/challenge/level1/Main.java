package challenge.level1;

/**
 * <h1> Lv 1. 장바구니 및 구매하기 기능을 추가하기</h1>
 *
 * <h2>요구사항이 가지는 의도</h2>
 * <ul>
 *     <li> 의도: 클래스 간 연계를 통해 객체 지향 프로그래밍의 기본적인 설계를 익히고, 사용자 입력에 따른 프로그램 흐름 제어와 상태 관리를 학습</li>
 *     <li> 클래스 간 역할 분리를 이해하고, 적절히 협력하는 객체를 설계 </li>
 *     <li> 프로그램 상태 변경 및 데이터 저장을 연습 </li>
 *     <li> 사용자 입력에 따른 예외 처리와 조건 분기를 연습 </li>
 * </ul>
 *
 * <h2>장바구니 생성 및 관리 기능</h2>
 *   <ol>
 *       <li> 사용자가 선택한 메뉴를 장바구니에 추가할 수 있는 기능을 제공합니다.</li>
 *       <li> 장바구니는 메뉴명, 수량, 가격 정보를 저장하며, 항목을 동적으로 추가 및 조회할 수 있어야 합니다. </li>
 *       <li> 사용자가 잘못된 선택을 했을 경우 예외를 처리합니다(예: 유효하지 않은 메뉴 번호 입력) </li>
 *   </ol>
 *
 * <h2>장바구니 출력 및 금액 계산</h2>
 *   <ol>
 *       <li> 사용자가 결제를 시도하기 전에, 장바구니에 담긴 모든 메뉴와 총 금액을 출력합니다.</li>
 *       <li> (출력 예시) 각 메뉴의 이름, 가격, 수량</li>
 *       <li> (출력 예시) 총 금액 합계</li>
 *   </ol>
 * <h2>장바구니 담기 기능</h2>
 *   <ol>
 *       <li> 메뉴를 클릭하면 장바구니에 추가할 지 물어보고, 입력값에 따라 “추가”, “취소” 처리합니다.</li>
 *  <ol>
 *       <li> 메뉴는 한 번에 1개만 담을 수 있습니다. </li>
 *  </ol>
 *       <li> 장바구니에 담은 목록을 출력합니다. </li>
 *   </ol>
 * <h2> 주문 기능</h2>
 *   <ol>
 *       <li> 장바구니에 담긴 모든 항목을 출력합니다.</li>
 *       <li> 합산하여 총 금액을 계산하고, “주문하기”를 누르면 장바구니를 초기화합니다. </li>
 *   </ol>
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