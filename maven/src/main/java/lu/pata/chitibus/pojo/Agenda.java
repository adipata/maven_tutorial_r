package lu.pata.chitibus.pojo;

import com.inamik.text.tables.Cell;
import com.inamik.text.tables.GridTable;
import com.inamik.text.tables.grid.Border;
import com.inamik.text.tables.grid.Util;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Persoana> agenda=new ArrayList<>();

    public void adauga(String nume, String telefon){
        agenda.add(new Persoana(nume,telefon));
    }

    public void afiseaza(){
        int i=0;
        for(Persoana p:agenda) {
            i++;
            System.out.println(i+". "+p.getNume()+" : "+p.getTelefon());
        }
    }

    public void afiseazaTabel(){
        GridTable g1=new GridTable(agenda.size()+1, 3);
        g1.put(0, 0, Cell.of("Pozitie"));
        g1.put(0, 1, Cell.of("Nume"));
        g1.put(0, 2, Cell.of("Telefon"));

        int i=0;
        for(Persoana p:agenda){
            i++;
            g1.put(i, 0, Cell.of(String.valueOf(i)));
            g1.put(i, 1, Cell.of(p.getNume()));
            g1.put(i, 2, Cell.of(p.getTelefon()));
        }

        g1 = Border.DOUBLE_LINE.apply(g1);
        Util.print(g1);
    }
}
