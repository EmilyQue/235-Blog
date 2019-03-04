package business;

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
public class UserBusinessService implements PostBusinessInterface {
	
    /**
     * Default constructor. 
     */
    public UserBusinessService() {
        // TODO Auto-generated constructor stub

    }
    
    @Override
    public void test() {
    	System.out.println("=======> Hello from UsersBusinessService.test()");
    }

    @Override
	public List<Post> getPosts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPosts(List<Post> posts) {
		// TODO Auto-generated method stub
		//this.posts = posts;
	}

}
