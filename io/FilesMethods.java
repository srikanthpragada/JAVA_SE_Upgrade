package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMethods {

	public static void main(String[] args) throws IOException {
		Path path = Path.of("c:\\classroom\\names.txt");
		Files.writeString(path, "First\nSecond\nThird");
		System.out.println(Files.readString(path));
	}
}
