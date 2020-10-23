package ee.reneroost.springdependencyinjection.controller;

import ee.reneroost.springdependencyinjection.service.TervitusTeenus;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final TervitusTeenus tervitusTeenus;

    public ConstructorInjectedController(
            @Qualifier("constructorTervitusTeenus")
                    TervitusTeenus tervitusTeenus) {
        this.tervitusTeenus = tervitusTeenus;
    }

    public String saaTervitus() {
        return tervitusTeenus.ytleTervitus();
    }
}
