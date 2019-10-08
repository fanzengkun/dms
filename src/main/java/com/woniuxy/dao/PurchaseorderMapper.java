package com.woniuxy.dao;

import com.woniuxy.domain.Purchasedetails;
import com.woniuxy.domain.Purchaseorder;
import com.woniuxy.domain.PurchaseorderExample;

import java.util.Date;
import java.util.List;
import java.util.Map;

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
    
    //根据业务自己加的
    //展示
    List<Object> findpoAndpd();
    //关闭外键约束
    void close();
    //开启外键约束
    void open();
    //根据poid删除
    void delByPoid(Integer poid);
    
    
    //订单表添加
    void saveTopo(Purchaseorder po);
    //订单明细表添加s
    void saveTopd(Purchasedetails pd);
    //求订单表最大poid
    Integer findMaxpoid();
    //最后添加订单时间
    void saveDate(Object obj);

    
	Integer getRowCount();
	List<Purchasedetails> findSomeByPage(@Param("starLine")Integer startLine, @Param("fsize")Integer fsize);
	
	
	Integer getRowCountBySeachTime(@Param("ftime")String ftime);
	Integer getRowCountBySeachId(@Param("fpoid")String fpoid);
	//搜索到的条目数可以返回page中的list的长度，所以这里只要数据就行，额，不行，(返回长度方法在上面
	List<Purchasedetails> findSomeBySeachTime(@Param("ftime")String ftime,@Param("starLine")Integer startLine, @Param("fsize")Integer fsize);
	List<Purchasedetails> findSomeBySeachId( @Param("fpoid")String fpoid,@Param("starLine")Integer startLine, @Param("fsize")Integer fsize);
	
	
}