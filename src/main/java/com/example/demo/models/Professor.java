package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table
@Entity
//@Setter
//@Getter
//@NoArgsConstructor
//@ToString
public class Professor {

	//1. mainigie
	@Column(name="IdPr")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPr;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Surname")
	private String surname;
	
	@Column(name="Degree")
	private profDegree degree;
	
	//viens-pret-viens
	@OneToOne(mappedBy = "professor")
	//@ToString.Exclude
	private Course course;
	
	//profesoram ir vairāki kursi
	//@OneToMany(mappedBy = "professor")
	//private Collection<Course> courses;

	//2. get un set
	public int getIdPr() {
		return idPr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public profDegree getDegree() {
		return degree;
	}

	public void setDegree(profDegree degree) {
		this.degree = degree;
	}

	//3.1 bezargumenta konstruktors
	public Professor() {
	}
	
	//3.2 argumenta konstruktors
	public Professor(int idPr, String name, String surname, profDegree degree) {
		super();
		this.name = name;
		this.surname = surname;
		this.degree = degree;
	}

	//4. toString
	@Override
	public String toString() {
		return "Professor [idPr=" + idPr + ", name=" + name + ", surname=" + surname + ", degree=" + degree + "]";
	}
	
	
	
	
}
