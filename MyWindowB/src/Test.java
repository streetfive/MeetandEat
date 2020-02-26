//
//
//
//	import java.io.BufferedReader;
//	import java.io.FileWriter;
//	import java.io.IOException;
//	import java.io.InputStreamReader;
//
//	public class Test {
//
//	    /*
//	     * liest Text einschl. Zeilenumbr&uuml;chen von der Konsole und schreibt
//	     * diesen in eine Text-Datei. q <return> beendet das Programm und schlieﬂt
//	     * die Datei
//	     */
//	    public static void liesUndSchreibe() {
//	        System.out.println("Bitte etwas eingeben und mit Return abschliessen.\n('q' beendet das Programm.)");
//	        BufferedReader tastaturInput = new BufferedReader(new InputStreamReader(System.in));
//	        FileWriter out = null;
//	        int t;
//	        try {
//	            out = new FileWriter("datei.txt", true);
//	            while (true) {
//	                t = tastaturInput.read();
//	                if (t == (char) 'q') {
//	                    out.close();
//	                    System.out.println("Programm wird beendet!");
//	                    System.exit(0);
//	                }
//	                out.write(t);
//	            }
//	        } catch (IOException ioe) {
//	            ioe.printStackTrace();
//	        } finally {
//	            try {
//	                if(out != null) out.close();
//	                if(tastaturInput != null) tastaturInput.close();
//	            } catch (IOException ioe){}
//	        }
//	    }
//
//	    public static void main(String[] args) {
//	        liesUndSchreibe();
//	    }
//	}