
public class Game extends Member {
	
	int playnum, point;
	
	public Game(String id, String name, int age, String phone,
					String sex, String job, int playnum, int point) {
		super(id, name, age, phone, sex, job);
		this.playnum = playnum;
		this.point = point;
	}
	
	public void showGameInfo() {
		System.out.println(id + "\t" + name + "\t" + age + "\t" + phone
							+ "\t" + sex + "\t" + job + "\t" 
							+ playnum + "\t" + point + "\t" + classify(point));
	}
	
	public String classify(int point) {
		String level;
		if (point>=100000) {
			level = "1등급";
		} else if (point>=50000) {
			level = "2등급";
		} else {
			level = "3등급";
		}
		return level;
	}

}
