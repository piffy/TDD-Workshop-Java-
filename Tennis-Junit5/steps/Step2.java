Aggiungere in fondo a GameTest.java, prima dell'ultima graffa:

    @Test
    public void zeroDeveEssereLaDescrizionePerIlPunteggio0() {
        assertEquals("zero, zero",game.getPunteggio());
    }


Run Gametest.java darà errore. Risolvete.
