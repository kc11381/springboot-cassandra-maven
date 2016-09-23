package restdemo;

public class Greeting {

	private long id;
	private String name;

	/** Default Greeting Constructor */
	public Greeting() {
		super();
	}

	/** Parameterized Greeting Constructor */
	public Greeting(long id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Greeting [id=" + id + ", name=" + name + "]";
	}
}