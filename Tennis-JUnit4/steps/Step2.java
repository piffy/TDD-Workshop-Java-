Aggiungere in fondo a GameTest.java, prima dell'ultima graffa:

    @Test
    public void zeroDeveEssereLaDescrizionePerIlPunteggio0() {
        assertEquals(game.getPunteggio(), "zero, zero");
    }

Alt+F6 darà errore. Risolvete.
