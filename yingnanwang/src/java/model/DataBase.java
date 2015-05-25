package model;
import java.util.HashMap;
import java.util.Map;

public class DataBase {
	private static final Map<String, String> users = new HashMap<String, String>();
	static {
		users.put("李晓彤", "121212");
		users.put("刘金辉", "123456");
		users.put("James", "666666");
	}
	public static Map<String, String> getUsers() {
		return users;
	}
}
