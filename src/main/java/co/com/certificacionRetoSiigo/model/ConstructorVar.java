package co.com.certificacionRetoSiigo.model;



public class ConstructorVar
{

    private String userName;
    private String password;
    private String tipoPersona;
    private String tipoIdentificacion;
    private String identificacion;
    private String tipoIva;
    private String indicativo;
    private String checkResponsabilidadFiscal;
    private String cargoContacto;


    public ConstructorVar(String userName, String password, String tipoPersona, String tipoIdentificacion,String identificacion, String tipoIva, String indicativo, String checkResponsabilidadFiscal, String cargoContacto ) {
        this.userName = userName;
        this.password = password;
        this.tipoPersona = tipoPersona;
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
        this.tipoIva = tipoIva;
        this.indicativo = indicativo;
        this.checkResponsabilidadFiscal = checkResponsabilidadFiscal;
        this.cargoContacto = cargoContacto;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipoIva() {
        return tipoIva;
    }

    public void setTipoIva(String tipoIva) {
        this.tipoIva = tipoIva;
    }

    public String getIndicativo() {
        return indicativo;
    }

    public void setIndicativo(String indicativo) {
        this.indicativo = indicativo;
    }

    public String getCheckResponsabilidadFiscal() {
        return checkResponsabilidadFiscal;
    }

    public void setCheckResponsabilidadFiscal(String checkResponsabilidadFiscal) {
        this.checkResponsabilidadFiscal = checkResponsabilidadFiscal;
    }

    public String getCargoContacto() {
        return cargoContacto;
    }

    public void setCargoContacto(String cargoContacto) {
        this.cargoContacto = cargoContacto;
    }
}
