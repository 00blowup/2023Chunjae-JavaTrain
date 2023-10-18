package oct18.hashMapEx;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    // HashMap 실습을 위한 실행 코드
    public static void main(String[] args) {
        // HashMap 컬렉션 생성
        System.out.println("컬렉션 생성");
        Map<String, Integer> hashMap = new HashMap<String, Integer>();

        System.out.println("현재 엔트리의 수: " + hashMap.size());
        System.out.println();

        // 객체 저장
        System.out.println("객체 저장");
        hashMap.put("돈가스", 8000);
        hashMap.put("김밥", 3000);
        hashMap.put("크림빵", 1500);
        hashMap.put("돈가스", 7000);   // 키가 중복되면 나중에 추가된 값만 저장

        System.out.println("현재 엔트리의 수: " + hashMap.size());
        System.out.println();

        // 키 하나로 값 하나 얻기
        System.out.println("키 하나로 값 하나를 조회해 출력");
        System.out.println("돈가스 가격: " + hashMap.get("돈가스"));
        System.out.println();

        // 모든 키 출력해보기
        System.out.println("모든 키값을 출력");
        for(String key : hashMap.keySet()) System.out.println(key);
        System.out.println();

        // 모든 값을 조회해 키와 함께 출력해보기
        System.out.println("모든 키와 값 쌍을 출력");
        for(String key : hashMap.keySet()) System.out.println(key + " 가격: " + hashMap.get(key));
        System.out.println();

        // 엔트리 삭제하기
        System.out.println("엔트리 하나 삭제");
        hashMap.remove("김밥");

        System.out.println("현재 엔트리의 수: " + hashMap.size());
        System.out.println();

        // 다시 모든 값을 조회해 키와 함께 출력하여 확인
        System.out.println("모든 키와 값 쌍을 출력");
        for(String key : hashMap.keySet()) System.out.println(key + " 가격: " + hashMap.get(key));
        System.out.println();


    }
}
