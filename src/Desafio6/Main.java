package Desafio6;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Ninja> vila = new LinkedList<>();
        Ninja naruto = new Ninja("Naruto");
        Ninja tobirama = new Ninja("Tobirama");
        Ninja hashirama = new Ninja("Hashirama");
        Ninja shikamaru = new Ninja("Shikamaru");
        Ninja sasuke = new Ninja("Sasuke");
        Ninja gaara = new Ninja("Gaara");
        Ninja kakashi = new Ninja("Kakashi");

        vila.add(naruto);
        vila.add(tobirama);
        vila.add(hashirama);
        vila.add(shikamaru);
        vila.add(sasuke);
        vila.add(gaara);
        vila.add(kakashi);

        System.out.println(vila);
        vila.pop();
        System.out.println(vila.peek());
        System.out.println(vila);
        vila.add(naruto);

        //forcando a usar estrutura de lacos
        for (Ninja ninja : vila){
            System.out.println(ninja);
        }

        vila.addFirst(tobirama);
        vila.removeFirst();

        System.out.println("quinto ninja: ");
        System.out.println( vila.get(5));



    }
}
