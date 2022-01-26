package br.com.vsep.crudPetShop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.vsep.crudPetShop.entity.Pet;
import br.com.vsep.crudPetShop.persistence.PetDao;

@Controller
public class PetController {

	@GetMapping("/")
	public ModelAndView index(Model model) throws Exception {
		PetDao petDao = new PetDao();
		List<Pet> listaDeReservas = petDao.bucarReservas();
		model.addAttribute("listaDeReservas", listaDeReservas);

		return new ModelAndView("index");
	}

	@PostMapping("reservar")
	public String reserva(@RequestParam(value = "tipoAnimal", required = false) String tipoAnimal,
			@RequestParam(value = "nome", required = false) String nome,
			@RequestParam(value = "raca", required = false) String raca,
			@RequestParam(value = "porte", required = false) String porte,
			@RequestParam(value = "dataReserva", required = false) String dataReserva,
			@RequestParam(value = "horario", required = false) String horario) {

		Pet pet = new Pet(tipoAnimal, nome, raca, porte, dataReserva, horario);
		PetDao petDao = new PetDao();

		try {
			petDao.cadastroPet(pet);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return "redirect:/";
	}

	@PostMapping("cancelar")
	public String cancelar(@RequestParam(value = "id", required = false) Integer id) {

		PetDao petDao = new PetDao();
		try {
			petDao.cancelarReserva(id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:/";
	}

	@PostMapping("update")
	public String update(@RequestParam(value = "tipoAnimal", required = false) String tipoAnimal,
			@RequestParam(value = "nome", required = false) String nome,
			@RequestParam(value = "raca", required = false) String raca,
			@RequestParam(value = "porte", required = false) String porte,
			@RequestParam(value = "dataReserva", required = false) String dataReserva,
			@RequestParam(value = "horario", required = false) String horario,
			@RequestParam(value = "idPet", required = false) Integer idPet) {

		Pet pet = new Pet();
		PetDao petDao = new PetDao();

		try {
			pet.setIdPet(idPet);
			pet.setNome(nome);
			pet.setTipoAnimal(tipoAnimal);
			pet.setRaca(raca);
			pet.setPorte(porte);
			pet.setDataReserva(dataReserva);
			pet.setHorario(horario);
			petDao.atualizarReserva(pet);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return "redirect:/";
	}
}
