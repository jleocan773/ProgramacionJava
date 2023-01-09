public abstract class Animal {
    abstract Integer getNumPatas();
    abstract Boolean esVolador();
    abstract String hablar();
    abstract Boolean esMamifero();
    final void dormir(){
        System.out.println("Zzzz..");
    }
}
