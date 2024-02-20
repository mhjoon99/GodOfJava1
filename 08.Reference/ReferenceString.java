public class ReferenceString {
    String instanceVariable;    // 인스턴스 변수
    // 생성자 영역
    public ReferenceString() {}
    public ReferenceString(String arg) {}

    // 메소드 영역
    public static void main(String[] args) {
        ReferenceString reference = new ReferenceString();
    }
    public String getString(){
        return instanceVariable;
    }
    public void setString(String str){
        instanceVariable=str;
    }
}
