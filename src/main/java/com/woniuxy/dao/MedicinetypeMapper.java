package com.woniuxy.dao;

import com.woniuxy.domain.Medicinetype;
import com.woniuxy.domain.MedicinetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicinetypeMapper {
    long countByExample(MedicinetypeExample example);

    int deleteByExample(MedicinetypeExample example);

    int deleteByPrimaryKey(Integer mtid);

    int insert(Medicinetype record);

    int insertSelective(Medicinetype record);

    List<Medicinetype> selectByExampleWithBLOBs(MedicinetypeExample example);

    List<Medicinetype> selectByExample(MedicinetypeExample example);

    Medicinetype selectByPrimaryKey(Integer mtid);

    int updateByExampleSelective(@Param("record") Medicinetype record, @Param("example") MedicinetypeExample example);

    int updateByExampleWithBLOBs(@Param("record") Medicinetype record, @Param("example") MedicinetypeExample example);

    int updateByExample(@Param("record") Medicinetype record, @Param("example") MedicinetypeExample example);

    int updateByPrimaryKeySelective(Medicinetype record);

    int updateByPrimaryKeyWithBLOBs(Medicinetype record);

    int updateByPrimaryKey(Medicinetype record);
}