package com.revature.dao;
import com.revature.model.Painting;
/* whats list?
list is an interface that arraylist and linkedlist implement
 */
import java.util.List;

public class paintingDAO {
    /*
    what is a DAO?
    DAO stands for Data Access Object
    the DAO is intended to contain methods that return POJO (plain old java objects)
    or collection of POJO from the database
    are DAOs necessary?
    not really - but they are considered best practice
     */

    public List<Painting> getAllPaintings() {
        return null;
    }

    public Painting getPainting() {
        return null;
    }

    public void addPainting() {

    }
}
