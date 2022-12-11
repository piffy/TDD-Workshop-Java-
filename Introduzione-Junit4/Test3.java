@Test
    public void testIsBisestileGregoriano() {
    assertTrue("1500 deve essere bisestile",JavaBisestile.isBisestile(1500));
    assertFalse("1900 non deve essere bisestile",JavaBisestile.isBisestile(1900));
    assertTrue("2000 deve essere bisestile",JavaBisestile.isBisestile(2000));
    }
