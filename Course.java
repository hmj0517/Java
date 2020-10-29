package com.hmj.course.bean;

import java.time.LocalTime;

//�γ̣���š��γ����ơ��Ͽεص㡢ʱ�䡢�ڿν�ʦ��������

public class Course {
	//��������
    private Integer id;  //�γ�ID
    private String courseName;  //�γ�����
    private String courseLocation;  //�ڿεص�
    private String courseTime;   //�ڿ�ʱ��
    private Teacher teacher;  // �ڿν�ʦ
    private String courseDescription;   //�γ̽���
    
	public Course() {
		//�޲ι���
	}
	public Course(Integer id, String courseName, String courseLocation, String courseTime, Teacher teacher,
			String courseDescription) {
		this.id = id;
		this.courseName = courseName;
		this.courseLocation = courseLocation;
		this.courseTime = courseTime;
		this.teacher = teacher;
		this.courseDescription = courseDescription;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseLocation() {
		return courseLocation;
	}
	public void setCourseLocation(String courseLocation) {
		this.courseLocation = courseLocation;
	}
	public String getCourseTime() {
		return courseTime;
	}
	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	 @Override
	    public String toString() {
	        return "�γ�ID:" + this.getId() + ",�γ�����:" + this.getCourseName() + ",�ڿεص�:" + this.getCourseLocation() + ",�ڿν�ʦ:" + this.getTeacher().getPersonName() + ",�ڿ�ʱ��:" + this.getCourseTime() + ",�γ̽���:" + this.courseDescription;
	    }
}
