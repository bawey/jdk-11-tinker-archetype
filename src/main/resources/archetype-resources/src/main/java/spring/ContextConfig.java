package ${package}.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@Slf4j
public class ContextConfig {
    @PostConstruct
    void postConstruct() {
        log.info("So the config has been bootstrapped...");
    }
}
