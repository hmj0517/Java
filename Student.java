package com.hmj.course.bean;

//ѧ������š��������Ա���ѡ�γ̡�������
public class Student extends Person {
	// ��������
	private Course selectedCourse; // ��ѡ�γ�
	private String beginDate; // ��ѧʱ��

	public Student() {
		// ���ø����޲ι��캯��
		super();
	}

	public Student(Integer id, String personName, String personSex, Integer personAge, String personTel,
			String personEmail, Course selectedCourse, String beginDate) {
		// ���ø���ȫ�ι��캯��
		super(id, personName, personSex, personAge, personTel, personEmail);
		// Ϊ�Լ������Ը�ֵ
		this.selectedCourse = selectedCourse;
		this.beginDate = beginDate;

	}

	public Course getSelectedCourse() {
		return selectedCourse;
	}

	public void setSelectedCourse(Course selectedCourse) {
		this.selectedCourse = selectedCourse;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}
}
