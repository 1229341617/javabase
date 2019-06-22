package _04_核心类库.IO流._02_文件类的常见操作;

import java.io.File;

public class PrintDirFiles {
	public static void main(String[] args) {
		printAllFName("c:\\");
	}

	private static void printAllFName(String dirName) {
		File file = new File(dirName);
		String[] list = file.list();
		for (String fName : list) {
			System.out.println(fName);
		}
	}
}
