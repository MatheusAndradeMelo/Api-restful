package br.org.serratec.backend.dto;

import java.io.Serializable;

import br.org.serratec.backend.model.Endereco;

public class EnderecoDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8753494633742468821L;

	private String cep;
	private String logradouro;
	private String bairro;
	private String localidade;
	private String uf;

	public EnderecoDTO() {
	}

	public EnderecoDTO(Endereco endereco) {
		super();
		this.cep = endereco.getCep();
		this.logradouro = endereco.getLogradouro();
		this.bairro = endereco.getBairro();
		this.localidade = endereco.getLocalidade();
		this.uf = endereco.getUf();
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
