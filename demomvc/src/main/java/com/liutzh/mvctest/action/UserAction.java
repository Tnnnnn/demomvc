package com.liutzh.mvctest.action;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.liutzh.mvctest.model.User;
import com.liutzh.mvctest.service.UserService;

@Controller
@RequestMapping(value={"/user"})
public class UserAction {

	private static Logger log = Logger.getLogger(UserAction.class);
	
	@Autowired  
	@Qualifier("userService") 
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public UserAction(){
		System.out.println("-----------------创建UserAction---------------------");
	}
	

    @RequestMapping(value = "/editUser")
    @ResponseBody
    public ModelAndView editUser(User user)
    {
    	ModelAndView mav = new ModelAndView();
        try
        {
        	List<User> list = userService.listUser();
        	mav.setViewName("list");
        	mav.addObject("userList", list);
        } catch (Exception e)
        {
            log.error(e);
        }
        return mav;
    }

}
