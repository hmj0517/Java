package com.hmj.course;

import com.hmj.course.bean.Course;
import com.hmj.course.bean.Student;
import com.hmj.course.bean.Teacher;


public class Main {
	public static void main(String[] args) {
		// ʵ�����γ̶���
		// ��ѧ�γ�(ʹ���޲ι���ʵ����)
		Course mathCourse = new Course();
		mathCourse.setId(2001);
		mathCourse.setCourseName("�ߵ���ѧ");
		mathCourse.setCourseLocation("1��¥101����");
		mathCourse.setCourseTime("9:00-12:00");
		mathCourse.setCourseDescription("�ߵ���ѧ�Ǳ���ͨ��ѧ��һ�ȵ���ѧ");
		// Ӣ��γ�(ʹ���޲ι���ʵ����)
		Course englishCourse = new Course();
		englishCourse.setId(2002);
		englishCourse.setCourseName("��ѧӢ��");
		englishCourse.setCourseLocation("2��¥202����");
		englishCourse.setCourseTime("14:00-18:00");
		englishCourse.setCourseDescription("��ѧӢ���Ǵ�ѧ��ʱ��ѧϰ��Ӣ��");
		// ʵ������ʦ����
		// ����(ʹ���޲ι���ʵ����)
		Teacher zhangSanTeacher = new Teacher();
		zhangSanTeacher.setId(3001);
		zhangSanTeacher.setPersonName("����");
		zhangSanTeacher.setPersonSex("��");
		zhangSanTeacher.setPersonAge(32);
		zhangSanTeacher.setPersonTel("13300010123");
		zhangSanTeacher.setPersonEmail("123@qq.com");
		zhangSanTeacher.setTeacherLevel("�߼�����");
		zhangSanTeacher.setTeacherDescription("�����ʦ�ر�����");
		// ����(ʹ���޲ι���ʵ����)
		Teacher liSiTeacher = new Teacher();
		liSiTeacher.setId(3002);
		liSiTeacher.setPersonName("����");
		liSiTeacher.setPersonSex("Ů");
		liSiTeacher.setPersonAge(33);
		liSiTeacher.setPersonTel("13311123456");
		liSiTeacher.setPersonEmail("456@qq.com");
		liSiTeacher.setTeacherLevel("�߼���ʦ");
		liSiTeacher.setTeacherDescription("�����ʦҲ�ر�����");
		// ��ʦ��γ��໥��
		// ��������ѧ,��ѧ��������
		zhangSanTeacher.setTeachingCourse(mathCourse);
		mathCourse.setTeacher(zhangSanTeacher);
		// ���Ľ�Ӣ��,Ӣ�������Ľ�
		liSiTeacher.setTeachingCourse(englishCourse);
		englishCourse.setTeacher(liSiTeacher);
		// ʵ����ѧ������
		// С��(ʹ���вι���ʵ����)
		Student xiaoMingStu = new Student(5001, "С��", "��",18, "17611115500", "789@qq.com", null, "2020-09");
		// С��(ʹ���вι���ʵ����)
		Student xiaoLiStu = new Student(5002, "С��", "Ů",19 , "18622223300", "JQK@qq.com", null, "2019-09");
		// ѧ��ѡ��
		// С��ѡ��ѧ
		xiaoMingStu.setSelectedCourse(mathCourse);
		System.out.println("С��ѡ�� --> " + xiaoMingStu.getSelectedCourse().getCourseName());
		// С��ѡӢ��
		xiaoLiStu.setSelectedCourse(englishCourse);
		System.out.println("С��ѡ�� --> " + xiaoLiStu.getSelectedCourse().getCourseName());
		// ��ӡ�γ���Ϣ
		System.out.println("С��ѡ����Ϣ --> " + xiaoMingStu.getSelectedCourse());
		System.out.println("С��ѡ����Ϣ --> " + xiaoLiStu.getSelectedCourse());

		// ѧ���˿�
		System.out.println("С���˿� --> " + xiaoMingStu.getSelectedCourse().getCourseName());
		xiaoMingStu.setSelectedCourse(null);
		System.out.println("С���˿� --> " + xiaoLiStu.getSelectedCourse().getCourseName());
		xiaoLiStu.setSelectedCourse(null);

		// ��ӡ�γ���Ϣ
		System.out.println("С��ѡ����Ϣ --> " + xiaoMingStu.getSelectedCourse());
		System.out.println("С��ѡ����Ϣ --> " + xiaoLiStu.getSelectedCourse());

	}
}
