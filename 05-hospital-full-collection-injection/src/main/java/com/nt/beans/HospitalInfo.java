package com.nt.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="hospital")
public class HospitalInfo {
	
	 private Integer id;
	 private String name;
	 private List<String> doctors;
	 private String[] specialists;
	 private Map<String,Integer> staff;
	 public Integer getId() {
		 return id;
	 }
	 public void setId(Integer id) {
		 this.id = id;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public List<String> getDoctors() {
		 return doctors;
	 }
	 public void setDoctors(List<String> doctors) {
		 this.doctors = doctors;
	 }
	 public String[] getSpecialists() {
		 return specialists;
	 }
	 public void setSpecialists(String[] specialists) {
		 this.specialists = specialists;
	 }
	 public Map<String, Integer> getStaff() {
		 return staff;
	 }
	 public void setStaff(Map<String, Integer> staff) {
		 this.staff = staff;
	 }
	 @Override
	 public String toString() {
		return "HospitalInfo [id=" + id + ", name=" + name + ", doctors=" + doctors + ", specialists="
				+ Arrays.toString(specialists) + ", staff=" + staff + "]";
	 }
	 
	 

}
