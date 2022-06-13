import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    
    Printer printer;
    
    @Before
    public void before(){
        printer = new Printer (12);
    }
    
    @Test
    public void hasSheetsLeft(){
        assertEquals(12, printer.getSheetsLeft());
    }
    
    @Test
    public void canPrint(){
        assertEquals(true, printer.print(6, 1));
    }
    
    @Test
    public void canReducePaper(){
        printer.print(5, 2);
        assertEquals(2, printer.getSheetsLeft());
    }
}
