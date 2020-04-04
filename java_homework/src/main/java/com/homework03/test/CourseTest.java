package com.homework03.test;

import com.homework03.entity.Course;


public class CourseTest {
    private static void testNewStudent(){
        Course c1 = new Course("Java课程设计","2018001",true);
        System.out.print("课程名称：" +c1.getName());
        System.out.print(" 课程编号：" + c1.getNode());
        if(c1.getCourse()) {
            System.out.print(" 是必修课");
        }
        else {
            System.out.print(" 不是必修课");
        }

        c1.setName("Web开发技术");
        c1.setNode("2018002");
        c1.setCourse(false);
        System.out.print("\n"+ "课程名称：" +c1.getName());
        System.out.print(" 课程编号：" + c1.getNode());
        if(c1.getCourse()) {
            System.out.print(" 是必修课");
        }
        else {
            System.out.print(" 不是必修课");
        }

    }
    public static void main(String[] args) {
        CourseTest.testNewStudent();

    }

}
