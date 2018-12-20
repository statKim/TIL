package model;

public class BoardBean {
	private int bbsNum;	//글번호
	private String bbsWriter; //글쓴이
	private String bbsSubject; //제목
	private String bbsContent; //글내용
	private String bbsDate; //글 쓴 날짜
	
	public int getBbsNum() {
		return bbsNum;
	}
	
	public void setBbsNum(int bbsNum) {
		this.bbsNum = bbsNum;
	}

	public String getBbsWriter() {
		return bbsWriter;
	}

	public void setBbsWriter(String bbsWriter) {
		this.bbsWriter = bbsWriter;
	}

	public String getBbsSubject() {
		return bbsSubject;
	}

	public void setBbsSubject(String bbsSubject) {
		this.bbsSubject = bbsSubject;
	}

	public String getBbsContent() {
		return bbsContent;
	}

	public void setBbsContent(String bbsContent) {
		this.bbsContent = bbsContent;
	}

	public String getBbsDate() {
		return bbsDate;
	}

	public void setBbsDate(String bbsDate) {
		this.bbsDate = bbsDate;
	}
}
