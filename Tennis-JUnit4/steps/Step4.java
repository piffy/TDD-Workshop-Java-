
    @Test
    public void trentaDeveEssereIlDescrittorePerIlPunteggio2() {
        game.puntoPer("Pippo");
        game.puntoPer("Pippo");
        game.puntoPer("Pluto");
        assertEquals(game.getPunteggio(), "trenta, quindici");
    }

