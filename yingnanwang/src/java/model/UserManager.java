package model;
import java.util.Map;

public class UserManager {
	public String getPassword(String username) {
		Map<String, String> users = DataBase.getUsers();
		return users.get(username);
	}
}