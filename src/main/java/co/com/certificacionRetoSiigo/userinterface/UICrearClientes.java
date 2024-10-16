package co.com.certificacionRetoSiigo.userinterface;

import co.com.certificacionRetoSiigo.util.ElementosShadow;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;
import org.openqa.selenium.By;

public class UICrearClientes
{

        public static final Target CLICBOTONCREAR = Target.the("Click en el boton crear").located(ByShadow.cssSelector("button", "siigo-header-molecule[class='data-siigo-five9 hydrated']", "siigo-button-atom[data-id='header-create-button']"));
        public static final Target CLICKBOTONCLIENTES = Target.the("Click en el boton clientes").located(ByShadow.cssSelector("a[data-value='Clientes']", "siigo-header-molecule.data-siigo-five9"));
        public static final Target SELECCIONARTIPOPERSONA = Target.the("Seleccionar tipo  persona").located(ElementosShadow.locate(By.xpath("(//siigo-dropdownlist-web)[2]"), "i.mdc-select__dropdown-icon"));
        public static final Target SELECCIONARTIPOPERSONAUL = Target.the("Lista de selección de tipo de persona").located(ElementosShadow.locate(By.xpath("(//siigo-dropdownlist-web)[2]"), "ul"));
        public static final Target SELECCIONARTIPOIDENTIFICACION = Target.the("Seleccionar tipo de identificación").located(ElementosShadow.locate(By.xpath("(//siigo-dropdownlist-web)[3]"),"i.mdc-select__dropdown-icon"));
        public static final Target SELECCIONARTIPOIDENTIFICACIONUL = Target.the("Lista de tipo de identificación").located(ElementosShadow.locate(By.xpath("(//siigo-dropdownlist-web)[3]"), "ul"));
        public static final Target INGRESARIDENTIFICACION = Target.the("Ingresar identificación").located(ElementosShadow.locate(By.xpath("//siigo-identification-input-web[@class='hydrated']"), "input"));
        public static final Target INGRESARCODIGO = Target.the("Ingresar código de sucursal").located(ElementosShadow.locate(By.xpath("(//siigo-textfield-web)[1]"), "input"));
        public static final Target INGRESARNOMBRE = Target.the("Ingresar nombre").located(ElementosShadow.locate(By.xpath("(//siigo-textfield-web)[2]"), "input"));
        public static final Target INGRESARAPELLIDO = Target.the("Ingresar apellido").located(ElementosShadow.locate(By.xpath("(//siigo-textfield-web)[3]"), "input"));
        public static final Target INGRESARNOMBRECOMERCIAL = Target.the("Ingresar nombre comercial").located(ElementosShadow.locate(By.xpath("(//siigo-textfield-web)[5]"), "input"));
        public static final Target LABELCIUDAD = Target.the("Click de ciudad").located(ElementosShadow.locate(By.xpath("(//siigo-autocomplete-web)[1]"), "#labelAutocompleteSelectItemcity"));
        public static final Target INGRESARCIUDAD = Target.the("Ingresar Ciudad para ciudad").located(ElementosShadow.locate(By.xpath("(//siigo-autocomplete-web)[1]"), "input"));
        public static final Target CONTAINER_CITIES = Target.the("Ciudades guardadas").located(ElementosShadow.locate(By.xpath("(//siigo-autocomplete-web)[1]"), "#tableAutocompletecity > tbody"));
        public static final Target INGRESARDIRECCION  = Target.the("Ingresar dirección").located(ElementosShadow.locate(By.xpath("(//siigo-textfield-web)[6]"), "input"));
        public static final Target INGRESAREMAIL  = Target.the("Ingresar correo electrónico").located(ElementosShadow.locate(By.xpath("(//siigo-textfield-web)[9]"), "input"));
        public static final Target INGRESARTELEFONO  = Target.the("Ingresar teléfono").located(ElementosShadow.locate(By.xpath("(//siigo-phone-web)[1]"), "input[aria-labelledby='inputNumber0']"));
        public static final Target SELECCIONARTIPOIVA  = Target.the("Seleccionar régimen IVA").located(ElementosShadow.locate(By.xpath("(//siigo-dropdownlist-web)[4]"), "i.mdc-select__dropdown-icon"));
        public static final Target SELECCIONARTIPOIVAUL  = Target.the("Seleccionar de régimen IVA").located(ElementosShadow.locate(By.xpath("(//siigo-dropdownlist-web)[4]"), "ul"));
        public static final Target INGRESARIDICATIVOFACTURACION  = Target.the("Ingresar indicativo de teléfono").located(ElementosShadow.locate(By.xpath("(//siigo-textfield-web)[10]"), "input"));
        public static final Target INGRESATELEFONOFACTURACION  = Target.the("Ingresar teléfono de facturación").located(ElementosShadow.locate(By.xpath("(//siigo-textfield-web)[11]"), "input"));
        public static final Target INGRESARCODIGOPOSTALFACTURACION  = Target.the("Ingresar código postal").located(ElementosShadow.locate(By.xpath("(//siigo-textfield-web)[12]"), "input"));
        public static final Target SELECCIONARRESPONSABILIDADFISCAL  = Target.the("Ingresar responsabilidad fiscal").locatedBy("//div[contains(text(),'{0}')]");
        public static final Target INGRESARNOMBRECONTACTO  = Target.the("Ingresar para nombre de contacto").located(ByShadow.cssSelector("input", "siigo-textfield-web[name='FirstName']"));
        public static final Target CLICKCONTACTOS  = Target.the("Ingresar contactos").locatedBy("//h3[contains(text(),'Contactos')]");
        public static final Target INGRESARAPELLIDOCONTACTO  = Target.the("Ingresar apellido de contacto").located(ByShadow.cssSelector("input", "siigo-textfield-web[name='LastName']"));
        public static final Target INGRESAREMAILCONTACTO  = Target.the("Ingresar correo de contacto").located(ByShadow.cssSelector("input", "siigo-emailinput-web[name='Email']"));
        public static final Target INGRESARCARGOCONTACTO  = Target.the("Ingresar cargo de contacto").located(ByShadow.cssSelector("input", "siigo-textfield-web[name='Charge']"));
        public static final Target INGRESARINDICATIVOCONTACTO  = Target.the("Ingresar indicativo de contacto").located(ByShadow.cssSelector("input", "siigo-textfield-web[name='Indicative']"));
        public static final Target INGRESARNUMEROTELEFONOCONTACTO  = Target.the("Campo para número de teléfono de contacto").located(ByShadow.cssSelector("input", "siigo-textfield-web[name='Number']"));
        public static final Target CLICKBOTONGUARDAR  = Target.the("Click en botón para guardar").located(By.xpath("//button[contains(text(),'Guardar')]"));
        public static final Target VERIFICARMENSAJE  = Target.the("Verificar mensaje ").located(By.xpath("(//h2[contains(text (), 'Perfil del tercero')])"));


}
