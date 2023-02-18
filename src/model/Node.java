package model;

public class Node {

    private String name;
    private Node next;
    private Node previous;
    private int numero_de_saltos = 0;

    public int getNumero_de_saltos() {
        return numero_de_saltos;
    }

    public void incrementarNumero_de_saltos() {
        this.numero_de_saltos++;
    }

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}

