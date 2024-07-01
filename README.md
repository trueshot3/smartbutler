
# SMARTBUTLER
>*시설물 관리 및 대여 시스템*
>#### 프로젝트 기간: 2024.01.15 ~ 2024.02.23
>#### 배포: http://54.180.83.121:8888/
>관리자 ID: admin
>
>사용자 ID: mail@mail.com
>
>작업자 ID: 아담청소
>
>공통 PW: 1111
>
>#### 산출물: https://drive.google.com/drive/u/0/folders/1Bee0VTa_Er4jHM1OXCLdO1wvkF4-G3UE

### 1. 개요

-  프로젝트명 : SMARTBUTLER(스마트버틀러)
-  팀명 : 팀 와일드카드
-  담당업무

      |  | 엄다빈(팀장) | 송창민 | 전종배 | 정시운 |
      | ------ | ------ | ------ | ------ | ----- |
      | FrontEnd | -관리자, 사용자, 작업자 CSS<br>-인덱스 페이지<br>-관리자, 사용자 메인페이지<br>-건물정보<br>-입주 정보<br>-관리비<br>-사용자 건물정보보기<br>-사용자 관리비 | -이미지보기 모달<br>-작업일지<br>-민원관리<br>-사용자 민원관리 | -로그인 화면<br>-계약업체 | -시설 목록<br>-견적목록<br>-회원 목록<br>-사용자 회원가입<br>-마이페이지<br>-사용자 견적신청 | 
      | BackEnd  | -건물정보 등록 수정<br>-관리비 등록 수정 전송<br>-입주정보 등록 수정 삭제<br>-이미지 저장 기능<br>-사용자 건물정보보기 리액트 구현<br>-사용자 관리비 보기 기능 | -페이지네이션<br>-작업요청 수정 삭제<br>-민원 처리<br>-사용자 민원 등록 수정 삭제 | -관리자, 사용자, 작업자 로그인/로그아웃 기능 구현<br>-계약업체 등록 수정 삭제 | -시설 등록 수정 삭제<br>-견적 처리<br>-사용자 탈퇴 기능<br>-사용자 회원가입<br>-마이페이지 수정<br>-사용자 견적신청 기능 |

- 개발 기간 : 2024-01-15 ~ 2024-02-15

- 개발 환경 : ![image](https://github.com/eomdapin/smartbutler/assets/146176667/1082e95a-60b0-400c-89b4-c426c53580d7)
- FrontEnd : HTML5, CSS3, JS, BootStrap 5.3, React
- BackEnd : Java 17, JPA, Spring Security 6, MySQL 8.0.22, Lombok 1.18.30
- Tool : STS4 4.21.0, VS code, SourceTree
- ETC : github, AWS EC2, Docker
- OS : Windows 11
  
***

### 2. 설계 배경

- 편리하고 효과적인 시설물 관리와 대여를 관리하는 환경 구축

***

### 3. 설계 목적  
- 시설물의 관리 및 대여에서 생기는 문서들의 전산화로 편의성 향상

***

### 4. 기대 효과  
- 시스템 전산화를 통한 빠른 업무처리 및 사용자들의 편의성과 관리 비용의 절감

***

### 5. UI/UX 특징
- 사용자 페이지 – 익숙하고 편안한 느낌으로 편의성과 접근성 강조하여 설계
- 관리자 및 작업자 페이지 – 고령 또는 웹에 익숙하지 않은 사용자 편의와 접근성을 생각하여 화면 설계 

***

### 6. 기능 요약
- 관리자
  - 건물 정보
  - 시설 관리
  - 임대 관리
  - 계약 업체
  - 민원 관리
  - 회원 정보

- 사용자
  - 마이페이지
  - 건물정보보기
  - 관리비 조회
  - 견적 신청
  - 민원 신청

- 작업자
  - 요청 목록

***

### 7. 참고 이미지
  메인 화면

  ![alt text](img/4.png)

  관리자

  ![alt text](img/3.png)

  사용자

  ![alt text](img/1.png)

  관리비

  ![alt text](img/5.png)

  작업자

  ![alt text](img/2.png)
