package com.adminportal.service;





import java.util.List;
import java.util.Set;

import com.adminportal.domain.User;
import com.adminportal.domain.security.UserRole;


public interface AdminService {
  
   

   
   List<User> findByAdminRoleId(int role_id);
   

   
 
   
   
   
   
   
}
