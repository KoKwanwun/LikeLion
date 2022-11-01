# LikeLion
**멋쟁이사자처럼 활동내용**

<img src="https://img.shields.io/badge/Java-007396?style=plastic&logo=java&logoColor=white"><br>

<img src="LIKELION_Image.png">

## Contents
<details>
<summary>Week7 (221031 ~ 221103)</summary>

## Week7 (221031 ~ 221103)
### 221031 (모의고사, Hospital 데이터 파싱)
- `Programmers_42840` : 모의고사
- **SpringBootCoreGuide** : Hospital 데이터 파싱

### 221101 (소수찾기, Hospital add, getCount, deleteAll, findById 구현)
- `Programmers_12921` : 소수찾기
- - **SpringBootCoreGuide** : Hospital add, getCount, deleteAll, findById 구현

### 221102 ()
- 

### 221103 ()
- 

</details>

---

<details>
<summary>Week6 (221024 ~ 221028)</summary>

## Week6 (221024 ~ 221028)
### 221024 (k번째 수, DataSource 인터페이스 적용, 익명클래스 도입, JdbcContext 분리, JdbcTemplate 사용)
- `KthNum_Programmers_42748` : K번째 수
- **LikeLion-gradle** . `dao` : DAO 복습(221021 내용)
- **Read-line-parser-gradle** . `dao` : DataSource 인터페이스, 익명클래스, JdbcContext, JdbcTemplate

### 221025 (Hash, Dao 총 복습)
- HashFunction, HashTableFunction : Hash 알고리즘 구현
- **Toby_Spring_Final** . `dao` : Dao 총 복습

### 221026 (Hash 충돌 방지, Spring boot 프로젝트 생성, @RestController, @RequestMapping, @GetMapping, @PathVariable)
- HashTableFunctionImprove : Hash 충돌 방지 구현
- **SpringBootCoreGuide** . `controller` : @RestController, @RequestMapping, @GetMapping, @PathVariable

### 221027 (Hash(완주하지 못한 선수), Git Fork하는 법, GET(@RequestParam), POST(@RequestBody), Put(@ResponseEntity), Swagger)
- `Programmers_42576` : Hash(완주하지 못한 선수)
- **SpringBootCoreGuide** . `controller` : GET(@RequestParam), POST(@RequestBody), Put(@ResponseEntity), Swagger

### 221028 (Hash(폰켓몬, 전화번호 목록), 로그 남기는 방법(@Slf4j, log.info), SpringBoot와 jdbcTemplate을 이용해 CRUD 구현)
- `Programmers_1845` : Hash(폰켓몬)
- `Programmers_42577` : Hash(전화번호 목록)
- **SpringBootCoreGuide** . `controller`
  - GetController : 로그 남기는 방법(@Slf4j, log.info)
- **SpringBootCoreGuide** . UserController, UserDao, User : SpringBoot와 jdbcTemplate을 이용해 CRUD 구현

</details>

---

<details>
<summary>Week5 (221017 ~ 221021)</summary>

## Week5 (221017 ~ 221021)
### 221017 (별찍기, 자바 DB 연동)
- RightTriangle : 직각삼각형 별찍기
- Pyramid : 피라미드 별찍기
- Rhombus : 마름모 별찍기
- **Read-line-parser-gradle** . `dao` : 자바 DB 연동

### 221018 (별찍기, 리펙토링 - 추상 클래스, Class 분리, 인터페이스 도입)
- SquareStar : 정사각형 별찍기
- RectangleStar : 직사각형 별찍기
- **Read-line-parser-gradle** . `dao` : 리펙토링 - 추상 클래스, Class 분리, 인터페이스 도입

### 221019 (Stack, 리펙토링 - Interface 도입 이해, Factory 적용, Spring 적용, deleteAll, getCount 추가)
- `stack` : Stack 구현
- **Read-line-parser-gradle** . `dao` : 리펙토링 - Factory 적용, Spring 적용

### 221020 (Stack, DAO 복습)
- **LikeLion-gradle** . `stack` : Stack 기능 및 테스트 추가 (isEmpty, peek)
- **LikeLion-gradle** . `dao` : DAO 복습(221019 내용)
- **Read-line-parser-gradle** . `dao` : deleteAll, getCount 메소드 및 테스트 추가, findById 예외처리, 테스트 코드에 @BeforeEach추가

