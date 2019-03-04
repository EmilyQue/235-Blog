package business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Post;

/**
 * Session Bean implementation class OrdersBusinessService
 */
@Stateless
@Local(PostBusinessInterface.class)
@Alternative
public class PostBusinessService implements PostBusinessInterface {

	List<Post> posts = new ArrayList<Post>();
	
    /**
     * Default constructor. 
     */
    public PostBusinessService() {
        // TODO Auto-generated constructor stub
    	posts.add(new Post("Title 1", "Text 1", "image1.jpg"));
		posts.add(new Post("Title 2", "Text 2", "image2.jpg"));
		posts.add(new Post("Title 3", "Text 3", "image3.jpg"));
		posts.add(new Post("Title 4", "Text 4", "image4.jpg"));
		posts.add(new Post("Title 5", "Text 5", "image5.jpg"));
		posts.add(new Post("Title 6", "Text 6", "image6.jpg"));
    }
    
    @Override
    public void test() {
    	System.out.println("=======> Hello from PostBusinessService.test()");
    }

	@Override
	public List<Post> getPosts() {
		// TODO Auto-generated method stub
		return posts;
	}

	@Override
	public void setPosts(List<Post> posts) {
		// TODO Auto-generated method stub
		this.posts = posts;
	}

}
