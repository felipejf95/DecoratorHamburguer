public class Ovo extends HambuergueDecorator{

    public Ovo(Hamburguer hamburguer, Menu menu) {
        super(hamburguer, menu);
    }

    @Override
    public float getCusto(){
        return super.getCusto() + 2.5f;
    }

    public String getDescricao(){
        return super.getDescricao() + " + ovo";
    }

}
