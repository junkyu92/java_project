package 그래픽문제;

public class 이차원배열2 {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		int[] arr2 = new int[5];
		int[] arr3 = new int[4];
		
		int[][] arrlist = new int[3][];
		arrlist[0] = arr1;
		arrlist[1] = arr2;
		arrlist[2] = arr3;
		//		0	1	2	3	4
		//0		0	0	0
		//1		0	0	0	0	0
		//2		0	0	0	0
		arrlist[1][1] = 1;
		arrlist[1][3] = 1;
		arrlist[2][3] = 1;
		
		System.out.println(arrlist.length);
		System.out.println(arrlist[0].length);
		System.out.println(arrlist[1].length);
		System.out.println(arrlist[2].length);
		
		
	}

}
