package ldss.ado03.models;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Veiculo {
	private String id;
	private String modelo;
	private String marca;
	private String bateria;
	private String potencia;
	private String torque;
	private String autonomia;
	private String[] images;

	public Veiculo() {
	}

	public Veiculo(String id, String modelo, String marca, String bateria, String potencia, String torque,
			String autonomia, String[] images) {
		this.id = id;
		this.modelo = modelo;
		this.marca = marca;
		this.bateria = bateria;
		this.potencia = potencia;
		this.torque = torque;
		this.autonomia = autonomia;
		this.images = images;
	}


	public static List<Veiculo> fromJson(String filePath) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			// Convert JSON string to Object
			List<Veiculo> veiculos = mapper.readValue(new File(filePath), new TypeReference<List<Veiculo>>() {
			});
			return veiculos;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getBateria() {
		return bateria;
	}

	public void setBateria(String bateria) {
		this.bateria = bateria;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public String getTorque() {
		return torque;
	}

	public void setTorque(String torque) {
		this.torque = torque;
	}

	public String getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(String autonomia) {
		this.autonomia = autonomia;
	}

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}
	
}
