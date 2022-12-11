    @Test
    public void testNonBisestile() {
    assertFalse("2005 non deve essere bisestile",JavaBisestile.isBisestile(2005));
    assertFalse("2003 non deve essere bisestile",JavaBisestile.isBisestile(2003));
    assertFalse("2002 non deve essere bisestile",JavaBisestile.isBisestile(2002));
    assertFalse("2001 non deve essere bisestile",JavaBisestile.isBisestile(2001));
    }
