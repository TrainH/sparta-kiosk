# 키오스크


![image](https://github.com/user-attachments/assets/6374c08b-0d6d-4b90-8ebd-7a06f469ed4b)



##  개요
이 프로그램은 키오스크 프로그램입니다.  

키오스크는 내가 먹고 싶은 음식을 선택해서 장바구니에 담은 후, 장바구니에 담긴 음식들을 주문할 수 있습니다.

음식 카테고리에서 햄버거를 선택해서 햄버거 종류 중 한가지를 선택합니다. 그리고 장바구니에 내가 먹고 싶은 메뉴를 일괄적으로 주문합니다.

또한, 고객별로 군인, 일반인 등인지 에 따라서 할인이 가능합니다.

> 
> **키오스크를 구현하기 위해 IntelliJ에서 Java로 만들어진 기초 프로젝트입니다.**
> 
> **작성자:** TrainH
> 
> **개발 기간:** 2024년 11월 21일 ~ 27일  
> 


##  필수 기능

###   1단계: 기본적인 키오스크를 프로그래밍해보자
- 햄버거 메뉴 출력 및 선택하기


![필수1](https://github.com/user-attachments/assets/f1be512d-9348-4dbc-aeb3-4e7e7b16ad72)


###   2단계: 객체 지향 설계를 적용해 햄버거 메뉴를 클래스로 관리하기
- MenuItem 클래스 생성하기
- main 함수에서 MenuItem 클래스를 활용하여 햄버거 메뉴를 출력


![필수2](https://github.com/user-attachments/assets/f56af306-dfdf-4d8a-ac6c-2a462094aa26)


###   3단계: 객체 지향 설계를 적용해 순서 제어를 클래스로 관리하기
- Kiosk 클래스 생성하기


![필수3](https://github.com/user-attachments/assets/130829f1-28b7-4aea-bc60-10aefdbb916d)


###   4단계: 객체 지향 설계를 적용해 햄버거 메뉴를 클래스로 관리하기
- Menu 클래스 생성하기


![필수4](https://github.com/user-attachments/assets/4777a46b-3049-4e65-93a2-1694f6d7882d)


###   5단계: 캡슐화 적용하기
- MenuItem, Menu 그리고 Kiosk 클래스의 필드에 직접 접근하지 못하도록 설정
- Getter와 Setter 메서드를 사용해 데이터를 관리


![필수5](https://github.com/user-attachments/assets/217bdd18-c696-4359-bc10-0e6cd1083282)



##  도전 기능

###   1단계: 장바구니 및 구매하기 기능을 추가하기
- 장바구니 생성 및 관리 기능
- 장바구니 출력 및 금액 계산
- 장바구니 담기 기능
- 주문 기능


https://github.com/user-attachments/assets/f8c27df6-4fb1-4b6c-b582-50986fc5bea7



###   2단계: Enum, 람다 & 스트림을 활용한 주문 및 장바구니 관리 
- Enum을 활용한 사용자 유형별 할인율 관리하기
- 람다 & 스트림을 활용한 장바구니 조회 기능


https://github.com/user-attachments/assets/161b412a-8cbb-4623-8341-500d10783bb2


