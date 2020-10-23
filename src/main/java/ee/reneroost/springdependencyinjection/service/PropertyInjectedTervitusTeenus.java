package ee.reneroost.springdependencyinjection.service;

import org.springframework.stereotype.Service;

import java.lang.reflect.AnnotatedParameterizedType;

@Service
public class PropertyInjectedTervitusTeenus implements TervitusTeenus {
    @Override
    public String ytleTervitus() {
        return "Tere maailm! - Property";
    }
}
