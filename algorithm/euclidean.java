package algorithm;

public class euclidean {
	
	public static void main(String args[])
	{
		//��������
		int m = 100122341;	//������
		int n = 2123412300;	//����
		int r;			//������
		int temp;		//�ӽú���
		int temp_m;		//�ӽú���
		int temp_n;		//�ӽú���		
		
		//�������� �������� ������ �������� ������ ��ȣġȯ�Ѵ�.
		if( m < n)
		{
			temp = m;
			m = n;
			n = temp;
		}
		
		temp_m = m;
		temp_n = n;		
		
		System.out.println("������  = " + temp_m);
		System.out.println("����  = "  + temp_n);
		
		//m��  n���� ���� �������� 0�� �ƴϸ� ����
		while((r = (temp_m % temp_n)) != 0)
		{
			temp_m = temp_n;
			temp_n = r;					
		}
		
		System.out.println(m + "�� " + n + "�� �ִ������� " + temp_n + "�̴�.");
	}
}
