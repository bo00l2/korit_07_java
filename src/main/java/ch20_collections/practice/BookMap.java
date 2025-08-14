package ch20_collections.practice;

import java.util.*;

/*
    서점에서판매하는 책 재고를 관리하는 프로그램
    지시 사항
    1. Map을 사용하여 도서명(String)을 key로, 재고를 Integer로 하여 value로 사용
    2. 사용자로부터 새 도서명과 수량을 입력 받아서 Map에 추가
        - 이미 존재하는 도서라면 "이미 재고에 있는 도서입니다." 출력 (contains()) -> 새로운 List 생성해야함.
    3. 사용자로부터 수량을 변경할 도서명과 새로운 재고 수량을 입력 받아 Map의 값을 '수정'
        - 존재하지 않는 도서라면 "해당 도서가 재고에 없습니다." 출력
    4. Map에 있는 모든 도서명과 재고 수량을 출력하도록 작성

    실행 예
    --- 도서 재고 관리 프로그램 ---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>> 1
    새 도서명을 입력하세요 >>> 자바의 정석
    재고 수량을 입력하세요 >>>
    자바의 정석 도서가 10 권 추가되었습니다.

    --- 도서 재고 관리 프로그램 ---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>>
    재고를 변경할 도서명을 입력하세요 >>> 자바의 정석
    새로운 재고 수량을 입력하세요 >>> 9
    자바의 정석 도서가 9 권으로 변경되었습니다.

    --- 도서 재고 관리 프로그램 ---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>> 3
    --- 전체 재고 목록 ---
    도서명 : 자바의 정석, 재고 수량 : 9 권

    --- 도서 재고 관리 프로그램 ---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>> 4
    프로그램을 종료합니다.
 */
public class BookMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> BookInventory = new HashMap<>();
        boolean endOfProgram = false;
        boolean continuing = true;


        while (continuing){
            System.out.println("--- 도서 추가 관리 프로그램 ---");
            System.out.println("1. 도서 추가\n2. 재고 수정\n3. 재고 목록\n4. 종료");
            System.out.print("메뉴를 선택하세요 >>> ");
            String select = "";
            select = scanner.nextLine();

            String bookName="";
            int bookNum=0;
            switch (select){
                case "1" :
                    System.out.print("새 도서명을 입력하세요 >>> ");
                    bookName = scanner.nextLine();
                    if(BookInventory.containsKey(bookName)){
                        System.out.println("이미 재고에 있는 도서입니다.");
                        break;
                    }
                    System.out.print("재고 수량을 입력하세요 >>> ");
                    bookNum = scanner.nextInt();
                    scanner.nextLine();
                    BookInventory.put(bookName, bookNum);   // 입력한 도서, 재고 추가
                    System.out.println(bookName + " 도서가 " + bookNum + " 권 추가되었습니다.");
                    break;
                case "2" :
                    System.out.print("재고를 변경할 도서명을 입력하세요 >>> ");
                    bookName = scanner.nextLine();
                    System.out.print("새로운 재고 수량을 입력하세요 >>> ");
                    bookNum = scanner.nextInt();
                    scanner.nextLine();
                    BookInventory.replace(bookName, bookNum);   // 재고 변경
                    System.out.println(bookName + " 도서가 " + bookNum + " 권으로 변경되었습니다.");
                    break;
                case "3" :
                    System.out.println("--- 현재 재고 목록 ---");
                    Set<String> keySet = BookInventory.keySet();    // 키값만 검색하는 새로운 keySet 생성
                    List<String> keyList = new ArrayList<>();       // 키값만 넣을 빈 리스트 생성
                    keyList.addAll(keySet);     // Set을 List로 변경
                    for (String key : keySet){
                        System.out.println("도서명 : " + key + ", 현재 재고 : " + BookInventory.get(key));
                    }
                    break;
                case "4" :
                    System.out.println("프로그램을 종료합니다.");
                    continuing = false;
                    break;
            }
        }
    }
}
