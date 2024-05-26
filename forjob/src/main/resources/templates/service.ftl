${package}

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface I${className}Service {

long countByExample(${className}ModelExample example);

int deleteByExample(${className}ModelExample example);

int deleteByPrimaryKey(Integer id);

int insert(${className}Model record);

int insertSelective(${className}Model record);

List<${className}Model> selectByExample(${className}ModelExample example);

${className}Model selectByPrimaryKey(Integer id);

int updateByExampleSelective(@Param("record") ${className}Model record, @Param("example") ${className}ModelExample example);

int updateByExample(@Param("record") ${className}Model record, @Param("example") ${className}ModelExample example);

int updateByPrimaryKeySelective(${className}Model record);

int updateByPrimaryKey(${className}Model record);
}
