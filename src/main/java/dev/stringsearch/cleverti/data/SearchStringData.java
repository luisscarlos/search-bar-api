package dev.stringsearch.cleverti.data;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class SearchStringData {

	String[] stations = {
			"Abrantes",
			 "Ad�mia",
			 "Afife",
			 "Agualva-Cac�m",
			 "Aguda",
			 "Aguim",
			 "Albergaria dos Doze",
			 "Alcaide",
			 "Alcains",
			 "Barragem de Belver",
			 "Vila Me�",
			 "Aregos",
			 "Areia-Darque",
			 "Arentim",
			 "Areosa",
			 "Arronches",
			 "Assumar",
			 "Avanca",
			 "Aveiro",
			 "Aveleda",
			 "Azambuja",
			 "Baixa da Banheira",
			 "Bara�al",
			 "Barca da Amieira-Envendos",
			 "Barcelos",
			 "Barqueiros",
			 "Barquinha",
			 "Barreiro",
			 "Barreiro-A",
			 "Barrimau",
			 "Barroselas",
			 "Beja",
			 "Belver-Gavi�o",
			 "Bel�m",
			 "Bemposta",
			 "Bencanta",
			 "Benfica",
			 "Benqueren�as",
			 "Bobadela",
			 "Boliqueime",
			 "Bombarral",
			 "Braga",
			 "Bra�o de Prata",
			 "Bustelo",
			 "Cabeda",
			 "Cacela",
			 "Cacia",
			 "Cais do Sodr�",
			 "Caldas da Rainha",
			 "Caldas de Moledo",
			 "Caminha",
			 "Campolide",
			 "Canas-Felgueira",
			 "Canelas",
			 "Cani�os",
			 "Carape�os",
			 "Carcavelos",
			 "Carrascal-Delongo",
			 "Carregado",
			 "Carregal do Sal",
			 "Carreira",
			 "Carre�o",
			 "Carvalha",
			 "Carvalheira-Maceda",
			 "Carvalhos de Figueiredo",
			 "Casa Branca",
			 "Casais",
			 "Cascais",
			 "Castanheira do Ribatejo",
			 "Castelejo",
			 "Castelo Branco",
			 "Castelo Novo",
			 "Caxarias",
			 "Caxias",
			 "Ca�de",
			 "Celorico da Beira",
			 "Cerdeira",
			 "Chan�a",
			 "Coimbra"};
	
	
	
	public String[] getStations() {
		Arrays.sort(stations);
		return this.stations;
	}
}
