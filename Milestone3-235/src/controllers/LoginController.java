package controllers;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.User;
import business.PostBusinessInterface;

@ManagedBean
@ViewScoped
public class LoginController {

	@Inject 
	PostBusinessInterface posts;
	
	public String onSubmit() {
		//gets the user values from the input form
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		
		//put the user object into the POST request
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		
		//prints a message to the console to tell us which business service is currently selected in the beans.xml file as an alternative
		posts.test();
		
		if (user.getUsername().equals("EmilyQ") && user.getPassword().equals("password")) {
			return ("loginSuccess.xhtml");
			}
		else {
				return ("loginFail.xhtml");
			}
	}
	
	public PostBusinessInterface getService() {
		return posts;
	}
}
