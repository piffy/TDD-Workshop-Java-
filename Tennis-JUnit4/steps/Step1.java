Sostituite nel file GameTest.java la classe GameTest con questa:

public class GameTest {

    Game game;

    @Before
    public void perTuttiITest() {
        game = new Game("Pippo", "Pluto");
    }

    

    
}

Alt+[F6] dovrebbe dare BUILD FAILED. Risolvete il problema fino ad ottenere un errore di initalizationError

