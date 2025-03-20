/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "inv_proyectos")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Proyectos {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_empresa", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Empresa empresaId;
    @Column
    private String codigo;
    @Column
    private String nombre;
    @JoinColumn(name = "id_ano_semestre", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private AnoSemestre anoSemestreId;
    @Column
    private Date fecha_inicio;
    @Column
    private int duracion;
    @JoinColumn(name = "id_tipo_proyecto", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TipoProyectos tipoProyectoId;
    @JoinColumn(name = "id_objetivo_socioec", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private ObjetivoSocioeconomicos objetivoSocioecId;
    @Column
    private String objetivo;
    @Column
    private String palabras_claves;
    @Column
    private String resultados_esperados;
    @JoinColumn(name = "id_financiacion_nac", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private FuenteFinanciacion financiacionNacId;
    @Column
    private BigDecimal valor;
    @JoinColumn(name = "id_financiacion_int", referencedColumnName = "id", nullable = true)
    @ManyToOne(fetch = FetchType.EAGER)
    private FuenteFinanciacion financiacionIntId;
    @Column
    private String id_tipo_gastos;
    @JoinColumn(name = "id_grupo_investigacion", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private GruposInvestigacion grupoInvestigacionId;
    @Column
    private String id_producto;
    @Column
    private int total_investigadores;
    @Column(name= "id_archivo", nullable = true)
    private Integer archivoId;
    @Column
    private char status;
    @Column
    private String user_create;
    @Column
    private Date date_create;
    @Column
    private String user_update;
    @Column
    private Date date_update;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Empresa getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Empresa empresaId) {
        this.empresaId = empresaId;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public AnoSemestre getAnoSemestreId() {
        return anoSemestreId;
    }

    public void setAnoSemestreId(AnoSemestre anoSemestreId) {
        this.anoSemestreId = anoSemestreId;
    }
    
    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public TipoProyectos getTipoProyectoId() {
        return tipoProyectoId;
    }

    public void setTipoProyectoId(TipoProyectos tipoProyectoId) {
        this.tipoProyectoId = tipoProyectoId;
    }

    public ObjetivoSocioeconomicos getObjetivoSocioecId() {
        return objetivoSocioecId;
    }

    public void setObjetivoSocioecId(ObjetivoSocioeconomicos objetivoSocioecId) {
        this.objetivoSocioecId = objetivoSocioecId;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getPalabras_claves() {
        return palabras_claves;
    }

    public void setPalabras_claves(String palabras_claves) {
        this.palabras_claves = palabras_claves;
    }

    public String getResultados_esperados() {
        return resultados_esperados;
    }

    public void setResultados_esperados(String resultados_esperados) {
        this.resultados_esperados = resultados_esperados;
    }

    public FuenteFinanciacion getFinanciacionNacId() {
        return financiacionNacId;
    }

    public void setFinanciacionNacId(FuenteFinanciacion financiacionNacId) {
        this.financiacionNacId = financiacionNacId;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public FuenteFinanciacion getFinanciacionIntId() {
        return financiacionIntId;
    }

    public void setFinanciacionIntId(FuenteFinanciacion financiacionIntId) {
        this.financiacionIntId = financiacionIntId;
    }

    public String getId_tipo_gastos() {
        return id_tipo_gastos;
    }

    public void setId_tipo_gastos(String id_tipo_gastos) {
        this.id_tipo_gastos = id_tipo_gastos;
    }
    
    public GruposInvestigacion getGrupoInvestigacionId() {
        return grupoInvestigacionId;
    }

    public void setGrupoInvestigacionId(GruposInvestigacion grupoInvestigacionId) {
        this.grupoInvestigacionId = grupoInvestigacionId;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }
    
    public int getTotal_investigadores() {
        return total_investigadores;
    }

    public void setTotal_investigadores(int total_investigadores) {
        this.total_investigadores = total_investigadores;
    }

    public Integer getArchivoId() {
        return archivoId;
    }

    public void setArchivoId(Integer archivoId) {
        this.archivoId = archivoId;
    }
    
    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getUser_create() {
        return user_create;
    }

    public void setUser_create(String user_create) {
        this.user_create = user_create;
    }

    public Date getDate_create() {
        return date_create;
    }

    public void setDate_create(Date date_create) {
        this.date_create = date_create;
    }

    public String getUser_update() {
        return user_update;
    }

    public void setUser_update(String user_update) {
        this.user_update = user_update;
    }

    public Date getDate_update() {
        return date_update;
    }

    public void setDate_update(Date date_update) {
        this.date_update = date_update;
    }
    
}
