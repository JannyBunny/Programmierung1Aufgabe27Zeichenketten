import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringBearbeitungTest {
    
    private StringBearbeitung normal;
    private StringBearbeitung konfus;
    private StringBearbeitung kurz;
    private StringBearbeitung lax;
    private StringBearbeitung leer;
    

    @Before
    public void setUp() throws Exception {
        
        normal = new StringBearbeitung("Zu wissen, was man weiß, und zu wissen, was man tut, das ist Wissen.");
        konfus = new StringBearbeitung("Ababababaa");
        kurz = new StringBearbeitung("Programmieren ist toll!");
        lax = new StringBearbeitung(" Fischers Fritze fischt frische Fische ");
        leer = new StringBearbeitung("");
        
    }

    @After
    public void tearDown() throws Exception {
    }

    
    @Test
    /**
     * Test, ob die Zeichenkette auf der Consolenausgabe erscheint
     */
    public void test_zeigeZeichenkette()
    {
        System.out.println("Test der Ausgabe-Methode - Konfuzius sagt:");
        normal.zeigeZeichenkette();
        System.out.println("");
        
    }
    
    /**
     * Testet die Länge des Strings
     */
    @Test
    public void test_gibLaenge()
    {
        assertEquals(68,normal.gibLaenge(),0);
    }
    
    /**
     * Testet die istGleich Funktion
     */
    @Test
    public void test_istGleichTrue()
    {
        String kurz2 = new String("Programmieren ist toll!");
        assertTrue( kurz.istGleich(kurz2));
    }
    
    /**
     * Testet die istGleich Funktion
     */
    @Test
    public void test_istGleichFalse()
    {
        assertFalse( kurz.istGleich("PRogrammieren is toll"));
    }
    
    /**
     * Testet KleinBuchstaben-Umwandlung
     */
    @Test
    public void test_inKleinBuchstabenUmwandeln()
    {
        String lowerCase = kurz.inKleinbuchstabenWandeln();
        assertEquals("programmieren ist toll!",lowerCase);
        
        //Testet, ob die Originalzeichenkette verändert wurde - Darf nicht sein
        assertTrue( kurz.istGleich("Programmieren ist toll!"));
    }
    
    /**
     * Prüft BeginntMit Methode auf true
     */
    @Test
    public void test_beginntMitTrue()
    {
        assertTrue( konfus.beginntMit("Abab"));
    }
    
    /**
     * Prüft BeginntMit Methode auf false
     */
    @Test
    public void test_beginntMitFalse()
    {
        assertFalse(konfus.beginntMit("Bab"));
    }
    
    /**
     * Prüft Anfang und Ende bereinigen
     */
    public void test_anfangUndEndeBereinigen1()
    {
        int initLength = lax.gibLaenge();
        lax.AnfangUndEndeBereinigen();

        int newLength = lax.gibLaenge();
        
        assertEquals(newLength, initLength-2,0);

    }
    
    /**
     * Tests die Anfang und Ende Bereinigen Methode mit
     * Übergabeparameter
     */
    @Test
    public void test_anfangUndEndeBereinigen2()
    {
        String theString = new String(" Eins zwei drei ");  
        int initLength = theString.length();
        
        int newLength = lax.AnfangUndEndeBereinigen(theString).length();
        assertEquals(newLength, initLength-2,0);
    }
    
    /**
     * Testet Enthält-Methode, ob ein enthaltenes
     * Wort erkannt wird
     */
    @Test
    public void test_enthaeltTrue()
    {
        assertTrue( normal.enthaelt(""));
    }
    
    /**
     * Testet Enthält-Methode, ob ein nicht enthaltenes Wort
     * false ergibt
     */
    @Test
    public void test_enthaeltFalse()
    {
        assertFalse( konfus.enthaelt("Baba"));
    }
    
    /**
     * Testet, ob die ist Leer-Methode einen leeren String erkennt
     */
    @Test
    public void test_istLeerTrue()
    {
        assertTrue( leer.istLeer());
    }
    
    /**
     * Testet, ob die ist Leer-Methode einen nicht leeren
     * String als solches erkennt
     */
    @Test
    public void test_istLeerFalse()
    {
        assertFalse( normal.istLeer());
    }
    
    /**
     * Tests, ob gibAnfang auf einen leeren String angewendet werden kann
     */
    @Test
    public void test_gibAnfangLeer()
    {
        try{
            leer.gibAnfang(3);
        }
        catch(StringIndexOutOfBoundsException e)
        {
            fail("Es wurde versucht die gibAnfang-Methode mit dem Index ausserhalb der gültigen Laenge aufzurufen!");
        }
    }
    
    /**
     * Test, ob gib Anfang Methode den korrekten Substring zurückgibt
     */
    @Test
    public void test_gibAnfangTrue()
    {
        int oldLength = lax.gibLaenge();
        
        assertEquals(" Fischer", lax.gibAnfang(8) );
        
        int compareLength = lax.gibLaenge();
        
        //Testet, ob die eigentliche Zeichenkette durch die gibAnfang nicht verändert wurde
        assertEquals(oldLength, compareLength, 0);

    }
    
    /**
     * Testet, ob negative Indizes abgefangen werden
     */
    @Test
    public void test_gibAnfangNegativerIndex()
    {
        try{
            normal.gibAnfang(-1);
        }catch(StringIndexOutOfBoundsException e)
        {
            fail("Es wurde versucht einen negativen Index für die gibAnfang-Methode einzugeben");
        }
    }
    
    /**
     * Testet, ob das erste Leerzeichen korrekt gefunden wird
     */
    @Test
    public void test_erstesLeerzeichen()
    {
        assertEquals(2,normal.erstesLeerzeichen(),0);
    }
    
    /**
     * Testet, ob bei einem leeren String kein erstes Leerzeichen gefunden wird
     * (Index -1)
     */
    @Test
    public void test_erstesLeerzeichenLeer()
    {
        assertEquals(-1,leer.erstesLeerzeichen(),0);
    }
    
    
    /**
     * Testet, ob die Verkettungs-Methode korrekt funktioniert
     */
    @Test
    public void test_verkette()
    {
        int originalLength = kurz.gibLaenge();
        
        String zuVerketten = new String(" Du lernst es gerade");
        
        String neueZeichenkette = kurz.verkette(zuVerketten);
        
        //Prüft, ob sich die Laenge nach Verkettung entsprechend angepasst hat
        assertEquals(originalLength+zuVerketten.length(), neueZeichenkette.length());
        
        int newLength = kurz.gibLaenge();

        //Prüft, ob der original String durch die Verkettung nicht verändert wurde
        
        assertEquals(originalLength, newLength,0);
        
    }
    
    
    /**
     * Testet, die Verkette Methode mit Übergabeparametern
     */
    @Test
    public void test_verketteMitParametern()
    {
        String vergleich = new String ("Die Wiese ist grün. Es ist bald Frühling");
        String outputString = leer.verkette("Die Wiese ist grün. ","Es ist bald Frühling");
        
        assertEquals(vergleich,outputString );
        //Prüft, ob der Original-String hierbei unverändert bleibt
        assertEquals(0,leer.gibLaenge());
        
        
    }
    
    /**
     * Testet, ob erfolgreich der Index für eine Teilkette gefunden wird
     */
    @Test
    public void test_findeTeilkette()
    {
        int index = lax.findeTeilkette("Fische");
        
        assertEquals(1,index,0);
    }
    
    /**
     * Testet, ob erfolgreich keine Teilkette gefunden wird
     */
    @Test
    public void test_findeTeilketteLeer()
    {
        int index = leer.findeTeilkette("Wiese");
        
        assertEquals(-1, index);
    }
    
    /**
     * Testet, ob die lexikographische Reihenfolge-Methode das entsprechende Resultat liefert
     */
    @Test
    public void test_lexikographischeReihenfolgeLeer()
    {
        String[] result = leer.inLexikografischerReihenfolge("Die Wiese ist gruen ", "Die Baeume sind gruen ");
        
        String output="";
        
        for(String entry : result)
        {
            output+=entry;
        }
        
        String vergleich = new String("Die Baeume sind gruen Die Wiese ist gruen ");
        
        assertEquals(vergleich,output);
        
    }
    
    
    /**
     * Testet, ob prinzipielle die lexikographische Reihenfolge beachtet wurde
     */
    @Test
    public void test_lexikographischeReihenfolge()
    {
        String str1 = "Die Wiese ist gruen ";
        String str2 = "Die Baeume sind gruen ";
        String[] result = leer.inLexikografischerReihenfolge(str1, str2);
        
        assertEquals(str2,result[0]);
        assertEquals(str1,result[1]);
    }
    
    @Test
    public void test_lexikographischeReihenfolge2()
    {
        String str1 = "Ababab ";
        String str2 = "ababab ";
        String[] result = leer.inLexikografischerReihenfolge(str1, str2);
        assertEquals(str1,result[0]);
        assertEquals(str2,result[1]);
    }
    
    /**
     * Testet, ob unabhängig der Gross- und Kleinschreibung die korrekte
     * Anzahl der Worte gefunden wird
     */
    @Test
    public void test_anzahlVorkommen()
    {
        assertEquals(3,lax.anzahlVorkommen("fisch"),0);
    }
    
    /**
     * Testet, ob unabhängig der Gross- und Kleinschreibung bei einem nicht 
     * existenten Wort eine Anzahl von 0 gefunden wird.
     */
    @Test
    public void test_anzahlVorkommenNegativ()
    {
        assertEquals(0,leer.anzahlVorkommen("fisch"),0);
    }
    
    /**
     * Prüft ob bei korrekter Eingabe der Host zurückgegeben wird
     */
    @Test
    public void test_gibHost()
    {
        String host = leer.gibHost("programmieren_1@hs-fulda.de");
        
        assertEquals( host,"hs-fulda.de");
    }
    
    /**
     * Prüft, ob bei doppelter @ Eingabe der korrekte Host zurückgegeben wird
     */
    @Test
    public void test_gibHostMitZweiATZeichen()
    {
        String host = leer.gibHost("programmieren_1@@hs-fulda.de");
        
        assertEquals(host,"hs-fulda.de");
    }
    
    
    
    
    
    

}
