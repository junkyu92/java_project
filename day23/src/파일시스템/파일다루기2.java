package 파일시스템;

import java.io.File;

public class 파일다루기2 {

	public static void main(String[] args) {
		File file = new File("C:\\Program Files\\Java\\jdk1.8.0_291");
		//jdk폴더 아래 몇 개가 있는지 프린트
		File[] list = file.listFiles();
		System.out.println(list.length);
		for (File file2 : list) {
			System.out.println(file2);
			if (file2.isDirectory()) {
				System.out.println("폴더");
			}else {
				System.out.println("파일");
			}
			System.out.println();
		}
	}
}
