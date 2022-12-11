    //Step 12 
    @Test
    public void testMigliaia() {
        System.out.print("T: 2000 ");
        assertEquals("MM", Romanizzazione.romanizza(2000));
        System.out.print("3416 ");
        assertEquals("MMMCDXVI", Romanizzazione.romanizza(3416));
        System.out.print("4999 ");
        assertEquals("MMMMCMXCIX", Romanizzazione.romanizza(4999));          
    }
    
