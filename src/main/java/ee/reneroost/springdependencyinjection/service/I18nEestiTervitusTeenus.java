package ee.reneroost.springdependencyinjection.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EE", "default"})
@Service("i18nTeenus")
public class I18nEestiTervitusTeenus implements TervitusTeenus {

    @Override
    public String ytleTervitus() {
        return "Tere maailm - EE";
    }
}
