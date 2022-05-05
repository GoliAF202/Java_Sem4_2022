package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table
@Entity
//@Setter
//@Getter
//@NoArgsConstructor
//@ToString
public class Course {

	//1. mainigie
		@Column(name="IdCo")
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int idCo;
		
		@Column(name="Title")
		private String title;
		
		@Column(name="CreditPoints")
		private int creditPoints;
		
		//viens-pret-viens
		@OneToOne
		@JoinColumn(name="IdPr")
		private Professor professor;
		
		//Vairakiem kursiem ir viens pasniedzejs
		//@ManyToOne(name="IdPr")
		//private Professor professor;
		
		
		//2. get un set
		public int getIdC() {
			return idCo;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getCreditPoints() {
			return creditPoints;
		}

		public void setCreditPoints(int creditPoints) {
			this.creditPoints = creditPoints;
		}
		
		public Professor getProfessor() {
			return professor;
		}

		public void setProfessor(Professor professor) {
			this.professor = professor;
		}

		//3.1 bezargumenta konstruktors
		public Course() {
		}
		
		//3.2 argumenta konstruktors
		public Course(String title, int creditPoints, Professor professor) {
			this.title = title;
			this.creditPoints = creditPoints;
			this.professor = professor;
		}

		//4. toString
		@Override
		public String toString() {
			return "Course [idCo=" + idCo + ", title=" + title + ", creditPoints=" + creditPoints + ", professor="
					+ professor + "]";
		}
		
		
}
