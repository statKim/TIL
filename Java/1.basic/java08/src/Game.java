
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
			level = "1���";
		} else if (point>=50000) {
			level = "2���";
		} else {
			level = "3���";
		}
		return level;
	}

}
