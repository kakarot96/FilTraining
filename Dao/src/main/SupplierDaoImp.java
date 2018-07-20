package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class SupplierDaoImp implements SupplierDao{

	List<Supplier> suppliers=new ArrayList<>();
	
	public SupplierDaoImp(){
		try {
		Connection connection= DBConnection.getConnection();
		
			Statement smt= connection.createStatement();
			
			ResultSet resultSet = smt.executeQuery("select * from supplier");
			while(resultSet.next()){
				int sid=resultSet.getInt(1);
				String sname=resultSet.getString("sname");
				String city=resultSet.getString("city");
				Supplier obj=new Supplier(sid,sname,city);
				suppliers.add(obj);
			}			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	@Override
	public Supplier getSupplier(int id) {
		// TODO Auto-generated method stub
		Supplier supplier= new Supplier(id,"","");
		int index= suppliers.indexOf(supplier);
		
		if(index>=0)
		return suppliers.get(index);
			
		else return suppliers.get(0);
	}

	@Override
	public List<Supplier> getAllSuppliers() {		
		return suppliers;
	}

	@Override
	public void deleteSupplier(Supplier s) {
		// TODO Auto-generated method stub
		
Connection connection= DBConnection.getConnection();
		
		try {
			PreparedStatement smt= connection.prepareStatement("delete from supplier where sid=?");
			smt.setInt(1,s.id);
		
			smt.executeUpdate();
			suppliers.remove(s);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public List<Supplier> getSuppliers() {
		return suppliers;
	}




	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}




	@Override
	public void addSupplier(Supplier s) {
		// TODO Auto-generated method stub
		
		Connection connection= DBConnection.getConnection();
		
		try {
			PreparedStatement smt= connection.prepareStatement("insert into supplier(sname,city) values(?,?)");
			smt.setString(1,s.sname);
			smt.setString(2,s.city);
			smt.executeUpdate();
			suppliers.add(s);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
}
