package model.dto;

//wordcloud table의 하나의 row값과 매핑되는 데이터 용 클래스
public class WordCloudDTO {
	String text;//w_text 컬럼과 매핑되는 자바 변수
	int frequency;
	
	public WordCloudDTO() {}
	public WordCloudDTO(String text, int frequency) {
		super();
		this.text = text;
		this.frequency = frequency;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WordCloudDTO [text=");
		builder.append(text);
		builder.append(", frequency=");
		builder.append(frequency);
		builder.append("]");
		return builder.toString();
	}
	
}