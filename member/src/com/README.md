# 회원 관리 프로그램 with JAVA


## 개요
Java와 객체 지향에 대해 공부하기 위해 콘솔창을 이용한 간단한 회원 관리 프로그램을 구현


## 주요 기능
관리자 [기능](#화면별-기능---관리자)
- 로그인
- 회원 등록, 조회, 수정, 삭제, 목록
- 고객 정보 파일 출력

회원 [기능](https://github.com/gwidding/Java/tree/main/member/src/com#%ED%99%94%EB%A9%B4%EB%B3%84-%EA%B8%B0%EB%8A%A5---%ED%9A%8C%EC%9B%90)
- 로그인
- 정보 확인, 수정, 탈퇴


## 프로젝트 폴더 구조
```
member
│
└── src
    │
    ├── com
    │   │
    │   ├── login
    │   │   │
    │   │   ├── controller
    │   │   │   ├── infoController
    │   │   │   ├── LoginController
    │   │   │   └── ManageLogin
    │   │   │
    │   │   ├── domain
    │   │   │   ├── EnrollFile
    │   │   │   └── Member
    │   │   │
    │   │   ├── exception
    │   │   │   ├── ExceptName
    │   │   │   ├── ExceptPhone
    │   │   │   ├── ExceptPwd
    │   │   │   └── ExceptScan
    │   │   │
    │   │   └── main
    │   │       ├── Login
    │   │       └── Menu
    │   │
    │   └── member
    │       │
    │       ├── controller
    │       │   ├── ManageMember
    │       │   └── MemberController
    │       │
    │       ├── domain
    │       │   ├── Admin
    │       │   └── Member
    │       │
    │       ├── exception
    │       │   ├── ExceptName
    │       │   ├── ExceptPwd
    │       │   └── ExceptScan
    │       │
    │       └── main
    │           ├── Login
    │           └── Menu
    │
    └── memberList.txt
```

<br><br>
## 화면별 기능 - 관리자

<table>
 <tr>
  <td><img src="https://github.com/gwidding/Java/assets/135992700/a4c19705-d9fd-4022-a863-c8c268dd83b7"></td>
  <td width="350px">
   <h3> 관리자 로그인 </h3>
    <li> 아이디, 비밀번호 일치 확인
    <li> 로그인 성공 → 회원 관리 프로그램 실행
  </td>
 </tr>

  <tr>
    <td><img src="https://github.com/gwidding/Java/assets/135992700/966e9169-d76c-4b1b-8e86-e3f5fa25b38f">
        <img src="https://github.com/gwidding/Java/assets/135992700/0cc75ced-d990-40db-b726-51773095cfbc">
    </td>
    <td>
      <h3> 회원 등록 </h3>
      <li> 이름, 연락처, 주소, 비밀번호
      <li> 유효성 검사
      <li> 회원 이름 중복 불가
    </td>
  </tr>

  <tr>
    <td><img src="https://github.com/gwidding/Java/assets/135992700/01f31c61-f5c8-4e24-85dc-bf9f26de689e"></td>
   <td>
      <h3> 회원 조회 </h3>
      <li> 회원 이름 입력
      <li> 번호, 이름, 연락처, 주소 조회
    </td>
  </tr>

  <tr>
   <td><img src="https://github.com/gwidding/Java/assets/135992700/7aeab696-e699-4c96-a9cb-0ea490631b50"></td>
   <td>
    <h3> 회원 정보 수정 </h3>
       <li> 회원 이름 입력
       <li> 비밀번호 유효성 검사
       <li> 비워두면 기존 정보 유지
   </td>
  </tr>

  <tr>
   <td><img src="https://github.com/gwidding/Java/assets/135992700/88ad2029-2870-4b11-8440-b82db04a80f9"></td>
   <td>
    <h3> 회원 목록 조회 </h3>
       <li> 회원 번호, 이름, 연락처 조회
       <li> 비밀번호 유효성 검사
   </td>
  </tr>

<tr>
 <td><img src="https://github.com/gwidding/Java/assets/135992700/edce3895-6117-4047-bf6a-7216030cf160"></td>
  <td>
    <h3> 회원 삭제 </h3>
       <li> 회원 이름 입력
        <li> 비밀번호 일치 확인
   </td>
</tr>

<tr>
 <td><img src="https://github.com/gwidding/Java/assets/135992700/5824f0e2-a3dc-4590-afe8-bfce4c123849"></td>
 <td>
    <h3> 파일 저장 </h3>
       <li> 변경 사항 등 txt 파일 저장
   </td>
</tr>

<tr>
 <td><img src="https://github.com/gwidding/Java/assets/135992700/cdd472e3-da1c-4e8c-8cbf-1b91ccb3eb7e"></td>
 <td>
  <h3> 프로그램 종료 </h3>
 </td>
</tr>  
</table>
<br><br>

## 화면별 기능 - 회원
<table>
 <tr>
  <td><img src="https://github.com/gwidding/Java/assets/135992700/ec9e29ba-de82-4150-b71c-d03d7b6cf02e"></td>
  <td>
   <h3> 회원 로그인 </h3>
   <li> 아이디, 비밀번호 일치 확인</li>
   <li> 비밀번호 오류 횟수 3회</li>
   <li> 성공 시 마이페이지 이동</li>
  </td>
 </tr>

 <tr>
  <td><img src="https://github.com/gwidding/Java/assets/135992700/86a0f6fe-6540-40b4-9b67-60c7875ed56b"></td>
  <td>
   <h3> 회원 정보 조회 </h3>
   <li> 회원 번호, 이름, 연락처, 주소</li>
  </td>
 </tr>

 <tr>
  <td><img src="https://github.com/gwidding/Java/assets/135992700/cb63cddb-656e-4cae-89ae-ee20a14d98d4"></td>
  <td>
    <h3> 회원 정보 수정 </h3>
    <li> 비밀번호 일치 확인</li>
   <li> 비워두면 기존 정보 유지</li>
   <li> 비밀번호 : 4~8자, 연락처 : 숫자만 허용</li>
   <li> 이름 중복 불가</li>
   <li> 수정 사항 txt 파일에 반영</li>
  </td>
  
 </tr>
  <td><img src="https://github.com/gwidding/Java/assets/135992700/8ea7e490-e687-4ba1-b148-3084159ab417">
      <img src="https://github.com/gwidding/Java/assets/135992700/a3e817bd-c431-43ec-a1f0-1963a4cdc88d">
  </td>
  <td>
   <h3> 회원 탈퇴</h3>
   <li> 비밀번호 일치 확인</li>
   <li> 탈퇴 여부 확인 N : 탈퇴 취소, Y : 탈퇴 진행</li>
   <li> 탈퇴 사항 txt 파일에 반영</li>
  </td>
  
 <tr>
  <td><img src="https://github.com/gwidding/Java/assets/135992700/d493ac0e-14f6-400d-a6ef-60106fdf3c48"></td>
  <td>
   <h3> 프로그램 종료 </h3>
  </td>
 </tr>
</table>
