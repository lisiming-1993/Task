package com.xiaobo.demo.dao;

import com.xiaobo.demo.pojo.EmailCode;

public interface EmailCodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email_code
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email_code
     *
     * @mbg.generated
     */
    int insert(EmailCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email_code
     *
     * @mbg.generated
     */
    int insertSelective(EmailCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email_code
     *
     * @mbg.generated
     */
    EmailCode selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email_code
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EmailCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email_code
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EmailCode record);
}