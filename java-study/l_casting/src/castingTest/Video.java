package castingTest;
//사용자가 선택한 영상이

//1. 애니메이션이라면, "자막 지원" 기능 사용
//2. 영화라면, "4D" 기능 사용
//3. 드라마라면, "굿즈" 기능 사용

public class Video {
	String title;
	int runningTime;
//	String service;

	public Video() {;}
	
	public Video(String title, int runningTime) {
		super();
		this.title = title;
		this.runningTime = runningTime;
//		this.service = service;
	}

	void show() {
		System.out.println("제목" + title);
	}
	
	void view () {
		System.out.println(runningTime + "분 입니다.");
	}
	
	public void support() {
		System.out.println("관람표 제공");
		
	}
}
