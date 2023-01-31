package fr.unice.scrabble.scrabblid.model;

import static org.junit.Assert.*;

import fr.unice.scrabble.scrabblid.model.plateau.Plateau;
import fr.unice.scrabble.scrabblid.model.plateau.enumValeurCase;
import org.junit.Test;


public class CommunTest {

    Plateau plateau;

    @Test
    public void initPiocheTest() {
        plateau = new Plateau();

        plateau.initPioche();
        assertEquals(100, plateau.getPioche().size());
        plateau.getPioche().remove(plateau.getPioche().size()-1);
        assertEquals(99, plateau.getPioche().size());
    }


    @Test
    public void setValeurLettreTest() {
        plateau = new Plateau();

        plateau.setValeurLettre();

        assertEquals(1, plateau.getValeurDuneLettre('A').intValue());
        assertEquals(4, plateau.getValeurDuneLettre('F').intValue());
        assertEquals(10, plateau.getValeurDuneLettre('W').intValue());
    }


    @Test
    public void initPlateauTest() {
        plateau = new Plateau();

        plateau.initPlateau();

        assertEquals(enumValeurCase.MOT_COMPTE_TRIPLE, plateau.getPlateauDuJeu()[0][0].getValeurCase());
        assertEquals(enumValeurCase.LETTRE_COMPTE_DOUBLE, plateau.getPlateauDuJeu()[8][12].getValeurCase());
        assertEquals(enumValeurCase.MOT_COMPTE_TRIPLE, plateau.getPlateauDuJeu()[14][14].getValeurCase());


    }

}

