public class Hello1 {

   
    public static void main(String[] args) {
	for(int i=0;i<=4;i++)
{
        System.out.println("Bonjour "+args[i]+"!");
}
    }
}

/*
Ce programme a comme but l'affichage d'un message pour chacun des arguments,pas simultanement.
On entre dans la ligne de commande et on suive le commandes:
-pour entrer dans le dossier ou se trouve le programme: cd desktop\SE-devoir 1-Avram Elena-Loredana 1221F+Enter
-pour creer la classe: javac Hello1.java+Enter
-pour rouler le programme: java Hello1 Michel Andres Claude Cristine+Enter
Resultat:
Bonjour Michel!
Bonjour Andres!
Bonjour Claude!
Bonjour Cristine!

*/