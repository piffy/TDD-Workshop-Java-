    //Step 6    
    @Test
    public void testSimboliBase() {
        System.out.print("10 ");
        assertEquals("X", Romanizzazione.romanizza(10));
        System.out.print("50 ");
        assertEquals("L", Romanizzazione.romanizza(50));
        System.out.print("100 ");
        assertEquals("C", Romanizzazione.romanizza(100));        
        System.out.print("500 ");
        assertEquals("D", Romanizzazione.romanizza(500));  
        System.out.println("1000");
        assertEquals("M", Romanizzazione.romanizza(1000));
    }
    
