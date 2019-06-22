package _04_核心类库.IO流._01_路径和属性分隔符;

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
		System.out.println("属性分隔符...");
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		System.out.println("路径分隔符...");
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
	}
}
