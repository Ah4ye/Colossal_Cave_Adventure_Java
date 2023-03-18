/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colossal_cave_adventure;

/**
 *
 * @author ahaye
 */
public class Story {
    private String name ;
    public Story(String s)
    {
        this.name = s;
    }
    
    public void raconte(String s){
        switch(s)
        {
            case "init" -> Context();
            case "Debut" -> Debut();
            case "Milieu" -> Milieu();
            case "Fin" -> Fin();
        }
    }
    public void Context()
    {
        System.out.println( "Haha so you are " + name+" the newbie" );
        System.out.println( "..."+"Haha"+".."  );
        System.out.println( "That was just a joke.."  );
        System.out.println( "Ok "+name + " listen to my story.. "  );
        System.out.println( ""  );
        
        
        
        System.out.println( "Depuis des temps immémoriaux dans cette contré d'ou nous sommes, vivait, un Homme bienheureux.");
        System.out.println("Cette Homme était si beau, et charmant que j'ai décider de lui offrir un Artefact, le Graal !");
        System.out.println("Cet Artefact, lui permetta d'accéder a tout ces désirs, y compris un Grand Pouvoir");
        System.out.println("Il devint richissime, et partageais avec quiquonque ploierait le genoux a son service.");
        System.out.println("Bref un chic type voyez-vous..");
        System.out.println("Malheureusement il égara cet Artefact..");
        System.out.println("Et par ailleurs cette Richesse lui value autant de fidèle, que la jalousie des autres, notament d'un certains Alexis !");
        System.out.println("Un personnage odieux, connu pour ses mensonges et ces tours de passe-passe, à tel point qu'on surnommait ");
        System.out.println("tous ces coups, 'Les Fourberies de Scapin'.. ");
        System.out.println("Ce fourbe dépossedat notre Roi par sa Ruse, de toute ces richesse, et usurpat son trone tel un vil faquin");
        System.out.println("C'est pourquoi j'ai decider que tu devais remedier à son sort, par la Sainte Justice Divine !!!");
        System.out.println("Trouve le Graal que j'ai spécialement conçus pour lui, et retablie la Bénédiction que je lui est faite..");
        System.out.println();
        System.out.println("En Route alors jeune Plebien !");
        System.out.println("Sors donc de ce tas de bouse qui te sert de Maison");
        System.out.println("Retrouve le Roi et aide le à retrouver L'Artefact !");
        System.out.println("Il me semble l'avoir aperçu près du Marais, Bonne chance !");
        System.out.println(" TAPEZ HELP SI BESOIN AIDE");
    
    }
    public void Debut(){
      
        System.out.println("*Notre jeune Heros sors alors de son tas de crottin*");
        System.out.println("Et se met en chemin...");
        System.out.println("Se trouve devant vous un 'Chemin'  ");
    }
    public void Milieu(){
        System.out.println("Vous etes dans une lugubre piece derriere vous se trouve 'Chemin' et il y a aussi une 'Fenetre' ");
    }
    public void Fin(){
        System.out.println("Vous etes dehors mais encercler par des murs se trouve derriere vous 'Fenetre'  ");
    }
}
