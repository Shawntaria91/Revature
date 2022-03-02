package com.projectone.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="scavengerItem")

@JsonIdentityInfo(
        //this is to stop recursive hibernate joins
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
public class ScavengerItem {
    @Id
    @Column(name="scavengerItem_id")
    private int id;

    //we don't actually need the column annotations - hibernate will imply from the names of variable
    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "scavengerItem", fetch=FetchType.EAGER)
    @JsonIgnoreProperties(value="scavengerItem")
    private List<MathQuestion> mathQuestions;

    public List<MathQuestion> getMathQuestions() {
        return mathQuestions;
    }

    public void setMathQuestions(List<MathQuestion> mathQuestions) {
        this.mathQuestions = mathQuestions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ScavengerItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
