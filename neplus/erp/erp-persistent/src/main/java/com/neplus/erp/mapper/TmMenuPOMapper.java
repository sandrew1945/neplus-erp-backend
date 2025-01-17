package com.neplus.erp.mapper;

import com.neplus.erp.model.TmMenuPO;
import com.neplus.erp.model.TmMenuPOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TmMenuPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_menu
     *
     * @mbg.generated Tue Jul 30 15:45:44 CEST 2024
     */
    long countByExample(TmMenuPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_menu
     *
     * @mbg.generated Tue Jul 30 15:45:44 CEST 2024
     */
    int deleteByExample(TmMenuPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_menu
     *
     * @mbg.generated Tue Jul 30 15:45:44 CEST 2024
     */
    int deleteByPrimaryKey(Integer menuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_menu
     *
     * @mbg.generated Tue Jul 30 15:45:44 CEST 2024
     */
    int insert(TmMenuPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_menu
     *
     * @mbg.generated Tue Jul 30 15:45:44 CEST 2024
     */
    int insertSelective(TmMenuPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_menu
     *
     * @mbg.generated Tue Jul 30 15:45:44 CEST 2024
     */
    List<TmMenuPO> selectByExample(TmMenuPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_menu
     *
     * @mbg.generated Tue Jul 30 15:45:44 CEST 2024
     */
    TmMenuPO selectByPrimaryKey(Integer menuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_menu
     *
     * @mbg.generated Tue Jul 30 15:45:44 CEST 2024
     */
    int updateByExampleSelective(@Param("record") TmMenuPO record, @Param("example") TmMenuPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_menu
     *
     * @mbg.generated Tue Jul 30 15:45:44 CEST 2024
     */
    int updateByExample(@Param("record") TmMenuPO record, @Param("example") TmMenuPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_menu
     *
     * @mbg.generated Tue Jul 30 15:45:44 CEST 2024
     */
    int updateByPrimaryKeySelective(TmMenuPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_menu
     *
     * @mbg.generated Tue Jul 30 15:45:44 CEST 2024
     */
    int updateByPrimaryKey(TmMenuPO record);
}