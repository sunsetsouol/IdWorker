package shop.sunsetsouol.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import shop.sunsetsouol.IdStrategy.IdGenType;
import shop.sunsetsouol.IdStrategy.IdGenerator;
import shop.sunsetsouol.IdStrategy.Impl.SnowFlake;

import javax.annotation.PostConstruct;
import java.util.HashMap;

/**
 * @author yinjunbiao
 * @version 1.0
 * @date 2024/2/15
 */
@Component
public class IdGeneratorStrategyFactory {
    private final HashMap<String , IdGenerator> idGeneratorHashMap = new HashMap<>();

    @Autowired
    private SnowFlake snowFlake;

    @PostConstruct
    protected void init(){
        idGeneratorHashMap.put(IdGenType.SNOWFLAKE.type, snowFlake);
    }

    public IdGenerator getIdGeneratorStrategy(String strategyType) {
        return idGeneratorHashMap.get(strategyType);
    }
}
