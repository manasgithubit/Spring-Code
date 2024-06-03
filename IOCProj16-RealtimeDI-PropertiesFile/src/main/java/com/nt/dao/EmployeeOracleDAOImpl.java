package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeOracleDAOImpl implements IEmployeeDAO {

	private static final String EMP_INSERT_QUERY = "INSERT INTO REALTIMEDI_SPRING_EMPLOYEE VALUES(SP_ENO_SEQ.NEXTVAL,?,?,?,?)";
	//HAS-A Property
	private DataSource ds;
	

	public EmployeeOracleDAOImpl(DataSource ds) {
		System.out.println("EmployeeOracleDAOImpl:1-param constructor");
		this.ds = ds;
	}
	
	@Override
	public int insertEmployee(EmployeeBO bo) throws Exception {
		System.out.println("EmployeeDAOImpl:insertEmployee()");
		int result = 0;
		try(Connection con = ds.getConnection();
		   PreparedStatement ps = con.prepareStatement(EMP_INSERT_QUERY);
				){
			//set values query params
			ps.setString(1,bo.getEname());
			ps.setString(2,bo.getDesg());
			ps.setFloat(3, bo.getBasicSalary());
			ps.setFloat(4, bo.getGrossSalary());
			ps.setFloat(5, bo.getNetSalary());
			//execute the query
			result = ps.executeUpdate(); 
	}//try
	catch(SQLException se) {
		// TODO: handle exception
		se.printStackTrace();
		throw se;//exception rethrowing
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		throw e;//exception rethrowing
	}	
		
	  return result;
	}//method
	

	/*@Override
	public int insertEmployee(EmployeeBO bo) throws Exception {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try
		{
			//get pooled JDBC con object
			con = ds.getConnection();
			//create PreparedStatement object having query as the pre-compiled SQL query
			ps = con.prepareStatement(EMP_INSERT_QUERY);
			//set values to query params
			ps.setString(1,bo.getEname());
			ps.setString(2,bo.getDesg());
			ps.setFloat(3, bo.getBasicSalary());
			ps.setFloat(4, bo.getGrossSalary());
			ps.setFloat(5, bo.getNetSalary());
			//execute the query
			result = ps.executeUpdate(); 
		}
		catch (SQLException se) {
			// TODO: handle exception
			se.printStackTrace();
			throw se;//exception rethrowing
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
		finally
		{
			//close jdbc objs	
			try
			{
				if (ps!= null)
					ps.close();
			}
			catch (SQLException se) 
			{
				se.printStackTrace();
				// TODO: handle exception
			}
			try
			{
				if(con!=null)
					con.close();
			}
			catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
		}//finally
		return result;
	}//method*/
}//class
