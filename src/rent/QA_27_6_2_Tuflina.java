package rent;

public class QA_27_6_2_Tuflina {
    public static void main(String[] args) {
    Owner owner = new Owner(1,"+375 29 588 63 25", "Pavel");
    Client client = new Client(1,25,"Vladislav",true);

    FlatRent firstApartament = new FlatRent(210.5, 50,1);
    FlatRent secondApartament = new FlatRent(2,40,158.5,owner , client);

    client.presentInformationOfClient();
    owner.presentInformationOfOwner();

    firstApartament.rentFirstApartament();
    secondApartament.rentSecondApartament();

    }
}