### 221021 (괄호 풀기 알고리즘, 인터페이스를 활용한 코드 개선 - try/catch 중복 제거, jdbcContextWithStatementStrategy 사용)
- **LikeLion-gradle** . `stack`.`bracket : 괄호 풀기 알고리즘
- **LikeLion-gradle** . `dao` : DAO 복습(221020 내용)
- **Read-line-parser-gradle** . `dao` : StatementStrategy 인터페이스 생성, 인터페이스를 활용한 코드 개선(ex.jdbcContextWithStatementStrategy 사용)

</details>

---

<details>
<summary>Week4 (221011 ~ 221014)</summary>

## Week4 (221011 ~ 221014)
### 221011 (알고리즘, Docker, MySQL)
- Programmers_12931 : 자릿수 더하기

### 221012 (csv parser)
- `domain`<br>
  ◻ Hospital : 데이터를 저장할 클래스 정의
- `parser`<br>
  ◻ Parser : T를 리턴하는 parse 함수를 가지고 있는 interface (HospitalParser처럼 응용가능)<br>
  ◻ HospitalParser : 파일은 ,로 분리 후 0인덱스 값을 Hospital 형태로 리턴
- FileController : 각 줄을 읽어 T 형태로 리턴
- ParserMain : 서울시 병의원 위치 정보.csv를 가져와 사이즈와 id 출력

### 221013 (SelectionSort, .sql 형식으로 데이터 전처리)
- `bubblesort`<br>
  ◻ BubbleSort01 : 버블 정렬 알고리즘(앞에서부터 값 고정)
- LikeLion-gradle Repository : .sql 형식으로 데이터 전처리 후 MySQL에 불러오기

### 221014 (InsertionSort, 병원 데이터 DB 넣기)
- `insertionsort`<br>
  ◻ InsertionSort01 : 삽입 정렬 알고리즘(이중 for문 사용)<br>
  ◻ InsertionSort02 : 삽입 정렬 알고리즘(재귀 함수 사용)
- **Read-line-parser-gradle** . `line` : 병원 데이터 파싱하여 전처리 후, DB에 넣기

</details>

---

<details>
<summary>Week3 (221004 ~ 221007)</summary>

## Week3 (221004 ~ 221007)
### 221004 (Array)
- HelloWorld : Hello World 출력
- ArrayTest : 크기가 10인 배열 만들고 1~10 넣고 출력
- PrintChange, PrintChange2 : 거스름돈 문제
- `Even_Odd` : 홀수 짝수 문제
- `Even_Odd_1161` : 정수를 입력 받아 홀수 짝수 문제

### 221005 (Interface, List)
- `randomCalculator`<br>
  ◻ interface를 만들어 랜덤한 수<br>
  ◻ 특정한 수 생성 함수 만든 후 사칙연산(baseNum 이용한 생성자 추가)
- Calculator, CalculatorMain : 매개 변수 2개를 이용하여 사칙연산
- `Collection`<br>
  ◻ List를 이용하여 임의의 이름 출력<br>
  ◻ 5명의 정보(반, 이름, 깃주소) 출력

### 221006 (List, Set, Map)
- `Student_List` : List를 활용하여 학생이름 5명 출력
- SetExercise : Set 테스트
- `randomNumberSet` : 50개 랜덤한 수 생성 후 중복 제거
- `randomAlphabetSet` : 50개 랜덤한 알파벳 생성 후 중복 제거
- `MapTest`<br>
  ◻ Map에 이름과 깃주소를 넣고 출력<br>
  ◻ 깃주소를 하나 가져와서 알파벳별, 알파벳이 아닌 문자별 개수 출력<br>
  ◻ 문자열 알파벳 개수 출력
- `File`<br>
  ◻ 파일에서 읽어서 한글자, 두글자, n글자 출력<br>
  ◻ 파일목록 출력<br>
  ◻ 1줄, n줄 읽기

### 221007 (대용량파일 불러오기)
- `MiniProject` :  2021년 인구관련연간 자료를 활용하여 2021 서울에서 가장 많이 이사간 지역은 어디인지 알아내기<br>
  ◻ 파일 생성 및 작성<br>
  ◻ 모든 전입 전출 경우의 수, 특정 전출에 따른 모든 전입 경우의 수, 특정 전입 전출 경우의 수 출력<br>
  ◻ 히트맵을 위한 데이터 전처리 후 히트맵 그리기<br>
- ReadFile : 파일 읽어서 출력

</details>

---

