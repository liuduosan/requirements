package reqs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import reqs.vo.Requirement;
import reqs.vo.RequirementExample;

@Component(value="requirementMapper")
@Mapper
public interface RequirementMapper {
    int countByExample(RequirementExample example);

    int deleteByExample(RequirementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Requirement record);

    int insertSelective(Requirement record);

    List<Requirement> selectByExample(RequirementExample example);

    Requirement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Requirement record, @Param("example") RequirementExample example);

    int updateByExample(@Param("record") Requirement record, @Param("example") RequirementExample example);

    int updateByPrimaryKeySelective(Requirement record);

    int updateByPrimaryKey(Requirement record);
}