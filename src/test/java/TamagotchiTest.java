import org.junit.Assert;
import org.junit.Test;

public class TamagotchiTest {
    //Subjet under test clase(Tamagochi)
    // Crear un Tamagochi
    @Test

    public void testCrearTamagotchi(){
        // Primero dejo los objetos a probar creados
        // Segundo ejecuto el metodo a probar
        Tamagotchi tama = new Tamagotchi("Virgi", Estado.HAMBRIENTA);
        // Tercero compruebo mediante Asserts que te se realizó correctamente la operación
        Assert.assertNotNull(tama);
    }
    @Test

    public void testParaCrearTamagotchiConNombre() {
        //Declaramos objetos y atributos necesarios
        Tamagotchi tama = new Tamagotchi("Virgi", Estado.HAMBRIENTA);
        //ejecutamos el metodo a probar
        String obtenido = tama.getNombre();
        String esperado = "Virgi";
        //validamos mediante un assert
        Assert.assertEquals(obtenido,esperado);
    }
    @Test
    public void testParaCrearDosTamagotchiConDistintoNombre(){
        Tamagotchi tama = new Tamagotchi("Virgi", Estado.HAMBRIENTA);
        Tamagotchi tama2 = new Tamagotchi("Nicolas", Estado.HAMBRIENTA);

        String obtenido1= tama.getNombre();
        String esperado1= "Virgi";

        String obtenido2 = tama2.getNombre();
        String esperado2 = "Nicolas";

        Assert.assertEquals(obtenido1,esperado1);
        Assert.assertEquals(obtenido2,esperado2);

    }

    //Conocer el nivel
    @Test
    public void testParaConocerElNivelInicialDeTamagotchi(){
        // Primero dejo los objetos a probar creados
        Tamagotchi tama = new Tamagotchi("Virgi", Estado.HAMBRIENTA);
        Integer nivelInicial = 0;
        // Segundo ejecuto el metodo a probar
        Integer nivelObtenido = tama.getNivel();
        // Tercero compruebo mediante Asserts que te se realizó correctamente la operación
        Assert.assertEquals(nivelInicial,nivelObtenido);

    }
    @Test
    public void testParaCrearDosTamagotchiConDiferenteNivel(){

        Tamagotchi tama = new Tamagotchi("Virgi", Estado.HAMBRIENTA);
        Integer nivelInicial = 0;
        Tamagotchi tama2 = new Tamagotchi("Virgi", Estado.HAMBRIENTA);
        Integer nivelInicial2 = 1;

        Integer nivelObtenido = tama.getNivel();
        Integer nivelObtenido2 = tama2.getNivel();

        Assert.assertEquals(nivelInicial,nivelObtenido);

    }
    @Test

    public void testParaDarEstado(){
      Tamagotchi tama = new Tamagotchi("Virgi",Estado.HAMBRIENTA);
      Estado Nuevoestado = Estado.HAMBRIENTA;

        Assert.assertEquals(Nuevoestado,tama.getEstado());

    }
    @Test

    public void testPruebaQuePuedeComer(){
        Tamagotchi tama = new Tamagotchi("Romina", Estado.HAMBRIENTA);

        Assert.assertTrue(tama.comer());

    }

    @Test
    public void testPasajeDeEstadoAlComerHambrienta(){
        Tamagotchi tama = new Tamagotchi("Romina", Estado.HAMBRIENTA);
        //por defecto esta hambrienta para hacer la prueba
        tama.setEstado(Estado.CONTENTA);
        tama.comer();
        Estado estadoEsperado = Estado.CONTENTA;
        Assert.assertEquals(estadoEsperado,tama.getEstado());
    }

    @Test
    public void testParaIncrementarNivelSiTamaEstaContento(){
        Tamagotchi tama = new Tamagotchi("Virgi", Estado.HAMBRIENTA);

        tama.setEstado(Estado.CONTENTA);
        tama.comer();
        Integer  nivelObtenido = 1;

        Assert.assertEquals(nivelObtenido,tama.getNivel());

    }

    @Test
    public void testParaQueTamaSeDiviertaDespuesDe80Min(){
        Tamagotchi tama = new Tamagotchi("Virgi", Estado.HAMBRIENTA);
        //el estado debería ser aburrida
        tama.setEstado(Estado.ABURRIDA);
        tama.comer();
        Estado estadoEsperado=Estado.CONTENTA;

        Assert.assertEquals(estadoEsperado,tama.getEstado());

    }
    @Test

    public void testParaVerQueCambieEstadoCuandoJuega(){
        Tamagotchi tama = new Tamagotchi("Virgi", Estado.HAMBRIENTA);
        tama.setEstado(Estado.ABURRIDA);
        tama.jugar();
        Estado estadoEsperado = Estado.CONTENTA;

        Assert.assertEquals(estadoEsperado,tama.getEstado());
    }
    @Test

    public void testParaVerQueCambieNivelEn2CuandoJuega(){
        Tamagotchi tama = new Tamagotchi("Virgi", Estado.HAMBRIENTA);
        tama.setEstado(Estado.CONTENTA);
        Integer nivelEsperado = 2;
        tama.jugar();
        Assert.assertEquals(nivelEsperado,tama.getNivel());
    }

    }

