package Ex02_FlyweightPattern.case2;

import java.util.HashMap;
import java.util.Map;

// 객체생성을 담당하는 팩토리패턴
public class FlyweightFactory {
    private static Map<String, Subject> map = new HashMap<String, Subject>();

    public Subject getSubject(String key) {
        Subject subject = map.get(key);
        if (subject == null) { // map에 만들어놓은 객체가 없다면
            subject = new Subject(key); // 객체생성
            map.put(key, subject); // 생성된객체 map에 등록
            System.out.println("새로 생성 "+key);
        } else {
            System.out.println("재사용 " + key); // 있다면 출력
        }
        return subject; // subject를 반환
    }
}
