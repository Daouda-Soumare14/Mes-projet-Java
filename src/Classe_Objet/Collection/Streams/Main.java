/*
package pooJiraWs.Classe_Objet.Collection.Streams;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        List<Humain> humainList = Arrays.asList(
                new Humain("soumare", "daouda", List.of("rachid"), 23, new Date(), 12344054543L),
                new Humain("soumare", "hamidou", List.of("bouba", "camara", "lassana"), 25, new Date(), 12344154543L),
                new Humain("soumare", "zakaria", List.of("eljay"), 24, new Date(), 12342454543L),
                new Humain("fofana", "abdou", List.of("samba"), 29, new Date(), 12344354543L)
        );

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("permet d'afficher s'il y a une personne qui a pluis de 20 ans dans liste");
        // permet d'afficher s'il y a une personne qui a pluis de 20 ans dans liste
        if (humainList.stream().anyMatch(humain -> humain.getAge() >= 20)){
            System.out.println("il y'a bien un humain agé de plus de 20 ans");
        }

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Filtrer les Humains ayant un âge supérieur ou égal à 25 ans et les stocker dans une nouvelle liste");
        // Filtrer les Humains ayant un âge supérieur ou égal à 25 ans et les stocker dans une nouvelle liste
        List<Humain> vieuxHumainList = humainList.stream().filter(humain -> humain.getAge() >= 25).toList();

        // Parcourir la liste des Humains ayant un âge supérieur ou égal à 25 ans et afficher leur prénom
        vieuxHumainList.forEach(humain -> System.out.println(humain.getPrenom()));

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Filtrer les Humains ayant un âge supérieur ou égal à 25 ans et mapper leur numéro social dans une nouvelle liste");
        // Filtrer les Humains ayant un âge supérieur ou égal à 25 ans et mapper leur numéro social dans une nouvelle liste
        List<Long> humainAgeDePlusDevingtAns = humainList.stream().filter(humain -> humain.getAge() >= 25).map(Humain::getNumeroSocial).toList();

        // Afficher la liste des numéros sociaux des Humains ayant un âge supérieur ou égal à 25 ans
        System.out.println(humainAgeDePlusDevingtAns);


        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Filtrer les Humains ayant un âge supérieur ou égal à 25 ans, puis mapper les listes d'autres prénoms dans une seule liste");
        // Filtrer les Humains ayant un âge supérieur ou égal à 25 ans, puis mapper les listes d'autres prénoms dans une seule liste
        List<String> autresPrenomList = humainList.stream().filter(humain -> humain.getAge() >= 25).flatMap(humain -> humain.getAutresPrenomList().stream()).toList();

        // Afficher la liste des autres prénoms des Humains ayant un âge supérieur ou égal à 25 ans
        System.out.println(autresPrenomList);


    }
}
*/
