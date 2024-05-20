package rent;

public class Owner {
    private int id;
    private String phone;
    private String name;

    public Owner(int id, String phone, String name) {
        this.id = id;
        this.phone = phone;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void presentInformationOfOwner(){
        System.out.println("О владельце известно- его ID: " + id + ", его имя: " + name + " и его телефон: " + phone);
    }

}
