package prototype;

public class Main {
    public static void main(String[] args){
        Autobuz autobuz1 = new Autobuz("324","mihai");
        Tranvai tranvai1 = new Tranvai("3854","andrei");
        try{
            MijlocTransport autobuz2 = autobuz1.copiaza();
            MijlocTransport tranvai2 = tranvai1.copiaza();
            System.out.println("Original"+ autobuz1);
            System.out.println("Copie"+autobuz2);
            System.out.println("Original"+tranvai1);
            System.out.println("Copie"+tranvai2);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
