package com.hmj.course;

import com.hmj.course.bean.Course;
import com.hmj.course.bean.Student;
import com.hmj.course.bean.Teacher;


public class Main {
	public static void main(String[] args) {
		// 实例化课程对象
		// 数学课程(使用无参构造实例化)
		Course mathCourse = new Course();
		mathCourse.setId(2001);
		mathCourse.setCourseName("高等数学");
		mathCourse.setCourseLocation("1号楼101教室");
		mathCourse.setCourseTime("9:00-12:00");
		mathCourse.setCourseDescription("高等数学是比普通数学高一等的数学");
		// 英语课程(使用无参构造实例化)
		Course englishCourse = new Course();
		englishCourse.setId(2002);
		englishCourse.setCourseName("大学英语");
		englishCourse.setCourseLocation("2号楼202教室");
		englishCourse.setCourseTime("14:00-18:00");
		englishCourse.setCourseDescription("大学英语是大学的时候学习的英语");
		// 实例化教师对象
		// 张三(使用无参构造实例化)
		Teacher zhangSanTeacher = new Teacher();
		zhangSanTeacher.setId(3001);
		zhangSanTeacher.setPersonName("张三");
		zhangSanTeacher.setPersonSex("男");
		zhangSanTeacher.setPersonAge(32);
		zhangSanTeacher.setPersonTel("13300010123");
		zhangSanTeacher.setPersonEmail("123@qq.com");
		zhangSanTeacher.setTeacherLevel("高级教授");
		zhangSanTeacher.setTeacherDescription("这个老师特别厉害");
		// 李四(使用无参构造实例化)
		Teacher liSiTeacher = new Teacher();
		liSiTeacher.setId(3002);
		liSiTeacher.setPersonName("李四");
		liSiTeacher.setPersonSex("女");
		liSiTeacher.setPersonAge(33);
		liSiTeacher.setPersonTel("13311123456");
		liSiTeacher.setPersonEmail("456@qq.com");
		liSiTeacher.setTeacherLevel("高级讲师");
		liSiTeacher.setTeacherDescription("这个老师也特别厉害");
		// 教师与课程相互绑定
		// 张三教数学,数学由张三教
		zhangSanTeacher.setTeachingCourse(mathCourse);
		mathCourse.setTeacher(zhangSanTeacher);
		// 李四教英语,英语由李四教
		liSiTeacher.setTeachingCourse(englishCourse);
		englishCourse.setTeacher(liSiTeacher);
		// 实例化学生对象
		// 小明(使用有参构造实例化)
		Student xiaoMingStu = new Student(5001, "小明", "男",18, "17611115500", "789@qq.com", null, "2020-09");
		// 小丽(使用有参构造实例化)
		Student xiaoLiStu = new Student(5002, "小丽", "女",19 , "18622223300", "JQK@qq.com", null, "2019-09");
		// 学生选课
		// 小明选数学
		xiaoMingStu.setSelectedCourse(mathCourse);
		System.out.println("小明选课 --> " + xiaoMingStu.getSelectedCourse().getCourseName());
		// 小丽选英语
		xiaoLiStu.setSelectedCourse(englishCourse);
		System.out.println("小丽选课 --> " + xiaoLiStu.getSelectedCourse().getCourseName());
		// 打印课程信息
		System.out.println("小明选课信息 --> " + xiaoMingStu.getSelectedCourse());
		System.out.println("小丽选课信息 --> " + xiaoLiStu.getSelectedCourse());

		// 学生退课
		System.out.println("小明退课 --> " + xiaoMingStu.getSelectedCourse().getCourseName());
		xiaoMingStu.setSelectedCourse(null);
		System.out.println("小丽退课 --> " + xiaoLiStu.getSelectedCourse().getCourseName());
		xiaoLiStu.setSelectedCourse(null);

		// 打印课程信息
		System.out.println("小明选课信息 --> " + xiaoMingStu.getSelectedCourse());
		System.out.println("小丽选课信息 --> " + xiaoLiStu.getSelectedCourse());

	}
}
