package shop.sunsetsouol.IdStrategy.IdGen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import shop.sunsetsouol.IdStrategy.IdGen.IdGenType;
import shop.sunsetsouol.IdStrategy.IdGen.IdGenerator;
import shop.sunsetsouol.IdStrategy.IdGen.Impl.SnowFlake;
import shop.sunsetsouol.IdStrategy.IdGen.Impl.TickerServers;
import shop.sunsetsouol.IdStrategy.IdGen.Impl.UUIDGenerator;

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

    @Autowired
    private UUIDGenerator uuidGenerator;

    @Autowired
    private TickerServers ticketServers;

    @PostConstruct
    protected void init(){
        idGeneratorHashMap.put(IdGenType.SNOWFLAKE.type, snowFlake);
        idGeneratorHashMap.put(IdGenType.UUID.type, uuidGenerator);
        idGeneratorHashMap.put(IdGenType.TICKET_SERVERS.type, ticketServers);
    }

    public IdGenerator getIdGeneratorStrategy(String strategyType) {
        return idGeneratorHashMap.get(strategyType);
    }
}
