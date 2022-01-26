package codingame.java.hc;

import java.util.Date;

public class Personne {
 
  private String nom;
  private String prenom;
  private long id;
  private Date dateNaiss;
  private boolean adulte;
 
  public Personne(String nom, String prenom, long id, Date dateNaiss,
    boolean adulte) {
    super();
    this.nom = nom;
    this.prenom = prenom;
    this.id = id;
    this.dateNaiss = dateNaiss;
    this.adulte = adulte;
  }  
}
