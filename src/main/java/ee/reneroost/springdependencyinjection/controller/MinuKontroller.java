package ee.reneroost.springdependencyinjection.controller;

import ee.reneroost.springdependencyinjection.service.TervitusTeenus;
import org.springframework.stereotype.Controller;

@Controller
public class MinuKontroller {

    private final TervitusTeenus tervitusTeenus;

    public MinuKontroller(TervitusTeenus tervitusTeenus) {
        this.tervitusTeenus = tervitusTeenus;
    }

    public String ytleTere() {
        return tervitusTeenus.ytleTervitus();
    }

}
