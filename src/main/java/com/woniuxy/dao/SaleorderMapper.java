package com.woniuxy.dao;

import com.woniuxy.domain.Saleorder;
import com.woniuxy.domain.SaleorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleorderMapper {
    long countByExample(SaleorderExample example);

    int deleteByExample(SaleorderExample example);

    int deleteByPrimaryKey(Integer soid);

    int insert(Saleorder record);

    int insertSelective(Saleorder record);

    List<Saleorder> selectByExample(SaleorderExample example);

    Saleorder selectByPrimaryKey(Integer soid);

    int updateByExampleSelective(@Param("record") Saleorder record, @Param("example") SaleorderExample example);

    int updateByExample(@Param("record") Saleorder record, @Param("example") SaleorderExample example);

    int updateByPrimaryKeySelective(Saleorder record);

    int updateByPrimaryKey(Saleorder record);
}