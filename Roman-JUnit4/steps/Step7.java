    //Step 7 
    @Test
    public void testSimboliBaseComposti() {
        System.out.print("12 ");
        assertEquals("XII", Romanizzazione.romanizza(12));
        System.out.print("55 ");
        assertEquals("LV", Romanizzazione.romanizza(55));
        System.out.print("101 ");
        assertEquals("CI", Romanizzazione.romanizza(101));        
        System.out.print("504 ");
        assertEquals("DIV", Romanizzazione.romanizza(504));  
        System.out.println("1009");
        assertEquals("MIX", Romanizzazione.romanizza(1009));
    }
