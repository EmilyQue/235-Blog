package controllers;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.Post;

@ManagedBean
@ViewScoped
public class PostController {

	public String onSubmit() {
		//gets the user values from the input form
		FacesContext context = FacesContext.getCurrentInstance();
		Post post = context.getApplication().evaluateExpressionGet(context, "#{post}", Post.class);
		
		//put the user object into the POST request
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("post", post);
		
		return "PostResponse.xhtml";
	}
}
