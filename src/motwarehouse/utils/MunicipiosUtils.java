/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motwarehouse.utils;

import motowarehouse.enums.Departamentos;

/**
 *
 * @author Luis E. Vásquez
 */
public class MunicipiosUtils {
    
    public MunicipiosUtils() {
    
    }
    
    public static String[] getNombres(String departamento) {
        String[] ahua = {"Ahuachapán", "Jujutla", "Atiquizaya", "Concepción de Ataco", "El Refugio", "Guaymango", "Apaneca",
            "San Francisco Menéndez", "San Lorenzo", "San Pedro Puxtla", "Tacuba", "Turín"};

        String[] sana = {"Candelaria de la Frontera", "Chalchuapa", "Coatepeque", "El Congo", "El Porvenir", "Masahuat", "Metapán",
            "San Antonio Pajonal", "San Sebastián Salitrillo", "Santa Ana", "Santa Rosa Guachipilín", "Santiago de la Frontera", "Texistepeque"};

        String[] sons = {"Acajutla", "Armenia", "Caluco", "Cuisnahuat", "Izalco", "Juayúa", "Nahuizalco", "Salcoatitán", "San Antonio del Monte",
            "San Julián", "Santa Catarina Masahuat", "Santa Isabel Ishuatán", "Santo Domingo de Guzmán", "Sonsonate", "Sonzacate"};

        String[] usul = {"Alegría", "Berlín", "California", "Concepción Batres", "El Triunfo", "Ereguayquín", "Estanzuelas", "Jiquilisco",
            "Jucuapa", "Jucuarán", "Mercedes Umaña", "Nueva Granada", "Ozatlán", "Puerto El Triunfo", "San Agustín", "San Buenaventura", "San Dionisio",
            "San Francisco Javier", "Santa Elena", "Santa María", "Santiago de María", "Tecapán", "Usulután"};

        String[] smig = {"Carolina", "Chapeltique", "Chinameca", "Chirilagua", "Ciudad Barrios", "Comacarán", "El Tránsito", "Lolotique",
            "Moncagua", "Nueva Guadalupe", "Nuevo Edén de San Juan", "Quelepa", "San Antonio del Mosco", "San Gerardo", "San Jorge", "San Luis de la Reina",
            "San Miguel", "San Rafael Oriente", "Sesori", "Uluazapa"};

        String[] morz = {"Arambala", "Cacaopera", "Chilanga", "Corinto", "Delicias de Concepción", "El Divisadero", "El Rosario (Morazán)",
            "Gualococti", "Guatajiagua", "Joateca", "Jocoaitique", "Jocoro", "Lolotiquillo", "Meanguera", "Osicala", "Perquín", "San Carlos",
            "San Fernando (Morazán)", "San Francisco Gotera", "San Isidro (Morazán)", "San Simón", "Sensembra", "Sociedad", "Torola", "Yamabal", "Yoloaiquín"};

        String[] luni = {"La Unión", "San Alejo", "Yucuaiquín", "Conchagua", "Intipucá", "San José", "El Carmen (La Unión)", "Yayantique",
            "Bolívar", "Meanguera del Golfo", "Santa Rosa de Lima", "Pasaquina", "Anamoros", "Nueva Esparta", "El Sauce", "Concepción de Oriente",
            "Polorós", "Lislique"};

        String[] libe = {"Antiguo Cuscatlán", "Chiltiupán", "Ciudad Arce", "Colón", "Comasagua", "Huizúcar", "Jayaque", "Jicalapa",
            "La Libertad", "Santa Tecla", "Nuevo Cuscatlán", "San Juan Opico", "Quezaltepeque", "Sacacoyo", "San José Villanueva",
            "San Matías", "San Pablo Tacachico", "Talnique", "Teotepeque", "Tepecoyo", "Zaragoza"};

        String[] chal = {"Agua Caliente", "Arcatao", "Azacualpa", "Cancasque", "Chalatenango", "Citalá", "Comapala", "Concepción Quezaltepeque",
            "Dulce Nombre de María", "El Carrizal", "El Paraíso", "La Laguna", "La Palma", "La Reina", "Las Vueltas", "Nueva Concepción",
            "Nueva Trinidad", "Nombre de Jesús", "Ojos de Agua", "Potonico", "San Antonio de la Cruz", "San Antonio Los Ranchos", "San Fernando (Chalatenango)",
            "San Francisco Lempa", "San Francisco Morazán", "San Ignacio", "San Isidro Labrador", "Las Flores", "San Luis del Carmen", "San Miguel de Mercedes",
            "San Rafael", "Santa Rita", "Tejutla"};

        String[] cusc = {"Cojutepeque", "Candelaria", "El Carmen (Cuscatlán)", "El Rosario (Cuscatlán)", "Monte San Juan", "Oratorio de Concepción",
            "San Bartolomé Perulapía", "San Cristóbal", "San José Guayabal", "San Pedro Perulapán", "San Rafael Cedros", "San Ramón", "Santa Cruz Analquito",
            "Santa Cruz Michapa", "Suchitoto", "Tenancingo"};

        String[] ssal = {"Aguilares", "Apopa", "Ayutuxtepeque", "Cuscatancingo", "Ciudad Delgado", "El Paisnal", "Guazapa", "Ilopango",
            "Mejicanos", "Nejapa", "Panchimalco", "Rosario de Mora", "San Marcos", "San Martín", "San Salvador", "Santiago Texacuangos",
            "Santo Tomás", "Soyapango", "Tonacatepeque"};

        String[] lpaz = {"Zacatecoluca", "Cuyultitán", "El Rosario (La Paz)", "Jerusalén", "Mercedes La Ceiba", "Olocuilta", "Paraíso de Osorio",
            "San Antonio Masahuat", "San Emigdio", "San Francisco Chinameca", "San Pedro Masahuat", "San Juan Nonualco", "San Juan Talpa",
            "San Juan Tepezontes", "San Luis La Herradura", "San Luis Talpa", "San Miguel Tepezontes", "San Pedro Nonualco", "San Rafael Obrajuelo",
            "Santa María Ostuma", "Santiago Nonualco", "Tapalhuaca"};

        String[] cab = {"Cinquera", "Dolores", "Guacotecti", "Ilobasco", "Jutiapa", "San Isidro (Cabañas)", "Sensuntepeque", "Tejutepeque",
            "Victoria"};

        String[] svic = {"Apastepeque", "Guadalupe", "San Cayetano Istepeque", "San Esteban Catarina", "San Ildefonso", "San Lorenzo",
            "San Sebastián", "San Vicente", "Santa Clara", "Santo Domingo", "Tecoluca", "Verapaz"};

        switch (departamento) {
            case "AHUACHAPAN":
                return ahua;
            case "CABAÑAS":
                return cab;
            case "CUSCATLÁN":
                return cusc;
            case "LIBERTAD":
                return libe;
            case "LA PAZ":
                return lpaz;
            case "LA UNIÓN":
                return luni;
            case "MORAZÁN":
                return morz;
            case "SAN MIGUEL":
                return smig;
            case "SAN SALVADOR":
                return ssal;
            case "SAN VICENTE":
                return svic;
            case "SANTA ANA":
                return sana;
            case "SONSONATE":
                return sons;
            case "USULUTÁN":
                return usul;
            case "CHALATENANGO":
                return chal;
            default:
                return null;
        }
    }
    
    
    public static String[] getNombresUpper(String departamento) {
        String[] munUpper;

        munUpper = getNombres(departamento);

        for (int i = 0; i < munUpper.length; i++) {
            munUpper[i] = munUpper[i].toUpperCase();
        }

        return munUpper;
    }
    
}
