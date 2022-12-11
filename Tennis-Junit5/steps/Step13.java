Create TieBreak, una classe derivata di Game

Quindi create il relativo test tramite il comando
	Click destro su TieBreak.java
	Tools > Create/Update Test 
	Click su [x] Public methods > [OK] > Junit 4.x > [Select]


SostituiteTieBreakTest con questo

public class TieBreakTest {
    
    TieBreak tieBreak;

    @Before
    public void perTuttiITest() {
        tieBreak = new TieBreak("Pippo", "Pluto");
    }
    
    @Test
    public void iPunteggiSonoNumerici() {
        assertEquals(tieBreak.getPunteggio(), "0, 0");
        tieBreak.puntoPer("Pippo");
        assertEquals(tieBreak.getPunteggio(), "1, 0");
    }

    
}




