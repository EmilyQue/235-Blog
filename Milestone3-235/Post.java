package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean
@ViewScoped
public class Post {

	public Post() {
		title = "";
		content = "";

	}

	@NotNull(message = "Please enter the content. This is a required field.")
	@Size(min = 2, max = 50)
	String title = "";

	@NotNull(message = "Please enter your blog post title. This is a required field.")
	@Size(min = 10, max = 500)
	String content = "";

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
