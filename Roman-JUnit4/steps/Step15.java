    //@Test
    //Step 15 (OPT)
        public void arabicizza() {
        System.out.println("T: 1 ");
        assertEquals(1, Romanizzazione.arabicizza("I"));
         
    } 
    
    @Test
    //Step 16 (OPT)
        public void arabicizza10() {
        System.out.print("T: ");    
        assertEquals(2, Romanizzazione.arabicizza("II"));
        assertEquals(3, Romanizzazione.arabicizza("III"));
        assertEquals(5, Romanizzazione.arabicizza("V"));
        assertEquals(6, Romanizzazione.arabicizza("VI"));
        assertEquals(7, Romanizzazione.arabicizza("VII"));
        System.out.println();
    } 
       
        @Test
    //Step 17 (OPT)
        public void arabicizza49() {
        System.out.print("T: ");    
        assertEquals(4, Romanizzazione.arabicizza("IV"));
        assertEquals(9, Romanizzazione.arabicizza("IX"));
        System.out.println();
    }    
      
