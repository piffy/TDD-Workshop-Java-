
    @Test
    public void quarantaDeveEssereIlDescrittorePerIlPunteggio3() {
        game.puntoPer("Pippo");game.puntoPer("Pippo");game.puntoPer("Pippo");
        assertEquals(game.getPunteggio(), "quaranta, zero");
    }

   
