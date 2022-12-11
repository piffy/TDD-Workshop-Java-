
    @Test
    public void paritàDeveEssereIlDescrittorePerIlPunteggioQuandoEntrambiHannoFatto3Punti() {
        game.puntoPer("Pippo");game.puntoPer("Pippo");game.puntoPer("Pippo");
        game.puntoPer("Pluto");game.puntoPer("Pluto");game.puntoPer("Pluto");
        assertEquals(game.getPunteggio(), "parità");
    }

    

