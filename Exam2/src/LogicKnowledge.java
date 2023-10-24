
public class LogicKnowledge {

	public static void main(String[] args) {
		int num = pickNumber(1,2,3);
		System.out.println(num);

	}
	public static int pickNumber(int a, int b, int c) {
		if (a==b && a==c) {
			return a;
		}
		else if (a==b) {
			return c;
		}
		else if (b==c) {
			return a;
		}
		else if (c==a) {
			return b;
		}
		else { 
			return a+b+c;
		}
	
	}

}
