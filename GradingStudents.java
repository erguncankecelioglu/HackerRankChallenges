//https://www.hackerrank.com/challenges/grading/problem

import java.util.List;

public class GradingStudents{
        public static List<Integer> gradingStudents(List<Integer> grades) {
                for (int i = 0; i < grades.size(); i++) {
                        if(grades.get(i)>=38){
                                if (grades.get(i)%5!=0){
                                        if((grades.get(i)+1)%5==0){
                                                grades.set(i, grades.get(i) + 1);
                                        }
                                        else if((grades.get(i)+2)%5==0){
                                                grades.set(i, grades.get(i) + 2);
                                        }
                                }
                        }
                }
                return grades;

        }
}
