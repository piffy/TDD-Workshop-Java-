
    @Test
    public void paritàDeveEssereIlDescrittorePerIlPunteggioQuandoEntrmbiHannoFatto3PuntiEIPunteggiSonoUguali() {
        game.puntoPer("Pippo");game.puntoPer("Pippo");game.puntoPer("Pippo");
        game.puntoPer("Pluto");game.puntoPer("Pluto");game.puntoPer("Pluto");
        assertEquals(game.getPunteggio(), "parità");
        game.puntoPer("Pippo");
        assertFalse(game.getPunteggio().equals("parità"));
        game.puntoPer("Pluto");
        assertEquals(game.getPunteggio(), "parità");
    }

