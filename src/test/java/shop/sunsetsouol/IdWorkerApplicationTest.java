package shop.sunsetsouol;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import shop.sunsetsouol.IdStrategy.IdGen.IdGenType;
import shop.sunsetsouol.IdStrategy.IdGen.IdGenerator;
import shop.sunsetsouol.IdStrategy.IdGen.IdGeneratorStrategyFactory;

import java.util.UUID;

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
        System.out.println(idGeneratorStrategy.getId());
        System.out.println(idGeneratorStrategy.getId());
        System.out.println(idGeneratorStrategy.getId());
        System.out.println(idGeneratorStrategy.getId());
        System.out.println(idGeneratorStrategy.getId());
        System.out.println(idGeneratorStrategy.getId());
        System.out.println(idGeneratorStrategy.getId());
        System.out.println(idGeneratorStrategy.getId());
        System.out.println(idGeneratorStrategy.getId());
        System.out.println(idGeneratorStrategy.getId());
        System.out.println(idGeneratorStrategy.getId());
        System.out.println(idGeneratorStrategy.getId());
    }

    @Test
    public void UUIDTest() {
        System.out.println(UUID.randomUUID().getMostSignificantBits());
        System.out.println(UUID.randomUUID().getLeastSignificantBits());
    }
}
