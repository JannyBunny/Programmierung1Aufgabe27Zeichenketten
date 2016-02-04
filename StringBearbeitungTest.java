/**
 * Die Klasse StringBearbeitung enthaelt einige Methoden, die
 * den Umgang mit Zeichenketten zeigen.
 * 
 * @author HHPaul 
 * @version (16/01)
 */
public class StringBearbeitung
{

    // Datenfeld: Diee Zeichenkette, die untersucht wird. 
    // (In der folgenden Doku 'diese Zeichenkette'.)
    private String zeichenkette;

<<<<<<< HEAD
public class StringBearbeitungTest {
    
    private StringBearbeitung normal;
    private StringBearbeitung konfus;
    private StringBearbeitung kurz;
    private StringBearbeitung lax;
    private StringBearbeitung leer;
    

    @Before
    public void setUp() throws Exception {
        
        normal = new StringBearbeitung("Zu wissen, was man wei�, und zu wissen, was man tut, das ist Wissen.");
        konfus = new StringBearbeitung("Ababababaa");
        kurz = new StringBearbeitung("Programmieren ist toll!");
        lax = new StringBearbeitung(" Fischers Fritze fischt frische Fische ");
        leer = new StringBearbeitung("");
        
    }

    @After
    public void tearDown() throws Exception {
    }

    
    @Test
=======
>>>>>>> origin/master
    /**
     * Der parameterlose Konstruktor. Initialisiert dies Zeichenkette mit willkuerlicher Zeichenkette
     */ 
    public StringBearbeitung()
    {
    // Eine Zeichenkette fuer alle Faelle
        zeichenkette = new String("In Ulm um Ulm und um Ulm herum." );
    }
    
    /**
<<<<<<< HEAD
     * Testet die L�nge des Strings
=======
     * Kopierkonstruktor; initialisiert diese Zeichenkette mit der uebergebenen Zeichenkette.
     * @param zeichenkette Eingabe der Zeichenkette, mit welcher gearbeitet werden soll.
>>>>>>> origin/master
     */
    public StringBearbeitung(String zeichenkette)
    {
        this.zeichenkette = new String(zeichenkette);
    } 
    
    /**
     * Gibt diese Zeichenkette aus.
     */
    public void zeigeZeichenkette() 
    {
        if (zeichenkette.length() > 0) {
            System.out.println(zeichenkette);
        }
    }
    
    /**
     * Ermittelt die Laenge dieser Zeichenkette.
     * @return Länge der Zeichenkette in ganzen Zahlen.
     */
     public int gibLaenge()
     {
         return zeichenkette.length();
     }
    
    /**
     *  Vergleicht diese Zeichenkette mit anderer Zeichenkette. (2 Zeichenketten werden als 
     *  gleich verstanden, wenn Sie den gleichen Inhalt haben und nicht nur, wenn die auf sie
     *  verweisenden Referenzen gleich sind.)
     *  @param andereZeichenkette Eingabe einer Zeichenkette, mit der verglichen werden soll.
     *  @return ist die Zeichenkette gleich? True, wenn ja.
     */
<<<<<<< HEAD
    @Test
    public void test_inKleinBuchstabenUmwandeln()
    {
        String lowerCase = kurz.inKleinbuchstabenWandeln();
        assertEquals("programmieren ist toll!",lowerCase);
        
        //Testet, ob die Originalzeichenkette ver�ndert wurde - Darf nicht sein
        assertTrue( kurz.istGleich("Programmieren ist toll!"));
    }
    
    /**
     * Pr�ft BeginntMit Methode auf true
=======
     public boolean istGleich(String andereZeichenkette)
     {
         return zeichenkette.equals(andereZeichenkette);
     }
       
    /**
     * Erzeugt Zeichenkette, bei der alle Grossbuchstaben dieser Zeichenkette in Kleinbuchstaben 
     * gewandelt wurden und gibt die gewandelte Zeichenkette zurueck.
     * @return die in Kleinbuchstaben umgewandelte Zeichenkette.
>>>>>>> origin/master
     */
     public String inKleinbuchstabenWandeln() 
     {   
         String zeichenkette2 = zeichenkette.toLowerCase(); 
         return zeichenkette2;
     }    
    
    /**
<<<<<<< HEAD
     * Pr�ft BeginntMit Methode auf false
     */
    @Test
    public void test_beginntMitFalse()
    {
        assertFalse(konfus.beginntMit("Bab"));
    }
    
    /**
     * Pr�ft Anfang und Ende bereinigen
=======
     * Prueft, ob diese Zeichenkette mit der uebergebenen Zeichenkette beginnt.
     * @param startKette Eingabe der Zeichenkette mit mit der geprüft werden soll.
     * @return Wenn die Zeichenkette mit der eingegeben überinstimmt, true, sonst false.
     */   
     public boolean beginntMit(String startKette)
     {
         return zeichenkette.startsWith(startKette);
     }
    
    /**
     * Entfernt fuehrende und abschliessende Leerzeichen dieser Zeichenkette, sofern vorhanden.
>>>>>>> origin/master
     */
     public void AnfangUndEndeBereinigen()
     {
         zeichenkette = zeichenkette.trim();
     }

<<<<<<< HEAD
        int newLength = lax.gibLaenge();
        
