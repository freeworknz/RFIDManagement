/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RFIDManagement.model;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author jsc8540
 */
public class History {

    //private StudentName studentName;
    private CourseName[] courseName = CourseName.values();

    public History() {

    }

    public boolean generateHistoryFile(String room) {
        try {
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("Learning History Tracking");

            //create font
            CellStyle headingCellStyle = workbook.createCellStyle();
            Font font = workbook.createFont();
            font.setBold(true);
            font.setFontHeightInPoints((short) 11);
            font.setFontName(HSSFFont.FONT_ARIAL);
            headingCellStyle.setFont(font);
            headingCellStyle.setAlignment(CellStyle.ALIGN_CENTER);

            //create course name heading      
            Row rowHeading = sheet.createRow(0);
            for (int i = 0; i < courseName.length; i++) {
                rowHeading.createCell(i + 1).setCellValue(courseName[i].toString());
                //apply font to the cell
                rowHeading.getCell(i + 1).setCellStyle(headingCellStyle);
                //auto fit cell
                sheet.autoSizeColumn(i + 1);
            }

            //create student name heading
            StudentName studentName = new StudentName();
            studentName.printStuName();
            //System.out.println(studentName.getStringAt(0, 0));
            for (int i = 0; i < studentName.getnArrayList().size(); i++) {
                Row stuName = sheet.createRow(i + 1);
                for (int j = 0; j < courseName.length + 1; j++) {
                    //System.out.println(studentName.getStringAt(i, j));       
                    stuName.createCell(j).setCellValue(studentName.getStringAt(i, j));
                    //apply font to the cell
                    stuName.getCell(j).setCellStyle(headingCellStyle);
                    //auto fit cell
                    sheet.autoSizeColumn(j);
                }
            }
            File file = new File(System.getProperty("user.home") + "/Desktop/Learning History Tracking Room_" + room + ".xls");
            FileOutputStream out = new FileOutputStream(file);

            //save to excel
            workbook.write(out);
            out.flush();
            out.close();
            workbook.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    
    
    /*
    public boolean containsStudent(String stuName) {
        return studentName.contains(stuName);
    }
     
    public int getCourseIndex(String courseName) {
        return CourseName.valueOf(courseName).ordinal();
    }
     */

}
