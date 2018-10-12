package me.Blen;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static Students student = new Students();
    static User user = new User();
    static ArrayList<Students> studentsList = new ArrayList<>();
    static ArrayList<Teachers> teachersList = new ArrayList<>();
    static ArrayList<Courses> coursesList = new ArrayList<>();


    public static void main(String[] args) {

        //prompting the user to make a choice of what he/she would like to do
        System.out.println(user.greeting());
//        user.setUserThirdChoice(scan.nextLine());

        do {
                userThirdChoiceMethod();
                if (user.getUserThirdChoice().equalsIgnoreCase("add")) {
                    System.out.println("Would you like to enter a teacher, a student, or a course today?");
                    String choice = scan.nextLine();

                    if (choice.equalsIgnoreCase("student")) {
                        studentAdd();
                        userSecondChoice();

                    } else if (choice.equalsIgnoreCase("teacher")) {
                        teacherAdd();
                        userSecondChoice();

                    } else if (choice.equalsIgnoreCase("course")) {
                        courseAdd();
                        userSecondChoice();
                    }

                } else if (user.getUserThirdChoice().equalsIgnoreCase("list")) {
                    System.out.println("Would you like to see the list of students, teachers, or courses. Type 'Students' for students, 'Teachers' for teachers, 'courses' for courses  ");
                    String listChoice = scan.nextLine();

                    if (listChoice.equalsIgnoreCase("students")) {
                        showListStud();
                        userSecondChoice();
                    } else if (listChoice.equalsIgnoreCase("teachers")) {
                        showListTeach();
                        userSecondChoice();
                    } else if (listChoice.equalsIgnoreCase("courses")) {
                        showListTeach();
                        userSecondChoice();
                    }
                }else{
                    System.out.println("You made wrong choice! Goodbye!");
                }
        }while(user.getUserChoice().equalsIgnoreCase("go"));
    }

    public static void studentAdd(){

        System.out.println("Please enter the id of the student");
        student.setId(scan.nextInt());
        scan.nextLine();

        System.out.println("Please enter the first name of the student");
        student.setFirstName(scan.nextLine());

        System.out.println("Please enter the last name of the student");
        student.setLastName(scan.nextLine());

        System.out.println("Please enter the email of the student");
        student.setEmail(scan.nextLine());

        studentsList.add(student);
    }

    public static void teacherAdd(){
        Teachers teacher = new Teachers();

        System.out.println("Please enter the id of the teacher");
        teacher.setId(scan.nextInt());
        scan.nextLine();

        System.out.println("Please enter the first name of the teacher");
        teacher.setFirstName(scan.nextLine());

        System.out.println("Please enter the last name of the teacher");
        teacher.setLastName(scan.nextLine());

        System.out.println("Please enter the email of the teacher");
        teacher.setEmail(scan.nextLine());

        teachersList.add(teacher);
    }

    public static void courseAdd(){
        Courses course = new Courses();

        System.out.println("Please enter the id of the course");
        course.setId(scan.nextInt());
        scan.nextLine();

        System.out.println("Please enter the  name of the course");
        course.setName(scan.nextLine());
        coursesList.add(course);
    }

    public static void showListStud(){
        for(Students eachStud : studentsList){
            System.out.println("Here is the list of students");
            System.out.println("Student's Id: " + eachStud.getId()+ " \nStudent's First Name: " + eachStud.getFirstName() + " \nStudent's Last Name: " + eachStud.getLastName()+
                    " \nStudent's Email: " + eachStud.getEmail());
        }
    }

    public static void showListTeach(){
        for(Teachers eachTeach : teachersList){
            System.out.println("Here is the list of teachers");
            System.out.println("Teacher's Id: " + eachTeach.getId()+ " \nTeacher's First Name: " + eachTeach.getFirstName() + " \nTeacher's Last Name: " + eachTeach.getLastName()+
                    " \nTeacher's Email: " + eachTeach.getEmail());        }
    }

    public static void showListCourse(){
        for(Courses eachCourse : coursesList){
            System.out.println("Here is the list of courses");
            System.out.println(" Course's Id: " + eachCourse.getId()+ " \nCourse's Name: " + eachCourse.getName());
        }
    }

    public static void  userSecondChoice(){
        System.out.println("Thank you! What would you like to do now? Enter go to do more actions or press any key to stop the program");
        String userSecChoice = scan.nextLine();
        user.setUserChoice(userSecChoice);


    }

    public static void userThirdChoiceMethod(){
        System.out.println(user.thirdChoice());
        String userThirdChoice = scan.nextLine();
        user.setUserThirdChoice(userThirdChoice);
    }


}
