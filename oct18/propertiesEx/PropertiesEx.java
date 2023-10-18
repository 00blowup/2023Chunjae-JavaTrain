package oct18.propertiesEx;

import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {
    // Properties 컬렉션을 이용해 .properties 파일의 내용을 읽는 실습 실행 코드
    public static void main(String[] args) {
        // Properties 컬렉션 생성
        Properties properties = new Properties();

        // PropertiesEx.class와 같은 ClassPath(out 디렉토리 내)에 생성된 database.properties 파일 로드
        // ProperitesEx.java와 같은 디렉토리에 database.properties를 생성한 채로 본 코드를 실행시키면 즉시 생성되어 참조 가능
        try{
            properties.load(PropertiesEx.class.getResourceAsStream("database.properties"));
        } catch (IOException e) { System.out.println("IOException 발생!"); }

        // 값 얻기
        System.out.println(properties.getProperty("value"));

    }
}