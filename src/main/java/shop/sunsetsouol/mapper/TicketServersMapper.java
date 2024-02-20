package shop.sunsetsouol.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author yinjunbiao
 * @version 1.0
 * @date 2024/2/20
 */
@Mapper
public interface TicketServersMapper {

    public int replace();
    public Long getId();
}
