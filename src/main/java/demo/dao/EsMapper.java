package demo.dao;

import demo.entity.Es;
import demo.entity.EsWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface EsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EsWithBLOBs record);

    int insertSelective(EsWithBLOBs record);
    int insertByList(@Param("textList") List<EsWithBLOBs> textList);
    EsWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EsWithBLOBs record);

    int updateByPrimaryKey(Es record);
}