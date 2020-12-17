package io.metersphere.base.mapper;

import io.metersphere.base.domain.ApiScenarioReport;
import io.metersphere.base.domain.ApiScenarioReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ApiScenarioReportMapper {
    long countByExample(ApiScenarioReportExample example);

    int deleteByExample(ApiScenarioReportExample example);

    int deleteByPrimaryKey(String id);

    int insert(ApiScenarioReport record);

    int insertSelective(ApiScenarioReport record);

    List<ApiScenarioReport> selectByExample(ApiScenarioReportExample example);

    ApiScenarioReport selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ApiScenarioReport record, @Param("example") ApiScenarioReportExample example);

    int updateByExample(@Param("record") ApiScenarioReport record, @Param("example") ApiScenarioReportExample example);

    int updateByPrimaryKeySelective(ApiScenarioReport record);

    int updateByPrimaryKey(ApiScenarioReport record);

}