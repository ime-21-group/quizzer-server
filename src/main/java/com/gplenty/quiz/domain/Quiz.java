package com.gplenty.quiz.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.gplenty.quiz.domain.users.Teacher;


@Entity
public class Quiz {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int quiz_id;
	
	@ManyToOne
	@JoinColumn(name="author")
	private Teacher author;
	
	@OneToMany(mappedBy="quiz")
	private List<Question> questions;
	
	@Column(name="quiz_name")
	private String quizName;
	
	private String subject;
	
	@Column(name="subject_matter")
	private String subjectMatter;

	//
	// Métodos de acesso
	//
	public int getQuiz_id() {
		return quiz_id;
	}

	public void setQuiz_id(int quiz_id) {
		this.quiz_id = quiz_id;
	}

	public Teacher getAuthor() {
		return author;
	}

	public void setAuthor(Teacher author) {
		this.author = author;
	}

	public String getQuizName() {
		return quizName;
	}

	public void setQuizName(String quiz_name) {
		this.quizName = quiz_name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubjectMatter() {
		return subjectMatter;
	}

	public void setSubjectMatter(String subject_matter) {
		this.subjectMatter = subject_matter;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
}
