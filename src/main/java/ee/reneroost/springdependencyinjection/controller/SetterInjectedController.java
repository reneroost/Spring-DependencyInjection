package ee.reneroost.springdependencyinjection.controller;

import ee.reneroost.springdependencyinjection.service.TervitusTeenus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private TervitusTeenus tervitusTeenus;

    @Autowired
    @Qualifier("setterTervitusTeenus")
    public void setTervitusTeenus( TervitusTeenus tervitusTeenus) {
        this.tervitusTeenus = tervitusTeenus;
    }

    public String saaTervitus() {
        return tervitusTeenus.ytleTervitus();
    }
}
