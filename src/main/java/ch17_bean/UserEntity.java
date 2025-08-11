package ch17_bean;

import lombok.Getter;
/*
    정보를 담는 객체를 Entity class라고 합니다.
    -> 데이터베이스와 연결되는 클래스만 지칭하기 때문에
    특별한 지위에 있다고 할 수 있음.
        1열       2열         3열        4열        -> 세로줄(열/Column)
    +----------------------------------------+
    | username | password | email     | name |    -> 컬럼명 / Header
    ------------------------------------------
    |    1      | 1234    | a@test.com| 안근수|    -> 가로줄(행/Row)
    +----------------------------------------+
 */
@Getter
// @Entity -> 이건 springboot 설치 시에 사용됩니다.
public class UserEntity {
    private int username;
    private int password;
    private String email;
    private String name;

    // 알아서 method 정의하고
    // username / 1
    // password / 9876
    // email / a@test.com
    // name / 이름을 입력한 후에
    // toString()을 이용해서 콘솔에 다음과 같이 출력

    /*
        실행 예
        username : 1
        email : a@test.com
        name : 이름
        비밀번호는 보안 상 제공하지 않습니다.
     */

    public UserEntity() {
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public int getUsername() {
//            return username;
//    }
//
//    public int getPassword() {
//        return password;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getName() {
//        return name;
//    }

    @Override
    public String toString() {
        return "username : " + username +
                "\nemail : " + email +
                "\nname : " + name +
                "\n비밀번호는 보안 상 제공하지 않습니다.";
    }
}

