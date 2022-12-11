    //Step 8 
    @Test
    public void testDecine() {
        System.out.print("T: 20 ");
        assertEquals("XX", Romanizzazione.romanizza(20));
        System.out.print("30 ");
        assertEquals("XXX", Romanizzazione.romanizza(30));
        System.out.print("60 ");
        assertEquals("LX", Romanizzazione.romanizza(60));        
        System.out.println("70 ");
        assertEquals("LXX", Romanizzazione.romanizza(70));  
    }
