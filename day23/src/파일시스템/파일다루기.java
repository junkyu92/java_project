package 파일시스템;

import java.io.File;

public class 파일다루기 {

	public static void main(String[] args) {
//		File file = new File("test.txt");
//		File file = new File("C:\\data");
		File file = new File("C:/data");
//		file.delete();
		boolean result = file.exists();
		if (result) {
			System.out.println("파일이나 폴더가 존재함");
			System.out.println(file.getAbsolutePath());
			if (file.isDirectory()) {
				System.out.println("폴더!!");
			}else {
				System.out.println("파일!!");
			}
		} else {
			System.out.print("존재하지 않음");
		}
		File[] list = file.listFiles();
		System.out.println(list.length);
		for (File file2 : list) {
			System.out.println(file2);
		}
	}
}
