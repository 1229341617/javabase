package _04_�������.IO��._01_·�������Էָ���;

import java.io.File;

public class PathAndAttriSeparatorChar {
	public static void main(String[] args) {
		createFile("\\");
	}

	public static void createFile(String seperator) {
		String path1 = "c:"+seperator+"will"+seperator+"123.txt";
		File f1 = new File(path1);
		System.out.println(f1.exists());
	}

	public static void test1() {
		System.out.println("���Էָ���...");
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		System.out.println("·���ָ���...");
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
	}
}
