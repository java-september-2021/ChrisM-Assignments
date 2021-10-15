package com.chrism.eventsbeltreviewer.authentication.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;

@Validated
@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min=2, max=50)
	private String firstName;
	@NotBlank
	@Size(min=2, max=50)
	private String lastName;
	@Email
	private String email;
	@NotBlank
	@Size(min=2, max=100)
	private String city;
	@NotBlank
	@Size(min=2, max=2)
	private String state;
	@NotBlank
	@Size(min=8, max=100)
	private String password;
	// Doesn't store in db
	@Transient
	private String passwordConfirmation;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;
 
	// Keep track of the events the user created
	@OneToMany(mappedBy="eventCreator", fetch=FetchType.LAZY)
	private List<Event> eventsCreated;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name="events_users",
			joinColumns = @JoinColumn(name = "user_id"),
			inverseJoinColumns = @JoinColumn(name = "event_id")
			)
	// List of events user is participating in
	private List<Event> eventsParticipatingIn;
	
	// Message Join
	@OneToMany(mappedBy="messageCreator", fetch = FetchType.LAZY)
	private List<Message> messagesCreated;
	
	public User() {
	}
 
	@PrePersist
	protected void onCreate(){
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate(){
		this.updatedAt = new Date();
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}

	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<Event> getEventsCreated() {
		return eventsCreated;
	}

	public void setEventsCreated(List<Event> eventsCreated) {
		this.eventsCreated = eventsCreated;
	}

	public List<Event> getEventsParticipatingIn() {
		return eventsParticipatingIn;
	}

	public void setEventsParticipatingIn(List<Event> eventsParticipatingIn) {
		this.eventsParticipatingIn = eventsParticipatingIn;
	}

	public List<Message> getMessagesCreated() {
		return messagesCreated;
	}

	public void setMessagesCreated(List<Message> messagesCreated) {
		this.messagesCreated = messagesCreated;
	}
	
	
}

