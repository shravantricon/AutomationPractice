package home;

public class NestLoop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++) {
			//System.out.print(i);
			{
				for(int j=0;j<=3;j++) {
					System.out.println(i);
				}
			}
		}
	}

}
