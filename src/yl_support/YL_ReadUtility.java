package yl_support;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

public class YL_ReadUtility {

	String fileName;

	public YL_ReadUtility (String _fileName) {
	this.fileName = _fileName;
	}

	public void readExcel(int intSheetNumber) {

		try {
			// obtaining input bytes from a file
			FileInputStream fis = new FileInputStream(new File(fileName));
			
			// creating workbook instance that refers to .xls file
			HSSFWorkbook wb = new HSSFWorkbook(fis);
			// creating a Sheet object to retrieve the object
			HSSFSheet sheet = wb.getSheetAt(intSheetNumber);
			
			// evaluating cell type
			FormulaEvaluator formulaEvaluator = wb.getCreationHelper().createFormulaEvaluator();
			
			for (Row row : sheet) // iteration over row using for each loop
			{
				for (Cell cell : row) // iteration over cell using for each loop
				{
					switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
					case Cell.CELL_TYPE_NUMERIC: // field that represents numeric cell type
						// getting the value of the cell as a number
						System.out.print(cell.getNumericCellValue() + "\t\t");
						break;
					case Cell.CELL_TYPE_STRING: // field that represents string cell type
						// getting the value of the cell as a string
						System.out.print(cell.getStringCellValue() + "\t\t");
						break;
					}
				}
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println("Error on : " + e.getMessage());
		}

	}

}
