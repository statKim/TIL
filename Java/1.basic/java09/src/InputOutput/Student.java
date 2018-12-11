package InputOutput;

import java.io.Serializable;

public class Student implements Serializable {
	
	private static final long serialVersionUID = -8134403304601404597L;	//숫자 바꾸면 read 안됨
	private transient String id;	// transient 붙은 키워드는 저장 안됨
	private String name;
	private String major;
	
	public Student(String id, String name, String major) {
		this.id = id;
		this.name = name;
		this.major = major;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getMajor() {
		return major;
	}
	
}
