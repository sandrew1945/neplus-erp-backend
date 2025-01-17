package com.neplus.erp.mapper;

import com.neplus.erp.model.TmTaskPO;
import com.neplus.erp.model.TmTaskPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmTaskPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_task
     *
     * @mbg.generated Wed Dec 04 19:29:10 CET 2024
     */
    long countByExample(TmTaskPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_task
     *
     * @mbg.generated Wed Dec 04 19:29:10 CET 2024
     */
    int deleteByExample(TmTaskPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_task
     *
     * @mbg.generated Wed Dec 04 19:29:10 CET 2024
     */
    int deleteByPrimaryKey(Integer taskId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_task
     *
     * @mbg.generated Wed Dec 04 19:29:10 CET 2024
     */
    int insert(TmTaskPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_task
     *
     * @mbg.generated Wed Dec 04 19:29:10 CET 2024
     */
    int insertSelective(TmTaskPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_task
     *
     * @mbg.generated Wed Dec 04 19:29:10 CET 2024
     */
    List<TmTaskPO> selectByExample(TmTaskPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_task
     *
     * @mbg.generated Wed Dec 04 19:29:10 CET 2024
     */
    TmTaskPO selectByPrimaryKey(Integer taskId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_task
     *
     * @mbg.generated Wed Dec 04 19:29:10 CET 2024
     */
    int updateByExampleSelective(@Param("record") TmTaskPO record, @Param("example") TmTaskPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_task
     *
     * @mbg.generated Wed Dec 04 19:29:10 CET 2024
     */
    int updateByExample(@Param("record") TmTaskPO record, @Param("example") TmTaskPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_task
     *
     * @mbg.generated Wed Dec 04 19:29:10 CET 2024
     */
    int updateByPrimaryKeySelective(TmTaskPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_task
     *
     * @mbg.generated Wed Dec 04 19:29:10 CET 2024
     */
    int updateByPrimaryKey(TmTaskPO record);
}