public class Salada extends HambuergueDecorator{


    public Salada(Hamburguer hamburguer, Menu menu) {
        super(hamburguer, menu);
    }

    @Override
    public float getCusto(){
        return super.getCusto() + 1.5f;
    }

    public String getDescricao(){
        return super.getDescricao() + " + salada";
    }

}
