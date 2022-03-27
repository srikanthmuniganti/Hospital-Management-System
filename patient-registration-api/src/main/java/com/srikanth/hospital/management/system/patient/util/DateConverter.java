package com.srikanth.hospital.management.system.patient.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateConverter {
	
	public static LocalDateTime convertDate()
	{
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'hh:mm:ss");
		LocalDateTime date=LocalDateTime.parse(dateFormatter.format(LocalDateTime.now()));
		return date;
	}
}
