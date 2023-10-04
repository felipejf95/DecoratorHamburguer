import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburguerTest {

    @Test
    void deveRetornarPrecoHamburguerSimples(){
        Hamburguer hamburguer = new HamburguerBase();
        assertEquals(10.0, hamburguer.getCusto());
        assertEquals("Hamburguer com bife", hamburguer.getDescricao());
    }

   @Test
    void deveRetornarPrecoHamburguerComSalada(){
        Menu menu = new MenuPlus();
        Hamburguer hamburguer = new Salada(new HamburguerBase(), menu);
        assertEquals(12.65f, hamburguer.getCusto(), 0.01f);
        assertEquals("Hamburguer com bife + salada", hamburguer.getDescricao());
    }

}


