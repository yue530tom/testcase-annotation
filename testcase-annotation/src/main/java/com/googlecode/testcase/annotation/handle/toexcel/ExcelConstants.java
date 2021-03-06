package com.googlecode.testcase.annotation.handle.toexcel;

public class ExcelConstants {

	public static final String DEFAULT_SHEET_NAME_WHEN_MORE_SHEET_EXIST = "others";
	public static final String DEFAULT_SHEET_NAME_WHEN_ONLY_DEFAULT_MODULE_EXIST = "Unnamed Module";
	public static final ExcelType DEFAULT_EXCEL_TYPE = ExcelType.XLSX;
	public static final String DEFAULT_EXCEL_NAME_FORMAT = "TestCase_%s%s";
	public static final String FILE_SEPARATOR= System.getProperty("file.separator");


	private ExcelConstants(){
		// no instance
	}

}
