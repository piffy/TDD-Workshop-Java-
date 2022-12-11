    @Test
    public void VinciConAlmeno7puntieDueDiVantaggio() {
        tieBreak.puntoPer("Pippo");tieBreak.puntoPer("Pippo");tieBreak.puntoPer("Pippo");
        tieBreak.puntoPer("Pippo");tieBreak.puntoPer("Pippo");tieBreak.puntoPer("Pippo");
        assertEquals( "6, 0",tieBreak.getPunteggio());
        tieBreak.puntoPer("Pippo");
        assertEquals( "Pippo vince",tieBreak.getPunteggio());
        tieBreak.puntoPer("Pluto");tieBreak.puntoPer("Pluto");tieBreak.puntoPer("Pluto");
        tieBreak.puntoPer("Pluto");tieBreak.puntoPer("Pluto");tieBreak.puntoPer("Pluto");
        assertEquals( "7, 6",tieBreak.getPunteggio());
    }




