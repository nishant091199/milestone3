package com.milestone3.milestone;

import java.util.List;
import javax.persistence.*;
@Entity
public class University {
@Id
private int id;
private String name;
private String city;
private List<College> collegeList;
public University() {}
public University(int id,String name,String city,List<College>collegeList) {
	this.id=id;
	this.name=name;
	this.city=city;
	this.collegeList=collegeList;
}
public int getId() {return id;}
public void setId(int id) {this.id=id;}
public String geName() {return name;}
public void setName(String name) {this.name=name;}
public String getCity() {return city;}
public void setcity(String city) {this.city=city;}
public List<College>getCollegeList(){return collegeList;}
@Override
public String toString() {
	return "University{'"
			+ ""+
			"id=" +id+
			", name='"+name+'\''+
			", city='"+city+'\''+
			", collegeList="+collegeList+
			'}';
}
}
