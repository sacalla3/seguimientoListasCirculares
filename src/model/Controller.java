package model;

public class Controller {

    CircularList list = new CircularList();

    int contadorTurnos = 1;

    public CircularList getList(){
        return list;
    }
    

    public void agregarTurno(){
        list.addNode(new Node(String.valueOf(contadorTurnos)));
        contadorTurnos++;
    }

    public String mostrarTurno(){
        return list.getActual().getName();
    }

    public void seguirTurno(){
       list.delete(list.getActual().getName());
    }

    public void pasarTurno(){
        list.getActual().incrementarNumero_de_saltos();

        if(list.getActual().getNumero_de_saltos() == 2){
            list.delete(list.getActual().getName());
        }else{
            list.siguiente(); 
        }

    }
    
}
