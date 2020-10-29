## 计G201 贺梦杰 2020322077
## 一、实验目的
1. 初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法
2. 掌握面向对象的类设计方法（属性、方法）
3. 掌握类的继承用法，通过构造方法实例化对象
4. 学会使用super()，用于实例化子类
5. 掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 二、实验要求
1. 编写上述实体类以及测试主类（注意类之间继承关系的适用）
2. 在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。
## 三、实验过程
1. 创建Person类，描述人员信息，其中包括人员编号、姓名、性别、年龄、手机号、邮箱等属性，并创建其无/全参构造函数以及get/set方法
2. 创建Course类，描述课程信息，其中包括课程编号、名称、授课地点、授课时间、授课教师、课程介绍等属性，创建其无/全参构造函数以及get/set方法，并重写toString方法
3. 创建Student类，继承Person类，用于描述学生信息，其中包括所选课程、入学时间等属性，并创建其无/全参构造函数以及get/set方法
4. 创建Teacher类，继承Person类，用于描述教师信息，其中包括所授课程、教师级别、教师介绍等属性，并创建其无/全参构造函数以及get/set方法
5. 完善Course类，增加授课教师属性，并完善构造方法、get/set方法
6. 创建Main类，并添加主函数，开始模拟选课流程
7. 无参构造实例化数学和英语课程，并使用set方法赋值
8. 无参构造实例化张三和李四教师，并使用set方法赋值
9. 完成教师和课程的双向绑定，令张三教数学、李四教英语
10. 全参构造实例化小明和小红学生对象
11. 执行学生选课流程，令小明选数学、小丽选英语，并调用toString()打印课程信息
12. 退课，再次打印课程信息
## 四、核心代码
```
   /*-------------------------------学生选课-------------------------------*/
		// 小明选数学
		xiaoMingStu.setSelectedCourse(mathCourse);
		System.out.println("小明选课 --> " + xiaoMingStu.getSelectedCourse().getCourseName());
		// 小丽选英语
		xiaoLiStu.setSelectedCourse(englishCourse);
		System.out.println("小丽选课 --> " + xiaoLiStu.getSelectedCourse().getCourseName());
		// 打印课程信息
		System.out.println("小明选课信息 --> " + xiaoMingStu.getSelectedCourse());
		System.out.println("小丽选课信息 --> " + xiaoLiStu.getSelectedCourse()); 
```
```
   /*-------------------------------学生退课-------------------------------*/
    System.out.println("小明退课 --> " + xiaoMingStu.getSelectedCourse().getCourseName());
    xiaoMingStu.setSelectedCourse(null);
    System.out.println("小丽退课 --> " + xiaoLiStu.getSelectedCourse().getCourseName());
    xiaoLiStu.setSelectedCourse(null);
    //打印课程信息
    System.out.println("小明选课信息 --> " + xiaoMingStu.getSelectedCourse());
    System.out.println("小丽选课信息 --> " + xiaoLiStu.getSelectedCourse());
```
## 五、系统运行截图
![RUNOOB 图标](https://mail.qq.com/cgi-bin/read_note?sid=EfznNw1t9ex2AHUq&catid=0&noteid=_5) 
## 六、编程感想
通过本次实验，我学会定义类中的属性以及方法、基本掌握类的继承的使用，同时基本了解了super()和super(args...)的使用。
   
