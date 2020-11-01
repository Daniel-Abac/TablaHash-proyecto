/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablahash;

/**
 *
 * @author Usuario
 */
public class Lista {
    private Nodo tope, fondo;
    private int numValores = 0;
    private String cadena = "";
    
    public void InsertarFondo(String nombre, String anio, String genero, int id){
        Nodo nuevo = new Nodo(nombre, anio, genero, id);
        if(Vacia()){
            tope = nuevo;
            fondo = nuevo;
            
            tope.setSiguiente(null);
            fondo.setSiguiente(null);
            
        }
        else{
            Nodo fin = fondo;
            fin.setSiguiente(nuevo);
            nuevo.setSiguiente(null);
            fondo = nuevo;
            
        }
        numValores++;
    }
   
    public void Eliminar(int id){
       Nodo aux = tope;
       int conta = numValores, aux2=0;
       if(aux.getId()== id){
          
           aux = aux.getSiguiente();
           tope = aux;
           numValores--;
       }
       else{
          while(conta!=1){
              if(conta == 2 && aux.getSiguiente().getId() == id){
                  fondo = aux;
                  fondo.setSiguiente(null);
                  numValores--;
                  break;
              }
              else if(aux.getSiguiente().getId() == id){
                
                  aux.setSiguiente(aux.getSiguiente().getSiguiente());
                  aux2=1;
                  numValores--;
                  break;
              }
              aux = aux.getSiguiente();
              conta--;     
          }
          
       }
      
    }
    //buscar un valor de la lista 
    private boolean BuscarValor(int id,Nodo nodo_actual){
        boolean existe = false;
        if(nodo_actual!=null){
            if(id == nodo_actual.getId()){
                existe = true;
                cadena +="Id: "+nodo_actual.getId()+"\n"
                         +"Nombre: "+nodo_actual.getNombre()+"\n"
                         +"Año: "+nodo_actual.getAnio()+"\n"
                         +"Genero: "+nodo_actual.getGenero()+"\n";
            }            
            else{
              existe = BuscarValor(id, nodo_actual.getSiguiente());
                
            }
        }
        return existe;
    }
   
    public boolean Buscar(int id){
        cadena = "";
        Nodo nodo_actual = tope;
        return BuscarValor(id, nodo_actual);
    }
    
    
    //mostrar los valores de la lista 
    private void MostrarValor(Nodo nodo_actual,int conta){
        if(nodo_actual!=null){
            if(conta == numValores){
                if(numValores == 1){
                      cadena += "[ "+nodo_actual.getId()+" ]"+" --> null"; 
                }
                else{
                cadena += nodo_actual.getId()+" --> null";
                }
            }
            else{
                if(conta == 1){
                  cadena += "[ "+nodo_actual.getId()+" ]"+" --> "; 
                }
                else{
                  cadena += nodo_actual.getId()+" --> "; 
                }
              
            }
            conta++;
            MostrarValor(nodo_actual.getSiguiente(),conta);
        }
        
    }
    public String Mostrar(){
        cadena ="";
        Nodo nodo_actual = tope;
        int conta = 1;
        MostrarValor(nodo_actual,conta );
        return cadena;
    }

    public Nodo getTope() {
        return tope;
    }

    public void setTope(Nodo tope) {
        this.tope = tope;
    }

    public Nodo getFondo() {
        return fondo;
    }

    public void setFondo(Nodo fondo) {
        this.fondo = fondo;
    }

    public int getNumValores() {
        return numValores;
    }

    public void setNumValores(int numValores) {
        this.numValores = numValores;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
    
    
    public boolean Vacia(){
        return(fondo==null)?true:false;
    }
    
    
}
