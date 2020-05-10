package apple;

import com.kdh.practice.Entity.Apple;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/*
* lambda 접근에 대한 이해
* 다양한 Predicate를 인자로 넘겨주며 기존 자바 8 이전에
* 오브젝트를 다루는 것의 번거러움을 나타냄
* */

public class AppleTest {


    List<Apple> appleList;

    void prettyPrintApple(List<Apple> inventory, ApplePredicate p) {
        for(Apple apple : inventory) {
            System.out.println(p.test(apple));
        }
    }

    //Predicate 인터페이스를 상속받아 Apple의 다양한 속성을 Print하는 메소드를 만듬
    interface ApplePredicate {
        public String test(Apple apple);
    }

    class colorPrintApplePredicate implements ApplePredicate {
        @Override
        public String test(Apple apple) {
            return apple.colorPrint();
        }
    }

    class weightPrintApplePredicate implements ApplePredicate {
        @Override
        public String test(Apple apple) {
            return apple.weightPrint();
        }
    }


    @BeforeEach
    void setUp() {
        appleList = new ArrayList<Apple>();
        Apple apple1 = new Apple("green",100);
        Apple apple2 = new Apple("yellow",150);
        Apple apple3 = new Apple("red",130);
        Apple apple4 = new Apple("white",140);
        Apple apple5 = new Apple("black",160);
        appleList.add(apple1);
        appleList.add(apple2);
        appleList.add(apple3);
        appleList.add(apple4);
        appleList.add(apple5);
    }

    @Test
    @DisplayName("퀴즈 2-1 유연항 prettyPrintApple 구현하기")
    void prettyPrintApple() {
        prettyPrintApple(appleList, new colorPrintApplePredicate());
        prettyPrintApple(appleList, new weightPrintApplePredicate());
    }
}
