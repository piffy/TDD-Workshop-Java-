
    @Test
    public void quindiciDeveEssereIlDescrittorePerIlPunteggio1() {
        game.puntoPer("Pluto");
        assertEquals("zero, quindici", game.getPunteggio());
    }
