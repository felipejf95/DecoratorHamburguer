public abstract class HambuergueDecorator implements Hamburguer{

    private Hamburguer hamburguer;

    private Menu menu;
    private String descricao;

    public HambuergueDecorator(Hamburguer hamburguer, Menu menu) {
        this.hamburguer = hamburguer;
        this.menu = menu;
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public float getCusto(){
        return this.hamburguer.getCusto() * (1 + menu.acrescimoMenu());
    }
    @Override
    public String getDescricao(){
        return this.hamburguer.getDescricao();
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}
