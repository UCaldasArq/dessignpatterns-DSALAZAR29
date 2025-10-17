package edu.ucaldas.behavior;

public class SupportHandler {

    public static Handler createChain() {
        Handler basic = new BasicSupportHandler();
        Handler supervisor = new SupervisorHandler();
        Handler manager = new ManagerHandler();

        // 🔗 ENLACE CORRECTO DE LA CADENA
        basic.setNext(supervisor);
        supervisor.setNext(manager);

        return basic; // devuelve el primer eslabón de la cadena
    }
}
