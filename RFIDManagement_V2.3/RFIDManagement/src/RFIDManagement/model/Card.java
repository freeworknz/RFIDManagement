/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RFIDManagement.model;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author Team 16
 * @created 13/05/2016 - v1.0
 * @an object for teaching card
 */
@XmlRootElement
public class Card {

    private String tagID;
    private String id = "C";
    private String name;
    private String teachUrl;
    private String stuUrl;
    
    public Card()
    {
        this.tagID = " ";
        this.name = " ";
        this.teachUrl = " ";
        this.stuUrl = " ";
    }
    
     public Card(String tagID, String name, String teachUrl, String stuUrl)
    {
        this.tagID = tagID;
        this.name = name;
        this.teachUrl = teachUrl;
        this.stuUrl = stuUrl;
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
     * @return the teachUrl
     */
    public String getTeachUrl() {
        return teachUrl;
    }

    /**
     * @param teachUrl the teachUrl to set
     */
    @XmlElement
    public void setTeachUrl(String teachUrl) {
        this.teachUrl = teachUrl;
    }

    /**
     * @return the stuUrl
     */
    public String getStuUrl() {
        return stuUrl;
    }

    /**
     * @param stuUrl the stuUrl to set
     */
    @XmlElement
    public void setStuUrl(String stuUrl) {
        this.stuUrl = stuUrl;
    }

    /**
     * @return the cardID
     */
    public String getID() {
        return id;
    }

    /**
     * @param cardID the cardID to set
     */
    public void setID(String cardID) {
        this.id = cardID;
    }

}
