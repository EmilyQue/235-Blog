package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.NewPost;

@ManagedBean
@ViewScoped
public class PostController {

	public String onSubmit() {
		// gets the post values from the input form
		FacesContext context = FacesContext.getCurrentInstance();
		NewPost post = context.getApplication().evaluateExpressionGet(context, "#{post}", NewPost.class);

		// outputs the post object data in the console
		System.out.println("Username is " + post.getTitle());
		System.out.println("Password is " + post.getContent());

		// put the user object into the POST request
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("post", post);

		return "postSuccess.xhtml";
	}

	public String onSubmit(NewPost post) {
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("post", post);

		return "postSuccess.xhtml";
	}
}
