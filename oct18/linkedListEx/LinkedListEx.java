package oct18.linkedListEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    // ArrayList와 LinkedList의 실행시간 비교 실습을 위한 실행 코드
    public static void main(String[] args) {
        // ArrayList 컬렉션 객체 생성
        List<String> arrayList = new ArrayList<>();

        // LinkedList 컬렉션 객체 생성
        List<String> linkedList = new LinkedList<>();

        // 시작시간 & 끝시간을 저장할 변수 선언
        long startTime;
        long endTime;

        // ArrayList 저장 시간 측정
        startTime = System.nanoTime();  // 나노세컨드 단위로 현재시간을 얻어옴
        for(int i=0; i<10000; i++) arrayList.add(0, String.valueOf(i)); // 0번 인덱스에 요소를 추가할 때마다 모든 요소들이 뒤로 밀려남
        endTime = System.nanoTime();
        System.out.printf("ArrayList 저장 소요시간: %8d ns \n", endTime-startTime);   // 소요시간 출력

        // LinkedList 저장 시간 측정
        startTime = System.nanoTime();  // 나노세컨드 단위로 현재시간을 얻어옴
        for(int i=0; i<10000; i++) linkedList.add(0, String.valueOf(i)); // 0번 인덱스에 요소를 추가할 때마다 첫 요소의 연결고리가 수정됨
        endTime = System.nanoTime();
        System.out.printf("LinkedList 저장 소요시간: %8d ns \n", endTime-startTime);   // 소요시간 출력

        // 실행해보면 ArrayList의 소요시간이 훨씬 긴 것을 확인할 수 있다.

    }

}
