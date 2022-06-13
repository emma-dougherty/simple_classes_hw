public class Printer {
    private int sheetsLeft;
    
    public Printer(int sheetsLeft){
        this.sheetsLeft = sheetsLeft;
    }
    
    public int getSheetsLeft(){
        return this.sheetsLeft;
    }
    
    public boolean print(int numPages, int numCopies){
        int sheetsNeeded = numPages * numCopies;
        if(this.sheetsLeft >= sheetsNeeded){
            this.sheetsLeft =  this.sheetsLeft - sheetsNeeded;
            return true;
        } else {
            return false;
        }
    }
    
}
