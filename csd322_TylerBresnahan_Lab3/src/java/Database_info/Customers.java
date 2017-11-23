/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database_info;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 14011197
 */
@Entity
@Table(name = "customers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customers.findAll", query = "SELECT c FROM Customers c")
    , @NamedQuery(name = "Customers.findByCustomerId", query = "SELECT c FROM Customers c WHERE c.customerId = :customerId")
    , @NamedQuery(name = "Customers.findByCustomerFName", query = "SELECT c FROM Customers c WHERE c.customerFName = :customerFName")
    , @NamedQuery(name = "Customers.findByCustomerLName", query = "SELECT c FROM Customers c WHERE c.customerLName = :customerLName")
    , @NamedQuery(name = "Customers.findByCustomerAddress", query = "SELECT c FROM Customers c WHERE c.customerAddress = :customerAddress")
    , @NamedQuery(name = "Customers.findByCustomerCity", query = "SELECT c FROM Customers c WHERE c.customerCity = :customerCity")
    , @NamedQuery(name = "Customers.findByCustomerPC", query = "SELECT c FROM Customers c WHERE c.customerPC = :customerPC")})
public class Customers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "customer_id")
    private Integer customerId;
    @Size(max = 15)
    @Column(name = "customer_FName")
    private String customerFName;
    @Size(max = 15)
    @Column(name = "customer_LName")
    private String customerLName;
    @Size(max = 30)
    @Column(name = "customer_address")
    private String customerAddress;
    @Size(max = 30)
    @Column(name = "customer_city")
    private String customerCity;
    @Size(max = 6)
    @Column(name = "customer_PC")
    private String customerPC;
    @OneToMany(mappedBy = "customerId")
    private Collection<Orders> ordersCollection;

    public Customers() {
    }

    public Customers(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerFName() {
        return customerFName;
    }

    public void setCustomerFName(String customerFName) {
        this.customerFName = customerFName;
    }

    public String getCustomerLName() {
        return customerLName;
    }

    public void setCustomerLName(String customerLName) {
        this.customerLName = customerLName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerPC() {
        return customerPC;
    }

    public void setCustomerPC(String customerPC) {
        this.customerPC = customerPC;
    }

    @XmlTransient
    public Collection<Orders> getOrdersCollection() {
        return ordersCollection;
    }

    public void setOrdersCollection(Collection<Orders> ordersCollection) {
        this.ordersCollection = ordersCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerId != null ? customerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customers)) {
            return false;
        }
        Customers other = (Customers) object;
        if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Database_info.Customers[ customerId=" + customerId + " ]";
    }
    
}
