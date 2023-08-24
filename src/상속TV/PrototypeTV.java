package 상속TV;

public class PrototypeTV {
    boolean isPower;  // 전원에 대한 설정값 저장
    int channel;      // 채널에 대한 설정값을 저장하는 인스턴스 필드
    int volume;       // 볼륨에 대한 설정값을 저장하는 인스턴스 필드
    // 생성자가 하는 일은 객체가 생성될 때 필드에 초기값을 할당한 역할이다.
    public PrototypeTV() {
        this.isPower = false;
        this.channel = 10;
        this.volume = 10;
    }
    // 생성자 오버로딩 : 생성자를 매개변수의 갯수나 타입에 따라 다양하게 호출 하도록 함
    public PrototypeTV(boolean isPower, int channel, int volume) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }
    public void setChannel(int cnl) {
        if(cnl > 0 && cnl < 1000) {
            channel = cnl;
        } else System.out.println("채널 설정 범위가 아닙니다.");
    }
}
// ProtoTypeTV 클래스로부터 상속을 받아 ProductTV 클래스를 만듦
class productTV extends PrototypeTV{
    String name;
    boolean isInternet;
    productTV() {name = "Smart TV";}
    productTV(String name){
        isPower = false;
        channel = 10;
        volume = 10;
        isInternet = false;
        this.name = name;
    }
    void setPower(boolean isPower) {this.isPower = isPower;}
    void setVolum(int vol) {
        if(vol >= 0 && vol <= 100) {
            volume = vol;
        } else System.out.println("볼륨 설정 범위를 벗어났습니다.");
    }
    // 오버라이딩 :부모에게서 물려받은 기능을 재정의해서 사용하는 것
    @Override // 어노테이션 상속받았는지 확인해줌
    public void setChannel(int ch) {
        if(ch > 1 && ch < 2000){
            channel = ch;
            System.out.println("채널을" + channel + "변경 했습니다.");
        }else System.out.println("채널 설정범위를 벗어낫습니다.");
    }
    // 메소드 오버로딩 : 동일 이름의 메소드를 매개변수의 타입이나 개수로 구분하는 것
    public void setChannel(int ch, boolean isInternet){
        if(isInternet){
            System.out.println("인터넷 모드 입니다.");
            this.isInternet = true;
        }else {
            this.isInternet =false;
            if (ch > 1 && ch < 2000) {
                channel = ch;
                System.out.println("채널을" + channel + "변경 했습니다.");
            } else System.out.println("채널 설정범위를 벗어났습니다.");
        }
    }
    void viewTV() {
        System.out.println("이름 : " + name);
        System.out.println("전원 : " + isPower);
        System.out.println("채널 : " + channel);
        System.out.println("음량 : " + volume);
        System.out.println("인터넷모드 : " + isInternet);
    }
}