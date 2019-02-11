package beans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean
@ViewScoped
public class User {

	public User() {
//		firstName = "Emily";
//		lastName = "Quevedo";
//		email = "emily@email.com";
//		phone = "123-456-7890";
		username = "EmilyQ";
		password = "equevedo";
	}
	
	@NotNull(message = "Please enter your first name. This is a required field.")
	@Size(min=2, max=50)
	String firstName = "";
	
	@NotNull(message = "Please enter your last name. This is a required field.")
	@Size(min=2, max=50)
	String lastName = "";
	
	@NotNull(message = "Please enter your email. This is a required field.")
	@Size(min=2, max=50)
	String email = "";
	
	@NotNull(message = "Please enter your phone number. This is a required field.")
	@Size(min=2, max=50)
	String phone = "";
	
	@NotNull(message = "Please enter your username. This is a required field.")
	@Size(min=2, max=50)
	String username = "";
	
	@NotNull(message = "Please enter your password. This is a required field.")
	@Size(min=2, max=50)
	String password = "";

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
