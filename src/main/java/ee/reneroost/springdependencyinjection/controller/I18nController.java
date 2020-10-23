package ee.reneroost.springdependencyinjection.controller;

import ee.reneroost.springdependencyinjection.service.TervitusTeenus;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final TervitusTeenus tervitusTeenus;

    public I18nController(@Qualifier("i18nTeenus") TervitusTeenus tervitusTeenus) {
        this.tervitusTeenus = tervitusTeenus;
    }

    public String ytleTere() {
        return tervitusTeenus.ytleTervitus();
    }

}
