package com.hmj.course.bean;

public class Person {
 
//	��������
    private Integer id;    //��Ա���
    private String personName;   //��Ա����
    private String personSex;  //��Ա�Ա�
    private Integer personAge;  // ��Ա����
    private String personTel;  //��Ա�ֻ���
    private String personEmail;   //��Ա����
    
//���캯��
	public Person() {
		//�޲ι��캯��
	}

//ȫ�ι��캯��
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
