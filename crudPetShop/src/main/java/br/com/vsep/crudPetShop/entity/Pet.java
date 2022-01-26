package br.com.vsep.crudPetShop.entity;

public class Pet {

	private Integer idPet;
	private String tipoAnimal;
	private String nome;
	private String raca;
	private String porte;
	private String dataReserva;
	private String horario;

	public Pet() {

	}

	public Pet(String tipoAnimal, String nome, String raca, String porte, String dataReserva, String horario) {
		super();
		this.tipoAnimal = tipoAnimal;
		this.nome = nome;
		this.raca = raca;
		this.porte = porte;
		this.dataReserva = dataReserva;
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Pet [tipoAnimal=" + tipoAnimal + ", nome=" + nome + ", raca=" + raca + ", porte=" + porte + ", data="
				+ dataReserva + ", horario=" + horario + "]";
	}

	public Integer getIdPet() {
		return idPet;
	}

	public void setIdPet(Integer idPet) {
		this.idPet = idPet;
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(String dataReserva) {
		this.dataReserva = dataReserva;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

}
