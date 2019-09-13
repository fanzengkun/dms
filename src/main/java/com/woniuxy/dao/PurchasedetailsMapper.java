package com.woniuxy.dao;

import com.woniuxy.domain.Purchasedetails;
import com.woniuxy.domain.PurchasedetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchasedetailsMapper {
    long countByExample(PurchasedetailsExample example);

    int deleteByExample(PurchasedetailsExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Purchasedetails record);

    int insertSelective(Purchasedetails record);

    List<Purchasedetails> selectByExample(PurchasedetailsExample example);

    Purchasedetails selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Purchasedetails record, @Param("example") PurchasedetailsExample example);

    int updateByExample(@Param("record") Purchasedetails record, @Param("example") PurchasedetailsExample example);

    int updateByPrimaryKeySelective(Purchasedetails record);

    int updateByPrimaryKey(Purchasedetails record);
}