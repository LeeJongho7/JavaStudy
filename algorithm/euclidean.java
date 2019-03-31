package algorithm;

public class euclidean {
	
	public static void main(String args[])
	{
		//변수선언
		int m = 100122341;	//피제수
		int n = 2123412300;	//제수
		int r;			//나머지
		int temp;		//임시변수
		int temp_m;		//임시변수
		int temp_n;		//임시변수		
		
		//피제수가 제수보다 작으면 피제수와 제수를 상호치환한다.
		if( m < n)
		{
			temp = m;
			m = n;
			n = temp;
		}
		
		temp_m = m;
		temp_n = n;		
		
		System.out.println("피제수  = " + temp_m);
		System.out.println("제수  = "  + temp_n);
		
		//m을  n으로 나눈 나머지가 0이 아니면 실행
		while((r = (temp_m % temp_n)) != 0)
		{
			temp_m = temp_n;
			temp_n = r;					
		}
		
		System.out.println(m + "과 " + n + "의 최대공약수는 " + temp_n + "이다.");
	}
}
