package com.hmj.course.bean;

public class Teacher extends Person {
	// ��������
	private Course teachingCourse;     // ���ڿγ�
	private String teacherLevel;           // ��ʦ����
	private String teacherDescription;  // ��ʦ����

	public Teacher() {
		// ���ø����޲ι��캯��
		super();
	}

	public Teacher(Integer id, String personName, String personSex, Integer personAge, String personTel,
			String personEmail,Course teachingCourse, String teacherLevel,String teacherDescription) {
		// ���ø���ȫ�ι��캯��
		super(id, personName, personSex, personAge, personTel, personEmail);
		// Ϊ�Լ������Ը�ֵ
		this.teachingCourse = teachingCourse;
		this.teacherLevel = teacherLevel;
		this.teacherDescription = teacherDescription;
	}

	public Course getTeachingCourse() {
		return teachingCourse;
	}

	public void setTeachingCourse(Course teachingCourse) {
		this.teachingCourse = teachingCourse;
	}

	public String getTeacherLevel() {
		return teacherLevel;
	}

	public void setTeacherLevel(String teacherLevel) {
		this.teacherLevel = teacherLevel;
	}

	public String getTeacherDescription() {
		return teacherDescription;
	}

	public void setTeacherDescription(String teacherDescription) {
		this.teacherDescription = teacherDescription;
	}
}
