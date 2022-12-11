Sostituite nel file GameTest.java la classe GameTest con questa:

public class GameTest {

    Game game;

    @BeforeEach
    public void perTuttiITest() {
        game = new Game("Pippo", "Pluto");
    }

}

Viene segnalato un errore, che dovete risolverlo. 
Basta 1 click


