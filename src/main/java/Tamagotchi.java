/*a. Modelar una mascota virtual, onda Tamagotchi, incluyendo los mensajes
correspondientes a las acciones de comer y jugar, y la pregunta acerca de si puede
jugar o no.
b. También hay que poder conocer el nivel de una mascota, que es un número entero
mayor o igual que 0, donde a mayor nivel, más capa es.
Una mascota puede estar aburrida, hambrienta o contenta; y su comportamiento depende de
en qué estado esté.
Veamos:
Cuando una mascota come, pasa lo siguiente:
● Si está hambrienta, se pone contenta.
● Si está contenta, su nivel se incrementa en una unidad.
● Si está aburrida, y hace más de 80 minutos que está aburrida, entonces se pone contenta.
● Si está aburrida desde hace 80 minutos o menos, entonces no le pasa nada, no cambia nada.
Cuando una mascota juega, pasa lo siguiente:
● Si está contenta, su nivel se incrementa en dos unidades.
● Si está aburrida, se pone contenta.
● No produce ningún efecto jugar con la mascota si esta hambrienta.
● Una mascota puede jugar si está contenta o aburrida, si está hambrienta no.

 */
public class Tamagotchi {
    private Integer nivel;
     private String nombre;
     //TODO:modificar estado a ENUM
    private  Estado estado;
    //TODO: modificar logica de tiempo de aburrimiento
    private final Integer TIEMPO_ABURRIDA = 90;

     int minutos;

    public Tamagotchi(String nombre, Estado estado) {

        this.nombre = nombre;
        this.estado = estado;
        this.nivel=0;

    }

    public Tamagotchi(String nombre, Estado estado, Integer nivel)  {

        this.nombre = nombre;
        this.estado = Estado.HAMBRIENTA;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(){
        this.nivel=nivel;
    }

    public void setEstado( Estado estado ) {
        this.estado = estado;
    }

    public Estado getEstado() {
    return estado;
    }

    public  Boolean comer(){

        if (estado.equals(Estado.HAMBRIENTA)) {
            estado = Estado.CONTENTA;
        }else if(estado.equals(Estado.CONTENTA)){
            nivel++;
        }else if (estado.equals(Estado.ABURRIDA)){
            if(TIEMPO_ABURRIDA>80)
        estado= Estado.CONTENTA;
        }
        return true;
        }

        public void jugar(){
             if(estado.equals(Estado.CONTENTA)){
                nivel+=2;
            }else if (estado.equals(Estado.ABURRIDA)){
                 estado= Estado.CONTENTA;
            }
        }
    }

