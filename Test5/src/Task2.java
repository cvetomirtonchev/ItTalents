
public class Task2 {

	public static void main(String[] args) {
		String dumi = "������� � ������� ��� ������������ � ������ ��� ����������� ����������. ������������ ����� �� �������, �������, ����������� ��� ���� �����, ���������� �� �������, ������, ��������� ��� ����� ���������, ����������� ������ �� ������ ������. ������� ���� �� � � ���� ��� ������ ������. ������� �� �������� � ���������, � ������������� �� �� ������ ��������������������. ������ ������� ��� ������������ �� � ���������� ������, �� ������� �-�����.";
		mostFre(dumi);

	}
	static void mostFre(String duma){
		String masiv []=duma.split(" ");
		int count = 0;
		String popular = " ";
		for (int i = 0; i < masiv.length; i++) {
			String tempElement=masiv[i];
			int tempCount=0;
			for (int j = 0; j < masiv.length; j++) {
				if(masiv[j].equalsIgnoreCase(tempElement)){
					tempCount++;
				}
			}
			if(tempCount>count){
				popular=tempElement;
				count=tempCount;
				
			}
		}
		System.out.println(popular + " " + count + "puti");
		
	
	
	}

}
