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

    /**
     * Der parameterlose Konstruktor. Initialisiert dies Zeichenkette mit willkuerlicher Zeichenkette
     */ 
    public StringBearbeitung()
    {
    // Eine Zeichenkette fuer alle Faelle
        zeichenkette = new String("In Ulm um Ulm und um Ulm herum." );
    }
    
    /**
     * Kopierkonstruktor; initialisiert diese Zeichenkette mit der uebergebenen Zeichenkette.
     * @param zeichenkette Eingabe der Zeichenkette, mit welcher gearbeitet werden soll.
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
     public boolean istGleich(String andereZeichenkette)
     {
         return zeichenkette.equals(andereZeichenkette);
     }
       
    /**
     * Erzeugt Zeichenkette, bei der alle Grossbuchstaben dieser Zeichenkette in Kleinbuchstaben 
     * gewandelt wurden und gibt die gewandelte Zeichenkette zurueck.
     * @return die in Kleinbuchstaben umgewandelte Zeichenkette.
     */
     public String inKleinbuchstabenWandeln() 
     {   
         String zeichenkette2 = zeichenkette.toLowerCase(); 
         return zeichenkette2;
     }    
    
    /**
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
     */
     public void AnfangUndEndeBereinigen()
     {
         zeichenkette = zeichenkette.trim();
     }

    /**
     * Entfernt fuehrende und abschliessende Leerzeichen der uebergebenen Zeichenkette, 
     * sofern vorhanden. Das Ergebnis wird zurueckgegeben.
     * @param kette Zeichenkette, welche der Leerzeichen beraubt werden soll.
     * @return Rückgabe der von Leerzeichen bereinigten Zeichenkette
     */
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
         return zeichenkette.contentEquals(wort);
     }

    /**
     * Prueft, ob diese Zeichenkette leer ist, also keine Zeichen enthaelt. Gibt true zurueck,
     * falls die Zeichenkette keine Zeichen enthaelt, false sonst.
     * @param gibt true, wenn die Zeichenkette leer ist.
     */    
     public boolean istLeer()
     {
         return zeichenkette.length() < 0;
     }

    /**
     * Gibt die Zeichenkette zurueck, die die ersten 'anzahl' Zeichen dieser Zeichenkette enthaelt.
     *@param anzahl Anzahl der Zeichenkette welche zurückgegeben werden soll.
     *@return gibt die ersten der in anzahl übergebenen Zeichen der Zeichenkette zurück.
     */
     public String gibAnfang(int anzahl)
     {
         return zeichenkette.substring(anzahl);
     }

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
     * Prueft, ob das uebergebene Wort in dieser Zeichenkette enthalten ist und gibt den
     * Index des ersten Zeichens zurueck, bei dem der uebereinstimmende Bereich beginnt.
     * @param wort prüft ob das wort in der Zeichenkette enthalten ist und gibt den Index zurück.
     * @return gibt den index des ersten Zeichens zurück bei dem der uebereinstimmende Bereich beginnt.
     */
     public int findeTeilkette(String wort)
     {
         return zeichenkette.indexOf(wort);
     }
    

    
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
         String zeichenkettenArray[] = zeichenkette.split(" ");
         for (String word: zeichenkettenArray) {
             if (word.trim().equalsIgnoreCase(teilkette)) {
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
         return eMailAdresse.substring(eMailAdresse.indexOf("@")+1);
     }

}