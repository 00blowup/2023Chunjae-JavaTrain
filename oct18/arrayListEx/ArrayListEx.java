package oct18.arrayListEx;

import java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args) {

        // ArrayList 생성
        ArrayList<Board> list = new ArrayList<>();

        // 객체 추가
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        // 저장된 총 객체 수 출력
        System.out.println("총 객체 수: " + list.size());

        // 인덱스로 객체 조회
        Board second = list.get(1);
        System.out.println("2번째 객체: " + second.getSubject() + " " + second.getContent() + " " + second.getWriter());
        System.out.println();

        // 모든 객체 순회
        System.out.println("모든 객체를 순서대로 출력");
        for(Board b: list) System.out.println(b.getSubject() + " " + b.getContent() + " " + b.getWriter());
        System.out.println();

        // 객체 삭제
        System.out.println("객체 2개 삭제");
        list.remove(2);
        list.remove(2); // 인덱스 3에 있던 요소가 2번 인덱스로 땡겨져오므로 다시 삭제할 수 있음

        // 다시 모든 객체 순회
        System.out.println("모든 객체를 순서대로 출력");
        for(Board b: list) System.out.println(b.getSubject() + " " + b.getContent() + " " + b.getWriter());





    }

}
