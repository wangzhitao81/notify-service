package io.choerodon.notify.infra.mapper;

import io.choerodon.mybatis.common.BaseMapper;
import io.choerodon.notify.domain.ReceiveSetting;
import org.apache.ibatis.annotations.Param;

/**
 * @author dengyouquan
 **/
public interface ReceiveSettingMapper extends BaseMapper<ReceiveSetting> {
    void deleteByUserIdAndSourceTypeAndSourceId(@Param("userId") long userId,
                                                @Param("sourceType") String sourceType,
                                                @Param("sourceId") Long sourceId);
}
