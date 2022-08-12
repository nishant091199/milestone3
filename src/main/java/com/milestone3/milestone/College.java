package com.milestone3.milestone;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class College {
@Id
private int collegeId;
private String name;
private String city;
public int getCollegeId() {return collegeId;}
public void setCollegeId(int collegeId) {this.collegeId=collegeId;}
public String getName() {return name;}
public void setName(String name) {return name;}
public void setCity(String city) {this.city=city;}
public College() {}
public College(int collegeId,String name,String city) {
	this.collegeId=collegeId;
	this.name=name;
	this.city=city;c
}
@Override
public String toString() {
	return "College{"+
"collegeId="+collegeId+
",name='"+name+'\'+'
",city='"+city+city+'\''+
'}';
}
}
