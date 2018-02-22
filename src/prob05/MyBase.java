package prob05;

public class MyBase extends Base {

	@Override
	public void service(String state) {
		// TODO Auto-generated method stub
		switch(state) {
		case "낮":
			System.out.println("낮에는 열심히 일하자!");
			break;
		case "밤":
			super.night();
			break;
		case "오후":
			System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
			break;
		}
	}
	
}