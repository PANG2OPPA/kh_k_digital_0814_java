package 인터페이스기본;

public interface NetworkAdapter {
    void connect(); // 자동으로 public abstract 포함됨

    void send(String msg);
}
// 유선 인터넷
class LAN implements NetworkAdapter {
    String company;
    LAN(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + " LAN에 연결되었습니다.");
    }

    @Override
    public void send(String msg) {

    }
}

class WiFi implements NetworkAdapter {
    String company;
    WiFi(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + "WiFi에 연결되었습니다.");

    }

    @Override
    public void send(String msg) {

    }
}

class FiveG implements NetworkAdapter {
    String company;
    FiveG(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + "5G에 연결되었습니다.");

    }

    @Override
    public void send(String msg) {

    }
}