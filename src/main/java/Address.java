public class Address {

    private String StreetName;
    private String DoorNo;
    private String PostalCode;

    public Address(String StreetName, String DoorNo, String PostalCode)
    {
        this.StreetName=StreetName;
        this.DoorNo=DoorNo;
        this.PostalCode=PostalCode;

    }

    public String getStreetname(){
        return StreetName;
    }
    public void setStreetname(String StreetName) {
        this.StreetName=StreetName;
    }

    public String getDoorno(){
        return DoorNo;
    }
    public void setDoorno(String DoorNo){
        this.DoorNo=DoorNo;
    }

    public String getPostalcode(){
        return PostalCode;
    }
    public void setPostalcode(String PostalCode) {
        this.PostalCode=PostalCode;
    }
}