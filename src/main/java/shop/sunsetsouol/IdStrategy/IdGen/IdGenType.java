package shop.sunsetsouol.IdStrategy.IdGen;

/**
 * @author yinjunbiao
 * @version 1.0
 * @date 2024/2/15
 */

public enum IdGenType {
    SNOWFLAKE("snowflake"),
    UUID("uuid");


    public final String type;

    IdGenType(String type) {
        this.type = type;
    }

}
