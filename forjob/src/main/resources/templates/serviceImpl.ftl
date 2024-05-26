${package}

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ${className}ServiceImpl implements I${className}Service {

@Autowired
${className}Mapper mapper;

@Override
public long countByExample(${className}ModelExample example) {
return mapper.countByExample(example);
}

@Override
public int deleteByExample(${className}ModelExample example) {
return mapper.deleteByExample(example);
}

@Override
public int deleteByPrimaryKey(Integer id) {
return mapper.deleteByPrimaryKey(id);
}

@Override
public int insert(${className}Model record) {
return mapper.insert(record);
}

@Override
public int insertSelective(${className}Model record) {
return mapper.insertSelective(record);
}

@Override
public List<${className}Model> selectByExample(${className}ModelExample example) {
    return mapper.selectByExample(example);
    }

    @Override
    public ${className}Model selectByPrimaryKey(Integer id) {
    return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(${className}Model record, ${className}ModelExample example) {
    return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(${className}Model record, ${className}ModelExample example) {
    return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(${className}Model record) {
    return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(${className}Model record) {
    return mapper.updateByPrimaryKey(record);
    }
    }