package parcialprogram2;


public class Main {
    public static void main(String[] args) {
        Dragon dragon = new Dragon("Smaug", 100, 20);
        Mago mago = new Mago("Gandalf", 80, 15);
        Guerrero guerrero = new Guerrero("Conan", 120, 18);

        Arma espada = new Arma("Espada Legendaria", 5);
        Arma baston = new Arma("Bastón de Poder", 7);

        mago.aprenderHechizo("Bola de fuego");
        guerrero.equiparArma(espada);
        mago.equiparArma(baston);

        Batalla.iniciar(mago, guerrero);
        System.out.println("\n----\n");
        Batalla.iniciar(dragon, mago);
    }
}