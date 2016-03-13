package es.com.blogspot.httpagenda_universitaria_etsiit.agendauniversitaria;

import java.util.Calendar;


public class Clase {

    private Calendar hora_inicio;
    private Calendar hora_fin;
    private String aula;
    private Asignatura asignatura;

    public Clase(Calendar hora_inicio, Calendar hora_fin, String aula, Asignatura asignatura){

        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.aula = aula;
        this.asignatura = asignatura;
    }

    //Métodos get

    public String getHoraInicio(){

        return Integer.toString(hora_inicio.get(Calendar.HOUR_OF_DAY))+
                Integer.toString(hora_inicio.get(Calendar.MINUTE));
    }

    public String getHoraFin(){

        return Integer.toString(hora_fin.get(Calendar.HOUR_OF_DAY))+
                Integer.toString(hora_fin.get(Calendar.MINUTE));
    }

    public String getAula(){

        return aula;
    }

    public Asignatura getAsignatura(){

        return asignatura;
    }

    //Métodos set

    public void setHoraInicio(int horas, int minutos){

        this.hora_inicio.set(Calendar.HOUR_OF_DAY,horas);
        this.hora_inicio.set(Calendar.MINUTE,minutos);
    }

    public void setHoraFin(int horas, int minutos){

        this.hora_fin.set(Calendar.HOUR_OF_DAY,horas);
        this.hora_fin.set(Calendar.MINUTE,minutos);
    }

    public void setAula(String aula){

        this.aula = aula;
    }

    public void setAsignatura(Asignatura asignatura){

        this.asignatura = asignatura;
    }

}
