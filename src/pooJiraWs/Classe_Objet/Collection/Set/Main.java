// Source code is decompiled from a .class file using FernFlower decompiler.
package pooJiraWs.Classe_Objet.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

import Classe_Objet.Collection.Set.Set;

public class Main 
{
    public static void main(String[] args) {
        Set val1 = new Set(1, 1);
        java.util.Set<Set> maset = new HashSet();
        maset.add(val1);
        Iterator var3 = maset.iterator();

        while(var3.hasNext()) {
            Set masetcomplet = (Set)var3.next();
            System.out.println(masetcomplet.getValeur1());
            System.out.println(masetcomplet.getValeur2());
        }

    }
}

