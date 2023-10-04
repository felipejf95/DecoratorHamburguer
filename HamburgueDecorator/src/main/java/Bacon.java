public class Bacon extends HambuergueDecorator{

    public Bacon(Hamburguer hamburguer, Menu menu) {
        super(hamburguer, menu);
    }

    @Override
    public float getCusto(){
        return super.getCusto() + 3.0f;
    }

    public String getDescricao(){
        return super.getDescricao() + " + bacon";
    }
}
