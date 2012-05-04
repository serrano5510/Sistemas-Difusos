/**
 * Clase Operador
 * @author José Manuel Serrano Marmol
 */

package Modelo;

import java.util.List;

public class Operador {
    public static final int TNORMAMIN = 1;
    public static final int TNORMAPROD = 2;
    public static final int TCONORMAMAX = 3;
    public static final int TCONORMASUMAALG = 4;
    
    public static float TnormaMIN(List<Float> valores){
        float v = valores.get(0);
        for(int i = 1; i < valores.size(); i++){
            v = Math.min(v,valores.get(i));
        }
        return v;
    }
    
    public static float TnormaPROD(List<Float> valores){
        float v = valores.get(0);
        for(int i = 1; i < valores.size(); i++){
            v = v * valores.get(i);
        }
        return v;
    }
    
    public static float TConormaMAX(List<Float> valores){
        float v = valores.get(0);
        for(int i = 1; i < valores.size(); i++){
            v = Math.max(v,valores.get(i));
        }
        return v;
    }
    
    public static float TconormaSUMALG(List <Float> valores){
        float aux = valores.get(0);
        for(int i = 1; i < valores.size(); i++){
            aux = aux + valores.get(i) - aux * valores.get(i);
        }
        return aux;
    }
}
