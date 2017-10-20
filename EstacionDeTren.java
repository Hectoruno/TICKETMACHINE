public class EstacionDeTren
{
    private String ciudad;
    private TicketMachine maquina1;
    private TicketMachine maquina2;
    /**
     * Constructor de la estacion de tren
     */
    public EstacionDeTren(String nombreCiudad, int precioMaquina1,int precioMaquina2)
    {
        ciudad = nombreCiudad;
        maquina1 = new TicketMachine(precioMaquina1);
        maquina2 = new TicketMachine(precioMaquina2);
    }
    /**
     * Simula la venta de un billete en la maquina 1
     */
    public void ventaBilleteMaquina1()
    {
        maquina1.insertMoney(500);
        maquina1.printTicket();
    }
    
    /**
     * Simula la venta de un billete en la maquina 2
     */
    public void ventaBilleteMaquina2()
    {
        maquina2.insertMoney(600);
        maquina2.printTicket();
    }
    
    /**
     * Devuelve el total de dinero recaudado por las maquinas de la estacion hasta el momento
     */
    public int getDineroRecaudadoPorEstacion()
    {
        return maquina1.getTotal() + maquina2.getTotal();
    }
     
    /**
     * Devuelve el total de dinero recaudado por la maquina 1 hasta el momento
     */
    public int getDineroRecaudadoPorMaquina1()
    {
       return maquina1.getTotal();
    }
    
    /**
     * Imprime por pantalla la cantidad recaudada por la maquina 1, por la 2 y el total de ambas
     */
    public void cantidadRecaudadaPorEstacion()
    {
        System.out.println ("Maquina1 " + maquina1.getTotal() + " Cents");
        System.out.println ("Maquina2 " + maquina2.getTotal() + " Cents");
        System.out.println ("Total " + (maquina1.getTotal() + maquina2.getTotal()) + " Cents");
    }
}