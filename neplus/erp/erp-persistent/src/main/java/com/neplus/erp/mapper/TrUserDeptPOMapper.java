package com.neplus.erp.mapper;

import com.neplus.erp.model.TrUserDeptPO;
import com.neplus.erp.model.TrUserDeptPOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TrUserDeptPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tr_user_dept
     *
     * @mbg.generated Tue Jul 30 15:45:44 CEST 2024
     */
    long countByExample(TrUserDeptPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tr_user_dept
     *
     * @mbg.generated Tue Jul 30 15:45:44 CEST 2024
     */
    int deleteByExample(TrUserDeptPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tr_user_dept
     *
     * @mbg.generated Tue Jul 30 15:45:44 CEST 2024
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tr_user_dept
     *
     * @mbg.generated Tue Jul 30 15:45:44 CEST 2024
     */
    int insert(TrUserDeptPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tr_user_dept
     *
     * @mbg.generated Tue Jul 30 15:45:44 CEST 2024
     */
    int insertSelective(TrUserDeptPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tr_user_dept
     *
     * @mbg.generated Tue Jul 30 15:45:44 CEST 2024
     */
    List<TrUserDeptPO> selectByExample(TrUserDeptPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tr_user_dept
     *
     * @mbg.generated Tue Jul 30 15:45:44 CEST 2024
     */
    TrUserDeptPO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tr_user_dept
     *
     * @mbg.generated Tue Jul 30 15:45:44 CEST 2024
     */
    int updateByExampleSelective(@Param("record") TrUserDeptPO record, @Param("example") TrUserDeptPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tr_user_dept
     *
     * @mbg.generated Tue Jul 30 15:45:44 CEST 2024
     */
    int updateByExample(@Param("record") TrUserDeptPO record, @Param("example") TrUserDeptPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tr_user_dept
     *
     * @mbg.generated Tue Jul 30 15:45:44 CEST 2024
     */
    int updateByPrimaryKeySelective(TrUserDeptPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tr_user_dept
     *
     * @mbg.generated Tue Jul 30 15:45:44 CEST 2024
     */
    int updateByPrimaryKey(TrUserDeptPO record);
}