Create TieBreak, una classe derivata di Game

Quindi create il relativo test tramite il comando (oramai dovreste sapere come si fa, ad ogni modo)
	NETBEANS:
	Click destro su TieBreak.java
	Tools > Create/Update Test 
	Click su [x] Public methods > [OK] > Junit 4.x > [Select]

        
	Click destro su Game.java
	Tools > Create/Update Test 
	Click su [x] Public methods > [OK] > Junit 4.x > [Select]
	
	IDEA:
	Click destro sul nome del progetto > New > Directory    e chiamatela test 
	Click destro su directory test > Mark directory as      Test sources Root
	Nel file TieBreak.java Click destro sulla PAROLA TieBreak  e premere [Alt]-[Invio] > Create test	

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




