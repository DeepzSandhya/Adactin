package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datawrite {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Deepak\\OneDrive\\Documents\\Employee data.xlsx");
	    
		FileInputStream fi = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fi);
		
		wb.createSheet("Employee details").createRow(0).createCell(0).setCellValue("Name");
		wb.getSheet("Employee details").getRow(0).createCell(1).setCellValue("EmployeeId");
		
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
        System.out.println("sucess");	
        wb.close();
		                                                     

	}

}
