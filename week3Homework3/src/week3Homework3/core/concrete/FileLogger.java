package week3Homework3.core.concrete;

import week3Homework3.core.abstracts.Logger;

public class FileLogger implements Logger {
	@Override
	public void log(String data) {
		System.out.println("Dosyaya loglandi: "+data);
	}

}
