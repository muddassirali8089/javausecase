/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.ResultSet;
import java.util.ArrayList;
import model.dto.EmployeeDTO;

/**
 *
 * @author Mukhtiar
 */
public class RecordsMapper {

    ArrayList<EmployeeDTO> getEmployees(ResultSet rs) {
        ArrayList<EmployeeDTO> emplist = new ArrayList<>();
        try{
        while (rs.next())
            {
                EmployeeDTO objEmp=new EmployeeDTO();                
//                objEmp.Id=rs.getString(1);
                objEmp.FirstName= rs.getString(1);
                objEmp.LastName =rs.getString(2);
                objEmp.Title=rs.getString(3);
                objEmp.EmailAddress=rs.getString(4);
                
                objEmp.Password=rs.getString(5);
//                objEmp.TitleOFCoutresy = rs.getString(5);
//                objEmp.City = rs.getString(9);
//                objEmp.Region = rs.getString(10);
//                objEmp.PostalCode = rs.getString(11);
//               objEmp.BirthDate = rs.getString(6);
                emplist.add(objEmp);
            }
        }catch (Exception e){
        }
        return emplist;
    }
    
}
