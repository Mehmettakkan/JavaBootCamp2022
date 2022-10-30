package week3Homework3.core.concrete;

import week3Homework3.core.abstracts.Logger;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Veritabanina loglandi: "+data);
	}

}
