package com.imooc;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestStudent {
	 static List<Student> StudentList=new LinkedList<Student>();
     public static void main(String[] args) {
		System.out.println("***祁德飞欢迎你来到学生管理系统****");
		String password="666666";
		System.out.println("输入一下密码吧");
		Scanner Q=new Scanner(System.in);
		String pw1=Q.nextLine();
		if(pw1.equals(password)) {
			Qi();
			}else {
			System.out.println("你输入的密码是错的，再输一次呗");
			}
	private static void Qi() {
		 System.out.println("1:增加学生    2：删除学生         3：修改    4：查询 ");
		 Scanner qq=new Scanner(System.in);
		 int qi=qq.nextInt();
		 switch(qi){
		 case 1:
			 System.out.println("请输入学生姓名：");
			 Scanner na=new Scanner(System.in);
			 System.out.println("请输入学生学号：");
			 Scanner nc=new Scanner(System.in);
			 System.out.println("请输入学生成绩：");
			 Scanner nd=new Scanner(System.in);
			 int gread=nd.nextInt();
			  StudentList.add(new Student(name,studentID,grader));
			  System.out.println("你已经添加了");
			  Qi();
		 case 2:
			 System.out.println("请告诉我需要删除的学生的ID");
			 Scanner si=new Scanner(System.in);
			 String studentID=si.nextLine();
			 boolean isfind=false;
			 for(int i=0;i<StudentList.size();i++) {
				 if(studentID.equals(StudentList.get(i).getStudentId())) {
					 System.out.println("发现了该生，删除");
					 StudentList.remove(i);
					 System.out.println("删除成功！！");
					 isfind=true;
				 }
			 }
			 if(!isfind) {
				 System.out.println("找不到所在位置");
				 isfind=true;
				 
			 }
			 Qi();
			 break;
		 case 3:
			 System.out.println("请告诉需要修改的学生ID");
			 Scanner QS=new Scanner(System.in);
			 String studentsID=QS.nextLine();
			 boolean issfind=false;
			 for(int j=0;j<StudentList.size();j++) {
			 if(studentsID.equals(StudentList.get(j).getStudentId())) {
				 System.out.println("发现了该生，修改");
				 Scanner gr=new Scanner(System.in);
				 int gr1=gr.nextInt();
				 StudentList.get(j).setGrade(gr1);
				 System.out.println("修改成功！！！");
				 isfind=true;
			 
		 }else {
			 
		 }
			 if(!isfind) {
				 System.out.println("没有找到");
			 }
			 Qi();
			 break;}
			 case 4:
				 System.out.println("需要查询的ID");
				 Scanner id=new Scanner(System.in);
				 String cstuID=id.nextLine();
				 boolean iisfind=false;
				 for(int j=0;j<StudentList.size();j++) {
					 if(studentsID.equals(StudentList.get(j).getStudentId())) {
						 System.out.println("学号\t"+ "  性别 \t "+  " 学号 \t "+"  年龄\t");
						 for(int i=0;i<StudentList.size();i++) {
							 Student s=StudentList.get(i);
							 System.out.println(s.getName()+"+"+s.getgender());
							 isfind=true;
						 } 
						 
						 
					 }
					 if(!isfind) {
						 System.out.println("没有找到");
					 }
					 Qi();
					 break;}
					 case 5:
						 System.out.println("共有学生"+StudentList.size());
						 System.out.println("学号\t"+ "  性别 \t "+  " 学号 \t "+"  年龄\t");
						 for(int i=0;i<StudentList.size();i++) {
							 Student is=StudentList.get(i);
							 System.out.println(is.getName()+"+"+is.getgender());
				 
			 }
				Qi();
				break;
	}
	}
