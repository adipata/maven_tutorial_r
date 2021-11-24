package lu.pata.chitibus.app;

import lu.pata.chitibus.pojo.*;


public class MainProgram {
	public static void main(String[] args){
		Agenda agenda=new Agenda();

        agenda.adauga("Nathalie","1234");
        agenda.adauga("Leon","5678");
        agenda.adauga("Roxana","9ABC");
        agenda.adauga("Adi","DEFG");

        agenda.afiseaza();
        agenda.afiseazaTabel();
	}
}