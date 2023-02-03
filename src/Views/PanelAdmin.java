
package Views;

import Controllers.CajasControllers;
import Controllers.CategoriasControllers;
import Controllers.ClientesControllers;
import Controllers.ComprasControllers;
import Controllers.ConfigControllers;
import Controllers.ConfiguracionControllers;
import Controllers.MedidasControllers;
import Controllers.ProductosControllers;
import Controllers.ProveedorControllers;
import Controllers.UsuariosControllers;
import Controllers.VentasControllers;
import Models.Cajas;
import Models.CajasDao;
import Models.Categorias;
import Models.CategoriasDao;
import Models.Clientes;
import Models.ClientesDao;
import Models.Compras;
import Models.ComprasDao;
import Models.Configuracion;
import Models.ConfiguracionDao;
import Models.Medidas;
import Models.MedidasDao;
import Models.Productos;
import Models.ProductosDao;
import Models.Proveedor;
import Models.ProveedorDao;
import Models.UsuarioDao;
import Models.Usuarios;
import Models.Ventas;
import Models.VentasDao;


public class PanelAdmin extends javax.swing.JFrame {
    Usuarios us = new Usuarios();
    UsuarioDao usDao = new UsuarioDao();
    Clientes cl = new Clientes();
    ClientesDao clDao = new ClientesDao();
    Medidas med = new Medidas();
    MedidasDao medDao = new MedidasDao();
    Categorias cat = new Categorias();
    CategoriasDao catDao = new CategoriasDao();
    Proveedor prov = new Proveedor();
    ProveedorDao provDao = new ProveedorDao();
    Productos pro = new Productos();
    ProductosDao proDao = new ProductosDao();
    Configuracion cof = new Configuracion();
    
    Cajas cj = new Cajas();
    CajasDao cjDao = new CajasDao();
    
    
    Compras comp = new Compras();
    ComprasDao compDao = new ComprasDao();
    
    Ventas vent = new Ventas();
    VentasDao ventDao = new VentasDao();
    
    ConfiguracionDao confDao = new ConfiguracionDao();
    
    public PanelAdmin() {
    }

