## 전체 흐름
1. 사용자가 로또 구입 금액 입력
2. 장당 1,000원으로 계산하여 구입 금액만큼 로또 발행
3. 사용자가 당첨 번호 입력
4. 사용자가 보너스 번호 입력
5. 당첨/보너스 번호와 발행한 로또 번호를 비교하여 당첨 통계 출력
   - 일치하는 번호의 개수, 당첨금, 당첨 개수
   - 총 수익률

## 구현 기능 목록
### 로또 구입 금액 입력
- [x] 구입 금액 입력 안내 문구를 출력하는 기능
- [x] 사용자로부터 구입 금액을 입력받는 기능
- [x] 입력된 구입 금액의 유효성 검사
  - [x] 금액이 1,000원으로 나누어 떨어지지 않는 경우 `IllegalArgumentException` 발생
  - [x] 예외 발생 시 해당 예외를 잡아 에러 메시지를 출력하고 다시 입력받는 기능

### 로또 번호 발행
- [x] 입력된 금액만큼 난수 6개 세트를 생성하는 기능
  - [x] 각 세트 안의 숫자는 중복되지 않도록 생성
- [x] 로또 번호를 발행한 개수 안내 문구를 출력하는 기능
- [x] 발행된 로또 번호 각각을 출력하는 기능
    - [x] 로또 번호 한 행은 오름차순 정렬하여 출력

### 로또 정답(당첨, 보너스 번호) 입력
- [x] 당첨 번호 입력 안내 문구를 출력하는 기능
- [x] 당첨 번호를 입력받는 기능
- [x] 보너스 번호 입력 안내 문구를 출력하는 기능
- [x] 보너스 번호를 입력받는 기능
- [x] 입력된 당첨 번호와 보너스 번호의 유효성 검사
  - [x] 번호가 유효하지 않은 경우 `IllegalArgumentException` 발생
    - 당첨 번호와 보너스 번호는 모두 1~45 범위 사이
    - 당첨 번호는 `,`로 구분된 6개의 숫자
    - 보너스 번호는 숫자 하나
- [x] 예외 발생 시 해당 예외를 잡아 에러 메시지를 출력하고 다시 입력받는 기능

### 당첨 통계 출력
- [x] 당첨 통계 안내 문구를 출력하는 기능
- [x] 로또 정책을 참조하여 등수를 계산하는 기능
- [x] 계산된 등수 정보를 출력하는 기능
- [x] 총 수익률을 계산하여 출력하는 기능
