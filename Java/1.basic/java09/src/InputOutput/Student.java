package InputOutput;

import java.io.Serializable;

public class Student implements Serializable {
	
	private static final long serialVersionUID = -8134403304601404597L;	//���� �ٲٸ� read �ȵ�
	private transient String id;	// transient ���� Ű����� ���� �ȵ�
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
