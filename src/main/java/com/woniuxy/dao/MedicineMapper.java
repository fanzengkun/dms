package com.woniuxy.dao;

import com.woniuxy.domain.Medicine;
import com.woniuxy.domain.MedicineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicineMapper {
    long countByExample(MedicineExample example);

    int deleteByExample(MedicineExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Medicine record);

    int insertSelective(Medicine record);

    List<Medicine> selectByExampleWithBLOBs(MedicineExample example);

    List<Medicine> selectByExample(MedicineExample example);

    Medicine selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") Medicine record, @Param("example") MedicineExample example);

    int updateByExampleWithBLOBs(@Param("record") Medicine record, @Param("example") MedicineExample example);

    int updateByExample(@Param("record") Medicine record, @Param("example") MedicineExample example);

    int updateByPrimaryKeySelective(Medicine record);

    int updateByPrimaryKeyWithBLOBs(Medicine record);

    int updateByPrimaryKey(Medicine record);
}