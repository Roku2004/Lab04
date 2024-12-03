package aims.media;

public class DigitalVideoDisc extends Media {
    private String director;
    private int length;
    private Media media;
    public DigitalVideoDisc(){
        
    }

    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, director, length);
    }

    
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost, "", 0);
    }

    // Constructor với 1 tham số: title
    public DigitalVideoDisc(String title) {
        super(title, "", 0, "", 0); 
    }
    
    
}
