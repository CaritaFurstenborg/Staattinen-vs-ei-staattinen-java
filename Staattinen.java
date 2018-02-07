package staattinen;


public class Staattinen {

    
    public static void main(String[] args) {
        // Molemmat metodit voi ajaa tästä staattisesta main metodista (luokan ainoa)
        // metodi staattinen() toimii suoraan näin koska tätä metodia on vain yksi luokassa jota on vain yksi:
        staattinen();
        
        // Staattinen tarkoittaa (one instance of), staatista objektia voi olla vain yksi ohjelmassa.
        // Koska ajava ohjelma "public STATIC void main(String[] args) on staattinen voidaan ajaa vaan staattista tavaraa täällä
        
        // Jos taas halutaan ajaa eiStaattinen() metodi joka ei siis ole staattinen, eli näitä voi olla monta ilmentymää,
        // joudutaan tekemään näin:
        Staattinen stat = new Staattinen();
        stat.eiStaattinen();
        
        // Ei staattinen metodi vaatii uuden objektin luokasta jossa se sijaitsee, jotta sitä voidaan kutsua. 
        // Näitä instanceja voi olla useampi joten täytyy määrittää mille niistä metodia kutsutaan.
        
    }
    
    public void eiStaattinen() {
        System.out.println("En ole staattinen...");
    }
    
    public static void staattinen() {
        System.out.println("Olen staattinen.");
    }
    
}
