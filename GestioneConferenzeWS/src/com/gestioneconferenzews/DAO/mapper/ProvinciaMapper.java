package com.gestioneconferenzews.DAO.mapper;

import com.gestioneconferenzews.DAO.model.Provincia;
import com.gestioneconferenzews.DAO.model.ProvinciaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProvinciaMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table provincia
	 * @mbggenerated  Wed Mar 12 22:35:50 CET 2014
	 */
	int countByExample(ProvinciaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table provincia
	 * @mbggenerated  Wed Mar 12 22:35:50 CET 2014
	 */
	int deleteByExample(ProvinciaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table provincia
	 * @mbggenerated  Wed Mar 12 22:35:50 CET 2014
	 */
	int deleteByPrimaryKey(String siglaProvincia);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table provincia
	 * @mbggenerated  Wed Mar 12 22:35:50 CET 2014
	 */
	int insert(Provincia record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table provincia
	 * @mbggenerated  Wed Mar 12 22:35:50 CET 2014
	 */
	int insertSelective(Provincia record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table provincia
	 * @mbggenerated  Wed Mar 12 22:35:50 CET 2014
	 */
	List<Provincia> selectByExample(ProvinciaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table provincia
	 * @mbggenerated  Wed Mar 12 22:35:50 CET 2014
	 */
	Provincia selectByPrimaryKey(String siglaProvincia);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table provincia
	 * @mbggenerated  Wed Mar 12 22:35:50 CET 2014
	 */
	int updateByExampleSelective(@Param("record") Provincia record,
			@Param("example") ProvinciaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table provincia
	 * @mbggenerated  Wed Mar 12 22:35:50 CET 2014
	 */
	int updateByExample(@Param("record") Provincia record,
			@Param("example") ProvinciaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table provincia
	 * @mbggenerated  Wed Mar 12 22:35:50 CET 2014
	 */
	int updateByPrimaryKeySelective(Provincia record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table provincia
	 * @mbggenerated  Wed Mar 12 22:35:50 CET 2014
	 */
	int updateByPrimaryKey(Provincia record);
}