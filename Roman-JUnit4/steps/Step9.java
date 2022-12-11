
    //Step 9 
    @Test
    public void testDecineAnomale() {
        System.out.print("T: 44 ");
        assertEquals("XLIV", Romanizzazione.romanizza(44));
        System.out.println("91 ");
        assertEquals("XCI", Romanizzazione.romanizza(91)); 
    }
