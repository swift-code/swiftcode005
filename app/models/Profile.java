package models;

import com.avaje.ebean.Model;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.List;
import java.util.Map;

/**
 * Created by lubuntu on 8/20/16.
 */
@Entity
public class Profile extends Model {

    public Profile(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String firstName;
    public String lastName;
    public String company;


}
