package remind.be;

public enum DiscountType {
    // 1. Enum 정의
    PATRIOT(0.1, "1"), // 국가유공자
    SOLDIER(0.05, "2"),  // 군인
    STUDENT(0.03, "3"),  // 학생
    CIVILIAN(0.0, "4"); // 일반인


    // 2. 필드
    private final double discountRate;
    private final String code;


    // 3. 생성자
    DiscountType(double discountRate, String code) {
        this.discountRate = discountRate;
        this.code = code;
    }

    // 4. Getter 메서드
    public double getDiscountRate() {
        return this.discountRate;
    }

    public String getCode() {
        return this.code;
    }


    // 5. fromCode 메서드
    public static DiscountType fromCode(String code) {
        for (DiscountType type : values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }
        throw new IllegalArgumentException("다시 주문해주세요. 입력하신번호는 " + code + " 입니다.");
    }
    }
