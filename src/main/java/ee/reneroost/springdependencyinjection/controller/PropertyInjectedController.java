package ee.reneroost.springdependencyinjection.controller;

import ee.reneroost.springdependencyinjection.service.TervitusTeenus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
//    @Qualifier("propertyInjectedTervitusTeenus")
    public TervitusTeenus tervitusTeenus;

    public String saaTervitus() {
        return tervitusTeenus.ytleTervitus();
    }
}
