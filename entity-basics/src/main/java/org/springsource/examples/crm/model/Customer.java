package org.springsource.examples.crm.model;
// Generated Dec 16, 2010 1:06:09 PM by Hibernate Tools 3.2.0.CR1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Customer generated by hbm2java
 */
@Entity
@Table(name = "customer"
        , schema = "public"
)
public class Customer implements java.io.Serializable {


    private long id;
    private String firstName;
    private String lastName;
    private Set<Purchase> purchases = new HashSet<Purchase>(0);

    public Customer() {
    }


    public Customer(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(long id, String firstName, String lastName, Set<Purchase> purchases) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.purchases = purchases;
    }

    @Id

    @Column(name = "id", unique = true, nullable = false)
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")
    public Set<Purchase> getPurchases() {
        return this.purchases;
    }

    public void setPurchases(Set<Purchase> purchases) {
        this.purchases = purchases;
    }


}


