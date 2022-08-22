package ch02;

import java.util.ArrayList;

public class Friend {
    public static void main(String[] args){
        /* 
         * 변경자 : 호출되는 객체 변경
         * 접근자 : 객체를 변경하지 않는 메서드
        */
        ArrayList<String> friends = new ArrayList<String>();
        friends.add("Peter"); // friends에 Peter 객체 추가
        // 자바는 변수에 객체 참조만을 담을 수 있다.
        // 실제 객체는 다른 곳에 있고 참조는 실제 객체를 찾아내는 구현체 방법
        ArrayList<String> people = friends ; // people, friends 는 같은 객체를 참조
        people.add("Paul");
    }
}
