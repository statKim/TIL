
public class Car {

		private int speed;
		private boolean stop;
		
		public int getSpeed() {
			return speed;
		}
		
		public void setSpeed(int speed) {
			if (speed < 0) {
				this.speed = 0;
				//return;		// if문 빠져나오기 위해=> 없어도 상관 ㄴㄴ
			} else {
				this.speed = speed;
			}
		}
		
		public boolean isStop() {
			return stop;
		}
		
		public void setStop(boolean stop) {
			this.stop = stop;
			this.speed = 0;
		}
	
}
