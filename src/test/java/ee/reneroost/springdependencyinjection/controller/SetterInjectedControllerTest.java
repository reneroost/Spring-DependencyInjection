package ee.reneroost.springdependencyinjection.controller;

import ee.reneroost.springdependencyinjection.service.ConstructorTervitusTeenus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();

        controller.setTervitusTeenus(new ConstructorTervitusTeenus());
    }

    @Test
    void saaTervitus() {
        System.out.println(controller.saaTervitus());
    }
}