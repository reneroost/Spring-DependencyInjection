package ee.reneroost.springdependencyinjection.controller;

import ee.reneroost.springdependencyinjection.service.ConstructorTervitusTeenus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorTervitusTeenus());
    }

    @Test
    void saaTervitus() {
        System.out.println(controller.saaTervitus());
    }
}