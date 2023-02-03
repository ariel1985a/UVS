
package Controllers;

import Models.Combo;
import Models.Productos;
import Models.ProductosDao;
import Models.Tables;
import Models.VentasDao;
import Views.PanelAdmin;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class ProductosControllers implements ActionListener, MouseListener, KeyListener{

    private Productos pro;
    private ProductosDao proDao;
    private PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel tmp;

    public ProductosControllers(Productos pro, ProductosDao proDao, PanelAdmin views) {
        this.pro = pro;
        this.proDao = proDao;
        this.views = views;
        this.views.btnRegistrarPro.addActionListener(this);
        this.views.btnModificarPro.addActionListener(this);
        this.views.btnNuevoPro.addActionListener(this);
        this.views.JMenuEliminarPro.addActionListener(this);
        this.views.JMenuReingresarPro.addActionListener(this);
        this.views.TableProductos.addMouseListener(this);
        this.views.JlabelProductos.addMouseListener(this);
        this.views.JLabelNuevaCompra.addMouseListener(this);
        this.views.JLabelNuevaVenta.addMouseListener(this);
        
        this.views.txtCodNC.addKeyListener(this);
        this.views.txtCantNC.addKeyListener(this);
        this.views.txtPagarConNC.addKeyListener(this);
        this.views.btnGenerarCompra.addActionListener(this);
        
        this.views.txtCodNV.addKeyListener(this);
        this.views.txtCantNV.addKeyListener(this);
        this.views.txtPagarConNV.addKeyListener(this);
        this.views.btnGenerarVenta.addActionListener(this);
        
        this.views.txtBuscarProducto.addKeyListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnRegistrarPro) {
            if (views.txtCodigoPro.getText().equals("")
                    || views.txtDescripcionPro.getText().equals("")
                    || views.txtPrecioCompraPro.getText().equals("")
                    || views.txtPrecioVentaPro.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todo los campos son obligatorios");
            } else {
                pro.setCodigo(views.txtCodigoPro.getText());
                pro.setDescripcion(views.txtDescripcionPro.getText());
                pro.setPrecio_compra(Double.parseDouble(views.txtPrecioCompraPro.getText()));
                pro.setPrecio_venta(Double.parseDouble(views.txtPrecioVentaPro.getText()));
                Combo itemP = (Combo) views.cbxProveedorPro.getSelectedItem();
                Combo itemC = (Combo) views.cbxCatPro.getSelectedItem();
                Combo itemM = (Combo) views.cbxMedidaPro.getSelectedItem();
                pro.setId_proveedor(itemP.getId());
                pro.setId_categoria(itemC.getId());
                pro.setId_medida(itemM.getId());
                if (proDao.registrar(pro)) {
                    limpiarTable();
                    listarProductos();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Producto registrado con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar el producto");
                }

            }
        } else if (e.getSource() == views.btnModificarPro) {
            if (views.txtCodigoPro.getText().equals("")
                    || views.txtDescripcionPro.getText().equals("")
                    || views.txtPrecioCompraPro.getText().equals("")
                    || views.txtPrecioVentaPro.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todo los campos son obligatorios");
            } else {
                pro.setCodigo(views.txtCodigoPro.getText());
                pro.setDescripcion(views.txtDescripcionPro.getText());
                pro.setPrecio_compra(Double.parseDouble(views.txtPrecioCompraPro.getText()));
                pro.setPrecio_venta(Double.parseDouble(views.txtPrecioVentaPro.getText()));
                Combo itemP = (Combo) views.cbxProveedorPro.getSelectedItem();
                Combo itemC = (Combo) views.cbxCatPro.getSelectedItem();
                Combo itemM = (Combo) views.cbxMedidaPro.getSelectedItem();
                pro.setId_proveedor(itemP.getId());
                pro.setId_categoria(itemC.getId());
                pro.setId_medida(itemM.getId());
                pro.setId(Integer.parseInt(views.txtIdPro.getText()));
                if (proDao.modificar(pro)) {
                    limpiarTable();
                    listarProductos();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Producto Modificado con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modificar el producto");
                }

            }
        } else if (e.getSource() == views.JMenuEliminarPro) {
            if (views.txtIdPro.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
            } else {
                int id = Integer.parseInt(views.txtIdPro.getText());
                if (proDao.accion("Inactivo", id)) {
                    limpiarTable();
                    listarProductos();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Producto eliminado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar producto");
                }
            }
        } else if (e.getSource() == views.JMenuReingresarPro) {
            if (views.txtIdPro.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para reingresar");
            } else {
                int id = Integer.parseInt(views.txtIdPro.getText());
                if (proDao.accion("Activo", id)) {
                    limpiarTable();
                    listarProductos();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Producto reingresado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al reingresar producto");
                }
            }
        }else if(e.getSource() == views.btnGenerarCompra){
            insertarCompra();
        }else if(e.getSource() == views.btnGenerarVenta){
            VentasDao vDao = new VentasDao();
            String respuesta = vDao.verificarCaja(Integer.parseInt(views.txtIdUsuario.getText()));
            if (respuesta.equals("existe")) {
                insertarVenta();
            }else if(respuesta.equals("no")){
                JOptionPane.showMessageDialog(null, "La caja esta cerrada");
            }else{
                JOptionPane.showMessageDialog(null, "Error fatal");
            }
        }
    }
    
    
     public void listarProductos() {
        Tables color = new Tables();
        views.TableProductos.setDefaultRenderer(views.TableProductos.getColumnClass(0), color);
        List<Productos> lista = proDao.ListaProductos(views.txtBuscarProducto.getText());
        modelo = (DefaultTableModel) views.TableProductos.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getCodigo();
            ob[2] = lista.get(i).getDescripcion();
            ob[3] = lista.get(i).getPrecio_venta();
            ob[4] = lista.get(i).getCantidad();
            ob[5] = lista.get(i).getEstado();
            modelo.addRow(ob);
        }
        views.TableProductos.setModel(modelo);
        JTableHeader header = views.TableUsers.getTableHeader();
        header.setOpaque(false);
        header.setBackground(Color.blue);
        header.setForeground(Color.white);
    }

    public void limpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    
    public void limpiarTableDetalle() {
        for (int i = 0; i < tmp.getRowCount(); i++) {
            tmp.removeRow(i);
            i = i - 1;
        }
    }
    
      private void limpiar(){
        views.txtIdUser.setText("");
        views.txtUsuarioUser.setText("");
        views.txtNombreUser.setText("");
        views.txtClaveUser.setText("");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
            if (e.getSource() == views.TableProductos) {
            int fila = views.TableProductos.rowAtPoint(e.getPoint());
            views.txtIdPro.setText(views.TableProductos.getValueAt(fila, 0).toString());
            pro = proDao.buscarPro(Integer.parseInt(views.txtIdPro.getText()));
            views.txtCodigoPro.setText(pro.getCodigo());
            views.txtDescripcionPro.setText(pro.getDescripcion());
            views.txtPrecioCompraPro.setText(""+pro.getPrecio_compra());
            views.txtPrecioVentaPro.setText(""+pro.getPrecio_venta());
            views.cbxProveedorPro.setSelectedItem(new Combo(pro.getId_proveedor(), pro.getProveedor()));
            views.cbxMedidaPro.setSelectedItem(new Combo(pro.getId_medida(), pro.getMedida()));
            views.cbxCatPro.setSelectedItem(new Combo(pro.getId_categoria(), pro.getCat()));
            }else if(e.getSource() == views.JlabelProductos){
                views.jTabbedPane1.setSelectedIndex(0);
                limpiarTable();
                listarProductos();
            }else if(e.getSource() == views.JLabelNuevaCompra){
                views.jTabbedPane1.setSelectedIndex(10);
            }else if(e.getSource() == views.JLabelNuevaVenta){
                views.jTabbedPane1.setSelectedIndex(6);
            }
            
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getSource() == views.txtCodNC) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                String cod = views.txtCodNC.getText();
                buscarProducto(views.txtCodNC, cod, views.txtIdNC, views.txtProductoNC, views.txtPrecioNC, views.txtCantNC, 0);
            }
        }//Buscar y agregar productos temp a la venta
        else if (e.getSource() == views.txtCodNV) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                String cod = views.txtCodNV.getText();
                buscarProducto(views.txtCodNV, cod, views.txtIdNV, views.txtProductoNV, views.txtPrecioNV, views.txtCantNV, 1);
            }
        }
        else if (e.getSource() == views.txtCantNC) {
             if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                 int cant = Integer.parseInt(views.txtCantNC.getText());
                 String desc = views.txtProductoNC.getText();
                 double precio = Double.parseDouble(views.txtPrecioNC.getText());
                 int id = Integer.parseInt(views.txtIdNC.getText());
                 agregarTemp(cant, desc, precio, id, views.TableNuevaCompra, views.txtCodNC);
                 limpiarCompras();
                 calcularTotal(views.TableNuevaCompra, views.JLabelTotalCompra);
            }
        } else if (e.getSource() == views.txtCantNV) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                if (views.txtCantNV.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Ingrese la cantidad");
                } else {

                    int cant = Integer.parseInt(views.txtCantNV.getText());
                    int stock = Integer.parseInt(views.txtStock.getText());
                    if (cant > stock) {
                        JOptionPane.showMessageDialog(null, "Stock no disponible");
                    } else {
                        String desc = views.txtProductoNV.getText();
                        double precio = Double.parseDouble(views.txtPrecioNV.getText());
                        int id = Integer.parseInt(views.txtIdNV.getText());
                        agregarTemp(cant, desc, precio, id, views.TableNuevaVenta, views.txtCodNV);
                        limpiarVentas();
                        calcularTotal(views.TableNuevaVenta, views.JLabelTotalPagar);
                    }
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource()== views.txtCantNC) {
            int cantidad;
            double precio;
            if (views.txtCantNC.getText().equals("")) {
                cantidad =1;
                precio = Double.parseDouble(views.txtPrecioNC.getText());
                views.txtTotalNC.setText(""+ precio);
            }else{
                cantidad = Integer.parseInt(views.txtCantNC.getText());
                precio = Double.parseDouble(views.txtPrecioNC.getText());
                views.txtTotalNC.setText(""+cantidad * precio);
            }
        }else if (e.getSource() == views.txtPagarConNC) {
            int pagar; 
            if (views.txtPagarConNC.getText().equals("")) {
                views.txtVueltoNC.setText("");
            }else{
                pagar = Integer.parseInt(views.txtPagarConNC.getText());
                double total = Double.parseDouble(views.JLabelTotalCompra.getText());
                views.txtVueltoNC.setText(""+ (pagar - total));
            }
        }else if (e.getSource() == views.txtBuscarProducto) {
            views.jTabbedPane1.setSelectedIndex(0);
            limpiarTable();
            listarProductos();
//TOTAL A PAGAR DEL MODULO VENTA
        }else if (e.getSource()== views.txtCantNV) {
            int cantidad;
            double precio;
            if (views.txtCantNV.getText().equals("")) {
                cantidad =1;
                precio = Double.parseDouble(views.txtPrecioNV.getText());
                views.txtTotalNV.setText(""+ precio);
            }else{
                cantidad = Integer.parseInt(views.txtCantNV.getText());
                precio = Double.parseDouble(views.txtPrecioNV.getText());
                views.txtTotalNV.setText(""+cantidad * precio);
            }
        }else if (e.getSource() == views.txtPagarConNV) {
            int pagar; 
            if (views.txtPagarConNV.getText().equals("")) {
                views.txtVueltoNV.setText("");
            }else{
                pagar = Integer.parseInt(views.txtPagarConNV.getText());
                double total = Double.parseDouble(views.JLabelTotalPagar.getText());
                views.txtVueltoNV.setText(""+ (pagar - total));
            }
        }
    }
    
    
    private void limpiarCompras(){
        views.txtCodNC.setText("");
        views.txtIdNC.setText("");
        views.txtProductoNC.setText("");
        views.txtCantNC.setText("");
        views.txtPrecioNC.setText("");
        views.txtTotalNC.setText("");
    }
    
    private void limpiarVentas(){
        views.txtCodNV.setText("");
        views.txtIdNV.setText("");
        views.txtProductoNV.setText("");
        views.txtCantNV.setText("");
        views.txtPrecioNV.setText("");
        views.txtTotalNV.setText("");
        views.txtStock.setText("");
    }
    
    
    private void calcularTotal(JTable tabla, JLabel totalPagar){
        double total = 0.00;
        int numFilas = tabla.getRowCount();
        for (int i = 0; i < numFilas; i++) {
            total = total + Double.parseDouble(String.valueOf(tabla.getValueAt(i, 4)));
        }
        totalPagar.setText(""+ total);
    }
    
    private void insertarCompra(){
        Combo id_p = (Combo) views.cbxProCompra.getSelectedItem();
        int id_proveedor = id_p.getId();
        String total = views.JLabelTotalCompra.getText();
        if (proDao.registrarCompra(id_proveedor, total)) {
            int id_compra = proDao.getUltimoId("compras");
            for (int i = 0; i < views.TableNuevaCompra.getRowCount(); i++) {                
                double precio = Double.parseDouble(views.TableNuevaCompra.getValueAt(i, 3).toString());
                int cantidad = Integer.parseInt(views.TableNuevaCompra.getValueAt(i, 2).toString());
                int id = Integer.parseInt(views.TableNuevaCompra.getValueAt(i, 0).toString());
                double sub_total = precio * cantidad;
                proDao.registrarCompraDetalle(id_compra, id, precio, cantidad, sub_total);
                pro = proDao.buscarId(id);
                int stockActual = pro.getCantidad() + cantidad;
                proDao.ActualizarStock(stockActual, id);
            }
            limpiarTableDetalle();
            JOptionPane.showMessageDialog(null, "Compra generada");
            proDao.generarReporte(id_compra);
//            Print p = new Print(id_compra);
//            p.setVisible(true);
           
        }
    }
    
    //Agregar Productos para la Compra y venta
    private void agregarTemp(int cant, String desc, double precio, int id, JTable tabla, JTextField codigo) {
        if (cant > 0) {
            tmp = (DefaultTableModel) tabla.getModel();
            ArrayList lista = new ArrayList();
            int item = 1;
            lista.add(item);
            lista.add(id);
            lista.add(desc);
            lista.add(cant);
            lista.add(precio);
            lista.add(cant * precio);
            Object[] obj = new Object[5];
            obj[0] = lista.get(1);
            obj[1] = lista.get(2);
            obj[2] = lista.get(3);
            obj[3] = lista.get(4);
            obj[4] = lista.get(5);
            tmp.addRow(obj);
            tabla.setModel(tmp);
           
            codigo.requestFocus();
        }

    }
    
    //Buscar productos para la compra y venta
    private void buscarProducto(JTextField campo, String cod, JTextField id, JTextField prod, 
            JTextField precio, JTextField cant, int accion) {
        if (campo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el codigo");
        } else {
            pro = proDao.buscarCodigo(cod);
            if (pro.getId() > 0) {
                id.setText("" + pro.getId());
            prod.setText(pro.getDescripcion());
            if (accion == 0) {
                precio.setText("" + pro.getPrecio_compra());
            }else{
                precio.setText("" + pro.getPrecio_venta());
                views.txtStock.setText("" + pro.getCantidad());
            }
            cant.requestFocus();
            }else{
                 JOptionPane.showMessageDialog(null, "El producto no existe o esta inactivo");
            } 
        }
    }
    
    //Insertar venta
       private void insertarVenta(){
        Combo cliente = (Combo) views.cbxClienteVentas.getSelectedItem();
        int id_cliente = cliente.getId();
        int id_user = Integer.parseInt(views.txtIdUsuario.getText());
        String total = views.JLabelTotalPagar.getText();
        if (proDao.registrarVenta(id_cliente, total, id_user)) {
            int id = proDao.getUltimoId("ventas");
            for (int i = 0; i < views.TableNuevaVenta.getRowCount(); i++) {                
                double precio = Double.parseDouble(views.TableNuevaVenta.getValueAt(i, 3).toString());
                int cantidad = Integer.parseInt(views.TableNuevaVenta.getValueAt(i, 2).toString());
                int id_producto = Integer.parseInt(views.TableNuevaVenta.getValueAt(i, 0).toString());
                double sub_total = precio * cantidad;
                proDao.registrarVentaDetalle(id, id_producto, precio, cantidad, sub_total);
                pro = proDao.buscarId(id_producto);
                int stockActual = pro.getCantidad() - cantidad;
                proDao.ActualizarStock(stockActual, id_producto);
            }
            limpiarTableDetalle();
            JOptionPane.showMessageDialog(null, "Venta generada");
            proDao.generarReporteVenta(id);
           
        }
    }
}


