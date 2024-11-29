package Modelo;

public class Persona {

	String idUsuario;
	String nom;
	String tel;
	String contra;
	String coment;
	
	public Persona(){
		
	}
	public Persona(String idUsuario,String nom,String tel,String contra,String coment) {
	   this.idUsuario = idUsuario;
	   this.nom = nom;
	   this.tel = tel;
	   this.contra = contra;
	   this.coment = coment;		
	   System.out.println("El valor es: " + idUsuario);	
	}
	
	
	//Métodos getter y setter (opcional)
	public String  getIdUsuario() {
	    return idUsuario;
	}

	public void setIdUsuario(String  idUsuario) {
	    this.idUsuario = idUsuario;
	}

	public String  getNombre() {
	    return nom;
	}

	public void setNombre(String  nom) {
	    this.nom = nom;
	}


	public String  getContrasena() {
	    return contra;
	}
	public void setContrasena(String  contra) {
	    this.contra =contra;
	}

	public String  getTelefono() {
	    return tel;
	}
	public void setTelefono(String  tel) {
	    this.tel =tel;
	}

	public String  getComentarios() {
	    return coment;
	}
	public void setSexo(String  coment) {
	    this.coment =coment;
	}

	
}
