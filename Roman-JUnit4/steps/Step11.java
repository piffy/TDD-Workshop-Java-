    //Step 11 
    @Test
    public void testCentinaia() {
        System.out.print("T: 200 ");
        assertEquals("CC", Romanizzazione.romanizza(200));
        System.out.print("316 ");
        assertEquals("CCCXVI", Romanizzazione.romanizza(316));
        System.out.print("804 ");
        assertEquals("DCCCIV", Romanizzazione.romanizza(804));        
        System.out.println("976");
        assertEquals("CMLXXVI", Romanizzazione.romanizza(976));  
    }
