/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RFIDManagement.model;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

/**
 *
 * @author jsc8540
 */
public class StudentName {

    private ArrayList<ArrayList<String>> infoList = new ArrayList<ArrayList<String>>();

    public StudentName() {

    }

    public void printStuName() {

        try {
            // count all files under the XMLTest folder
            File folder = new File(System.getProperty("user.home")+"/Documents/RFID Database/1");
            File[] listOfFiles = folder.listFiles();
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            // get file name
            for (int i = 0; i < listOfFiles.length; i++) {
                File file = listOfFiles[i];
                // check for xml files
                if (file.exists() && file.getName().endsWith(".xml")) {
                    Document doc = dBuilder.parse(file);
                    ArrayList<String> info = new ArrayList<String>();
                    //System.out.println(doc.getElementsByTagName("id").item(0).getTextContent());
                    if (!doc.getElementsByTagName("id").item(0).getTextContent().equals("T")) {
                        String sName = doc.getElementsByTagName("name").item(0).getTextContent();
                        info.add(sName);
                        for (int index = 1; index <= 14; index++) {
                            String cName = doc.getElementsByTagName("course_" + index).item(0).getTextContent();
                            info.add(cName);
                            //System.out.println(info.get(0));
                        }
                        infoList.add(info);
                    }
                    
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<ArrayList<String>> getnArrayList() {
        return infoList;
    }

    public String getStringAt(int i, int j) {
        return infoList.get(i).get(j);
    }

    public boolean contains(String name) {
        boolean check = false;
        if (this.infoList != null) {
            for (ArrayList<String> info : infoList) {
                 check =  info.contains(name);
            }
        }
        return check;
    }

}
