@Test
    public void VinciConAlmeno7puntieDueDiVantaggio() {
        tieBreak.puntoPer("Pippo");tieBreak.puntoPer("Pippo");tieBreak.puntoPer("Pippo");
        tieBreak.puntoPer("Pippo");tieBreak.puntoPer("Pippo");tieBreak.puntoPer("Pippo");
        assertEquals(tieBreak.getPunteggio(), "6, 0");
        tieBreak.puntoPer("Pippo");
        assertEquals(tieBreak.getPunteggio(), "vince Pippo");
        tieBreak.puntoPer("Pluto");tieBreak.puntoPer("Pluto");tieBreak.puntoPer("Pluto");
        tieBreak.puntoPer("Pluto");tieBreak.puntoPer("Pluto");tieBreak.puntoPer("Pluto");
        assertEquals(tieBreak.getPunteggio(), "7, 6");
    }


