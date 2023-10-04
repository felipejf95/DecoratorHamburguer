public class Queijo extends HambuergueDecorator{

    String queijo;
    public Queijo(Hamburguer hamburguer, Menu menu, String queijo) {
        super(hamburguer, menu);
        this.queijo = queijo;
    }

    @Override
    public float getCusto(){
        return super.getCusto() + 2.5f;
    }

    public String getDescricao(){
        return super.getDescricao() + " + " + this.queijo;
    }
}
