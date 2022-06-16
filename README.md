# Cellification🔬
2022년 1학기 캡스톤디자인 안드로이드 개발

# 주제 선정 및 개요
기업 (주)SOL 이 제안한 인공지능을 활용한 세포 계수 분석  애플리케이션 개발 산학협력 주제를 캡스톤 주제로 선정하여 개발을 진행하였다. 제공받은 세포배양액 이미지를 업로드하면, 어플리케이션이  살아있는 세포 개수와 죽어있는 세포 개수를 AI를 통해 구분하여 살아있는 세포와 죽어있는 세포의 계수와 비율을 결과로 알려준다.

# 팀원
| 팀원 | 역할 | 개발환경
|-----|-----|--------
|조수빈(PM), 김태강| 백엔드 | Spring frameworks, AWS s3, Naver Cloud Platform, Flask
|김민종, 박준후| 안드로이드 |  Kotlin, android native
|한동현| AI | YOLO, pytorch

# 개발 환경
IDE : Android Studio Bumblebee 2022.1.1 patch 2     
Language : kotlin 1.6.21        
sdkVersion : 31 (Android 12)        
UI Design : Figma

# 애플리케이션 UI
UI는 Figma를 사용하여 디자인 후 안드로이드 스튜디오에서 구현함.
1. 메인화면(분석 - 갤러리 접근) 및 사이드바

    <img src="https://user-images.githubusercontent.com/79445881/174091251-551d72cb-e164-4f53-9a9f-79bf84a905ad.jpg" width="100" height="200"/>
        <img src="https://user-images.githubusercontent.com/79445881/174092063-53818aba-330b-471c-b80a-f87f0d1ca938.jpg" width="100" height="200"/>
2. 분석완료 및 저장소

    <img src="https://user-images.githubusercontent.com/79445881/174092182-699f94ab-fb70-4138-9a1e-8e636ef72ff5.jpg" width="100" height="200"/>
        <img src="https://user-images.githubusercontent.com/79445881/174092266-3b309b63-b345-486c-8913-b84d7e49d4db.jpg" width="100" height="200"/>
            <img src="https://user-images.githubusercontent.com/79445881/174092335-995a419c-0af8-49eb-967f-c11059e38484.jpg" width="100" height="200"/>
3. 설정화면

    <img src="https://user-images.githubusercontent.com/79445881/174092453-ab1e306e-bafb-40f0-8508-9ffa08dacb08.jpg" width="100" height="200"/>


# 개발 과정 (요약)
[전체 개발 과정](https://github.com/Kim-Min-Jong/Capstone_mobile/blob/main/android/Cellification/app/src/main/java/readme/develop.md)

## 커밋 메시지 규칙
1. 문장의 끝에 . 를 붙이지 말기

2. 이슈 번호를 커밋 메시지 끝에 붙이기
3. 형식

   > [타입]: [내용] [이슈 번호]

4. 예시

   > DOCS: OO메소드 관련 설명 주석 [#3]
   >
   > FEAT: 시스템의 기능 add() [#6]

> \- FEAT : 새로운 기능의 추가
>
> \- FIX: 버그 수정
>
> \- DOCS: 문서 수정
>
> \- STYLE: 스타일 관련 기능(코드 포맷팅, 세미콜론 누락, 코드 자체의 변경이 없는 경우)
>
> \- REFACTOR: 코드 리펙토링
>
> \- TEST: 테스트 코트, 리펙토링 테스트 코드 추가
>
> \- CHORE: 간단한 수정, 빌드 업무 수정, 패키지 매니저 수정(ex .gitignore 수정 같은 경우)
