package com.Mapping.Entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.annotations.ListIndexBase;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "EmployeeInfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    public int eid;

    @Column(length = 20)
    public String ename;

    @ElementCollection
    @CollectionTable(name = "Employee_Friends", joinColumns = @JoinColumn(name = "Emp_Id",referencedColumnName="EID"))
    @OrderColumn(name = "Friend_INDX")
    @ListIndexBase(value = 1)
    //@ElementCollection(fetch = FetchType.EAGER) 
    public List<String> friends;

    @ElementCollection
    @CollectionTable(name = "Employee_PhoneNumbers", joinColumns = @JoinColumn(name = "Emp_Id",referencedColumnName="EID"))
    @Column(name = "Phone_Number")
    //@ElementCollection(fetch = FetchType.EAGER) 
    public Set<Long> phoneNumbers;

    @ElementCollection
    @CollectionTable(name = "Employee_ID_Details", joinColumns = @JoinColumn(name = "Emp_Id",referencedColumnName="EID"))
    @MapKeyColumn(name = "ID_Type")
    @Column(name = "ID_Number")
    //@ElementCollection(fetch = FetchType.EAGER)
    public Map<String, Integer> idDetails;
}
