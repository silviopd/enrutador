
package ddd;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
public class Ddd {

   
    public static void main(String[] args) throws IOException {
        
        JFileChooser fileChooser = new JFileChooser();
       fileChooser.setFileFilter( new FileNameExtensionFilter(null,"docx","txt","pdf","jpg","jpeg","png","bmp"));
       fileChooser.setCurrentDirectory(new java.io.File("e:/imagenes_tmp/"));
       int result = fileChooser.showOpenDialog(null);
        if ( result == JFileChooser.APPROVE_OPTION ){
            //obtiene ruta y nombre del archivo
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + ruta);
        }
    }

}
