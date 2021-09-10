2021.09.10금 
1. 실험용 프로젝트 생성 후, maven 연동
2. 생성자 내부에서 스레드 2개 선언
3. topthread로 스레드 2개 잡기
1. 실험용 프로젝트 생성 후, maven 연동
 
Archetype 선택하라고 나옴. Group Id, Artifact Id, Version을 선택해야 다음으로 넘어갈 수 있음.
기존 sdv1 패키지를 보면 com.automatak.dnp3, DAU_Comm_v1, 2.3.3-SNAPSHOT
로 선택되어있음.  archytype 선택을 하지 않기 위해, simple project 생성으로 바꿈
 
파일 생성 후, pom.xml을 기존 sdv1 것과 맞춤.
실행하여 동작되는 것을 확인.
2. 생성자 내부에서 스레드 2개 선언
1)DevDBInfo: 변수관리 객체
총 30군데 반영.
2) config 파일 읽어오기.
