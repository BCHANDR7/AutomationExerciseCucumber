package utitlities;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataManager {
	
	public static List<HashMap<String, String>> getData(String filepath, String sheetName) throws IOException
	{
		List<HashMap<String, String>> mydata=new ArrayList<HashMap<String,String>>();
		FileInputStream file = new FileInputStream(filepath);
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet(sheetName);
		int totalRows=sheet.getLastRowNum();
		XSSFRow headerRow=sheet.getRow(0);
		
		if(headerRow==null)
		{
			throw new RuntimeException("Missing row in the sheet: "+sheetName);	
			
		}
		
		for(int i=1;i<=totalRows;i++)
		{
			HashMap<String, String> map=new HashMap<String, String>();
			XSSFRow currentRow=sheet.getRow(i);
			if(currentRow==null)
			{
				continue;
			}
			for(int j=0;j<currentRow.getLastCellNum();j++)
			{
				String key=headerRow.getCell(j).toString();
				String value;
				DataFormatter format=new DataFormatter();
				if(currentRow.getCell(j)!=null)
				{
					value=format.formatCellValue(currentRow.getCell(j));
				}
				else {
					value="";
				}
				
				map.put(key, value);
			}
			mydata.add(map);
			
		}
		
		return mydata;
	}

}
