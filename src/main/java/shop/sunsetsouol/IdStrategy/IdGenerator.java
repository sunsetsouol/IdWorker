package shop.sunsetsouol.IdStrategy;

import org.springframework.stereotype.Component;

/**
 * @author yinjunbiao
 * @version 1.0
 * @date 2024/2/15
 */
@Component
public abstract class IdGenerator {

    public long getLongId(){
        return 0;
    }

    public String  getStringId(){
        return "";
    }
}
