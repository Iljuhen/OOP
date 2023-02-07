package DZs.dz1;

public class Conservi extends Product {
    private String tara;
    private Float massa;

    public Conservi(int price, String name, double massa, String tara) {
        super(price, name);
        this.massa = (float) massa;
        this.tara = tara;
        
    }
    @Override
    public String toString() {
        
        return super.toString()+ ", " + "massa = " + massa + "kg," + " tara - " + tara;
    }
    
}

