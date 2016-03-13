package es.com.blogspot.httpagenda_universitaria_etsiit.agendauniversitaria;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.Collection;


public class Horario {

    private Multimap<String,Clase> horario;

    public Horario(){

        horario = ArrayListMultimap.create();
    }

    public void aniadeClase(String dia, Clase una_clase){

        horario.put(dia,una_clase);
    }

    public Collection<Clase> getClases(String dia){

        return horario.get(dia);
    }

}
