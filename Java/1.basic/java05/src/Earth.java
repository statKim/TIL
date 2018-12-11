
public class Earth {
	
	// 값 변경하지 않는 static final 지정
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	}
	
}
