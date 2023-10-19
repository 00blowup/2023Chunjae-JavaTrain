package oct19.treeSetEx;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {
    // TreeSet 실습을 위한 실행 코드
    public static void main(String[] args) {
        // TreeSet 컬렉션 생성
        TreeSet<Integer> treeSet = new TreeSet<>();

        // 요소 저장
        treeSet.add(28);
        treeSet.add(12);
        treeSet.add(83);
        treeSet.add(32);
        treeSet.add(97);

        // 모든 요소를 오름차순으로 출력
        System.out.println("모든 요소 오름차순 출력");
        for(Integer n : treeSet) System.out.println(n);
        System.out.println();

        // 특정 조건에 부합하는 요소 조회
        System.out.println("특정 조건에 부합하는 요소 조회");
        System.out.println("최솟값: " + treeSet.first());
        System.out.println("최댓값: " + treeSet.last());
        System.out.println("50점 초과이면서 가장 작은 수: " + treeSet.higher(50));
        System.out.println("50점 미만이면서 가장 큰 수: " + treeSet.lower(50));
        System.out.println("90점 이하이면서 가장 큰 수: " + treeSet.floor(90));
        System.out.println("40점 이상이면서 가장 작은 수: " + treeSet.ceiling(40));
        System.out.println();

        // 모든 요소를 내림차순으로 출력
        System.out.println("모든 요소 내림차순 출력");
        NavigableSet<Integer> descendingSet = treeSet.descendingSet();
        for(Integer n : descendingSet) System.out.println(n);
        System.out.println();

        // 범위 검색 (32 <= n)
        System.out.println("32 이상의 요소 모두 출력");
        NavigableSet<Integer> rangeSet = treeSet.tailSet(32, true); // tailSet 즉 해당 값보다 뒤의 수 (더 큰)
        for (Integer n : rangeSet) System.out.println(n);
        System.out.println();

        // 범위 검색 (32 <= n <90)
        System.out.println("32 이상 90 미만의 요소 모두 출력");
        rangeSet = treeSet.subSet(32,true, 90, false);
        for (Integer n : rangeSet) System.out.println(n);

    }
}
