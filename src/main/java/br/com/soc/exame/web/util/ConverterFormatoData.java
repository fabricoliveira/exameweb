package br.com.soc.exame.web.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConverterFormatoData {
	
	/**
	 * Converte uma String do formato yyyy-MM-dd para dd/MM/yyyy
	 */
	public static String converterParaDiaMesAno(String data) {
		if(data != null && !data.trim().equals("")) {
			LocalDate localDate = LocalDate.parse(data);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			return localDate.format(formatter);
		}
		return null;
	}
	
	
	/**
	 * Converte uma String do formato dd/MM/yyyy para LocalDate
	 */
	public static LocalDate ConverterParaLocalDate(String data) {
		if(data != null && !data.trim().equals("")) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        return LocalDate.parse(data, formatter);
		}
		return null;
	}

}
