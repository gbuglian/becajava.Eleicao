package br.eleicao.app;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.eleicao.app.model.*;
import br.eleicao.app.repository.*;

@SpringBootApplication
public class EleicaoApplication implements CommandLineRunner {

	// Criando propriedade de Interface

	final MunicipioRepository _municipioRepository; 
	final ZonaRepository _zonaRepository;
	final CandidatoRepository  _candidatoRepository;
	final EleitorRepository _eleitorRepository;
	final VotoRepository _votoRepository;

	// Alimentando a propriedade com a construção da Classe

	public EleicaoApplication(MunicipioRepository municipioRepository, EleitorRepository eleitorRepository,
			CandidatoRepository candidatoRepository, VotoRepository votoRepository, ZonaRepository zonaRepository) {
		_municipioRepository = municipioRepository; 
		_eleitorRepository = eleitorRepository;
		_candidatoRepository = candidatoRepository;
		_votoRepository = votoRepository;
		_zonaRepository = zonaRepository;

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

		// Deletando um município

//		Municipio municipio = new Municipio();		
//		municipio.setId(new Long(4));
//		_municipioRepository.delete(municipio);;
//		System.out.println("Município deletado com sucesso!");

		// Atualizando um município

//		Municipio municipio = new Municipio();
//		municipio.setId(new Long(2));
//		municipio.setNome("São Paulo");
//		municipio.setPopulacao(14000000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município atualizado com sucesso!");

		// Selecionando apenas UM município

//		Optional<Municipio> municipio = _municipioRepository.findById(new Long(2));
//		System.out.println("Município: " + municipio.get().getNome());

		// Selecionando todos os municípios

//		Iterable<Municipio> municipios = _municipioRepository.findAll();		
//		for(Municipio m : municipios) {
//			System.out.println("Município: " + m.getNome());
//		}

		// -----------------------------------------------------------
		// Aqui começa os comandos de Candidato !!

		// Salvar Candidato
		
//		Candidato candidato = new Candidato();
//		Municipio municipio = new Municipio();
//		municipio.setId(2l);
//		candidato.setNome("Gabriel do povo");
//		candidato.setNumero("282888");
//		candidato.setMunicipio(municipio);
//		candidato.setTipo("Vereador");
//		_candidatoRepository.save(candidato);
//		System.out.println("Candidato salvo com sucesso!");
//
//		candidato = new Candidato();
//		municipio = new Municipio();
//		municipio.setId(3l);
//		candidato.setNome("Gabriel da roça");
//		candidato.setNumero("979777");
//		candidato.setMunicipio(municipio);
//		candidato.setTipo("Vereador");
//		_candidatoRepository.save(candidato);
//		System.out.println("Candidato salvo com sucesso!");
//
//		candidato = new Candidato();
//		municipio = new Municipio();
//		municipio.setId(5l);
//		candidato.setNome("Gabriel da quebrada");
//		candidato.setNumero("898999");
//		candidato.setMunicipio(municipio);
//		candidato.setTipo("Vereador");
//		_candidatoRepository.save(candidato);
//		System.out.println("Candidato salvo com sucesso!");

		// Deletando um Candidato

//		Candidato candidato = new Candidato();		
//		candidato.setId(new Long(3));
//		_candidatoRepository.delete(candidato);
//		System.out.println("Candidato deletado com sucesso!");

		// Atualizando um Candidato

//		Candidato candidato = new Candidato();
//		candidato.setId(new Long(1));
//		candidato.setNumero("565666");
//		candidato.setNome("Gabriel do povo");
//		candidato.setTipo("Vereador");
//		_candidatoRepository.save(candidato);		
//		System.out.println("Candidato atualizado com sucesso!");

		// Selecionando apenas um Candidato

//		Optional<Candidato> candidato = _candidatoRepository.findById(new Long(2));
//		System.out.println("Candidato: " + candidato.get().getNumero());
//		System.out.println("Nome: " + candidato.get().getNome());
//		System.out.println("Tipo: " + candidato.get().getTipo());

		// Selecionando todos os Candidatos

//		Iterable<Candidato> candidato = _candidatoRepository.findAll();		
//		for(Candidato c : candidato) {
//			System.out.println("Candidato nº: " + c.getNumero());	
//			System.out.println("Candidato nome: " + c.getNome());
//			System.out.println("Colocação: " + c.getTipo());
//		}

		// -----------------------------------------------------------
		// Aqui começa os comandos de Eleitor !!

		// Salvar Eleitor

//		Eleitor eleitor = new Eleitor();
//		eleitor.setNome("Gabriel");
//		_eleitorRepository.save(eleitor);
//		System.out.println("Eleitor salvo com sucesso!");

//		eleitor = new Eleitor();
//		eleitor.setNome("Carlos");
//		_eleitorRepository.save(eleitor);
//		System.out.println("Eleitor salvo com sucesso!");

//		eleitor = new Eleitor();
//		eleitor.setNome("Guilherme");
//		_eleitorRepository.save(eleitor);
//		System.out.println("Eleitor salvo com sucesso!");

		// Deletando um Eleitor

//		Eleitor eleitor = new Eleitor();		
//		eleitor.setId(new Long(3));
//		_eleitorRepository.delete(eleitor);
//		System.out.println("Eleitor deletado com sucesso!");

		// Atualizando um Eleitor

//		Eleitor eleitor = new Eleitor();
//		eleitor.setId(new Long(1));
//		eleitor.setNome("Gabriel Eu");
//		_eleitorRepository.save(eleitor);		
//		System.out.println("Eleitor atualizado com sucesso!");

		// Selecionando apenas um Eleitor

//		Optional<Eleitor> eleitor = _eleitorRepository.findById(new Long(1));
//		System.out.println("Nome do Eleitor: " + eleitor.get().getNome());

		// Selecionando todos os Eleitores

//		Iterable<Eleitor> eleitor = _eleitorRepository.findAll();		
//		for(Eleitor e : eleitor) {
//			System.out.println("Eleitor nome: " + e.getNome());
//		}

		// -----------------------------------------------------------
		// Aqui começa os comandos de Voto !!
		
		// Salvar Voto

//		Voto voto = new Voto();
//			
//		Zona zona = new Zona();
//		zona.setId(2l);
//		voto.setZona(zona);
//		
//		Eleitor eleitor = new Eleitor();
//		eleitor.setId(2l);
//		voto.setEleitor(eleitor);
//		
//		Candidato candidato = new Candidato();
//		candidato.setId(2l);
//		voto.setCandidato(candidato);
//		
//		_votoRepository.save(voto);
//		System.out.println("Voto salva com sucesso!");

//		voto = new Voto();
//		zona = new Zona();
//		zona.setId(1l);
//		eleitor = new Eleitor();
//		eleitor.setId(2l);
//		candidato = new Candidato();
//		candidato.setId(3l);
//		voto.setZona(zona);
//		voto.setCandidato(candidato);
//		voto.setEleitor(eleitor);
//		_votoRepository.save(voto);
//		System.out.println("Voto salva com sucesso!");

//		voto = new Voto();
//		zona = new Zona();
//		zona.setId(1l);
//		eleitor = new Eleitor();
//		eleitor.setId(6l);
//		candidato = new Candidato();
//		candidato.setId(5l);
//		voto.setZona(zona);
//		voto.setCandidato(candidato);
//		voto.setEleitor(eleitor);
//		_votoRepository.save(voto);
//		System.out.println("Voto salva com sucesso!");

		// Deletando um Voto

//		Voto voto = new Voto();		
//		voto.setId(new Long(1));
//		_votoRepository.delete(voto);;
//		System.out.println("Voto deletado com sucesso!");
		

		// Atualizando um Voto

//		Voto voto = new Voto();
//		voto.setId(new Long(2));
		
//		Zona zona = new Zona();
//		zona.setId(2l);
//		voto.setZona(zona);
		
//		Eleitor eleitor = new Eleitor();
//		eleitor.setId(2l);
//		voto.setEleitor(eleitor);
		
//		Candidato candidato = new Candidato();
//		eleitor.setId(2l);
//		voto.setCandidato(candidato);
				
//		_votoRepository.save(voto);		
//		System.out.println("Voto atualizada com sucesso!");

		// Selecionando apenas um Voto

//		Optional<Voto> voto = _votoRepository.findById(new Long(2));
//		System.out.println("Voto: " + voto.get().getId());

		// Selecionando todos os Votos

//		Iterable<Voto> voto = _votoRepository.findAll();		
//		for(Voto v : voto) {
//			System.out.println("Voto nº: " + v.getId());
//		}

		// -----------------------------------------------------------
		// Aqui começa os comandos de Zona Eleitoral !!

		// Salvar Zona Eleitoral

		Zona zona = new Zona();
		zona.setNumero("24563");
		_zonaRepository.save(zona);
		System.out.println("Zona salva com sucesso!");

		zona = new Zona();
		zona.setNumero("647352");
		_zonaRepository.save(zona);
		System.out.println("Zona salva com sucesso!");

		zona = new Zona();
		zona.setNumero("623547");
		_zonaRepository.save(zona);
		System.out.println("Zona salva com sucesso!");

		// Deletando uma Zona Eleitoral

//		Zona zona = new Zona();		
//		zona.setId(new Long(1));
//		_zonaRepository.delete(zona);;
//		System.out.println("Zona deletada com sucesso!");
//		

		// Atualizando uma Zona Eleitoral

//		Zona zona = new Zona();
//		zona.setId(new Long(2));
//		zona.setNumero("12345");
//		_zonaRepository.save(zona);		
//		System.out.println("Zona atualizada com sucesso!");

		// Selecionando apenas uma Zona Eleitoral

//		Optional<Zona> zona = _zonaRepository.findById(new Long(2));
//		System.out.println("Zona: " + zona.get().getNumero());

		// Selecionando todos as Zonas Eleitorais

//		Iterable<Zona> zona = _zonaRepository.findAll();		
//		for(Zona z : zona) {
//		System.out.println("Zona Eleitoral nº: " + z.getNumero());
//		
//		}

	}

}