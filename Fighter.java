package devoir2;

import java.util.Random;

public class Fighter extends Robot {
	
//super est utiliser par les classes fille pour recuperer les elements des constructeurs pour les reeutiliser.



	private String nom;
	private int nbrVie, graine;
	
	public Fighter()
	{ super();
	this.nom="";
	this.nbrVie=10;
	this.graine=0;
		}
	public Fighter(String n)
	{ 
		
	this.nom= "Fighter " + n;
	this.nbrVie=10;
	this.graine=0;}
	
	public Fighter(String n, int nbr, int g)
	{ super();
	this.nom= "Fighter " + n;
	this.nbrVie=nbr;
	this.graine=g;
		}
	
	
	public Fighter(Fighter R)
	{ super();
	this.nom=R.nom;
	this.nbrVie=R.nbrVie;
	this.graine=R.graine;
		}
	
	public void setnom(String n) {
		this.nom=n;
	}
	public void setnbrVie(int n) {
		this.nbrVie=n;
	}
	public void setgraine(int n) {
		this.graine=n;
	}
	
	public String getnom() {
		return nom;
	}
	
	public int getnbrVie() {
		return nbrVie;
	}
	public int getgraine() {
		return graine;
	}
	public boolean isDead() {
		 boolean etat=false;
		 if(this.nbrVie<=0) {etat=true;}
		 else {etat=false;}
			 return etat;
	 }
		
	public void affiche() {System.out.println("Je suis le " + nom );}
	
	Random d = new Random();
	public void fire(Fighter F){
		 
		if(d.nextBoolean()){
			F.nbrVie-=2;
			System.out.println(F.nom +" a ete touché par " + this.nom);
			}
	 }
	
	public void fire(Robot R){
		 
		if(d.nextBoolean()){
			R.setnbrVie(R.getnbrVie()-2);
			System.out.println(R.getnom() +" a ete touché par " + this.nom);
			}
	 }
}
