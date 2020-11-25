/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWorld;

import java.rmi.RemoteException;
import java.rmi.server.RemoteRef;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Avell B154 PLUS
 */
public class CliImpl extends UnicastRemoteObject implements InterfaceCli {
	
    CliImpl (String nome, int id, InterfaceServ referenciaServer) throws RemoteException{
        referenciaServer.registrarInteresse(nome, id, this);
    }
    
    @Override
    public void notificar(String texto) throws RemoteException{
        System.out.println(texto);
    }
}
