import javax.management.modelmbean.ModelMBeanNotificationBroadcaster;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    public MemberDTO() {
        // 아무 정보도 모를 때
    }
    public MemberDTO(String name) {
        // 이름만 알 때
        this.name = name;
    }
    public MemberDTO(String name, String phone) {
        // 이름, 핸드폰번호만 알 때
        this.name = name;
        this.phone = phone;
    }
    public MemberDTO(String name, String phone, String email) {
        // 모든 정보를 알 때
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}
class ReferenceConstructor {
    public static void main(String[] args) {
        ReferenceConstructor reference = new ReferenceConstructor();
    }
    public void makeMemberObject() {
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("Sangmin");
        MemberDTO dto3 = new MemberDTO("Sangmin", "010XXXXYYYY");
        MemberDTO dto4 = new MemberDTO("Sangmin", "010XXXXYYYY", "god@godofjava.com");
    }
}