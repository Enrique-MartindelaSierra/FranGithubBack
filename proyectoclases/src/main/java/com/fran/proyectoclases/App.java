package com.fran.proyectoclases;

import java.time.LocalDate;

import com.fran.proyectoclases.entidades.Cuenta;
import com.fran.proyectoclases.entidades.CuentaCaixa;
import com.fran.proyectoclases.entidades.CuentaSabadell;
import com.fran.proyectoclases.entidades.CuentaSantander;
import com.fran.proyectoclases.enumerados.NivelCatalan;

public class App 
{
    public static void main( String[] args )
    {
        //Cuenta c = new Cuenta();
    	//CuentaSabadell cs = new CuentaSabadell();
    	CuentaCaixa cc = new CuentaCaixa();
    	CuentaCaixa cc2 = new CuentaCaixa("111", "Fran", LocalDate.now(), "ES", 10000,NivelCatalan.Alto);
    	CuentaCaixa cc3 = new CuentaCaixa(cc2);
    	CuentaCaixa cc4 = new CuentaCaixa(cc);
    	System.out.println(cc);
    	System.out.println(cc2);
    	System.out.println(cc3);
    	System.out.println(cc4);
    	CuentaSantander cs = new CuentaSantander();
    	CuentaSantander cs2 = new CuentaSantander("222", "Fran", LocalDate.now(), "ES", 20000,true);
    	CuentaSantander cs3 = new CuentaSantander(cs2);
    	System.out.println(cs);
    	System.out.println(cs2);
    	System.out.println(cs3);
    	System.out.println("El número de cuentas del santander es: " + CuentaSantander.getContador());
    	

    }
}
