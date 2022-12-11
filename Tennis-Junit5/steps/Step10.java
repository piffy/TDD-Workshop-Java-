
@Test
    public void VittoriaSenzaVantaggi() {
        game.puntoPer("Pippo");game.puntoPer("Pippo");game.puntoPer("Pippo");game.puntoPer("Pippo");
        assertEquals(game.getPunteggio(), "Pippo vince");
    }
