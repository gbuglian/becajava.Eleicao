package br.eleicao.app;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.eleicao.app.model.Municipio;
import br.eleicao.app.model.Zona;
import br.eleicao.app.repository.MunicipioRepository;
import br.eleicao.app.repository.ZonaRepository;


@SpringBootApplication
public class EleicaoApplication implements CommandLineRunner {

//	final MunicipioRepository _municipioRepository; // Criando propriedade da Interface Municipio
	final ZonaRepository _zonaRepository;
	
//	public EleicaoApplication(MunicipioRepository municipioRepository) { // Alimentando a propriedade com a construção da Classe
//		this._municipioRepository = municipioRepository; 
//	}
	
	public EleicaoApplication(ZonaRepository zonaRepository) {
		this._zonaRepository = zonaRepository; 
	}

	public static void main(String[] args) {
		SpringApplication.run(EleicaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// -----------------------------------------------------------
		// Aqui começa os comando de Municipio !!!

		// Salvar Município
//		Municipio municipio = new Municipio();
//		municipio.setNome("São Paulo");
//		municipio.setPopulacao(14000000);
//		_municipioRepository.save(municipio);
//		System.out.println("Município salvo com sucesso!");


		
//		municipio = new Municipio();
//		municipio.setNome("Sorocaba");
//		municipio.setPopulacao(140000);
//		_municipioRepository.save(municipio);
//		System.out.println("Município salvo com sucesso!");

		
		
//		municipio = new Municipio();
//		municipio.setNome("Guarulhos");
//		municipio.setPopulacao(1400000);
//		_municipioRepository.save(municipio);
//		System.out.println("Município salvo com sucesso!");

		
		
//		 Deletando um município
//		Municipio municipio = new Municipio();		
//		municipio.setId(new Long(4));
//		_municipioRepository.delete(municipio);;
//		System.out.println("Município deletado com sucesso!");
		

		
//		//Atualizando um município
//		Municipio municipio = new Municipio();
//		municipio.setId(new Long(2));
//		municipio.setNome("São Paulo");
//		municipio.setPopulacao(14000000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município atualizado com sucesso!");
		

		
//		//Selecionando apenas UM município
//		Optional<Municipio> municipio = _municipioRepository.findById(new Long(2));
//		System.out.println("Município: " + municipio.get().getNome());
		

		
//		//Selecionando todos os municípios
//		Iterable<Municipio> municipios = _municipioRepository.findAll();		
//		for(Municipio m : municipios) {
//			System.out.println("Município: " + m.getNome());
//		}
		
		
		// -----------------------------------------------------------
		//Aqui começa os comandos de Zona Eleitoral !!
		
		
		// Salvar Zona Eleitoral
		Zona zona = new Zona();
		zona.setNumero("24563");
		_zonaRepository.save(zona);
		System.out.println("Município salvo com sucesso!");


		
		zona = new Zona();
		zona.setNumero("647352");
		_zonaRepository.save(zona);
		System.out.println("Município salvo com sucesso!");

		
		
		zona = new Zona();
		zona.setNumero("623547");
		_zonaRepository.save(zona);
		System.out.println("Município salvo com sucesso!");


		
		
		// Deletando uma Zona Eleitoral
//		Zona zona = new Zona();		
//		zona.setId(new Long(1));
//		_zonaRepository.delete(zona);;
//		System.out.println("Município deletado com sucesso!");
//		

		
		//Atualizando uma município
//		Zona zona = new Zona();
//		zona.setId(new Long(2));
//		zona.setNumero("12345");
//		_zonaRepository.save(zona);		
//		System.out.println("Município atualizado com sucesso!");
		

		
		//Selecionando apenas uma Zona Eleitoral
//		Optional<Zona> zona = _zonaRepository.findById(new Long(2));
//		System.out.println("Município: " + zona.get().getNumero());
		

		
		//Selecionando todos os municípios
//		Iterable<Zona> zona = _zonaRepository.findAll();		
//		for(Zona z : zona) {
//		System.out.println("Zona Eleitoral nº: " + z.getNumero());
//		
//		}
		
		

	}

}