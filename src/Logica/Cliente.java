/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author osboxes
 */
public class Cliente extends Thread{
    
    private Socket _socket;
    private DataInputStream _Datos_Entrada;
    private DataOutputStream _Datos_Salida;
    private int _puerto;
    private String _ip;
    private datos _dp;
    private boolean bandera=true;
    
    public Cliente(datos dp){
        this._ip=dp.ip;
        this._puerto=dp.puerto;
        this._dp=dp;
    }
    
    @Override
    public void run(){
        try{
            this._socket= new Socket(_ip, _puerto);
            this._socket.setSoTimeout( 2000 );
            this._socket.setKeepAlive( true );
            
            while(bandera){
                // Creamos flujo de entrada para leer los datos que envia el cliente 
                this._Datos_Entrada= new DataInputStream(_socket.getInputStream());
                // Obtenemos el nombre del archivo
                String FileName= _Datos_Entrada.readUTF();
                // Obtenemos el tamaño del archivo
                int FileSize=_Datos_Entrada.readInt();
                // indicar donde guardaremos el archivo
                FileOutputStream file = new FileOutputStream(FileName);
                BufferedOutputStream out = new BufferedOutputStream( file );
                BufferedInputStream in = new BufferedInputStream(_socket.getInputStream());
                // Creamos el array de bytes para leer los datos del archivo
                byte[] buffer = new byte[FileSize];
                // Obtenemos el archivo mediante la lectura de bytes enviados
                for( int i = 0; i < buffer.length; i++ )
                  buffer[ i ] = ( byte )in.read( );
                // Escribimos el archivo 
                out.write( buffer );
                // Cerramos flujos
                out.flush();
                out.close();
                in.close();
                this._dp.FileName=FileName;
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void sendMsg(String mensajes){
        try{
            if(mensajes.equals("out"))
                bandera=false;
            _Datos_Salida.writeUTF(mensajes);
            _Datos_Salida.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
