package com.itheima.dao.cargo;

import com.itheima.domain.cargo.Contract;
import com.itheima.domain.cargo.ContractExample;
import java.util.List;

public interface ContractDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table co_contract
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table co_contract
     *
     * @mbg.generated
     */
    int insert(Contract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table co_contract
     *
     * @mbg.generated
     */
    int insertSelective(Contract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table co_contract
     *
     * @mbg.generated
     */
    List<Contract> selectByExample(ContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table co_contract
     *
     * @mbg.generated
     */
    Contract selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table co_contract
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Contract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table co_contract
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Contract record);
}