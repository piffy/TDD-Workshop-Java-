    //Step 13 
    @Test
    public void testOutOfRange() {
        System.out.print("T: Zero ");
        assertEquals("", Romanizzazione.romanizza(0));
        System.out.print(" negativi ");
        assertEquals("", Romanizzazione.romanizza(-5));  
        System.out.println("eccessivi ");
        assertEquals("", Romanizzazione.romanizza(6788));  
    } 



