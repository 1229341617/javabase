package _04_核心类库.IO流._02_文件类的常见操作;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PrintAllDirFiles {
	public static void main(String[] args) {
		System.out.println(listAllDirNames("C:\\Windows"));
	}

	private static int listAllDirNames(String rootPath) {
		File rootDir = new File(rootPath);
		File[] files = rootDir.listFiles();
		List<String> fNames = new ArrayList<>();
		
		doListAllDirNames(files, fNames);
		return fNames.size();
	}

	private static void doListAllDirNames(File[] files, List<String> fNames) {
		if(files != null && files.length > 0){
			for (File f : files) {
				if(!f.isDirectory()){
					fNames.add(f.getName());
				}else{
					doListAllDirNames(f.listFiles(),fNames);
				}
			}
		}
	}
	
}
