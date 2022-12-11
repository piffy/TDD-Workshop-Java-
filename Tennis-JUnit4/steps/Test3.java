@Test
    public void testSecoloNonBisestile() {
    assertFalse("1700 non deve essere bisestile",JavaBisestile.isBisestile(1700));
    assertFalse("1900 non deve essere bisestile",JavaBisestile.isBisestile(1900));
    assertFalse("1800 non deve essere bisestile",JavaBisestile.isBisestile(1800));
    }

