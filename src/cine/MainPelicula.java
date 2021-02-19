/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;



public class MainPelicula {

public static void main(String args[]) {
    
  Pelicula matrix =new Pelicula();
  
    matrix.setNombre("Matrix");
    Categoria categoriaDeBDD = obtenerCategoriaDeBDD();
    matrix.setCategoria(categoriaDeBDD);


}

public static Categoria obtenerCategoriaDeBDD(){
    Categoria categoria =new Categoria();
    categoria.setId(0);
    categoria.setNombre("accion");
    categoria.setDescripcion("full armas");
    categoria.setEstado(true);
    return categoria;
}
    
}
