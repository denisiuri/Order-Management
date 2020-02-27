package businessLayer;

public class Client {
    private int client_id;
    private String lastName;
    private String firstName;
    private String address;
    private String phone_no;

    public Client(int id, String last, String first, String ad, String no) {
        this.client_id = id;
        this.lastName = last;
        this.firstName = first;
        this.address = ad;
        this.phone_no = no;
    }

    public Client() {

    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }
}