        assertEquals(newLength, initLength-2,0);

    }
    
    /**
     * Tests die Anfang und Ende Bereinigen Methode mit
     * �bergabeparameter
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
     * Testet Enth�lt-Methode, ob ein enthaltenes
     * Wort erkannt wird
     */
    @Test
    public void test_enthaeltTrue()
    {
        assertTrue( normal.enthaelt(""));
    }
    
    /**
     * Testet Enth�lt-Methode, ob ein nicht enthaltenes Wort
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
    
=======
>>>>>>> origin/master
    /**
     * Entfernt fuehrende und abschliessende Leerzeichen der uebergebenen Zeichenkette, 
     * sofern vorhanden. Das Ergebnis wird zurueckgegeben.
     * @param kette Zeichenkette, welche der Leerzeichen beraubt werden soll.
     * @return Rückgabe der von Leerzeichen bereinigten Zeichenkette
     */
<<<<<<< HEAD
    @Test
    public void test_gibAnfangLeer()
    {
        try{
            leer.gibAnfang(3);
        }
        catch(StringIndexOutOfBoundsException e)
        {
            fail("Es wurde versucht die gibAnfang-Methode mit dem Index ausserhalb der g�ltigen Laenge aufzurufen!");
        }
    }
    
    /**
     * Test, ob gib Anfang Methode den korrekten Substring zur�ckgibt
     */
    @Test
    public void test_gibAnfangTrue()
    {
        int oldLength = lax.gibLaenge();
        
        assertEquals(" Fischer", lax.gibAnfang(8) );
        
        int compareLength = lax.gibLaenge();
        
        //Testet, ob die eigentliche Zeichenkette durch die gibAnfang nicht ver�ndert wurde
        assertEquals(oldLength, compareLength, 0);
=======
     public String AnfangUndEndeBereinigen(String kette)
     {
         return kette.trim();
     } 

   /**
     * Prueft, ob das uebergebene Wort in der Kette enthalten ist. Gibt true zurueck,
     * falls das Wort enthalten ist, false sonst.
     *@param wort Wort, welches in der Zeichenkette enthalten sein soll. 
     *@return gibt true, wenn das eingegebene Wort in der Zeichenkette enthalten ist, ansonsten false.
     */    
     public boolean enthaelt(String wort)
     {
         return zeichenkette.contains(wort);
     }

    /**
     * Prueft, ob diese Zeichenkette leer ist, also keine Zeichen enthaelt. Gibt true zurueck,
     * falls die Zeichenkette keine Zeichen enthaelt, false sonst.
     * @param gibt true, wenn die Zeichenkette leer ist.
     */    
     public boolean istLeer()
     {
         return zeichenkette.length() <= 0;
     }
>>>>>>> origin/master

    /**
     * Gibt die Zeichenkette zurueck, die die ersten 'anzahl' Zeichen dieser Zeichenkette enthaelt.
     *@param anzahl Anzahl der Zeichenkette welche zurückgegeben werden soll.
     *@return gibt die ersten der in anzahl übergebenen Zeichen der Zeichenkette zurück.
     */
<<<<<<< HEAD
    @Test
    public void test_gibAnfangNegativerIndex()
    {
        try{
            normal.gibAnfang(-1);
        }catch(StringIndexOutOfBoundsException e)
        {
            fail("Es wurde versucht einen negativen Index f�r die gibAnfang-Methode einzugeben");
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
        
        //Pr�ft, ob sich die Laenge nach Verkettung entsprechend angepasst hat
        assertEquals(originalLength+zuVerketten.length(), neueZeichenkette.length());
        
        int newLength = kurz.gibLaenge();

        //Pr�ft, ob der original String durch die Verkettung nicht ver�ndert wurde
        
        assertEquals(originalLength, newLength,0);
        
    }
    
    
    /**
     * Testet, die Verkette Methode mit �bergabeparametern
     */
    @Test
    public void test_verketteMitParametern()
    {
        String vergleich = new String ("Die Wiese ist gr�n. Es ist bald Fr�hling");
        String outputString = leer.verkette("Die Wiese ist gr�n. ","Es ist bald Fr�hling");
        
        assertEquals(vergleich,outputString );
        //Pr�ft, ob der Original-String hierbei unver�ndert bleibt
        assertEquals(0,leer.gibLaenge());
        
        
    }
    
    /**
     * Testet, ob erfolgreich der Index f�r eine Teilkette gefunden wird
     */
    @Test
    public void test_findeTeilkette()
    {
        int index = lax.findeTeilkette("Fische");
        
        assertEquals(1,index,0);
    }
    
=======
     public String gibAnfang(int anzahl)
     {
         if ( (anzahl >= 0) && (anzahl<=zeichenkette.length()) ) {
         return zeichenkette.substring(0,anzahl);
        }
        return "Falscher Anfang";
     }

>>>>>>> origin/master
    /**
     * Gibt die Position des ersten Leerzeichens dieser Zeichenkette zurueck.
     * @return gibt Position des ersten leerzeichens zurück 0 basierte Zählweise.
     */ 
     public int erstesLeerzeichen()
     {
         return zeichenkette.indexOf(" ");
     }

    /**
     * Verkettet diese Zeichenkette mit der uebergebenen Zeichenkette 'andereKette' und gibt 
     * das Ergebnis zurueck.
     * @param andereKette unsere Zeichenkette wird hiermit verkettet.
     * @return Rückgabe der verketten Zeichenketten.
     */
     public String verkette(String andereKette)
     {
         return zeichenkette + andereKette;         
     }
    
    /**
     * Verkettet 2 uebergebene Zeichenketten und gibt das Ergebnis zurueck.
     * @param zKette1 erste Zeichenkette
     * @param zKette2 zweite Zeichenkette
     * @return gibt das ergebnis der beiden verketteten Zeichenketten zurück.
     */
     public String verkette(String zKette1, String zKette2)
     {
         return zKette1+zKette2;
     } 

    /**
<<<<<<< HEAD
     * Testet, ob unabh�ngig der Gross- und Kleinschreibung die korrekte
     * Anzahl der Worte gefunden wird
=======
     * Prueft, ob das uebergebene Wort in dieser Zeichenkette enthalten ist und gibt den
     * Index des ersten Zeichens zurueck, bei dem der uebereinstimmende Bereich beginnt.
     * @param wort prüft ob das wort in der Zeichenkette enthalten ist und gibt den Index zurück.
     * @return gibt den index des ersten Zeichens zurück bei dem der uebereinstimmende Bereich beginnt.
>>>>>>> origin/master
     */
     public int findeTeilkette(String wort)
     {
         return zeichenkette.indexOf(wort);
     }
    
<<<<<<< HEAD
    /**
     * Testet, ob unabh�ngig der Gross- und Kleinschreibung bei einem nicht 
     * existenten Wort eine Anzahl von 0 gefunden wird.
     */
    @Test
    public void test_anzahlVorkommenNegativ()
    {
        assertEquals(0,leer.anzahlVorkommen("fisch"),0);
    }
    
    /**
     * Pr�ft ob bei korrekter Eingabe der Host zur�ckgegeben wird
     */
    @Test
    public void test_gibHost()
    {
        String host = leer.gibHost("programmieren_1@hs-fulda.de");
        
        assertEquals( host,"hs-fulda.de");
    }
    
    /**
     * Pr�ft, ob bei doppelter @ Eingabe der korrekte Host zur�ckgegeben wird
     */
    @Test
    public void test_gibHostMitZweiATZeichen()
    {
        String host = leer.gibHost("programmieren_1@@hs-fulda.de");
        
        assertEquals(host,"hs-fulda.de");
    }
    
    
    
    
    
    
=======

    
    /**
     * Vergleicht die beiden uebergebenen Zeichenketten. Gibt ein String-Array zurueck, 
     * das die beiden Zeichenketten in lexikografischer Reihenfolge enthaelt. (Die im 
     * Lexikon weiter vorne stehende Zeichenkette soll auch im Array vorne stehen)
     * @param zKette1 Erste Zeichenkette.
     * @param zKette2 Zweite Zeichenkette.
     * @return Array der Strings in in lexikografischer Reihenfolge.
     */
     public String [] inLexikografischerReihenfolge(String zKette1, String zKette2)
     {
         String [] zk = new String[2];
         if (zKette1.compareTo(zKette2) < 0 ) {
            zk[0] = zKette1;
            zk[1] = zKette2;
            }
         if (zKette1.compareTo(zKette2) > 0 ) {
            zk[0] = zKette2;
            zk[1] = zKette1;
            }
         return zk;
     }

    /**
     * Prueft, wie oft eine uebergebene Zeichenkette in dieser Zeichenkette
     * enthalten ist. Dabei soll Gross-/Kleinschreibung nicht unterschieden werden. Gibt
     * zurueck, wie oft die Teilkette in dieser Zeichenkette enthaten ist.
     * @param teilkette Welche gegen die zeichenkette geprüft werden soll.
     * @return Anzahl der vorkommen der Übergebenen teilkette in der Zeichenkette.
     */
     public int anzahlVorkommen(String teilkette)
     {
         int anzahl=0;
         String zeichenkettenArray[] = zeichenkette.split("[!?;:,. ]");
         for (String word: zeichenkettenArray) {
             if (word.trim().toLowerCase().contains(teilkette.toLowerCase())) {
                 anzahl++;
                }
            }
         return anzahl;         
     }
    
    /**
     * Findet den Hostnamen in einer uebergebenen Zeichenkette, welche eine Email-Adresse enthaelt.
     * Die Email-Adresse soll das Format "benutzername@hostname" haben. Der Hostname soll als
     * Zeichenkette zurueckgegeben werden.
     * @param eMailAdresse Übergebene Emailadresse zum hostnamen Suchen.
     * @return Gibt den gefundenen Hostnamen zurück.
     */
     public String gibHost(String eMailAdresse)
     {
         return eMailAdresse.substring(eMailAdresse.lastIndexOf("@")+1);
     }
>>>>>>> origin/master

}
