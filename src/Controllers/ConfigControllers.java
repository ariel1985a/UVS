
package Controllers;

import Models.Configuracion;
import Models.UsuarioDao;
import Views.PanelAdmin;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ConfigControllers implements MouseListener{

    private Configuracion cof;
    private UsuarioDao Cdao;
    private PanelAdmin views;

    public ConfigControllers(Configuracion cof, UsuarioDao Cdao, PanelAdmin views) {
        this.cof = cof;
        this.Cdao = Cdao;
        this.views = views;
        this.views.JLabelCat.addMouseListener(this);
        this.views.JLabelClientes.addMouseListener(this);
        this.views.JLabelConfig.addMouseListener(this);
        this.views.JLabelMedidas.addMouseListener(this);
        this.views.JLabelNuevaCompra.addMouseListener(this);
        this.views.JLabelNuevaVenta.addMouseListener(this);
        this.views.JLabelProveedor.addMouseListener(this);
        this.views.JLabelCaja.addMouseListener(this);
        this.views.JLabelUsers.addMouseListener(this);
        this.views.JlabelProductos.addMouseListener(this);
        cof = Cdao.getConfig();
        views.txtIdEmpresa.setText(""+ cof.getId());
        views.txtRucEmpresa.setText(cof.getRuc());
        views.txtTelefonoEmpresa.setText(cof.getTelefono());
        views.txtNombreEmpresa.setText(cof.getNombre());
        views.txtDireccionEmpresa.setText(cof.getDireccion());
        views.txtMensaje.setText(cof.getMensaje());
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == views.JLabelConfig){
                views.jTabbedPane1.setSelectedIndex(9);
            }
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == views.JLabelCat) {
            views.JPanelCategorias.setBackground(new Color(255,51,51));
        }else if(e.getSource() == views.JLabelClientes) {
            views.JPanelClientes.setBackground(new Color(255,51,51));
        }else if(e.getSource() == views.JLabelConfig) {
            views.JPanelConfig.setBackground(new Color(255,51,51));
        }else if(e.getSource() == views.JLabelMedidas) {
            views.JPanelMedidas.setBackground(new Color(255,51,51));
        }else if(e.getSource() == views.JLabelNuevaCompra) {
            views.JpanelNuevaCompra.setBackground(new Color(255,51,51));
        }else if(e.getSource() == views.JLabelNuevaVenta) {
            views.JPanelNuevaVenta.setBackground(new Color(255,51,51));
        }else if(e.getSource() == views.JLabelProveedor) {
            views.JPanelProveedor.setBackground(new Color(255,51,51));
        }else if(e.getSource() == views.JLabelCaja) {
            views.JPanelCaja.setBackground(new Color(255,51,51));
        }else if(e.getSource() == views.JLabelUsers) {
            views.JPanelUsers.setBackground(new Color(255,51,51));
        }else{
            views.JPanelProducto.setBackground(new Color(255,51,51));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == views.JLabelCat) {
            views.JPanelCategorias.setBackground(new Color(51,51,51));
        }else if(e.getSource() == views.JLabelClientes) {
            views.JPanelClientes.setBackground(new Color(51,51,51));
        }else if(e.getSource() == views.JLabelConfig) {
            views.JPanelConfig.setBackground(new Color(51,51,51));
        }else if(e.getSource() == views.JLabelMedidas) {
            views.JPanelMedidas.setBackground(new Color(51,51,51));
        }else if(e.getSource() == views.JLabelNuevaCompra) {
            views.JpanelNuevaCompra.setBackground(new Color(51,51,51));
        }else if(e.getSource() == views.JLabelNuevaVenta) {
            views.JPanelNuevaVenta.setBackground(new Color(51,51,51));
        }else if(e.getSource() == views.JLabelProveedor) {
            views.JPanelProveedor.setBackground(new Color(51,51,51));
        }else if(e.getSource() == views.JLabelCaja) {
            views.JPanelCaja.setBackground(new Color(51,51,51));
        }else if(e.getSource() == views.JLabelUsers) {
            views.JPanelUsers.setBackground(new Color(51,51,51));
        }else{
            views.JPanelProducto.setBackground(new Color(51,51,51));
        }
    }
    
}

