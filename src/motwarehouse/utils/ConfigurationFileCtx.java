package motwarehouse.utils; 

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

    private String nombreRepresentante;
    private String genero;
    private String nombreEmpresa;
    private String nombreAbrev;
    

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
        int numLine = 1;
        if (archivo != null) {

            try {
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);

                // Lectura del fichero
                String linea;
                while ((linea = br.readLine()) != null) {
                    switch (numLine) {
                        case 1:
                            nombreRepresentante = linea;
                            break;
                        case 2:
                            this.genero = linea;
                            break;
                        case 3:
                            this.nombreEmpresa = linea;
                            break;
                        case 4:
                            this.nombreAbrev = linea;
                            break;

                        default:
                            break;

                    }
                    numLine++;

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

    /**
     * @return the nombreRepresentante
     */
    public String getNombreRepresentante() {
        return nombreRepresentante.toUpperCase();
    }

    /**
     * @param nombreRepresentante the nombreRepresentante to set
     */
    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        String ret = "";
        if(genero != null) {
            ret = ("M".equals(genero.replace(" ", ""))? "o" : "a");
        }
        
        
        return ret;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the nombreEmpresa
     */
    public String getNombreEmpresa() {
        return nombreEmpresa.toUpperCase();
    }

    /**
     * @param nombreEmpresa the nombreEmpresa to set
     */
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    /**
     * @return the nombreAbrev
     */
    public String getNombreAbrev() {
        return nombreAbrev.toUpperCase();
    }

    /**
     * @param nombreAbrev the nombreAbrev to set
     */
    public void setNombreAbrev(String nombreAbrev) {
        this.nombreAbrev = nombreAbrev;
    }

}
