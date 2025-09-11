<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/fe5b4792-f609-4d69-ae04-6e8191d52ea7" />
<img width="1920" height="1932" alt="image" src="https://github.com/user-attachments/assets/d29dc603-8472-40de-a1fb-40bac98a2d33" />


## 1. 개요
- 기간 : 2024년 7월 ~ 2024년 8월
- 인원 : PM 1명, DESIGN 1명, FE(Android) 3명, BE(SpringBoot) 4명
- 역할 :
  - 백엔드(SpringBoot) 파트장
  - 메인 페이지 구현
  - 검색 기능 구현
  - 지역 필터링 구현
  - 마이페이지 구현
- 기술스택 : 
  - JAVA 17
  - SpringBoot 3.3.2
  - Build Tool Gradle - groovy
- 의존성 : Spring Web, Spring Data JPA, Lombok, MySql Driver, Spring Security

## 2. 개발 내용

<table>
  <tr>
    <td align="center" width="50%">
      <img width="1920" height="1880" alt="image" src="https://github.com/user-attachments/assets/55fe8715-8998-41ad-bbe5-340818592956" /><br/>
      <sub>메인 페이지</sub>
    </td>
    <td align="center" width="50%">
      <img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/afe6ae88-5139-4570-9b53-9f426d0e216d" /><br/>
      <sub>검색 기능</sub>
    </td>
  </tr>
  <tr>
    <td align="center" width="50%">
      <img width="1920" height="1348" alt="image" src="https://github.com/user-attachments/assets/86fd5c5e-723b-450f-a0e3-17cda55edf49" /><br/>
      <sub>내 근처 사건 사고 조회</sub>
    </td>
    <td align="center" width="50%">
      <img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/6f683e74-8ac3-4a9d-b88f-ff8b54bb1120" /><br/>
      <sub>근처 시설 조회</sub>
    </td>
  </tr>
</table>
<br/>

1. 메인 페이지
   - 조회 시 사용자의 근처 사건·사고, 국내 주요 사건·사고, 사고 알림, 광고 데이터를 함께 불러옵니다.
   - 근처 사건·사고 데이터는 `@Query`를 활용해 최신순·인기순·거리순으로 정렬하여 제공합니다.
2. 지역 필터링
   - 지역 데이터베이스 테이블을 법정동 기준으로 시·도, 시·군·구, 읍·면·동 단위로 분리합니다.
   - 안드로이드에서 전달받은 지역명 데이터를 파싱해 사용자의 현재 읍·면·동 위치를 식별하고, 이를 기준으로 지역 관리 및 필터링을 수행합니다.
3. 검색 기능
   - 검색 시 데이터 내에서 해시태그와 일치하는 문자열이 발견되면, 해당 해시태그와 연관된 모든 데이터를 조회합니다.

## 3. 설계
<table>
  <tr>
    <td align="center" width="50%">
      <img width="984" height="610" alt="image" src="https://github.com/user-attachments/assets/0e7f4031-5426-455c-a56b-d5ba6541c4f6" /><br/>
      <sub>API 명세서</sub>
    </td>
    <td align="center" width="50%">
      <img width="1422" height="822" alt="image (3)" src="https://github.com/user-attachments/assets/16668d5d-b5dd-464c-8884-41b556066354" /><br/>
      <sub>ERD 다이어그램</sub>
    </td>
  </tr>
</table>
<br/>
