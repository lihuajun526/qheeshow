package com.qheeshow.eway.service.dao;

import com.qheeshow.eway.service.model.Investor;
import com.qheeshow.eway.service.model.InvestorExample;
import com.qheeshow.eway.service.model.InvestorWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvestorMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_investor
	 * @mbggenerated  Sun Mar 05 18:53:24 CST 2017
	 */
	int countByExample(InvestorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_investor
	 * @mbggenerated  Sun Mar 05 18:53:24 CST 2017
	 */
	int deleteByExample(InvestorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_investor
	 * @mbggenerated  Sun Mar 05 18:53:24 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_investor
	 * @mbggenerated  Sun Mar 05 18:53:24 CST 2017
	 */
	int insert(InvestorWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_investor
	 * @mbggenerated  Sun Mar 05 18:53:24 CST 2017
	 */
	int insertSelective(InvestorWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_investor
	 * @mbggenerated  Sun Mar 05 18:53:24 CST 2017
	 */
	List<InvestorWithBLOBs> selectByExampleWithBLOBs(InvestorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_investor
	 * @mbggenerated  Sun Mar 05 18:53:24 CST 2017
	 */
	List<Investor> selectByExample(InvestorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_investor
	 * @mbggenerated  Sun Mar 05 18:53:24 CST 2017
	 */
	InvestorWithBLOBs selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_investor
	 * @mbggenerated  Sun Mar 05 18:53:24 CST 2017
	 */
	int updateByExampleSelective(@Param("record") InvestorWithBLOBs record, @Param("example") InvestorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_investor
	 * @mbggenerated  Sun Mar 05 18:53:24 CST 2017
	 */
	int updateByExampleWithBLOBs(@Param("record") InvestorWithBLOBs record, @Param("example") InvestorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_investor
	 * @mbggenerated  Sun Mar 05 18:53:24 CST 2017
	 */
	int updateByExample(@Param("record") Investor record, @Param("example") InvestorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_investor
	 * @mbggenerated  Sun Mar 05 18:53:24 CST 2017
	 */
	int updateByPrimaryKeySelective(InvestorWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_investor
	 * @mbggenerated  Sun Mar 05 18:53:24 CST 2017
	 */
	int updateByPrimaryKeyWithBLOBs(InvestorWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_investor
	 * @mbggenerated  Sun Mar 05 18:53:24 CST 2017
	 */
	int updateByPrimaryKey(Investor record);
}