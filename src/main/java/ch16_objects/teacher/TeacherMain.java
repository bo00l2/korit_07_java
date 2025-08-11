package ch16_objects.teacher;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("안근수", "코리아아이티");
        Teacher teacher2 = new Teacher("안근수", "코리아아이티");

        System.out.println(teacher1);
        System.out.println(teacher2);

        boolean result1 = teacher1.equals(teacher2);
        System.out.println(result1);
        // 이상의 코드에서 중요한 점은 재정의 전과 후가 결과값이 다르다는 것이다.
        // Teacher에서 .equals()를 재정의하기 전에는 false가 떴다
        // 그때의 경우는 teacher1 과 teacher2의 주소지까지를 확인하여
        // 같은지 아닌지의 여부를 판단했다면,
        // 재정의 이후에는 field에 입력된 데이터가 동일한지만 체크하기 때문이다.

        Class tClass = teacher1.getClass(); // 지난 시간에 함
        System.out.println(tClass); // 결과값 : class ch16_objects.Teacher.Teacher
        System.out.println(tClass.getSimpleName());  // 결과값 : Teacher
        System.out.println(teacher1.getClass().getSimpleName());  // 결과값 : Teacher
        // 우리가 어느 수준까지 작성할지, 변수에 대입할지를 조직에 따라,
        // 성향에 따라 결정해야 한다..

        Field[] fields = tClass.getDeclaredFields();    //
        System.out.println(fields); // 주소지 출력됨
        for(int i=0; i<fields.length; i++){
            System.out.println("필드명 출력 : " + fields[i].getName());
            System.out.println("패키지명 + 클래스명 출력 : " + fields[i].getType());
            System.out.println("클래스명 출력 : " + fields[i].getType().getSimpleName());
        }

        // 동일한 방식으로 향상된 for문으로 작성하시오.
        for (Field field : fields){
            System.out.println("필드명 출력 : " + field.getName());
            System.out.println("패키지명 + 클래스명 출력 : " + field.getType());
            System.out.println("클래스명 출력 : " + field.getType().getSimpleName());
        }

        Method[] methods = tClass.getDeclaredMethods();
        for(int i=0; i<methods.length; i++){
            System.out.println("메서드 명 출력 : " + methods[i].getName());
            System.out.println("리턴 타입 출력 : " + methods[i].getReturnType() + "\n");
        }

        ch16_objects.Teacher teacher3 = new ch16_objects.Teacher("안근수", "코리아아이티");

        boolean result2 = teacher1.equals(teacher3);
        System.out.println(result2);    // 결과값 : false

//        System.out.println(teacher3 instanceof Teacher);  // 오류 발생
//         teacher3의 자료형은 ch16_objects.Teacher이지
        // ch16_objects.teacher.Teacher가 아니다.
    }
}
