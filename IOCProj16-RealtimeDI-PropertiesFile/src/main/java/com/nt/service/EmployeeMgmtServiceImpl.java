package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	//HAS-A property
	private IEmployeeDAO dao;
	private String osName;
	 
	private String path;
	
	
	public void setOsName(String osName)
    {
	 System.out.println("EmployeeMgmtServiceImpl.setOsName()");
     this.osName = osName;
    }


    public void setPath(String path)
    {
     System.out.println("EmployeeMgmtServiceImpl.setPath()");
     this.path = path;
    }
    
	//alt + shift + s,o


 public EmployeeMgmtServiceImpl(IEmployeeDAO dao) {
		System.out.println("EmployeeMgmtServiceImpl.1-param constructor"); //systrace + ctrl + space
		this.dao = dao;
	}
	
	
	@Override
	public String registerEmployee(EmployeeDTO dto) throws Exception {
		System.out.println("EmployeeMgmtServiceImpl.registerEmployee()" + "osName="+osName+"path="+path);
		// TODO Auto-generated method stub
		//write b.logic to calculate grossSalary and NetSalary
		float grossSalary = dto.getBasicSalary() + dto.getBasicSalary()*0.4f; //+40% on basicSalary
		float netSalary = grossSalary - dto.getBasicSalary() * 0.2f; //-20% on grossSalary
		//prepare BO class obj having persistable data
		EmployeeBO bo = new EmployeeBO();
		bo.setEname(dto.getEname());
		bo.setDesg(dto.getDesg());
		bo.setBasicSalary(dto.getBasicSalary());
		bo.setGrossSalary(grossSalary);
		bo.setNetSalary(netSalary);
		//use DAO
		int count = dao.insertEmployee(bo);
		//generate final result
		return count == 1?"Employee registered with netSalary::"+netSalary:"Employee not registered with netSalary::"+netSalary;
	}//method
	
}//class
