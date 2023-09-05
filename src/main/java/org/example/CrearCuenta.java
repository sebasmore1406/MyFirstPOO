package org.example;

public class CrearCuenta {
    public static void main(String[] args){
        Cuenta cuentaDeSebas = new Cuenta();
        cuentaDeSebas.saldo = 14006;
        System.out.printf("Saldo de la cuenta: %.2f \n", cuentaDeSebas.saldo);
    }
}
