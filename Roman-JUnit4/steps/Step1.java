Sostituite nel file RomanizzazioneTest.java la classe GameTest con questa:

public class RomanizzazioneTest {
    
    //Step 1
    @Test
    public void test1() {
        System.out.println("T: 1");
        int n = 1;
        String expResult = "I";
        String result = Romanizzazione.romanizza(n);
        assertEquals(expResult, result);
    }
  
        
        
}


Alt+[F6] dovrebbe dare BUILD FAILED. Risolvete il problema fino ad ottenere un errore di initalizationError e quindi rendete il test verde.

