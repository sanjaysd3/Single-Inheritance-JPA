package com.cg.client;

import javax.persistence.EntityManager;

import com.cg.bean.Emp;
import com.cg.bean.Manager;
import com.cg.util.JPAUtil;

public class TestEmpInhDemo {
	
	public static void main(String...args)
	{
		Emp e1 = new Emp();
		e1.setEmpName("Sanjay");
		e1.setEmpSal(13361.00f);
		
		Emp e2 = new Emp();
		e2.setEmpName("Abhi");
		e2.setEmpSal(15361.70f);
		
		Manager m1= new Manager();
		m1.setEmpName("Shashi");
		m1.setEmpSal(25000.36f);
		m1.setDeptName("Sales");
		
		EntityManager entmgr=JPAUtil.getEntMgr();
		entmgr.getTransaction().begin();
		entmgr.persist(e1);
		entmgr.persist(e2);
		entmgr.persist(m1);
		entmgr.getTransaction().commit();
		
		System.out.println("All records inserted successfully");
		
		
	}
	

}
