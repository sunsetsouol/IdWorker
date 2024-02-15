package shop.sunsetsouol;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import shop.sunsetsouol.IdStrategy.IdGenType;
import shop.sunsetsouol.IdStrategy.IdGenerator;
import shop.sunsetsouol.factory.IdGeneratorStrategyFactory;

/**
 * @author yinjunbiao
 * @version 1.0
 * @date 2024/2/15
 */
@SpringBootTest
public class IdWorkerApplicationTest {

    @Autowired
    private IdGeneratorStrategyFactory idGeneratorStrategyFactory;
    @Test
    public void contextLoads() {
        IdGenerator idGeneratorStrategy = idGeneratorStrategyFactory.getIdGeneratorStrategy(IdGenType.SNOWFLAKE.type);
        System.out.println((idGeneratorStrategy.getId()));
        System.out.println((idGeneratorStrategy.getId()));
        System.out.println((idGeneratorStrategy.getId()));
        System.out.println((idGeneratorStrategy.getId()));
        System.out.println((idGeneratorStrategy.getId()));
        System.out.println((idGeneratorStrategy.getId()));
        System.out.println((idGeneratorStrategy.getId()));
        System.out.println((idGeneratorStrategy.getId()));
    }
}
