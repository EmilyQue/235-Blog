package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Post {
	@NotNull(message = "Please enter the post title. This is a required field.")
	@Size(min=2, max=50)
	String postName = "";
	
	@NotNull(message = "Please enter the post text. This is a required field.")
	@Size(min=2, max=200)
	String postText = ""; 
	
	@NotNull(message = "Please enter image path. This is a required field.")
	@Size(min=2, max=50)
	String photo = "";
	
	public Post(String postName, String postText, String photo) {
		super();
		this.postName = postName;
		this.postText = postText;
		this.photo = photo;

	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public String getPostText() {
		return postText;
	}

	public void setPostText(String postText) {
		this.postText = postText;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
}
