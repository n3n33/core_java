package ch02;
import java.time.LocalDate;

public class Cal {
    public static void main(String[] args){
        /* 
         * 캡슐화 : 다른 사람이 구현한 객체의 메서드를 호출할 때 내부에 무슨일이 일어나는지 몰라도된다
         * 클래스 : 객체를 제공해 자신의 작업을 공유하고 싶을 때 클래스 만들어 제공
        */

        // 캘린더 구현
        // 특정 위치로 고정하지 않고 날짜를 표현 -> LocalDate 사용
        LocalDate date = LocalDate.of(2022, 5, 1);
        date = date.plusDays(1);

        while (date.getMonthValue() == 5 ){
            System.out.printf("%4d", date.getMonthValue());
            date = date.plusDays(1);
        }
    }
}
