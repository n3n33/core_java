package ch01;
import java.util.Random;
/*
 * javac 명령으로 자바 소스 코드를 특정 기계에 종속되지않은
 * 중간 표현인 바이트 코드로 컴파일 해서 클래스파일에 저장함
 * java 명령어로 가상머신을 구동하고 클래스파일을 로드해서 바이트코드 실행함
 */
public class App {
    public static void main(String[] args) throws Exception {
        // 메인은 메서드
        System.out.println("Hello, World!");
        // System.out 은 객체이며
        // PrintStream 클래스의 인스턴스
        // PrintStream 클래스에는 println 등의 메서드가 있다.
        // 이런 메서드는 해당 클래스의 객체 (인스턴스)에서 작동함
        // 이것을 인스턴스 메서드라고 한다

        // 자바는 객체 대부분을 생성(construct)해야한다.
        // Random 클래스의 객체는 난수를 생성할 수 있다.

        Random generator = new Random();
        System.out.println(generator.nextInt());
        System.out.println(generator.nextInt());

        // 변수 선언
        // 타입이 같은 경우 변수 여러개 한줄로 선언할 수있다.
        // 하지만 각 변수를 개별로 선언하는 방법을 선호한다.
        int total = 0; // 0으로 초기값 지정
        int count ; // 초기화 되지않음

        Random generator1 = new Random();

        // 상수 선언
        // final 키워드 사용
        // 할당하면 변경할 수 없는 값 (다른 언어에서는 constant)

    }
    // static 키워드로 상수를 메서드 외부에 선언 가능
    public static final int DAYS_PER_WEEK = 7;
}

