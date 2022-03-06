package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;

/**
 *
 * @author Luis E. Vásquez
 */
public class ConfigurationFileCtx {

    private File archivo;
    private FileReader fr = null;
    private BufferedReader br = null;
    private JFileChooser jFileChoose;

    private String nombre;

    public ConfigurationFileCtx() {
        jFileChoose = new JFileChooser();
    }

    /*public ConfigurationFileCtx(String ubicacion) {
        // archivo cargado de configuracion
        this.archivo = new File(ubicacion);
    }*/
    
    public String showDialogLoadFile() {
        jFileChoose.setApproveButtonText("Seleccionar");
        jFileChoose.showSaveDialog(null);   
        archivo = jFileChoose.getSelectedFile();
        return jFileChoose.getSelectedFile().getName();
    }

    public void loadFile() {
        if (archivo != null) {

            try {
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);

                // Lectura del fichero
                String linea;
                while ((linea = br.readLine()) != null) {
                    nombre = linea;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // En el finally cerramos el fichero, para asegurarnos
                // que se cierra tanto si todo va bien como si salta 
                // una excepcion.
                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }

        }
    }

    public boolean validateFieldsFile() {
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
