    @Test
    public void testNonBisestile() {
        assertFalse(JavaBisestile.isBisestile(2005), "2005 non deve essere bisestile");
        assertFalse(JavaBisestile.isBisestile(2003), "2003 non deve essere bisestile");
        assertFalse(JavaBisestile.isBisestile(2002), "2002 non deve essere bisestile");
        assertFalse(JavaBisestile.isBisestile(2001), "2001 non deve essere bisestile");
    }

