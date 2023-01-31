package fr.unice.scrabble.scrabblid;

import static org.junit.Assert.*;

import fr.unice.scrabble.scrabblid.model.Joueur;
import fr.unice.scrabble.scrabblid.model.plateau.Plateau;
import org.junit.Test;

public class JoueurTest {
    Joueur j1;
    Plateau plateau;

    @Test
    public void piocheTest() {

        plateau = new Plateau();
        j1 = new Joueur(1);

        plateau.initPioche();
        int taillePioche = plateau.getPioche().size();

        j1.piocher();
        assertEquals(7, j1.getChevalet().size());

        assertEquals(plateau.getPioche().size(), taillePioche - 7);
    }


}
