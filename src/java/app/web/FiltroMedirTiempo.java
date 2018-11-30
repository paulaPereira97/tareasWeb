package app.web;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FiltroMedirTiempo
 */
@WebFilter("/*")
public class FiltroMedirTiempo implements Filter {

    /**
     * Default constructor. 
     */
    public FiltroMedirTiempo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// Tomamos el tiempo al entrar la peticion
		long tiempoInicial = System.currentTimeMillis();
		
		// Paso de testigo
		// El servlet continua con la peticion
		chain.doFilter(request, response);
		
		// Ya procesamos la respuesta
		long tiempoFinal = System.currentTimeMillis();
		
		// Medimos el tiempo invertido en atender la peticion
		long tiempoInvertido = tiempoFinal - tiempoInicial;
		
		System.out.println("Se ha tardado " + tiempoInvertido + " mseg en atender la solicitud");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
