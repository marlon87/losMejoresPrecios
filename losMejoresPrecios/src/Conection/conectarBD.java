package Conection;

/*
 *Este metodo Permite la conexion con una Base de datos de MySQL
 */

 
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class conectarBD {
//Datos para la conexion
    private Connection con=null;
    Connection conexion=null;
    private String lastError=null;
    private Usuario pers=new Usuario();
    
  private String database="losMejoresPrecios";
  private String url="";
  private String usuario="usuario";
  private String password="1490Martin";
   //Funcion conectar
    public conectarBD(){
      try {
            Class.forName("com.mysql.jdbc.Driver");

            url="jdbc:mysql://"+"analisis.cxlcq8r3vcp4.us-west-2.rds.amazonaws.com:3306"+"/"+database+"?autoReconnect=true&useSSL=false";
            conexion=(Connection) DriverManager.getConnection(url,usuario,password);
            System.out.println("Conexion a Base de Datos "+url+" . . . . .Ok");
         }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    public Connection getConexion(){
        return conexion;
    }
    //--MARLON LIBRERIAS----------------------------------------------------------------------------
    public boolean conectar(){
        try{
            //un formulario donde este el driver
            Class.forName("com.mysql.jdbc.Driver");
            //con=DriverManager.getConnection("jdbc:mysql://localhost/" + bd + "?user=" + "&password=" + clave);
            con=getConexion();
            return true;
        }catch(ClassNotFoundException cnfe){
            lastError= cnfe.getMessage();
            return false;
        }
    }//--------------------------------------------------------------------------
     public boolean desconectar()
    {
        try{
            if(con!=null)
                con.close();
            con=null;
            return true;
        }catch(SQLException e)
        {
            lastError= e.getMessage();
            return false;
        }
    }
    public Object [][] select(String table, String fields, String where){
      int registros = 0;  
                        
      String colname[] = fields.split(",");

      //Consultas SQL
                            //
      String q ="SELECT " + fields + " FROM " + table;
      String q2 = "SELECT count(*) as total FROM " + table;
      if(where!=null)
      {
          q+= " WHERE " + where;
          q2+= " WHERE " + where;
      }
       try{
         PreparedStatement pstm = con.prepareStatement(q2);
         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
      }
       //se crea una matriz con tantas filas y columnas que necesite
    Object[][] data = new String[registros][fields.split(",").length];
    //realizamos la consulta sql y llenamos los datos en la matriz "Object"
      try{
         PreparedStatement pstm = con.prepareStatement(q);
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            for(int j=0; j<=fields.split(",").length-1;j++){
                data[i][j] = res.getString( colname[j].trim() );
            }
            i++;         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
 } 
     //---------------------------------------------------------------------------
    public boolean ingresaralsistema(String user, String contra)
    {        
                                 //nombre de la tabla
        Object[][] res = this.select("usuariosistema", " nikuser , passuser ", " nikuser='"+user+"' AND passuser='"+contra+"' ");
        if( res.length > 0)
        {
            pers.setNombre( res[0][0].toString() );
            pers.setContraseña( res[0][1].toString() );
            
            return true;
        }        
        else
            return false;
    } 
     
     //---FIN DE LA MODIFICACION MARLON---------------------------------------------------
    
     public  String Procedimiento(int codEmp, String nombre, String apellido, String direccion, int telefono, String sexo, String cargo, String fechaingreso, String salario, String accion){
        
       String mensaje="";
        try {
            
             con = getConexion();
 
            if (con == null) {
                mensaje = "No hay conexión a la base de datos...!";
            } else {
                Statement st = con.createStatement();
          
                CallableStatement sp=con.prepareCall("{call insertar_empleados(?,?,?,?,?,?,?,?,?,?)}");
               
                sp.setInt(1,codEmp);
                sp.setString(2,nombre);
                sp.setString(3,apellido);
                sp.setString(4,direccion);
                sp.setInt(5,telefono);
                sp.setString(6,sexo);
                sp.setString(7,cargo);
                java.sql.Date sqlDate = new java.sql.Date(Calendar.getInstance().getTimeInMillis());
                
                sp.setDate(8,sqlDate);
                sp.setString(9,salario);
                sp.setString(10,accion);
            
               if( sp.execute())

                
                st.close();
                con.close();
                
               mensaje="Operacion realizada con Exito";
            }
        } catch (SQLException e) {
            mensaje="Error al conectar: "+e;
        } catch (Exception e) {
            mensaje="Error: "+e;
        }
        
        return mensaje;
                
    }
     
    public  String ProcedimientoProveedores(int idProveedores, String nit, String nombre, String direccion, String telefono,
            String correo,String accion){
        
       String mensaje="";
        try {
            
             con = getConexion();
 
            if (con == null) {
                mensaje = "No hay conexión a la base de datos...!";
            } else {
                Statement st = con.createStatement();
          
                CallableStatement sp=con.prepareCall("{call insertar_proveedores(?,?,?,?,?,?,?)}");
               
                sp.setInt(1,idProveedores);
                sp.setString(2,nit);
                sp.setString(3,nombre);
                sp.setString(4,direccion);
                sp.setString(5,telefono);
                sp.setString(6,correo);
                sp.setString(7,accion);
            
               if( sp.execute())

                
                st.close();
                con.close();
                
               mensaje="Operacion realizada con Exito";
            }
        } catch (SQLException e) {
            mensaje="Error al conectar: "+e;
        } catch (Exception e) {
            mensaje="Error: "+e;
        }
        
        return mensaje;
                
    }
    
    public  String ProcedimientoProducto(int idProducto, String descripcion, int idCategoria, float preciocompra, float precioventa,
            int existencia,String garantia,String accion){
        
       String mensaje="";
        try {
            
             con = getConexion();
 
            if (con == null) {
                mensaje = "No hay conexión a la base de datos...!";
            } else {
                Statement st = con.createStatement();
          
                CallableStatement sp=con.prepareCall("{call insertar_productos(?,?,?,?,?,?,?,?)}");
               
                sp.setInt(1,idProducto);
                sp.setString(2,descripcion);
                sp.setInt(3,idCategoria);
                sp.setFloat(4,preciocompra);
                sp.setFloat(5,precioventa);
                sp.setInt(6,existencia);
                sp.setString(7,garantia);
                sp.setString(8,accion);
            
               if( sp.execute())

                
                st.close();
                con.close();
                
               mensaje="Operacion realizada con Exito";
            }
        } catch (SQLException e) {
            mensaje="Error al conectar: "+e;
        } catch (Exception e) {
            mensaje="Error: "+e;
        }
        
        return mensaje;
                
    }
    
    
    public  String ProcedimientoVehiculo(int IdVehiculo, String descripcion, String color, String placas, 
            String estado,String accion){
        
       String mensaje="";
        try {
            
             con = getConexion();
 
            if (con == null) {
                mensaje = "No hay conexión a la base de datos...!";
            } else {
                Statement st = con.createStatement();
          
                CallableStatement sp=con.prepareCall("{call insertar_vehiculos(?,?,?,?,?,?)}");
               
                sp.setInt(1,IdVehiculo);
                sp.setString(2,descripcion);
                sp.setString(3,color);
                sp.setString(4,placas);
                sp.setString(5,estado);
                sp.setString(6,accion);
            
               if( sp.execute())

                
                st.close();
                con.close();
                
               mensaje="Operacion realizada con Exito";
            }
        } catch (SQLException e) {
            mensaje="Error al conectar: "+e;
        } catch (Exception e) {
            mensaje="Error: "+e;
        }
        
        return mensaje;
                
    }
    
    public  String ProcedimientoRuta(int IdRuta,int zona,String departamento, String municipio, 
            String aldea,int IdVehiculo,int IdEmpleado,String nombre, String accion){
        
       String mensaje="";
        try {
            
             con = getConexion();
 
            if (con == null) {
                mensaje = "No hay conexión a la base de datos...!";
            } else {
                Statement st = con.createStatement();
          
                CallableStatement sp=con.prepareCall("{call insertar_rutas(?,?,?,?,?,?,?,?,?)}");
               
                sp.setInt(1,IdRuta);
                sp.setInt(2,zona);
                sp.setString(3,departamento);
                sp.setString(4,municipio);
                sp.setString(5,aldea);
                sp.setInt(6,IdVehiculo);
                sp.setInt(7,IdEmpleado );
                sp.setString(8, nombre);
                sp.setString(9,accion); 
            
               if( sp.execute())

                
                st.close();
                con.close();
                
               mensaje="Operacion realizada con Exito";
            }
        } catch (SQLException e) {
            mensaje="Error al conectar: "+e;
        } catch (Exception e) {
            mensaje="Error: "+e;
        }
        
        return mensaje;
                
    }

    public  String ProcedimientoFormaPago(int IdFormaPago,String Descripcion,String accion){
        
       String mensaje="";
        try {
            
             con = getConexion();
 
            if (con == null) {
                mensaje = "No hay conexión a la base de datos...!";
            } else {
                Statement st = con.createStatement();
          
                CallableStatement sp=con.prepareCall("{call insertar_formas_de_pago(?,?,?)}");
               
                sp.setInt(1,IdFormaPago);
                sp.setString(2,Descripcion);
                sp.setString(3,accion); 
            
               if( sp.execute())

                
                st.close();
                con.close();
                
               mensaje="Operacion realizada con Exito";
            }
        } catch (SQLException e) {
            mensaje="Error al conectar: "+e;
        } catch (Exception e) {
            mensaje="Error: "+e;
        }
        
        return mensaje;
                
    }
    
    public  String ProcedimientoCatalogo(int IdCatalogo,String Descripcion,String accion){
        
       String mensaje="";
        try {
            
             con = getConexion();
 
            if (con == null) {
                mensaje = "No hay conexión a la base de datos...!";
            } else {
                Statement st = con.createStatement();
          
                CallableStatement sp=con.prepareCall("{call insertar_catalogos(?,?,?)}");
               
                sp.setInt(1,IdCatalogo);
                sp.setString(2,Descripcion);
                sp.setString(3,accion); 
            
               if( sp.execute())

                
                st.close();
                con.close();
                
               mensaje="Operacion realizada con Exito";
            }
        } catch (SQLException e) {
            mensaje="Error al conectar: "+e;
        } catch (Exception e) {
            mensaje="Error: "+e;
        }
        
        return mensaje;
                
    }
}
   
  