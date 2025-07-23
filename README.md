# spring-gift-enhancement

## 0단계 - 기본 코드 준비

### 구현할 기능 목록

1. 위시리스트 레포지토리를 remote add, fetch 한다.
2. cherry-pick을 통해 위시리스트 레포지토리의 0,1,2,3단계 커밋들을 가져온다.

## 1단계 - 엔티티 매핑

### 구현할 기능 목록

1. JPA 관련 의존성을 추가하고, application.properties에 관련 설정을 추가한다.
2. ProductRepository 를 JPA 기반으로 교체하고 Service 및 Entity도 수정 소요가 있다면 수정한다.
3. MemberRepository 에도 동일 작업을 진행한다.
4. RefreshTokenRepository 에도 동일 작업을 진행한다.
5. WishlistRepository 에도 동일 작업을 진행하나 외래 키 매핑 등에 유의하여 작업한다.
6. JDBC의 잔해들을 모두 정리한다.

## 2단계 - 페이지네이션

### 구현할 기능 목록

1. WishlistService의 getWishlistItems 메서드에 페이지네이션 기능을 추가한다.
2. ProductService의 getProducts 메서드에 페이지네이션 기능을 추가한다.


## 3단계 - 상품 옵션

### 구현할 기능 목록

1. 연관 관계 및 Validation에 유의하며 Option 엔티티를 작성한다.
2. OptionRepository를 작성한다.
3. OptionService를 작성한다.
4. OptionController를 작성한다.