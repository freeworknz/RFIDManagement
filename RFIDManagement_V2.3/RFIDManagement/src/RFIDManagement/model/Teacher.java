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
 * @created 15/05/2016 - v1.0
 * @teacher class
 */
@XmlRootElement
public class Teacher {
    
    private String tagID;
    private String id = "T";
    private String userName;
    private String password;
    private String name;
    private int roomnum;
    
    
    public Teacher()
    {
        this.tagID = " ";
        this.userName = " ";
        this.password = " ";
        this.name = " ";  
        this.roomnum = 1;
    }
    
    public Teacher(String tagID, String userName, String password, String name, int roomnum)
    {
        this.tagID = tagID;
        this.userName = userName;
        this.password = password;
        this.name = name;  
        this.roomnum = roomnum;
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
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    @XmlElement
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    @XmlElement
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    @XmlElement
    public void setPassword(String password) {
        this.password = password;
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
     * @return the roomnum
     */
    public int getRoomnum() {
        return roomnum;
    }

    /**
     * @param roomnum the roomnum to set
     */
    @XmlElement
    public void setRoomnum(int roomnum) {
        this.roomnum = roomnum;
    }
    
    
    
}
