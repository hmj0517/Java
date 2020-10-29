package com.hmj.course.bean;

import java.time.LocalTime;

//课程（编号、课程名称、上课地点、时间、授课教师、……）

public class Course {
	//定义属性
    private Integer id;  //课程ID
    private String courseName;  //课程名称
    private String courseLocation;  //授课地点
    private String courseTime;   //授课时间
    private Teacher teacher;  // 授课教师
    private String courseDescription;   //课程介绍
    
	public Course() {
		//无参构造
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
	        return "课程ID:" + this.getId() + ",课程名称:" + this.getCourseName() + ",授课地点:" + this.getCourseLocation() + ",授课教师:" + this.getTeacher().getPersonName() + ",授课时间:" + this.getCourseTime() + ",课程介绍:" + this.courseDescription;
	    }
}
