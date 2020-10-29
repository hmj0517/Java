package com.hmj.course.bean;

public class Teacher extends Person {
	// 定义属性
	private Course teachingCourse;     // 所授课程
	private String teacherLevel;           // 教师级别
	private String teacherDescription;  // 教师介绍

	public Teacher() {
		// 调用父类无参构造函数
		super();
	}

	public Teacher(Integer id, String personName, String personSex, Integer personAge, String personTel,
			String personEmail,Course teachingCourse, String teacherLevel,String teacherDescription) {
		// 调用父类全参构造函数
		super(id, personName, personSex, personAge, personTel, personEmail);
		// 为自己的属性赋值
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
