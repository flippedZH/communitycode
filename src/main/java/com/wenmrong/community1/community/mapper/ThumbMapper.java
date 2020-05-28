package com.wenmrong.community1.community.mapper;

import com.wenmrong.community1.community.model.Thumb;
import com.wenmrong.community1.community.model.ThumbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ThumbMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THUMB
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    long countByExample(ThumbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THUMB
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    int deleteByExample(ThumbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THUMB
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THUMB
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    int insert(Thumb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THUMB
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    int insertSelective(Thumb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THUMB
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    List<Thumb> selectByExampleWithRowbounds(ThumbExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THUMB
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    List<Thumb> selectByExample(ThumbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THUMB
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    Thumb selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THUMB
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    int updateByExampleSelective(@Param("record") Thumb record, @Param("example") ThumbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THUMB
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    int updateByExample(@Param("record") Thumb record, @Param("example") ThumbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THUMB
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    int updateByPrimaryKeySelective(Thumb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THUMB
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    int updateByPrimaryKey(Thumb record);
}