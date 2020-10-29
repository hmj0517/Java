package com.hmj.course.bean;

public class Person {
 
//	定义属性
    private Integer id;    //人员编号
    private String personName;   //人员姓名
    private String personSex;  //人员性别
    private Integer personAge;  // 人员年龄
    private String personTel;  //人员手机号
    private String personEmail;   //人员邮箱
    
//构造函数
	public Person() {
		//无参构造函数
	}

//全参构造函数
	public Person(Integer id, String personName, String personSex, Integer personAge, String personTel,
			String personEmail) {
		super();
		this.id = id;
		this.personName = personName;
		this.personSex = personSex;
		this.personAge = personAge;
		this.personTel = personTel;
		this.personEmail = personEmail;
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonSex() {
		return personSex;
	}

	public void setPersonSex(String personSex) {
		this.personSex = personSex;
	}

	public Integer getPersonAge() {
		return personAge;
	}

	public void setPersonAge(Integer personAge) {
		this.personAge = personAge;
	}

	public String getPersonTel() {
		return personTel;
	}

	public void setPersonTel(String personTel) {
		this.personTel = personTel;
	}

	public String getPersonEmail() {
		return personEmail;
	}

	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
	}
}
