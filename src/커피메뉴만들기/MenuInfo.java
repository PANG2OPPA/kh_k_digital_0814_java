package 커피메뉴만들기;

public class MenuInfo {
    String name; // 메뉴명
    int price; // 가격
    String category; // 분류
    String descrition; // 메뉴에 대한 설명

    public MenuInfo(String name, int price, String category, String descrition) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.descrition = descrition;
    }
}
