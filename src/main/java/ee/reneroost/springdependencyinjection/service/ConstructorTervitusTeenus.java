package ee.reneroost.springdependencyinjection.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorTervitusTeenus implements TervitusTeenus {
    @Override
    public String ytleTervitus() {
        return "Tere maailm! - Constructor";
    }
}
