package staattinen;


public class Staattinen {

    
    public static void main(String[] args) {
        // Molemmat metodit voi ajaa tästä staattisesta main metodista
        // metodi staattinen() toimii suoraan näin:
        staattinen();
        
        // Staattinen tarkoittaa (one instance of)
        // Koska ajava ohjelma "public STATIC void main(String[] args) on staattinen voidaan ajaa vaan staattista tavaraa täällä
        
        // Jos taas halutaan ajaa eiStaattinen() metodi joka ei siis ole staattinen joudutaan tekemään näin:
        Staattinen stat = new Staattinen();
        stat.eiStaattinen();
        
        // Ei staattinen metodi vaatii uuden objektin luokasta jossa se sijaitsee, jotta sitä voidaan kutsua
        // tässä tapauksessa tämä pääluokka nimeltä Staattinen
        
    }
    
    public void eiStaattinen() {
        System.out.println("En ole staattinen...");
    }
    
    public static void staattinen() {
        System.out.println("Olen staattinen.");
    }
    
}
