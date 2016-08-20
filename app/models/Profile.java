package models;

import com.avaje.ebean.Model;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.List;

/**
 * Created by lubuntu on 8/20/16.
 */
@Entity
public class Profile extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String email;
    public String password;

    @OneToMany(mappedBy = "sender")
    public List<ConnectionRequest> connectionRequestsSent;

    @OneToMany(mappedBy = "receiver")
    public List<ConnectionRequest> connectionRequestsReceived;

    @OneToOne
    public Profile profile;

}
