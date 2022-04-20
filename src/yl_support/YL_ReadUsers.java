package yl_support;

public class YL_ReadUsers {

	public static void main(String[] args) {
		String strFileName = "C:\\Users\\christopher.carlos\\eclipse-workspace\\YourLogo\\resources\\data\\datausers.xls";
		YL_ReadUtility excel = new YL_ReadUtility(strFileName);
		excel.readExcel(0);
	}
}
