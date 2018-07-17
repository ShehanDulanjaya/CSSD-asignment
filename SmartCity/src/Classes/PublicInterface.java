/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.List;

/**
 *
 * @author Akila Jayasinghe
 */
public class PublicInterface {

    private String ID;

    /**
     *
     */
    public List<EmbllishedData> data;

    /**
     *
     * @param ID
     */
    public PublicInterface(String ID) {
        this.ID = ID;
    }

    /**
     *
     * @return
     */
    public String getID() {
        return ID;
    }

    /**
     *
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     *
     * @return
     */
    public List<EmbllishedData> getData() {
        return data;
    }

    /**
     *
     * @param data
     */
    public void setData(List<EmbllishedData> data) {
        this.data = data;
    }
}
