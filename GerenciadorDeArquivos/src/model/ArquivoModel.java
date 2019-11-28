package model;

import sun.util.resources.pt.CalendarData_pt;

public class ArquivoModel {
	//conteudo
	//data de modificação dos inodes
	//data de modificação do arquivo
	//tamanho
	//data de criação
	
	CalendarData_pt dataCriacao = new CalendarData_pt();
	CalendarData_pt dataAteracaoArquivo = new CalendarData_pt();
	CalendarData_pt dataAlteracaoInode = new CalendarData_pt();
	int tamanho;
	int ID;
	
	
}
