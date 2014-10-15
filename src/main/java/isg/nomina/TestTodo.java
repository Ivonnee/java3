/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package isg.nomina;


public class TestTodo {
    public static void main (String args[]){
        Trabajador t=new Trabajador(1,"Ivonne",40,200);
        Nomina n=new Nomina (t);
        n.pagarnomina();
    }
    
}
