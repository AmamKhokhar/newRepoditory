package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "arrays")
public class Array {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    @Column(name = "ArrayName" , nullable = false)
    private String Array_Name;

    @Column(name = "Elements" , nullable = false)
    private int Element;

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getArray_Name() {
		return Array_Name;
	}

	public void setArray_Name(String array_Name) {
		Array_Name = array_Name;
	}

	public int getElement() {
		return Element;
	}

	public void setElements(int element) {
		Element = element;
	}
}
