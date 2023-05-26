package programmerhabib.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import programmerhabib.spring.core.data.Bar;
import programmerhabib.spring.core.data.Foo;

@Slf4j
@Configuration
public class DependsOnConfiguration {

    @Bean
    @DependsOn({
            "bar"
    })
    public Foo foo() {
        log.info("Create new foo");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("Create new Bar");
        return new Bar();
    }
}
