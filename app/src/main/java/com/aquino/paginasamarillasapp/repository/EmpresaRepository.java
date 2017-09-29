package com.aquino.paginasamarillasapp.repository;

import com.aquino.paginasamarillasapp.R;
import com.aquino.paginasamarillasapp.model.Empresa;

import java.util.ArrayList;
import java.util.List;

public class EmpresaRepository {

    private static EmpresaRepository _INSTANCE = null;

    private EmpresaRepository(){ }

    public static EmpresaRepository getInstance(){
        if(_INSTANCE == null) {
            _INSTANCE = new EmpresaRepository();
        }
        return _INSTANCE;
    }


    List<Empresa> empresas = new ArrayList<>();


    public List<Empresa> getEmpresas() {
        return empresas;
    }

    public void agregarEmpresa(){

        Empresa e1= new Empresa(100,"Educacion", "Tecsup", "Av Cascanueces 205", 999167812, "contacto@tecsup.edu.pe", "http://tecsup.edu.pe", R.drawable.ic_tecsup, "Tecsup es una organización educativa privada sin fines de lucro, dedicada a formar y capacitar profesionales, así como brindar servicios de consultoría, investigación y aplicación de tecnología. El fundador, Luis Hochschild Plaut, se esforzó por hacer de Tecsup una valiosa obra para beneficio de los jóvenes y profesionales de empresas e instituciones del país.");
        Empresa e2= new Empresa(200,"Restaurantes", "Pizza Hut", "Av Izaguirre 105", 5243567, "atencionalcliente@pizza.com", "http:/pizzahut.com.pe", R.drawable.ic_pizza, "Pizza Hut es una cadena de restaurantes de comida rápida subsidiaria del grupo Yum! Brands. Es conocido por su menú italoamericano de cocina que incluye pizza y pasta, así como guarniciones y postres");
        Empresa e3= new Empresa(300,"Restaurantes", "Norky's", "Av Belaunde 111", 5124513, "clientes@hotmail.com", "http://norkys.com.pe", R.drawable.ic_norkys, "Reserva gratis en norkys.pe mesa para el restaurante Norkys (Perú 3641). Para comer rápido, rico y a buen precio.");
        Empresa e4 = new Empresa(400,"Restaurantes", "KFC", "Av. Perú 2152", 5050505, "kfcclientes@gmail.com", "http://kfc.com.pe", R.drawable.ic_kfc, "Compra online y disfruta promociones exclusivas. Paga en tu domicilio u oficina, con efectivo o tarjeta, sin costo adicional. ¡Fácil y rápido!");
        Empresa e5 = new Empresa(500,"Educacion", "Cibertec", "Av. Izaguirre 252", 5081231, "cibertec@gmail.com", "http://cibertec.com.pe", R.drawable.ic_cibertec, "Cibertec es una institución educativa que cuenta con más de 33 años de experiencia (autorizado mediante Resolución Ministerial 1451-83-ED con fecha 10 de noviembre de 1983) en la formación y capacitación de profesionales en diferentes áreas de Tecnologías de la Información, Gestión y Negocios, Diseño, Comunicaciones e Ingeniería.");
        Empresa e6 = new Empresa(600,"Cine", "Cineplanet", "Av. Canada 200", 998143210, "cineplanet@gmail.com", "http://cineplanet.com.pe", R.drawable.ic_cineplanet, "Cineplanet, la cadena de cines más grande del Perú.");
        Empresa e7 = new Empresa(700,"Cine", "Cinestar", "Av. Jose Carlos Mariategui 252", 3451232, "cinestarperu@hotmail.com", "http://cinestar.pe", R.drawable.ic_cinestar, "Cinestar cartelera y horarios. Encuentra información, cómo llegar, teléfono y compra de entradas de Cinestar");
        Empresa e8 = new Empresa(800,"Libros", "Crisol", "San Miguel 1434", 5056712, "crisolperu@gmail.com", "http://crisol.com.pe", R.drawable.ic_crisol, "Somos una empresa de retail especializada, dedicada a la venta minorista de libros y artículos de entretenimiento cultura. Nuestras actividades se concentran en la venta de libros diversos en un ambiente agradable, diferenciado por nuestra calidad de servicio y el asesoramiento de nuestros libreros.");
        Empresa e9 = new Empresa(900,"Noticias", "Comercio", "Av. Gamarra 1232", 999131204, "comercioclientes@gmail.com", "http://elcomercio.pe", R.drawable.ic_comercio, "Noticias del Perú y del mundo en elcomercio.pe - Ultimas noticias de política, deportes, televisión, fútbol, cartelera, economía, mundo, tecnología, ciencia y más.");
        Empresa e10 = new Empresa(950,"Educacion", "Senati", "Panamericana Norte 1345", 4561232, "senati@hotmail.com", "http://senati.com.pe", R.drawable.ic_senati, "Motivados por el hecho que la formación profesional y la educación técnica tradicionales no otorgaban las calificaciones requeridas por la actividad productiva moderna, los empresarios de la Sociedad Nacional de Industrias decidieron en 1960, promover la creación de una institución destinada específicamente a desarrollar las aptitudes humanas para el desempeño competente de las ocupaciones profesionales de la actividad industrial manufacturera y de las labores de instalación, reparación y mantenimiento");
        empresas.add(e1);
        empresas.add(e2);
        empresas.add(e3);
        empresas.add(e4);
        empresas.add(e5);
        empresas.add(e6);
        empresas.add(e7);
        empresas.add(e8);
        empresas.add(e9);
        empresas.add(e10);
    }


}