    public PanelAdmin(int id, String nombre) {
        initComponents();
        ConfigControllers config = new ConfigControllers(cof, usDao, this);
        CajasControllers caja = new CajasControllers(cj, cjDao, this);
        UsuariosControllers users = new UsuariosControllers(us, usDao, this);
        ClientesControllers cliente = new ClientesControllers(cl, clDao, this);
        MedidasControllers medida = new MedidasControllers(med, medDao, this);
        CategoriasControllers categoria = new CategoriasControllers(cat, catDao, this);
        ProveedorControllers proveedor = new ProveedorControllers(prov, provDao, this);
        ProductosControllers producto = new ProductosControllers(pro, proDao, this);
        
        ComprasControllers compras = new ComprasControllers(comp, compDao, this);
        VentasControllers ventas = new VentasControllers(vent, ventDao, this);
        ConfiguracionControllers configuracion = new ConfiguracionControllers(cof, confDao, this);
        this.setLocationRelativeTo(null);
        txtIdUsuario.setText("" + id);
        btnUsers.setText(nombre);
        
        jTabbedPane1.setSelectedIndex(6);
        jTabbedPane1.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPopupUsuarios = new javax.swing.JPopupMenu();
        JMenuEliminarUsers = new javax.swing.JMenuItem();
        JMenuReingresarUser = new javax.swing.JMenuItem();
        JPopupClientes = new javax.swing.JPopupMenu();
        JMenuElimnarCli = new javax.swing.JMenuItem();
        JMenuReingresarCli = new javax.swing.JMenuItem();
        JPopupCat = new javax.swing.JPopupMenu();
        JMenuEliminarCat = new javax.swing.JMenuItem();
        JMenuReingresarCat = new javax.swing.JMenuItem();
        JPopupMed = new javax.swing.JPopupMenu();
        JMenuEliminarMed = new javax.swing.JMenuItem();
        JMenuReingresarMed = new javax.swing.JMenuItem();
        JPopupProv = new javax.swing.JPopupMenu();
        JMenuEliminarProv = new javax.swing.JMenuItem();
        JMenuReingresarProv = new javax.swing.JMenuItem();
        JPopupProductos = new javax.swing.JPopupMenu();
        JMenuEliminarPro = new javax.swing.JMenuItem();
        JMenuReingresarPro = new javax.swing.JMenuItem();
        JPopupCajas = new javax.swing.JPopupMenu();
        JMenuEliminarCaja = new javax.swing.JMenuItem();
        JMenuReingresarCaja = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        JPanelNuevaVenta = new javax.swing.JPanel();
        JLabelNuevaVenta = new javax.swing.JLabel();
        JpanelNuevaCompra = new javax.swing.JPanel();
        JLabelNuevaCompra = new javax.swing.JLabel();
        JPanelProducto = new javax.swing.JPanel();
        JlabelProductos = new javax.swing.JLabel();
        JPanelClientes = new javax.swing.JPanel();
        JLabelClientes = new javax.swing.JLabel();
        JPanelProveedor = new javax.swing.JPanel();
        JLabelProveedor = new javax.swing.JLabel();
        JPanelMedidas = new javax.swing.JPanel();
        JLabelMedidas = new javax.swing.JLabel();
        JPanelCategorias = new javax.swing.JPanel();
        JLabelCat = new javax.swing.JLabel();
        JPanelConfig = new javax.swing.JPanel();
        JLabelConfig = new javax.swing.JLabel();
        JPanelUsers = new javax.swing.JPanel();
        JLabelUsers = new javax.swing.JLabel();
        JPanelCaja = new javax.swing.JPanel();
        JLabelCaja = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtBuscarProducto = new javax.swing.JTextField();
        btnUsers = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoPro = new javax.swing.JTextField();
        txtDescripcionPro = new javax.swing.JTextField();
        txtPrecioCompraPro = new javax.swing.JTextField();
        txtPrecioVentaPro = new javax.swing.JTextField();
        cbxProveedorPro = new javax.swing.JComboBox<>();
        cbxMedidaPro = new javax.swing.JComboBox<>();
        cbxCatPro = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnNuevoPro = new javax.swing.JButton();
        btnRegistrarPro = new javax.swing.JButton();
        btnModificarPro = new javax.swing.JButton();
        txtIdPro = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableProductos = new javax.swing.JTable();
        PaginadorPro = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombreCli = new javax.swing.JTextField();
        txtTelefonoCli = new javax.swing.JTextField();
        btnNuevoCli = new javax.swing.JButton();
        btnRegitrarCli = new javax.swing.JButton();
        btnModificarCli = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDireccionCli = new javax.swing.JTextPane();
        txtIdCli = new javax.swing.JTextField();
        txtBuscarCli = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableClientes = new javax.swing.JTable();
        PaginadoCli = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableProveedor = new javax.swing.JTable();
        PaginadoProv = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNombreProv = new javax.swing.JTextField();
        txtTelefonoProv = new javax.swing.JTextField();
        btnNuevoProv = new javax.swing.JButton();
        btnRegistrarProv = new javax.swing.JButton();
        btnModificarProv = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtDireccionProv = new javax.swing.JTextPane();
        jLabel15 = new javax.swing.JLabel();
        txtRucProv = new javax.swing.JTextField();
        txtBuscarProv = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        txtIdProv = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        PaginadoUser = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TableUsers = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNombreUser = new javax.swing.JTextField();
        btnNuevoUser = new javax.swing.JButton();
        btnRegitrarUser = new javax.swing.JButton();
        btnModificarUser = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtUsuarioUser = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cbxCajaUser = new javax.swing.JComboBox<>();
        cbxRolUser = new javax.swing.JComboBox<>();
        txtClaveUser = new javax.swing.JPasswordField();
        txtIdUser = new javax.swing.JTextField();
        txtBuscarUsers = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtNombreCat = new javax.swing.JTextField();
        btnNuevoCat = new javax.swing.JButton();
        btnRegitrarCat = new javax.swing.JButton();
        btnModificarCat = new javax.swing.JButton();
        txtBuscarCat = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        txtIdCat = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TableCat = new javax.swing.JTable();
        PaginadoCat = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtNombreMed = new javax.swing.JTextField();
        btnNuevoMed = new javax.swing.JButton();
        btnRegitrarMed = new javax.swing.JButton();
        btnModificarMed = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtNombreCortoMed = new javax.swing.JTextField();
        txtBuscarMed = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txtIdMed = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        TableMedida = new javax.swing.JTable();
        PaginadoMed = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        TableNuevaVenta = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtCodNV = new javax.swing.JTextField();
        txtProductoNV = new javax.swing.JTextField();
        txtCantNV = new javax.swing.JTextField();
        txtPrecioNV = new javax.swing.JTextField();
        txtTotalNV = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        btnGenerarVenta = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        cbxClienteVentas = new javax.swing.JComboBox<>();
        txtPagarConNV = new javax.swing.JTextField();
        txtVueltoNV = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        JLabelTotalPagar = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtIdNV = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        btnCajas = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        TableVentas = new javax.swing.JTable();
        PaginadoVentas = new javax.swing.JPanel();
        btnHistorialVentas = new javax.swing.JButton();
        txtBuscarVentas = new javax.swing.JTextField();
        txtIdVentas = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        TableCompras = new javax.swing.JTable();
        txtBuscarCompra = new javax.swing.JTextField();
        btnHistorialCompra = new javax.swing.JButton();
        txtIdCompra = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtNombreEmpresa = new javax.swing.JTextField();
        txtTelefonoEmpresa = new javax.swing.JTextField();
        btnModificarEmpresa = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtDireccionEmpresa = new javax.swing.JTextPane();
        txtRucEmpresa = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtMensaje = new javax.swing.JTextPane();
        txtIdEmpresa = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        TableNuevaCompra = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtCodNC = new javax.swing.JTextField();
        txtProductoNC = new javax.swing.JTextField();
        txtCantNC = new javax.swing.JTextField();
        txtPrecioNC = new javax.swing.JTextField();
        txtTotalNC = new javax.swing.JTextField();
        btnGenerarCompra = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        cbxProCompra = new javax.swing.JComboBox<>();
        txtPagarConNC = new javax.swing.JTextField();
        txtVueltoNC = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        JLabelTotalCompra = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtIdNC = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        txtNombreCaja = new javax.swing.JTextField();
        btnNuevoCaja = new javax.swing.JButton();
        btnRegitrarCaja = new javax.swing.JButton();
        btnModificarCaja = new javax.swing.JButton();
        txtBuscarCaja = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        txtIdCaja = new javax.swing.JTextField();
        jScrollPane15 = new javax.swing.JScrollPane();
        TableCaja = new javax.swing.JTable();
        PaginadoCat1 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        txtMontoInicial = new javax.swing.JTextField();
        btnNuevoApertura = new javax.swing.JButton();
        btnAbrirCaja = new javax.swing.JButton();
        btnCerrarCaja = new javax.swing.JButton();
        txtBuscarApertura = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        TableApertura = new javax.swing.JTable();

        JMenuEliminarUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        JMenuEliminarUsers.setText("Eliminar");
        JPopupUsuarios.add(JMenuEliminarUsers);

        JMenuReingresarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exchange.png"))); // NOI18N
        JMenuReingresarUser.setText("Reingresar");
        JPopupUsuarios.add(JMenuReingresarUser);

        JMenuElimnarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        JMenuElimnarCli.setText("Eliminar");
        JPopupClientes.add(JMenuElimnarCli);

        JMenuReingresarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exchange.png"))); // NOI18N
        JMenuReingresarCli.setText("Reingresar");
        JPopupClientes.add(JMenuReingresarCli);

        JMenuEliminarCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        JMenuEliminarCat.setText("Eliminar");
        JPopupCat.add(JMenuEliminarCat);

        JMenuReingresarCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exchange.png"))); // NOI18N
        JMenuReingresarCat.setText("Reingresar");
        JPopupCat.add(JMenuReingresarCat);

        JMenuEliminarMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        JMenuEliminarMed.setText("Eliminar");
        JPopupMed.add(JMenuEliminarMed);

        JMenuReingresarMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exchange.png"))); // NOI18N
        JMenuReingresarMed.setText("Reingresar");
        JPopupMed.add(JMenuReingresarMed);

        JMenuEliminarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        JMenuEliminarProv.setText("Eliminar");
        JPopupProv.add(JMenuEliminarProv);

        JMenuReingresarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exchange.png"))); // NOI18N
        JMenuReingresarProv.setText("Reingresar");
        JPopupProv.add(JMenuReingresarProv);

        JMenuEliminarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        JMenuEliminarPro.setText("Eliminar");
        JPopupProductos.add(JMenuEliminarPro);

        JMenuReingresarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exchange.png"))); // NOI18N
        JMenuReingresarPro.setText("Reingresar");
        JMenuReingresarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuReingresarProActionPerformed(evt);
            }
        });
        JPopupProductos.add(JMenuReingresarPro);

        JMenuEliminarCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        JMenuEliminarCaja.setText("Eliminar");
        JPopupCajas.add(JMenuEliminarCaja);

        JMenuReingresarCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exchange.png"))); // NOI18N
        JMenuReingresarCaja.setText("Reingresar");
        JMenuReingresarCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuReingresarCajaActionPerformed(evt);
            }
        });
        JPopupCajas.add(JMenuReingresarCaja);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelNuevaVenta.setBackground(new java.awt.Color(51, 51, 51));

        JLabelNuevaVenta.setBackground(new java.awt.Color(255, 255, 255));
        JLabelNuevaVenta.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        JLabelNuevaVenta.setForeground(new java.awt.Color(255, 255, 255));
        JLabelNuevaVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Nventa.png"))); // NOI18N
        JLabelNuevaVenta.setText("Nueva Venta");
        JLabelNuevaVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelNuevaVentaLayout = new javax.swing.GroupLayout(JPanelNuevaVenta);
        JPanelNuevaVenta.setLayout(JPanelNuevaVentaLayout);
        JPanelNuevaVentaLayout.setHorizontalGroup(
            JPanelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelNuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelNuevaVentaLayout.setVerticalGroup(
            JPanelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelNuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelNuevaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 40));

        JpanelNuevaCompra.setBackground(new java.awt.Color(51, 51, 51));

        JLabelNuevaCompra.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        JLabelNuevaCompra.setForeground(new java.awt.Color(255, 255, 255));
        JLabelNuevaCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelNuevaCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Carrito-de-compras.png"))); // NOI18N
        JLabelNuevaCompra.setText("Nueva Compra");
        JLabelNuevaCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JpanelNuevaCompraLayout = new javax.swing.GroupLayout(JpanelNuevaCompra);
        JpanelNuevaCompra.setLayout(JpanelNuevaCompraLayout);
        JpanelNuevaCompraLayout.setHorizontalGroup(
            JpanelNuevaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelNuevaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JpanelNuevaCompraLayout.setVerticalGroup(
            JpanelNuevaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelNuevaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JpanelNuevaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, 40));

        JPanelProducto.setBackground(new java.awt.Color(51, 51, 51));

        JlabelProductos.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        JlabelProductos.setForeground(new java.awt.Color(255, 255, 255));
        JlabelProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlabelProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/producto.png"))); // NOI18N
        JlabelProductos.setText("Productos");
        JlabelProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelProductoLayout = new javax.swing.GroupLayout(JPanelProducto);
        JPanelProducto.setLayout(JPanelProductoLayout);
        JPanelProductoLayout.setHorizontalGroup(
            JPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JlabelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelProductoLayout.setVerticalGroup(
            JPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JlabelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 40));

        JPanelClientes.setBackground(new java.awt.Color(51, 51, 51));

        JLabelClientes.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        JLabelClientes.setForeground(new java.awt.Color(255, 255, 255));
        JLabelClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Clientes.png"))); // NOI18N
        JLabelClientes.setText("Clientes");
        JLabelClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelClientesLayout = new javax.swing.GroupLayout(JPanelClientes);
        JPanelClientes.setLayout(JPanelClientesLayout);
        JPanelClientesLayout.setHorizontalGroup(
            JPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelClientesLayout.setVerticalGroup(
            JPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 40));

        JPanelProveedor.setBackground(new java.awt.Color(51, 51, 51));

        JLabelProveedor.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        JLabelProveedor.setForeground(new java.awt.Color(255, 255, 255));
        JLabelProveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/proveedor.png"))); // NOI18N
        JLabelProveedor.setText("Proveedores");
        JLabelProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelProveedorLayout = new javax.swing.GroupLayout(JPanelProveedor);
        JPanelProveedor.setLayout(JPanelProveedorLayout);
        JPanelProveedorLayout.setHorizontalGroup(
            JPanelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelProveedorLayout.setVerticalGroup(
            JPanelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 40));

        JPanelMedidas.setBackground(new java.awt.Color(51, 51, 51));

        JLabelMedidas.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        JLabelMedidas.setForeground(new java.awt.Color(255, 255, 255));
        JLabelMedidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelMedidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/detallista.png"))); // NOI18N
        JLabelMedidas.setText("Medidas");
        JLabelMedidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelMedidasLayout = new javax.swing.GroupLayout(JPanelMedidas);
        JPanelMedidas.setLayout(JPanelMedidasLayout);
        JPanelMedidasLayout.setHorizontalGroup(
            JPanelMedidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelMedidas, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelMedidasLayout.setVerticalGroup(
            JPanelMedidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelMedidas, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelMedidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 40));

        JPanelCategorias.setBackground(new java.awt.Color(51, 51, 51));

        JLabelCat.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        JLabelCat.setForeground(new java.awt.Color(255, 255, 255));
        JLabelCat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/box.png"))); // NOI18N
        JLabelCat.setText("Categorias");
        JLabelCat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelCategoriasLayout = new javax.swing.GroupLayout(JPanelCategorias);
        JPanelCategorias.setLayout(JPanelCategoriasLayout);
        JPanelCategoriasLayout.setHorizontalGroup(
            JPanelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelCat, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelCategoriasLayout.setVerticalGroup(
            JPanelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelCat, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 40));

        JPanelConfig.setBackground(new java.awt.Color(51, 51, 51));

        JLabelConfig.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        JLabelConfig.setForeground(new java.awt.Color(255, 255, 255));
        JLabelConfig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/config.png"))); // NOI18N
        JLabelConfig.setText("Configuración");
        JLabelConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelConfigLayout = new javax.swing.GroupLayout(JPanelConfig);
        JPanelConfig.setLayout(JPanelConfigLayout);
        JPanelConfigLayout.setHorizontalGroup(
            JPanelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelConfigLayout.setVerticalGroup(
            JPanelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 200, 40));

        JPanelUsers.setBackground(new java.awt.Color(51, 51, 51));

        JLabelUsers.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        JLabelUsers.setForeground(new java.awt.Color(255, 255, 255));
        JLabelUsers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/users.png"))); // NOI18N
        JLabelUsers.setText("Usuarios");
        JLabelUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelUsersLayout = new javax.swing.GroupLayout(JPanelUsers);
        JPanelUsers.setLayout(JPanelUsersLayout);
        JPanelUsersLayout.setHorizontalGroup(
            JPanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelUsersLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JLabelUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPanelUsersLayout.setVerticalGroup(
            JPanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelUsersLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JLabelUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(JPanelUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 200, 40));

        JPanelCaja.setBackground(new java.awt.Color(51, 51, 51));

        JLabelCaja.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        JLabelCaja.setForeground(new java.awt.Color(255, 255, 255));
        JLabelCaja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cajero.png"))); // NOI18N
        JLabelCaja.setText("Caja");
        JLabelCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelCajaLayout = new javax.swing.GroupLayout(JPanelCaja);
        JPanelCaja.setLayout(JPanelCajaLayout);
        JPanelCajaLayout.setHorizontalGroup(
            JPanelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelCajaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JLabelCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPanelCajaLayout.setVerticalGroup(
            JPanelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelCajaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JLabelCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(JPanelCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 200, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 620));

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pos Venta");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 24, 200, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        jPanel3.setBackground(new java.awt.Color(0, 51, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 270, 35));

        btnUsers.setText("Users");
        jPanel3.add(btnUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 150, 35));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/consultas.png"))); // NOI18N
        jPanel3.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(204, 204, 204));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Informática y Programación");
        jPanel3.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 440, -1));

        txtIdUsuario.setText("1");
        jPanel3.add(txtIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 30, 60, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1200, 100));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Producto"));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Código");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Descripción");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Precio Compra");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Precio Venta");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Proveedor");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Medida");

        cbxProveedorPro.setEditable(true);

        cbxMedidaPro.setEditable(true);

        cbxCatPro.setEditable(true);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Categoria");

        btnNuevoPro.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnNuevoPro.setText("Nuevo");

        btnRegistrarPro.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRegistrarPro.setText("Registrar");

        btnModificarPro.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnModificarPro.setText("Modificar");

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel54.setText("Id");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(btnNuevoPro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegistrarPro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificarPro))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel54))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoPro)
                            .addComponent(txtDescripcionPro)
                            .addComponent(cbxProveedorPro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxMedidaPro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxCatPro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrecioCompraPro, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(txtPrecioVentaPro))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtIdPro))))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescripcionPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioCompraPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioVentaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxProveedorPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addComponent(cbxMedidaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(27, 27, 27)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCatPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 520));

        TableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Código", "Descripción", "Precio", "Stock", "Estado"
            }
        ));
        TableProductos.setComponentPopupMenu(JPopupProductos);
        TableProductos.setRowHeight(23);
        jScrollPane1.setViewportView(TableProductos);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 800, 450));

        javax.swing.GroupLayout PaginadorProLayout = new javax.swing.GroupLayout(PaginadorPro);
        PaginadorPro.setLayout(PaginadorProLayout);
        PaginadorProLayout.setHorizontalGroup(
            PaginadorProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        PaginadorProLayout.setVerticalGroup(
            PaginadorProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel4.add(PaginadorPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 800, 60));

        jTabbedPane1.addTab("Productos", jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Cliente"));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Nombre");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Telefono");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Dirección");

        btnNuevoCli.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnNuevoCli.setText("Nuevo");

        btnRegitrarCli.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRegitrarCli.setText("Registrar");

        btnModificarCli.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnModificarCli.setText("Modificar");

        jScrollPane3.setViewportView(txtDireccionCli);

        txtIdCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCliActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel62.setText("Id");

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lupa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(btnNuevoCli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegitrarCli)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarCli))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel62)
                            .addComponent(jLabel67))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTelefonoCli)
                            .addComponent(txtNombreCli, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscarCli, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdCli, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarCli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdCli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(20, 20, 20)
                        .addComponent(txtTelefonoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10))
                .addGap(31, 31, 31)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegitrarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel11)))
                .addGap(24, 24, 24))
        );

        jPanel5.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 450));

        TableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Teléfono", "Dirección", "Estado"
            }
        ));
        TableClientes.setComponentPopupMenu(JPopupClientes);
        jScrollPane2.setViewportView(TableClientes);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 750, 380));

        javax.swing.GroupLayout PaginadoCliLayout = new javax.swing.GroupLayout(PaginadoCli);
        PaginadoCli.setLayout(PaginadoCliLayout);
        PaginadoCliLayout.setHorizontalGroup(
            PaginadoCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        PaginadoCliLayout.setVerticalGroup(
            PaginadoCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel5.add(PaginadoCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 750, 60));

        jTabbedPane1.addTab("Clientes", jPanel5);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Ruc", "Nombre", "Teléfono", "Dirección", "Estado"
            }
        ));
        TableProveedor.setComponentPopupMenu(JPopupProv);
        jScrollPane4.setViewportView(TableProveedor);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 750, 380));

        javax.swing.GroupLayout PaginadoProvLayout = new javax.swing.GroupLayout(PaginadoProv);
        PaginadoProv.setLayout(PaginadoProvLayout);
        PaginadoProvLayout.setHorizontalGroup(
            PaginadoProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        PaginadoProvLayout.setVerticalGroup(
            PaginadoProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel6.add(PaginadoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 750, 60));

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Proveedor"));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Nombre");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Telefono");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Dirección");

        btnNuevoProv.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnNuevoProv.setText("Nuevo");

        btnRegistrarProv.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRegistrarProv.setText("Registrar");

        btnModificarProv.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnModificarProv.setText("Modificar");

        jScrollPane5.setViewportView(txtDireccionProv);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Ruc");

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lupa.png"))); // NOI18N

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel63.setText("Id");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(btnNuevoProv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegistrarProv)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarProv)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel53)
                            .addComponent(jLabel63))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscarProv)
                            .addComponent(txtNombreProv)
                            .addComponent(txtTelefonoProv)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtRucProv)
                            .addComponent(txtIdProv))
                        .addGap(115, 115, 115))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdProv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBuscarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRucProv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTelefonoProv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoProv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jPanel6.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 500));

        jTabbedPane1.addTab("Proveedores", jPanel6);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout PaginadoUserLayout = new javax.swing.GroupLayout(PaginadoUser);
        PaginadoUser.setLayout(PaginadoUserLayout);
        PaginadoUserLayout.setHorizontalGroup(
            PaginadoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        PaginadoUserLayout.setVerticalGroup(
            PaginadoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel7.add(PaginadoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 750, 60));

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setBorder(null);

        TableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Usuario", "Nombre", "Rol", "", "Caja", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableUsers.setComponentPopupMenu(JPopupUsuarios);
        TableUsers.setRowHeight(20);
        jScrollPane6.setViewportView(TableUsers);
        if (TableUsers.getColumnModel().getColumnCount() > 0) {
            TableUsers.getColumnModel().getColumn(4).setResizable(false);
            TableUsers.getColumnModel().getColumn(4).setPreferredWidth(0);
        }

        jPanel7.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 840, 380));

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Usuario"));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Nombre");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("Contraseña");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Caja");

        btnNuevoUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnNuevoUser.setText("Nuevo");

        btnRegitrarUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRegitrarUser.setText("Registrar");

        btnModificarUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnModificarUser.setText("Modificar");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Usuario");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("Rol");

        cbxCajaUser.setEditable(true);

        cbxRolUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador" }));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lupa.png"))); // NOI18N

        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel64.setText("Id");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreUser, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUsuarioUser, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbxCajaUser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxRolUser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtClaveUser)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdUser)
                            .addComponent(txtBuscarUsers)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNuevoUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegitrarUser)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarUser)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuarioUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtClaveUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cbxCajaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cbxRolUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegitrarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel7.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 500));

        jTabbedPane1.addTab("Usuarios", jPanel7);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Nueva Categoria"));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("Nombre");

        btnNuevoCat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnNuevoCat.setText("Nuevo");

        btnRegitrarCat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRegitrarCat.setText("Registrar");

        btnModificarCat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnModificarCat.setText("Modificar");

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lupa.png"))); // NOI18N

        jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel65.setText("Id");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(btnNuevoCat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegitrarCat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificarCat)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscarCat)
                            .addComponent(txtNombreCat)
                            .addComponent(txtIdCat))))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdCat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65))
                .addGap(34, 34, 34)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscarCat)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtNombreCat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoCat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegitrarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
        );

        jPanel8.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 450));

        TableCat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Estado"
            }
        ));
        TableCat.setComponentPopupMenu(JPopupCat);
        TableCat.setRowHeight(20);
        jScrollPane7.setViewportView(TableCat);

        jPanel8.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 750, 380));

        javax.swing.GroupLayout PaginadoCatLayout = new javax.swing.GroupLayout(PaginadoCat);
        PaginadoCat.setLayout(PaginadoCatLayout);
        PaginadoCatLayout.setHorizontalGroup(
            PaginadoCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        PaginadoCatLayout.setVerticalGroup(
            PaginadoCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel8.add(PaginadoCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 750, 60));

        jTabbedPane1.addTab("Categorias", jPanel8);

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Nueva Medida"));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setText("Nombre");

        btnNuevoMed.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnNuevoMed.setText("Nuevo");

        btnRegitrarMed.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRegitrarMed.setText("Registrar");

        btnModificarMed.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnModificarMed.setText("Modificar");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setText("Nombre corto");

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lupa.png"))); // NOI18N

        jLabel66.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel66.setText("Id");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNuevoMed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegitrarMed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificarMed))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel66))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdMed, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreMed, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel21Layout.createSequentialGroup()
                                        .addComponent(txtNombreCortoMed, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtBuscarMed))
                                .addGap(1, 1, 1)))))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdMed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(txtBuscarMed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txtNombreMed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(txtNombreCortoMed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevoMed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegitrarMed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificarMed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel22)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel23)))
                .addGap(51, 51, 51))
        );

        jPanel9.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 450));

        TableMedida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Nombre Corto", "Estado"
            }
        ));
        TableMedida.setComponentPopupMenu(JPopupMed);
        TableMedida.setRowHeight(20);
        jScrollPane8.setViewportView(TableMedida);

        jPanel9.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 750, 380));

        javax.swing.GroupLayout PaginadoMedLayout = new javax.swing.GroupLayout(PaginadoMed);
        PaginadoMed.setLayout(PaginadoMedLayout);
        PaginadoMedLayout.setHorizontalGroup(
            PaginadoMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        PaginadoMedLayout.setVerticalGroup(
            PaginadoMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel9.add(PaginadoMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 750, 60));

        jTabbedPane1.addTab("Medidas", jPanel9);

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableNuevaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripción", "Cant", "Precio", "Total"
            }
        ));
        jScrollPane9.setViewportView(TableNuevaVenta);

        jPanel10.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 131, 1150, 310));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setText("Código");
        jPanel10.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setText("Producto");
        jPanel10.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setText("Cant");
        jPanel10.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel27.setText("Precio");
        jPanel10.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel28.setText("Total");
        jPanel10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, -1, -1));
        jPanel10.add(txtCodNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 30));
        jPanel10.add(txtProductoNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 220, 30));
        jPanel10.add(txtCantNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 40, 30));
        jPanel10.add(txtPrecioNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 60, 30));
        jPanel10.add(txtTotalNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 40, 30));
        jPanel10.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 50, 30));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel29.setText("Stock");
        jPanel10.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, -1, -1));

        btnGenerarVenta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnGenerarVenta.setText("Generar Venta");
        jPanel10.add(btnGenerarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 70, -1, 30));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setText("Cliente");
        jPanel10.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jPanel10.add(cbxClienteVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 230, -1));
        jPanel10.add(txtPagarConNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 100, -1));
        jPanel10.add(txtVueltoNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 80, -1));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel31.setText("Total Pagar");
        jPanel10.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 470, -1, -1));

        JLabelTotalPagar.setText("-------");
        jPanel10.add(JLabelTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 470, 110, -1));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel32.setText("Pagar con");
        jPanel10.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, -1, -1));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel33.setText("vuelto");
        jPanel10.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, -1, -1));
        jPanel10.add(txtIdNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 50, 30));

        jLabel57.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel57.setText("Id");
        jPanel10.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, -1, -1));

        btnCajas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCajas.setText("Cajas");
        jPanel10.add(btnCajas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 70, -1, 30));

        jTabbedPane1.addTab("Nueva Venta", jPanel10);

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cliente", "Total", "Fecha"
            }
        ));
        jScrollPane11.setViewportView(TableVentas);
        if (TableVentas.getColumnModel().getColumnCount() > 0) {
            TableVentas.getColumnModel().getColumn(0).setMinWidth(80);
            TableVentas.getColumnModel().getColumn(0).setPreferredWidth(80);
            TableVentas.getColumnModel().getColumn(0).setMaxWidth(120);
            TableVentas.getColumnModel().getColumn(2).setMinWidth(150);
            TableVentas.getColumnModel().getColumn(2).setPreferredWidth(150);
            TableVentas.getColumnModel().getColumn(2).setMaxWidth(200);
            TableVentas.getColumnModel().getColumn(3).setMinWidth(200);
            TableVentas.getColumnModel().getColumn(3).setPreferredWidth(200);
            TableVentas.getColumnModel().getColumn(3).setMaxWidth(250);
        }

        jPanel11.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1170, 390));

        javax.swing.GroupLayout PaginadoVentasLayout = new javax.swing.GroupLayout(PaginadoVentas);
        PaginadoVentas.setLayout(PaginadoVentasLayout);
        PaginadoVentasLayout.setHorizontalGroup(
            PaginadoVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
        );
        PaginadoVentasLayout.setVerticalGroup(
            PaginadoVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel11.add(PaginadoVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 1170, 50));

        btnHistorialVentas.setText("Generar Reporte");
        jPanel11.add(btnHistorialVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, -1));
        jPanel11.add(txtBuscarVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 260, 30));
        jPanel11.add(txtIdVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 60, -1));

        jTabbedPane1.addTab("Ventas", jPanel11);

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Proveedor", "Total", "Fecha"
            }
        ));
        TableCompras.setRowHeight(23);
        jScrollPane12.setViewportView(TableCompras);
        if (TableCompras.getColumnModel().getColumnCount() > 0) {
            TableCompras.getColumnModel().getColumn(0).setMinWidth(80);
            TableCompras.getColumnModel().getColumn(0).setPreferredWidth(80);
            TableCompras.getColumnModel().getColumn(0).setMaxWidth(120);
            TableCompras.getColumnModel().getColumn(2).setMinWidth(150);
            TableCompras.getColumnModel().getColumn(2).setPreferredWidth(150);
            TableCompras.getColumnModel().getColumn(2).setMaxWidth(200);
            TableCompras.getColumnModel().getColumn(3).setMinWidth(200);
            TableCompras.getColumnModel().getColumn(3).setPreferredWidth(200);
            TableCompras.getColumnModel().getColumn(3).setMaxWidth(250);
        }

        jPanel12.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1060, 450));
        jPanel12.add(txtBuscarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 40));

        btnHistorialCompra.setText("Generar Reporte");
        jPanel12.add(btnHistorialCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));
        jPanel12.add(txtIdCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 12, 140, 30));

        jTabbedPane1.addTab("Compras", jPanel12);

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la empresa"));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel39.setText("Nombre");

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel44.setText("Telefono");

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel45.setText("Dirección");

        btnModificarEmpresa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnModificarEmpresa.setText("Modificar");

        jScrollPane13.setViewportView(txtDireccionEmpresa);

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel46.setText("Ruc");

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel47.setText("Mensaje");

        jScrollPane14.setViewportView(txtMensaje);

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel56.setText("Id");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(jLabel44)
                            .addComponent(jLabel45)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(jLabel47))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRucEmpresa)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(txtTelefonoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdEmpresa))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnModificarEmpresa)
                .addGap(93, 93, 93))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRucEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addGap(27, 27, 27)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtTelefonoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel47)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnModificarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel13.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 500));

        jTabbedPane1.addTab("Configuracion", jPanel13);

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableNuevaCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripción", "Cant", "Precio", "Total"
            }
        ));
        jScrollPane10.setViewportView(TableNuevaCompra);

        jPanel16.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 131, 1060, 310));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel34.setText("Código");
        jPanel16.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel35.setText("Producto");
        jPanel16.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel36.setText("Cant");
        jPanel16.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel37.setText("Precio");
        jPanel16.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel38.setText("Total");
        jPanel16.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, -1, -1));
        jPanel16.add(txtCodNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 30));
        jPanel16.add(txtProductoNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 220, 30));
        jPanel16.add(txtCantNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 40, 30));
        jPanel16.add(txtPrecioNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 70, 30));
        jPanel16.add(txtTotalNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 70, 30));

        btnGenerarCompra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnGenerarCompra.setText("Generar Compra");
        jPanel16.add(btnGenerarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, -1, 30));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel40.setText("Proveedor");
        jPanel16.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jPanel16.add(cbxProCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 230, -1));
        jPanel16.add(txtPagarConNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 100, -1));
        jPanel16.add(txtVueltoNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 80, -1));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel41.setText("Total Pagar");
        jPanel16.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 470, -1, -1));

        JLabelTotalCompra.setText("-------");
        jPanel16.add(JLabelTotalCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 470, 110, -1));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel42.setText("Pagar con");
        jPanel16.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, -1, -1));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel43.setText("Vuelto");
        jPanel16.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, -1, -1));
        jPanel16.add(txtIdNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 50, 30));

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel55.setText("Id");
        jPanel16.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, -1, -1));

        jTabbedPane1.addTab("Nueva Compra", jPanel16);

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Nueva Caja"));

        jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel58.setText("Nombre");

        btnNuevoCaja.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnNuevoCaja.setText("Nuevo");

        btnRegitrarCaja.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRegitrarCaja.setText("Registrar");

        btnModificarCaja.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnModificarCaja.setText("Modificar");

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lupa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(btnNuevoCaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegitrarCaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificarCaja)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscarCaja)
                            .addComponent(txtNombreCaja)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(txtIdCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(txtIdCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscarCaja)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(txtNombreCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegitrarCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
        );

        jPanel14.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 450));

        TableCaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Estado"
            }
        ));
        TableCaja.setComponentPopupMenu(JPopupCajas);
        TableCaja.setRowHeight(20);
        jScrollPane15.setViewportView(TableCaja);

        jPanel14.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 750, 380));

        javax.swing.GroupLayout PaginadoCat1Layout = new javax.swing.GroupLayout(PaginadoCat1);
        PaginadoCat1.setLayout(PaginadoCat1Layout);
        PaginadoCat1Layout.setHorizontalGroup(
            PaginadoCat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        PaginadoCat1Layout.setVerticalGroup(
            PaginadoCat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel14.add(PaginadoCat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 750, 60));

        jTabbedPane1.addTab("Cajas", jPanel14);

        jPanel24.setBackground(new java.awt.Color(204, 204, 204));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder("Apertura y Cierre"));

        jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel60.setText("Monto Inicial");

        btnNuevoApertura.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnNuevoApertura.setText("Nuevo");

        btnAbrirCaja.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAbrirCaja.setText("Abrir");

        btnCerrarCaja.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCerrarCaja.setText("Cerrar");

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lupa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(btnNuevoApertura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(btnAbrirCaja)
                        .addGap(26, 26, 26)
                        .addComponent(btnCerrarCaja))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60)
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscarApertura)
                            .addComponent(txtMontoInicial))))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscarApertura)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(txtMontoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrirCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
        );

        jPanel24.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 510));

        TableApertura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha Apertura", "Fecha Cierre", "Monto Inicial", "Monto Final", "Total Ventas", "Usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane16.setViewportView(TableApertura);
        if (TableApertura.getColumnModel().getColumnCount() > 0) {
            TableApertura.getColumnModel().getColumn(4).setMinWidth(60);
            TableApertura.getColumnModel().getColumn(4).setPreferredWidth(60);
            TableApertura.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        jPanel24.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 840, 490));

        jTabbedPane1.addTab("Apertura y Cierre", jPanel24);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 1200, 620));
        jTabbedPane1.getAccessibleContext().setAccessibleName("tab1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCliActionPerformed

    private void JMenuReingresarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuReingresarProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMenuReingresarProActionPerformed

    private void txtBuscarCat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCat1ActionPerformed

    private void JMenuReingresarCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuReingresarCajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMenuReingresarCajaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel JLabelCaja;
    public javax.swing.JLabel JLabelCat;
    public javax.swing.JLabel JLabelClientes;
    public javax.swing.JLabel JLabelConfig;
    public javax.swing.JLabel JLabelMedidas;
    public javax.swing.JLabel JLabelNuevaCompra;
    public javax.swing.JLabel JLabelNuevaVenta;
    public javax.swing.JLabel JLabelProveedor;
    public javax.swing.JLabel JLabelTotalCompra;
    public javax.swing.JLabel JLabelTotalPagar;
    public javax.swing.JLabel JLabelUsers;
    public javax.swing.JMenuItem JMenuEliminarCaja;
    public javax.swing.JMenuItem JMenuEliminarCat;
    public javax.swing.JMenuItem JMenuEliminarMed;
    public javax.swing.JMenuItem JMenuEliminarPro;
    public javax.swing.JMenuItem JMenuEliminarProv;
    public javax.swing.JMenuItem JMenuEliminarUsers;
    public javax.swing.JMenuItem JMenuElimnarCli;
    public javax.swing.JMenuItem JMenuReingresarCaja;
    public javax.swing.JMenuItem JMenuReingresarCat;
    public javax.swing.JMenuItem JMenuReingresarCli;
    public javax.swing.JMenuItem JMenuReingresarMed;
    public javax.swing.JMenuItem JMenuReingresarPro;
    public javax.swing.JMenuItem JMenuReingresarProv;
    public javax.swing.JMenuItem JMenuReingresarUser;
    public javax.swing.JPanel JPanelCaja;
    public javax.swing.JPanel JPanelCategorias;
    public javax.swing.JPanel JPanelClientes;
    public javax.swing.JPanel JPanelConfig;
    public javax.swing.JPanel JPanelMedidas;
    public javax.swing.JPanel JPanelNuevaVenta;
    public javax.swing.JPanel JPanelProducto;
    public javax.swing.JPanel JPanelProveedor;
    public javax.swing.JPanel JPanelUsers;
    private javax.swing.JPopupMenu JPopupCajas;
    private javax.swing.JPopupMenu JPopupCat;
    private javax.swing.JPopupMenu JPopupClientes;
    private javax.swing.JPopupMenu JPopupMed;
    private javax.swing.JPopupMenu JPopupProductos;
    private javax.swing.JPopupMenu JPopupProv;
    private javax.swing.JPopupMenu JPopupUsuarios;
    public javax.swing.JLabel JlabelProductos;
    public javax.swing.JPanel JpanelNuevaCompra;
    public javax.swing.JPanel PaginadoCat;
    public javax.swing.JPanel PaginadoCat1;
    public javax.swing.JPanel PaginadoCli;
    public javax.swing.JPanel PaginadoMed;
    public javax.swing.JPanel PaginadoProv;
    private javax.swing.JPanel PaginadoUser;
    private javax.swing.JPanel PaginadoVentas;
    public javax.swing.JPanel PaginadorPro;
    public javax.swing.JTable TableApertura;
    public javax.swing.JTable TableCaja;
    public javax.swing.JTable TableCat;
    public javax.swing.JTable TableClientes;
    public javax.swing.JTable TableCompras;
    public javax.swing.JTable TableMedida;
    public javax.swing.JTable TableNuevaCompra;
    public javax.swing.JTable TableNuevaVenta;
    public javax.swing.JTable TableProductos;
    public javax.swing.JTable TableProveedor;
    public javax.swing.JTable TableUsers;
    public javax.swing.JTable TableVentas;
    public javax.swing.JButton btnAbrirCaja;
    public javax.swing.JButton btnCajas;
    public javax.swing.JButton btnCerrarCaja;
    public javax.swing.JButton btnGenerarCompra;
    public javax.swing.JButton btnGenerarVenta;
    public javax.swing.JButton btnHistorialCompra;
    public javax.swing.JButton btnHistorialVentas;
    public javax.swing.JButton btnModificarCaja;
    public javax.swing.JButton btnModificarCat;
    public javax.swing.JButton btnModificarCli;
    public javax.swing.JButton btnModificarEmpresa;
    public javax.swing.JButton btnModificarMed;
    public javax.swing.JButton btnModificarPro;
    public javax.swing.JButton btnModificarProv;
    public javax.swing.JButton btnModificarUser;
    public javax.swing.JButton btnNuevoApertura;
    public javax.swing.JButton btnNuevoCaja;
    public javax.swing.JButton btnNuevoCat;
    public javax.swing.JButton btnNuevoCli;
    public javax.swing.JButton btnNuevoMed;
    public javax.swing.JButton btnNuevoPro;
    public javax.swing.JButton btnNuevoProv;
    public javax.swing.JButton btnNuevoUser;
    public javax.swing.JButton btnRegistrarPro;
    public javax.swing.JButton btnRegistrarProv;
    public javax.swing.JButton btnRegitrarCaja;
    public javax.swing.JButton btnRegitrarCat;
    public javax.swing.JButton btnRegitrarCli;
    public javax.swing.JButton btnRegitrarMed;
    public javax.swing.JButton btnRegitrarUser;
    private javax.swing.JButton btnUsers;
    public javax.swing.JComboBox<Object> cbxCajaUser;
    public javax.swing.JComboBox<Object> cbxCatPro;
    public javax.swing.JComboBox<Object> cbxClienteVentas;
    public javax.swing.JComboBox<Object> cbxMedidaPro;
    public javax.swing.JComboBox<Object> cbxProCompra;
    public javax.swing.JComboBox<Object> cbxProveedorPro;
    public javax.swing.JComboBox<String> cbxRolUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTextField txtBuscarApertura;
    public javax.swing.JTextField txtBuscarCaja;
    public javax.swing.JTextField txtBuscarCat;
    public javax.swing.JTextField txtBuscarCli;
    public javax.swing.JTextField txtBuscarCompra;
    public javax.swing.JTextField txtBuscarMed;
    public javax.swing.JTextField txtBuscarProducto;
    public javax.swing.JTextField txtBuscarProv;
    public javax.swing.JTextField txtBuscarUsers;
    public javax.swing.JTextField txtBuscarVentas;
    public javax.swing.JTextField txtCantNC;
    public javax.swing.JTextField txtCantNV;
    public javax.swing.JPasswordField txtClaveUser;
    public javax.swing.JTextField txtCodNC;
    public javax.swing.JTextField txtCodNV;
    public javax.swing.JTextField txtCodigoPro;
    public javax.swing.JTextField txtDescripcionPro;
    public javax.swing.JTextPane txtDireccionCli;
    public javax.swing.JTextPane txtDireccionEmpresa;
    public javax.swing.JTextPane txtDireccionProv;
    public javax.swing.JTextField txtIdCaja;
    public javax.swing.JTextField txtIdCat;
    public javax.swing.JTextField txtIdCli;
    public javax.swing.JTextField txtIdCompra;
    public javax.swing.JTextField txtIdEmpresa;
    public javax.swing.JTextField txtIdMed;
    public javax.swing.JTextField txtIdNC;
    public javax.swing.JTextField txtIdNV;
    public javax.swing.JTextField txtIdPro;
    public javax.swing.JTextField txtIdProv;
    public javax.swing.JTextField txtIdUser;
    public javax.swing.JTextField txtIdUsuario;
    public javax.swing.JTextField txtIdVentas;
    public javax.swing.JTextPane txtMensaje;
    public javax.swing.JTextField txtMontoInicial;
    public javax.swing.JTextField txtNombreCaja;
    public javax.swing.JTextField txtNombreCat;
    public javax.swing.JTextField txtNombreCli;
    public javax.swing.JTextField txtNombreCortoMed;
    public javax.swing.JTextField txtNombreEmpresa;
    public javax.swing.JTextField txtNombreMed;
    public javax.swing.JTextField txtNombreProv;
    public javax.swing.JTextField txtNombreUser;
    public javax.swing.JTextField txtPagarConNC;
    public javax.swing.JTextField txtPagarConNV;
    public javax.swing.JTextField txtPrecioCompraPro;
    public javax.swing.JTextField txtPrecioNC;
    public javax.swing.JTextField txtPrecioNV;
    public javax.swing.JTextField txtPrecioVentaPro;
    public javax.swing.JTextField txtProductoNC;
    public javax.swing.JTextField txtProductoNV;
    public javax.swing.JTextField txtRucEmpresa;
    public javax.swing.JTextField txtRucProv;
    public javax.swing.JTextField txtStock;
    public javax.swing.JTextField txtTelefonoCli;
    public javax.swing.JTextField txtTelefonoEmpresa;
    public javax.swing.JTextField txtTelefonoProv;
    public javax.swing.JTextField txtTotalNC;
    public javax.swing.JTextField txtTotalNV;
    public javax.swing.JTextField txtUsuarioUser;
    public javax.swing.JTextField txtVueltoNC;
    public javax.swing.JTextField txtVueltoNV;
    // End of variables declaration//GEN-END:variables
}
