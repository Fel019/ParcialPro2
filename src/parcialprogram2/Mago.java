/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialprogram2;

import java.util.ArrayList;
import java.util.List;

public class Mago extends Criatura implements Magico {
    private List<String> hechizos = new ArrayList<>();

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        lanzarHechizo(objetivo);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " tiene ahora " + salud + " de salud.");
    }

    @Override
    public void lanzarHechizo(Criatura objetivo) {
        int daño = fuerza;
        if (arma != null) daño += arma.atacarConArma();
        System.out.println(nombre + " lanza un hechizo a " + objetivo.nombre + " causando " + daño + " de daño.");
        objetivo.defender(daño);
    }

    @Override
    public void aprenderHechizo(String hechizo) {
        hechizos.add(hechizo);
        System.out.println(nombre + " ha aprendido el hechizo: " + hechizo);
    }
}
