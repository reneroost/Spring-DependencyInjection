package ee.reneroost.springdependencyinjection.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryTervitusTeenus implements TervitusTeenus {

    @Override
    public String ytleTervitus() {
        return "Tere maailm! - Primary";
    }
}
