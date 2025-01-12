package com.neplus.erp.mapper;

import com.neplus.erp.model.TmUserPO;
import com.neplus.erp.model.TmUserPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmUserPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_user
     *
     * @mbg.generated Sun Jan 12 19:03:26 CET 2025
     */
    long countByExample(TmUserPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_user
     *
     * @mbg.generated Sun Jan 12 19:03:26 CET 2025
     */
    int deleteByExample(TmUserPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_user
     *
     * @mbg.generated Sun Jan 12 19:03:26 CET 2025
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_user
     *
     * @mbg.generated Sun Jan 12 19:03:26 CET 2025
     */
    int insert(TmUserPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_user
     *
     * @mbg.generated Sun Jan 12 19:03:26 CET 2025
     */
    int insertSelective(TmUserPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_user
     *
     * @mbg.generated Sun Jan 12 19:03:26 CET 2025
     */
    List<TmUserPO> selectByExample(TmUserPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_user
     *
     * @mbg.generated Sun Jan 12 19:03:26 CET 2025
     */
    TmUserPO selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_user
     *
     * @mbg.generated Sun Jan 12 19:03:26 CET 2025
     */
    int updateByExampleSelective(@Param("record") TmUserPO record, @Param("example") TmUserPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_user
     *
     * @mbg.generated Sun Jan 12 19:03:26 CET 2025
     */
    int updateByExample(@Param("record") TmUserPO record, @Param("example") TmUserPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_user
     *
     * @mbg.generated Sun Jan 12 19:03:26 CET 2025
     */
    int updateByPrimaryKeySelective(TmUserPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_user
     *
     * @mbg.generated Sun Jan 12 19:03:26 CET 2025
     */
    int updateByPrimaryKey(TmUserPO record);
}