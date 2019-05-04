package br.com.fiap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_SGC_PLANTA_INFO")
@SequenceGenerator(name = "planta_info", sequenceName = "SQ_T_SGC_PLANTA_INFO", allocationSize = 1)
public class PlantaInfo {

	@Id
	@Column(name = "cd_planta_info")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "planta_info")
	private int codigo;

	@Column(name = "nm_planta_info", nullable = false, length=80)
	private String nome;

	@Column(name = "nm_especie", length=80)
	private String nomeEspecie;

	@Column(name = "ds_temperatura_ideal", length=50)
	private String temperaturaIdeal;

	@Column(name = "ds_umidade_ideal", length=50)
	private String umidadeIdeal;

	@Column(name = "ds_luminosidade_ideal", length=50)
	private String luminosidadeIdeal;

	@Column(name = "ds_rega_ideal", length=50)
	private String regaIdeal;

	@Column(name = "ds_periodo_plantio_ideal", length=50)
	private String periodoPlantioIdeal;

	@Column(name = "ds_periodo_colheita_ideal", length=50)
	private String periodoColheitaIdeal;

	@Column(name = "ds_cuidados_especiais", length=200)
	private String cuidadosEspeciais;

	@Column(name = "ds_plantas_convivencia", length=200)
	private String plantasConvivencia;

	@Column(name = "fl_foto_planta_info")
	@Lob
	private byte[] foto;

//	@OneToMany(mappedBy="departamento", cascade = CascadeType.PERSIST)
//	private List<AtualizacaoPlantaInfo> atualizacoesPlantaInfo = new ArrayList<AtualizacaoPlantaInfo>;
	
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeEspecie() {
		return nomeEspecie;
	}

	public void setNomeEspecie(String nomeEspecie) {
		this.nomeEspecie = nomeEspecie;
	}

	public String getTemperaturaIdeal() {
		return temperaturaIdeal;
	}

	public void setTemperaturaIdeal(String temperaturaIdeal) {
		this.temperaturaIdeal = temperaturaIdeal;
	}

	public String getUmidadeIdeal() {
		return umidadeIdeal;
	}

	public void setUmidadeIdeal(String umidadeIdeal) {
		this.umidadeIdeal = umidadeIdeal;
	}

	public String getLuminosidadeIdeal() {
		return luminosidadeIdeal;
	}

	public void setLuminosidadeIdeal(String luminosidadeIdeal) {
		this.luminosidadeIdeal = luminosidadeIdeal;
	}

	public String getRegaIdeal() {
		return regaIdeal;
	}

	public void setRegaIdeal(String regaIdeal) {
		this.regaIdeal = regaIdeal;
	}

	public String getPeriodoPlantioIdeal() {
		return periodoPlantioIdeal;
	}

	public void setPeriodoPlantioIdeal(String periodoPlantioIdeal) {
		this.periodoPlantioIdeal = periodoPlantioIdeal;
	}

	public String getPeriodoColheitaIdeal() {
		return periodoColheitaIdeal;
	}

	public void setPeriodoColheitaIdeal(String periodoColheitaIdeal) {
		this.periodoColheitaIdeal = periodoColheitaIdeal;
	}

	public String getCuidadosEspeciais() {
		return cuidadosEspeciais;
	}

	public void setCuidadosEspeciais(String cuidadosEspeciais) {
		this.cuidadosEspeciais = cuidadosEspeciais;
	}

	public String getPlantasConvivencia() {
		return plantasConvivencia;
	}

	public void setPlantasConvivencia(String plantasConvivencia) {
		this.plantasConvivencia = plantasConvivencia;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	
/*	
	public List<AtualizacaoPlantaInfo> getAtualizacoesPlantaInfo() {
		return atualizacoesPlantaInfo;
	}

	public void setAtualizacoesPlantaInfo(List<AtualizacaoPlantaInfo> atualizacoesPlantaInfo) {
		this.atualizacoesPlantaInfo = atualizacoesPlantaInfo;
	}
*/
	
}
