# 사다리 게임
## 진행 방법
* 사다리 게임 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/nextstep-step/nextstep-docs/tree/master/codereview)



Optional
요구사항 1 - Optional을 활용해 조건에 따른 반환
nextstep.optional.User의 ageIsInRange1() 메소드는 30살 이상, 45살 이하에 해당하는 User가 존재하는 경우 true를 반환하는 메소드이다.

같은 기능을 Optional을 활용해 ageIsInRange2() 메소드에 구현한다. 메소드 인자로 받은 User를 Optional로 생성하면 stream의 map, filter와 같은 메소드를 사용하는 것이 가능하다.

nextstep.optional.UserTest의 테스트가 모두 pass해야 한다.

힌트
Guide To Java 8 Optional 문서를 참고해 Optional 사용 방법을 익힌다.
Optional.ofNullable(user)을 활용해 User을 Optional로 생성하는 것이 가능하다.
Optional의 map(), filter() 메소드등을 활용해 필요한 데이터를 추출
Optional의 isPresent() 메소드 활용




요구사항 2 - Optional에서 값을 반환
nextstep.optional.Users의 getUser() 메소드를 자바 8의 stream과 Optional을 활용해 구현한다.

자바 8의 stream과 Optional을 사용하도록 리팩토링한 후 UsersTest의 단위 테스트가 통과해야 한다.

힌트
Guide To Java 8 Optional 문서를 참고해 Optional 사용 방법을 익힌다.
Optional의 orElse() 메소드 활용해 구현한다.





요구사항 3 - Optional에서 exception 처리
nextstep.optional.ExpressionTest의 테스트가 통과하도록 Expression의 of 메소드를 구현한다.

단, of 메소드를 구현할 때 자바 8의 stream을 기반으로 구현한다.

힌트
Guide To Java 8 Optional 문서를 참고해 Optional 사용 방법을 익힌다.
자바의 enum 전체 값은 values() 메소드를 통해 배열로 접근 가능하다.
Arrays.stream()을 이용해 배열을 stream으로 생성할 수 있다.
일치하는 값 하나를 추출할 때 findFirst() 메소드를 활용 가능하다.
Optional의 orElseThrow() 메소드 활용해 구현한다.