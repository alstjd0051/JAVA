package workshop5;
public class Test01 {
	public static void main(String[] args) {
		char[] cArr = args[0].toCharArray();
		for(int i = cArr.length-1;i>-1;i--) System.out.print(cArr[i]);

		/*	for(int i = 0, j = cArr.length-1; i < j || i != j ;i++, j--){
			char tmp = cArr[i];
			cArr[i] = cArr[j];
			cArr[j] = tmp;
		}
		for(char a : cArr) System.out.print(a);
		*/
	}
}
