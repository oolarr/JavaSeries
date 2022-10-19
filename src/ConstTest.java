import java.util.HashSet;
import java.util.Set;

public class ConstTest {
	
	private int id;
	private String name;
	private Set<String> authors;
	public ConstTest(int id, String name, Set<String> authors) {
		super();
		this.id = id;
		this.name = name;
		this.authors = authors;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<String> authors) {
		this.authors = authors;
	}
	
	String name1 = "jake";
	
	Set<String> authors1 = new HashSet<String>();
	
	

}
