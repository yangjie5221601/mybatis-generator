package com.guazi.xinche.wtable.orm.mapper;

import com.guazi.xinche.wtable.orm.entity.OrderWtable;
import com.guazi.xinche.wtable.orm.entity.OrderWtableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderWtableMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(OrderWtableExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(OrderWtableExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(OrderWtable record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(OrderWtable record);

    /**
     *
     * @mbggenerated
     */
    List<OrderWtable> selectByExample(OrderWtableExample example);

    /**
     *
     * @mbggenerated
     */
    OrderWtable selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") OrderWtable record, @Param("example") OrderWtableExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") OrderWtable record, @Param("example") OrderWtableExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(OrderWtable record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OrderWtable record);
}