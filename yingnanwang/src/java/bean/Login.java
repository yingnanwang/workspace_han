package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.UserManager;

@ManagedBean
@RequestScoped
public class Login {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	private String pw;
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}

	private String errmsg;
	public String getErrmsg() {
		return errmsg;
	}

	public String action() {
		UserManager um = new UserManager();
		String password = um.getPassword(name);
		if(password==null) {
			errmsg = "用户名不存在。";
			return "failure";
		} else if(!password.equals(pw)) {
			errmsg = "密码错误。";
			return "failure";
		}
		return "success";
	}
}
