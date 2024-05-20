package rent;

public class Client {
    private int id;
    private int age;
    private String name;
    private boolean registration;

    public Client(int id, int age, String name, boolean registration) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.registration = registration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRegistration() {
        return registration;
    }

    public void setRegistration(boolean registration) {
        this.registration = registration;
    }
    public void presentInformationOfClient(){
        System.out.println("О клиенте известно- его ID: " + id + ", его имя: " + name + ", его возраст: " + age+" и прописка: "+ registration);

    }
}
