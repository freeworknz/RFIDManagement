/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RFIDManagement.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Team 16
 * @created 13/05/2016 - v1.0
 * @an object for student
 */

@XmlRootElement
public class Student {
    
    private String tagID;
    private int id;
    private int room;
    private String name;
    private String proUrl;
    private int COURSE_1 = 0;
    private int COURSE_2 = 0;
    private int COURSE_3 = 0;
    private int COURSE_4 = 0;
    private int COURSE_5 = 0;
    private int COURSE_6 = 0;
    private int COURSE_7 = 0;
    private int COURSE_8 = 0;
    private int COURSE_9 = 0;
    private int COURSE_10 = 0;
    private int COURSE_11 = 0;
    private int COURSE_12 = 0;
    private int COURSE_13 = 0;
    private int COURSE_14 = 0;
    
    
    
    
    
    
    public Student()
    {
        this.tagID = " ";
        this.id = 0000;
        this.room = 1;
        this.name = " ";
        this.proUrl = " ";
    }
    
    public Student(String tagID, int id, int room, String name, String proUrl)
    {
            this.tagID = tagID;
            this.id = id;
            this.room = room;
            this.name = name;
            this.proUrl = proUrl;
    }

    /**
     * @return the tagID
     */
    public String getTagID() {
        return tagID;
    }

    /**
     * @param tagID the tagID to set
     */
    @XmlElement
    public void setTagID(String tagID) {
        this.tagID = tagID;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the proUrl
     */
    public String getProUrl() {
        return proUrl;
    }

    /**
     * @param proUrl the proUrl to set
     */
    @XmlElement
    public void setProUrl(String proUrl) {
        this.proUrl = proUrl;
    }

    /**
     * @return the room
     */
    public int getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    @XmlElement
    public void setRoom(int room) {
        this.room = room;
    }

    /**
     * @return the COURSE_1
     */
    public int getCourse_1() {
        return COURSE_1;
    }

    /**
     * @param COURSE_1 the COURSE_1 to set
     */
    @XmlElement
    public void setCourse_1(int COURSE_1) {
        this.COURSE_1 = COURSE_1;
    }

    /**
     * @return the COURSE_2
     */
    public int getCourse_2() {
        return COURSE_2;
    }

    /**
     * @param COURSE_2 the COURSE_2 to set
     */
    @XmlElement
    public void setCourse_2(int COURSE_2) {
        this.COURSE_2 = COURSE_2;
    }

    /**
     * @return the COURSE_3
     */
    public int getCourse_3() {
        return COURSE_3;
    }

    /**
     * @param COURSE_3 the COURSE_3 to set
     */
    @XmlElement
    public void setCourse_3(int COURSE_3) {
        this.COURSE_3 = COURSE_3;
    }

    /**
     * @return the COURSE_4
     */
    public int getCourse_4() {
        return COURSE_4;
    }

    /**
     * @param COURSE_4 the COURSE_4 to set
     */
    @XmlElement
    public void setCourse_4(int COURSE_4) {
        this.COURSE_4 = COURSE_4;
    }

    /**
     * @return the COURSE_5
     */
    public int getCourse_5() {
        return COURSE_5;
    }

    /**
     * @param COURSE_5 the COURSE_5 to set
     */
    @XmlElement
    public void setCourse_5(int COURSE_5) {
        this.COURSE_5 = COURSE_5;
    }

    /**
     * @return the COURSE_6
     */
    public int getCourse_6() {
        return COURSE_6;
    }

    /**
     * @param COURSE_6 the COURSE_6 to set
     */
    @XmlElement
    public void setCourse_6(int COURSE_6) {
        this.COURSE_6 = COURSE_6;
    }

    /**
     * @return the COURSE_7
     */
    public int getCourse_7() {
        return COURSE_7;
    }

    /**
     * @param COURSE_7 the COURSE_7 to set
     */
    @XmlElement
    public void setCourse_7(int COURSE_7) {
        this.COURSE_7 = COURSE_7;
    }

    /**
     * @return the COURSE_8
     */
    public int getCourse_8() {
        return COURSE_8;
    }

    /**
     * @param COURSE_8 the COURSE_8 to set
     */
    @XmlElement
    public void setCourse_8(int COURSE_8) {
        this.COURSE_8 = COURSE_8;
    }

    /**
     * @return the COURSE_9
     */
    public int getCourse_9() {
        return COURSE_9;
    }

    /**
     * @param COURSE_9 the COURSE_9 to set
     */
    @XmlElement
    public void setCourse_9(int COURSE_9) {
        this.COURSE_9 = COURSE_9;
    }

    /**
     * @return the COURSE_10
     */
    public int getCourse_10() {
        return COURSE_10;
    }

    /**
     * @param COURSE_10 the COURSE_10 to set
     */
    @XmlElement
    public void setCourse_10(int COURSE_10) {
        this.COURSE_10 = COURSE_10;
    }

    /**
     * @return the COURSE_11
     */
    public int getCourse_11() {
        return COURSE_11;
    }

    /**
     * @param COURSE_11 the COURSE_11 to set
     */
    @XmlElement
    public void setCourse_11(int COURSE_11) {
        this.COURSE_11 = COURSE_11;
    }

    /**
     * @return the COURSE_12
     */
    public int getCourse_12() {
        return COURSE_12;
    }

    /**
     * @param COURSE_12 the COURSE_12 to set
     */
    @XmlElement
    public void setCourse_12(int COURSE_12) {
        this.COURSE_12 = COURSE_12;
    }

    /**
     * @return the COURSE_13
     */
    public int getCourse_13() {
        return COURSE_13;
    }

    /**
     * @param COURSE_13 the COURSE_13 to set
     */
    @XmlElement
    public void setCourse_13(int COURSE_13) {
        this.COURSE_13 = COURSE_13;
    }

    /**
     * @return the COURSE_14
     */
    public int getCourse_14() {
        return COURSE_14;
    }

    /**
     * @param COURSE_14 the COURSE_14 to set
     */
    @XmlElement
    public void setCourse_14(int COURSE_14) {
        this.COURSE_14 = COURSE_14;
    }

    /**
     * @return the history
     */
    
    
    
}
