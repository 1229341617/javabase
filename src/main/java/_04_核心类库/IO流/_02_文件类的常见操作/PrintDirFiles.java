package _04_�������.IO��._02_�ļ���ĳ�������;

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
