package com.woniuxy.dao;

import com.woniuxy.domain.Salesdetails;
import com.woniuxy.domain.SalesdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesdetailsMapper {
    long countByExample(SalesdetailsExample example);

    int deleteByExample(SalesdetailsExample example);

    int deleteByPrimaryKey(Integer sdid);

    int insert(Salesdetails record);

    int insertSelective(Salesdetails record);

    List<Salesdetails> selectByExample(SalesdetailsExample example);

    Salesdetails selectByPrimaryKey(Integer sdid);

    int updateByExampleSelective(@Param("record") Salesdetails record, @Param("example") SalesdetailsExample example);

    int updateByExample(@Param("record") Salesdetails record, @Param("example") SalesdetailsExample example);

    int updateByPrimaryKeySelective(Salesdetails record);

    int updateByPrimaryKey(Salesdetails record);
}