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
    
    //返回总行数
    Integer getRowCount();
    //根据返回起始行和每页展示行数返回数据
    List<Purchasedetails> findSomeByPage(@Param("startLine")Integer startLine,@Param("fsize")Integer fsize);
    
    //可能需要动态sql，因为有7个条件，略多
    //条件搜索到数据的记录数
    Integer getRowCountBySome(Purchasedetails pd);
    List<Purchasedetails> findSomeBySome(@Param("pd")Purchasedetails pd,@Param("startLine")Integer startLine,@Param("fsize")Integer fsize);
    //模糊查询时间必须要string，上面是使用对象映射的里面的属性类型是date，额， 所以要独立写出来，数据和数据记录数
    Integer getRowCountByTime(@Param("time")String time);
    Integer getRowCountByQualityguaranteperiod(@Param("qualityguaranteperiod")String qualityguaranteperiod);
    List<Purchasedetails> findSomeByTime(@Param("time")String time,@Param("startLine")Integer startLine,@Param("fsize")Integer fsize);
    List<Purchasedetails> findSomeByQualityguaranteperiod(@Param("qualityguaranteperiod")String qualityguaranteperiod,@Param("startLine")Integer startLine,@Param("fsize")Integer fsize);
    
    //查询订单内是否有明细
    Integer findpdondo(@Param("poid")Integer pid);
    //删除订单
    void delpo(@Param("poid")Integer poid);
}