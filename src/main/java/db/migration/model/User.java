package db.migration.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name="full_name", nullable = false)
    private String full_name;

    @Column(name = "phone_no")
    private long phone_no;

    @Column(name = "address", nullable = false)
    private String address;
}
