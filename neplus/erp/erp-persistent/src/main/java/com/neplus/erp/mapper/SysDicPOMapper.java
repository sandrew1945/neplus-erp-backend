package com.neplus.erp.mapper;

import com.neplus.erp.model.SysDicPO;
import com.neplus.erp.model.SysDicPOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysDicPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbg.generated Tue Jul 30 15:32:20 CEST 2024
     */
    long countByExample(SysDicPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbg.generated Tue Jul 30 15:32:20 CEST 2024
     */
    int deleteByExample(SysDicPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbg.generated Tue Jul 30 15:32:20 CEST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbg.generated Tue Jul 30 15:32:20 CEST 2024
     */
    int insert(SysDicPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbg.generated Tue Jul 30 15:32:20 CEST 2024
     */
    int insertSelective(SysDicPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbg.generated Tue Jul 30 15:32:20 CEST 2024
     */
    List<SysDicPO> selectByExampleWithBLOBs(SysDicPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbg.generated Tue Jul 30 15:32:20 CEST 2024
     */
    List<SysDicPO> selectByExample(SysDicPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbg.generated Tue Jul 30 15:32:20 CEST 2024
     */
    SysDicPO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbg.generated Tue Jul 30 15:32:20 CEST 2024
     */
    int updateByExampleSelective(@Param("record") SysDicPO record, @Param("example") SysDicPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbg.generated Tue Jul 30 15:32:20 CEST 2024
     */
    int updateByExampleWithBLOBs(@Param("record") SysDicPO record, @Param("example") SysDicPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbg.generated Tue Jul 30 15:32:20 CEST 2024
     */
    int updateByExample(@Param("record") SysDicPO record, @Param("example") SysDicPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbg.generated Tue Jul 30 15:32:20 CEST 2024
     */
    int updateByPrimaryKeySelective(SysDicPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbg.generated Tue Jul 30 15:32:20 CEST 2024
     */
    int updateByPrimaryKeyWithBLOBs(SysDicPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbg.generated Tue Jul 30 15:32:20 CEST 2024
     */
    int updateByPrimaryKey(SysDicPO record);
}