package com.imooc;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestStudent {
	 static List<Student> StudentList=new LinkedList<Student>();
     public static void main(String[] args) {
		System.out.println("***��·ɻ�ӭ������ѧ������ϵͳ****");
		String password="666666";
		System.out.println("����һ�������");
		Scanner Q=new Scanner(System.in);
		String pw1=Q.nextLine();
		if(pw1.equals(password)) {
			Qi();
			}else {
			System.out.println("������������Ǵ�ģ�����һ����");
			}
	private static void Qi() {
		 System.out.println("1:����ѧ��    2��ɾ��ѧ��         3���޸�    4����ѯ ");
		 Scanner qq=new Scanner(System.in);
		 int qi=qq.nextInt();
		 switch(qi){
		 case 1:
			 System.out.println("������ѧ��������");
			 Scanner na=new Scanner(System.in);
			 System.out.println("������ѧ��ѧ�ţ�");
			 Scanner nc=new Scanner(System.in);
			 System.out.println("������ѧ���ɼ���");
			 Scanner nd=new Scanner(System.in);
			 int gread=nd.nextInt();
			  StudentList.add(new Student(name,studentID,grader));
			  System.out.println("���Ѿ������");
			  Qi();
		 case 2:
			 System.out.println("���������Ҫɾ����ѧ����ID");
			 Scanner si=new Scanner(System.in);
			 String studentID=si.nextLine();
			 boolean isfind=false;
			 for(int i=0;i<StudentList.size();i++) {
				 if(studentID.equals(StudentList.get(i).getStudentId())) {
					 System.out.println("�����˸�����ɾ��");
					 StudentList.remove(i);
					 System.out.println("ɾ���ɹ�����");
					 isfind=true;
				 }
			 }
			 if(!isfind) {
				 System.out.println("�Ҳ�������λ��");
				 isfind=true;
				 
			 }
			 Qi();
			 break;
		 case 3:
			 System.out.println("�������Ҫ�޸ĵ�ѧ��ID");
			 Scanner QS=new Scanner(System.in);
			 String studentsID=QS.nextLine();
			 boolean issfind=false;
			 for(int j=0;j<StudentList.size();j++) {
			 if(studentsID.equals(StudentList.get(j).getStudentId())) {
				 System.out.println("�����˸������޸�");
				 Scanner gr=new Scanner(System.in);
				 int gr1=gr.nextInt();
				 StudentList.get(j).setGrade(gr1);
				 System.out.println("�޸ĳɹ�������");
				 isfind=true;
			 
		 }else {
			 
		 }
			 if(!isfind) {
				 System.out.println("û���ҵ�");
			 }
			 Qi();
			 break;}
			 case 4:
				 System.out.println("��Ҫ��ѯ��ID");
				 Scanner id=new Scanner(System.in);
				 String cstuID=id.nextLine();
				 boolean iisfind=false;
				 for(int j=0;j<StudentList.size();j++) {
					 if(studentsID.equals(StudentList.get(j).getStudentId())) {
						 System.out.println("ѧ��\t"+ "  �Ա� \t "+  " ѧ�� \t "+"  ����\t");
						 for(int i=0;i<StudentList.size();i++) {
							 Student s=StudentList.get(i);
							 System.out.println(s.getName()+"+"+s.getgender());
							 isfind=true;
						 } 
						 
						 
					 }
					 if(!isfind) {
						 System.out.println("û���ҵ�");
					 }
					 Qi();
					 break;}
					 case 5:
						 System.out.println("����ѧ��"+StudentList.size());
						 System.out.println("ѧ��\t"+ "  �Ա� \t "+  " ѧ�� \t "+"  ����\t");
						 for(int i=0;i<StudentList.size();i++) {
							 Student is=StudentList.get(i);
							 System.out.println(is.getName()+"+"+is.getgender());
				 
			 }
				Qi();
				break;
	}
	}
