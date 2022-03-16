
package motwarehouse.utils;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Luis E. Vásquez
 */
public class ReadFileTxt {
    
    private String empresa;
      
    public ReadFileTxt(String empresa) {
        this.empresa = empresa;
    }
    
    public List<String> getMarcas() throws FileNotFoundException {

        String line;
        List<String> marcas = new ArrayList<>();

        for (String modelo : ModelosStaticFile.arrays_modelos_cadisa) {
            marcas.add(modelo.split(",")[0]);
        }

        return marcas.stream().distinct().collect(Collectors.toList());
    }
    
    
    public List<String> getModelos(String marcaSelected) throws FileNotFoundException {
        String aux;

        List<String> modelos = new ArrayList<>();
        for (String modelo : ModelosStaticFile.arrays_modelos_cadisa) {
            aux = modelo.split(",")[0];
            if (aux.replace(" ", "").equals(marcaSelected.replace(" ", ""))) {
                modelos.add(modelo.split(",")[1]);
            }
        }

        return modelos;
    }

}
