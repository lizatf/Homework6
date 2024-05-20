package rent;

public class FlatRent {
    private int id;
    private int area;
    private double costOfRent;
    private Owner owner = new Owner(1,"+375 29 588 63 25", "Pavel") ;
    private Client client = new Client(1,25,"Vladislav",true);

    public FlatRent(double costOfRent, int area, int id) {
        this.costOfRent = costOfRent;
        this.area = area;
        this.id = id;
    }

    public FlatRent(int id, int area, double costOfRent, Owner owner , Client client) {
        this.id = id;
        this.area = area;
        this.costOfRent = costOfRent;
        this.owner = owner;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getCostOfRent() {
        return costOfRent;
    }

    public void setCostOfRent(double costOfRent) {
        this.costOfRent = costOfRent;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    public void rentFirstApartament(){
        System.out.println("Квартира номер 1 id: " +id + ", площадь: " +area +"m2" + ", стоимость за месяц: " +costOfRent +"$" + ", владелец: " + owner.getName() + ", прописан ли клиент в жилплощади: " + getClient().isRegistration() + " и его имя: " + client.getName());
    }
    public void rentSecondApartament(){
        System.out.println("Квартира номер 2 id: " +id + ", площадь: " +area +"m2" + ", стоимость за месяц: " +costOfRent +"$" + ", владелец: " + owner.getName() + ", прописан ли клиент в жилплощади: " + getClient().isRegistration() + " и его имя: " + client.getName());
    }
}
