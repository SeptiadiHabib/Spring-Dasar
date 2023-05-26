package programmerhabib.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerhabib.spring.core.data.Connection;

public class LifeCycleTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleTest.class);
    }

    @Test
    void testConnection() {

        Connection connection = applicationContext.getBean(Connection.class);
    }
}
