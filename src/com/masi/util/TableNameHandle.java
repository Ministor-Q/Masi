package com.masi.util;

public class TableNameHandle {

	public static String tableName(String codeString){
		char code = codeString.charAt(1);
		String tableName = null;
		switch (code) {
		case '1':
			tableName = "sy";
			break;
		case '2':
			tableName = "xygk";
			break;
		case '3':
			tableName = "jxgz";
			break;
		case '4':
			tableName = "kygz";
			break;
		case '5':
			tableName = "rcpy";
			break;
		case '6':
			tableName = "xsgz";
			break;
		case '7':
			tableName = "xwgg";
			break;
		case '8':
			tableName = "djgz";
			break;
		case '9':
			tableName = "szdw";
			break;
		case '0':
			tableName = "zyxz";
			break;
		default:
			break;
		}
		
		return tableName;
	}
	
}
