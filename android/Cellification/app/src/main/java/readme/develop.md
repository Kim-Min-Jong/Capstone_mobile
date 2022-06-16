# 안드로이드 개발 과정(요약)
1. splash screen을 통해 로딩화면을 구성
- 안드로이드 어플 시작점인 로딩화면을 구성하였다. 로딩이 끝나면 메인으로 넘어간다.

2. side bar 제작
- 각종 메뉴와 사용자 정보를 볼 수 있는 side bar를 제작하였다.

3. 로그인, 회원가입, 분석, 분석완료, 결과, 저장소, 설정화면 구성
- 사전 제작한 UI를 안드로이드 스튜디오를 통해 직접 구현하였다(xml)

4. 제작한 side bar를 MainActivity에 적용 (전역 적용)
- 2에서 만든 side bar를 mainActivity에 적용하여 어떤 화면에서든 side bar를 볼 수 있게 하였다.

5. bottom navigation bar 제작 후 적용
- 하단에서 각 메뉴로 넘어갈 수 있는 navigation bar를 제작하였다.

6. 서버와 통신하는 모델인 Cell, User data class 생성
- 서버와 맞는 데이터 타입을 주고 받아야 하기 때문에 cell, user data class를 생성하였다.

7. API 명세서에 따른 Cell, User service 구현
- 백엔드에서 구현한 restful api 명세서를 통해 안드로이드에서 사용할 api를 구현하였다.

8. (Cell, User) datasource, repository 생성
- mvvm아키텍쳐를 적용하기 위해 datasource, repository 패턴을 적용하여 관심사 분리를 하였다.

9. 로그인, 회원가입 시 입력값 유효성 검사 구현
- 로그인, 회원가입 시 무작위 값이 들어가는 것을 방지하기 위해 유효성 검사를 구현하였다.

10. 안드로이드 서버 통신 라이브러리 retrofit 설정
- backend와 통신하기 위해 안드로이드 http 라이브러리인 retrofit을 설정하였다.

11. 서버에서 받아온 상태에 따라 데이터를 저장하는 APIResponse 구현
- 회원가입, 로그인, 분석 등 서버와 동작을 하면 그에따른 반환값이 있는데, 이것을 관리하기위해             APIResponse를 구현하였다.

12. 의존성 주입을 위한 dagger-hilt 모듈 적용
- mvvm아키텍쳐를 제대로 적용하려면 의존성 주입이 필요하다. 따라서 hilt 모듈을 통해 hilt가 알아          서 의존성 관리를 하도록 설정하였다.

13. 프로젝트 전반에 hilt를 이용하여 의존성 주입
- hilt annotation을 사용하여 간단하게 의존성 주입을 실시 하였다.

14. 이미지 로딩을 위한 Glide 모듈 적용
- 분석이 완료된 이미지를 빠르게 불러오기 위해 이미지 로딩 라이브러리인 Glide를 적용하였다.

15. service - repository - viewmodel - view 연결, 테스트
- 위에서 구현한 각 mvvm 컴포넌트들을 연결하고 서버와 통신하면서 테스트(로그인)를 진행함.

16. 저장소 recycler view 기능(data search, data delete) 구현
- 분석 후 결과 목록을 볼 수 있는 recycler view을 구현하고, 데이터 필터링, 삭제 기능을 구현함

17. 설정 기능 구현
- 전역데이터 삭제, 로그아웃, 회원탈퇴등 설정 기능을 구현하였다.

18. AI - BackEnd - Android 연결, 테스트
- 15의 테스트가 로그인 위주의 테스트였다면, 현재는 ai와의 연결도 완료되어 실제 세포계수분석 테스트를 진행하였다.

19. 구현 완료 및 버그 수정 