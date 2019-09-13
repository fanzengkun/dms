package com.woniuxy.dao;

import com.woniuxy.domain.Purchaseorder;
import com.woniuxy.domain.PurchaseorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseorderMapper {
    long countByExample(PurchaseorderExample example);

    int deleteByExample(PurchaseorderExample example);

    int deleteByPrimaryKey(Integer poid);

    int insert(Purchaseorder record);

    int insertSelective(Purchaseorder record);

    List<Purchaseorder> selectByExample(PurchaseorderExample example);

    Purchaseorder selectByPrimaryKey(Integer poid);

    int updateByExampleSelective(@Param("record") Purchaseorder record, @Param("example") PurchaseorderExample example);

    int updateByExample(@Param("record") Purchaseorder record, @Param("example") PurchaseorderExample example);

    int updateByPrimaryKeySelective(Purchaseorder record);

    int updateByPrimaryKey(Purchaseorder record);
}