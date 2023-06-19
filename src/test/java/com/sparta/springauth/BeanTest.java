package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

//    @Autowired
//    Food food; //같은 타입의 Bean이 두개 이상이라 Autowired를 사용할 수 없다. 자동으로 어떤 클래스를 Bean으로 등록할지 모른다.

    // 1번
//    @Autowired
//    Food pizza; //정확하게 명시해야함
//
//    @Autowired
//    Food chicken;

    // 2번
//    @Autowired
//    Food food; //Primary 애너테이션이 달려있는 클래스를 우선적으로 Bean으로 등록한다.

    // 3번
    @Autowired
    @Qualifier("pizza")
    Food food;

    // Primary와 Qualifier 중 우선순위는 Qualifier의 우선순위가 높다.
    // 범용적으로 사용되는 Bean 객체에는 Primary를, 지역적으로 사용하는 Bean 객체에는 Qualifier를 붙여주는 것이 좋다.

    @Test
    @DisplayName("테스트")
    void test1() {
        food.eat();
    }
}
