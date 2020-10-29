package com.hmj.course.bean;

//学生（编号、姓名、性别、所选课程、……）
public class Student extends Person {
	// 定义属性
	private Course selectedCourse; // 所选课程
	private String beginDate; // 入学时间

	public Student() {
		// 调用父类无参构造函数
		super();
	}

	public Student(Integer id, String personName, String personSex, Integer personAge, String personTel,
			String personEmail, Course selectedCourse, String beginDate) {
		// 调用父类全参构造函数
		super(id, personName, personSex, personAge, personTel, personEmail);
		// 为自己的属性赋值
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
