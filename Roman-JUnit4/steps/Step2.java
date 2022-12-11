Aggiungere in fondo a RomanizzazioneTest.java, prima dell'ultima graffa:

    //Step 2
    @Test
        public void test23() {
        System.out.print("T: 2 ");
        assertEquals("II", Romanizzazione.romanizza(2));
        System.out.println("3");
        assertEquals("III", Romanizzazione.romanizza(3));
    }

Alt+F6 darà errore. Risolvete.
