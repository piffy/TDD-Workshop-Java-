    @Test
    public void testSecoloNonBisestile() {
        assertFalse(JavaBisestile.isBisestile(1700), "1700 non deve essere bisestile");
        assertFalse(JavaBisestile.isBisestile(1900), "1900 non deve essere bisestile");
        assertFalse(JavaBisestile.isBisestile(1800), "1800 non deve essere bisestile");
    }

