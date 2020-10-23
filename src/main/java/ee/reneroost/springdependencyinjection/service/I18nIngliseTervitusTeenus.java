package ee.reneroost.springdependencyinjection.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nTeenus")
public class I18nIngliseTervitusTeenus implements TervitusTeenus {
    @Override
    public String ytleTervitus() {
        return "Hello world - EN";
    }
}
