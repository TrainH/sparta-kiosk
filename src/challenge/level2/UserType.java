package challenge.level2;

/**
 * Enum을 활용한 사용자 유형별 할인율 관리하기
 *  - 사용자 유형의 Enum 정의 및 각 사용자 유형에 따른 할인율 적용
 *  - PATRIOT
 *  - SOLDER
 *  - STUDENT
 *  - CIVILIAN
 *  - 주문 시, 사용자 유형에 맞는 할인율 적용해 총 금액 계산
 */

public enum UserType {
    // 1. Enum 정의
    // UserType은 열거형(Enum)으로, 네 가지 사용자 유형을 정의
    // 각 열거형 값은 두개의 속성: 할인율(discountRate)과 고유코드(code)를 가짐
    PATRIOT(0.1, "1"), // 국가유공자
    SOLDIER(0.05, "2"),  // 군인
    STUDENT(0.03, "3"),  // 학생
    CIVILIAN(0.0, "4"); // 일반인


    // 2. 필드
    // discountRate : 할인율을 나타내는 double 타입의 필드
    // code : 각 사용자 유형에 해당하는 코드 값을 나타내는 String 타입의 필드
    // * final 키워드는 해당 필드가 한 번 초기화 되면 변경되니 않도록 보장함
    private final double discountRate;
    private final String code;


    // 3. 생성자
    // UserType의 생성자는 discountRate와 code를 인자로 받아 각 열거형 값에 대해 설정
    // 각 열거형 값 (PATRIOT, SOLDIER, STUDENT, CIVILIAN)은 이 생성자를 통해서
    // 각각의 discountRate와 code 값을 갖게 됨
    UserType(double discountRate, String code) {
        this.discountRate = discountRate;
        this.code = code;
    }

    // 4. Getter 메서드
    // getDiscountRate() 메서드는 UserType의 할인율을 반환함
    // getCode() 메서드는 UserType의 코드 값을 반환함
    public double getDiscountRate() {
        return this.discountRate;
    }

    public String getCode() {
        return this.code;
    }


    // 5. fromCode 메서드
    // fromCode(String code) 메서드는 입력된 code값을 바탕으로 해당하는 UserType을 반환하는 메서드임
    // values()는 enum 타입에 의해 자동으로 제공되는 메서드로, 모든 UserType값들을 배열로 반환
    // 반복문을 통해 각 UserType와 code와 입력된 code를 비교하고 일치하는 UserType을 반환함
    // 만약 일치하는 UserType이 없으면, 예외를 던짐
    public static UserType fromCode(String code) {
        for (UserType type : values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }
        throw new IllegalArgumentException("다시 주문해주세요. 입력하신번호는 " + code + " 입니다.");
    }
}