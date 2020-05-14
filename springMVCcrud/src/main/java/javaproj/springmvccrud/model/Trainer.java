/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproj.springmvccrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name="trainer")
public class Trainer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Size(min=3, max=50)
	@Column(name = "firstName", nullable = false)
	private String fname;
        
        @Size(min=3, max=50)
	@Column(name = "lastName", nullable = false)
	private String lname;

//	@NotNull
//	@DateTimeFormat(pattern="dd/MM/yyyy") 
//	@Column(name = "ENTERING_DATE", nullable = false)
//	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
//	private LocalDate enteringDate;

	@NotNull
	@Column(name = "trainerSubject", nullable = false)
	private String subject;

        public Trainer() {
        }

        public Trainer(int id, String fname, String lname, String subject) {
            this.id = id;
            this.fname = fname;
            this.lname = lname;
            this.subject = subject;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFname() {
            return fname;
        }

        public void setFname(String fname) {
            this.fname = fname;
        }

        public String getLname() {
            return lname;
        }

        public void setLname(String lname) {
            this.lname = lname;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        @Override
        public String toString() {
            return "Trainer{" + "id=" + id + ", fname=" + fname + ", lname=" + lname + ", subject=" + subject + '}';
        }
        
        
    
}
