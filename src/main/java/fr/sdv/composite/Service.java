package fr.sdv.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement{

    private String nom;
    private List<IElement> elements;

    public List<IElement> getElements() {
        return elements;
    }

    public void setElements(List<IElement> elements) {
        this.elements = elements;
    }

    public void addElements(IElement elements) {
        if(this.elements == null){
            this.elements = new ArrayList<IElement>();
        }
        this.elements.add(elements);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Service(String nom) {
        this.nom = nom;
    }

    @Override
    public double calculerSalaire() {
        if (elements == null || elements.isEmpty())
            return 0;
        double salaireTotal = 0;
        for (IElement element : elements)
            salaireTotal += element.calculerSalaire();
        return salaireTotal;
    }
}
