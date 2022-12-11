    public void VittoriaAiVantaggi() {
        game.puntoPer("Pippo");game.puntoPer("Pippo");game.puntoPer("Pippo");game.puntoPer("Pippo");
        game.puntoPer("Pluto");game.puntoPer("Pluto");game.puntoPer("Pluto");game.puntoPer("Pluto");
        game.puntoPer("Pippo");
        assertEquals(game.getPunteggio(), "vantaggio Pippo");
        game.puntoPer("Pippo");
        assertEquals(game.getPunteggio(), "vittoria Pippo");
    }
