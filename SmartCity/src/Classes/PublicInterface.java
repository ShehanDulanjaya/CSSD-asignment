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
    public List<EmbllishedData> data;

    public PublicInterface(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public List<EmbllishedData> getData() {
        return data;
    }

    public void setData(List<EmbllishedData> data) {
        this.data = data;
    }
}
