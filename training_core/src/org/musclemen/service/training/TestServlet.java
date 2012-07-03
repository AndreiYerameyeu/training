package org.musclemen.service.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.musclemen.model.training.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Autowired
	@Qualifier("trainingDao")
	private TrainingDAO dao;

    /**
     * Default constructor. 
     */
    public TestServlet() {
        // TODO Auto-generated constructor stub
    }
    
    

	@Override
	public void init(ServletConfig config) throws ServletException {		
		super.init(config);
		WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		webApplicationContext.getAutowireCapableBeanFactory().autowireBean(this);
		//dao = (TrainingDAO) webApplicationContext.getBean("trainingDao");		
	}



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		generatePage(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		generatePage(request, response);
	}
	
	public void generatePage(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		 response.setContentType( "text/html" );  
         PrintWriter out = response.getWriter();  
         out.println( "<html><head>" );  
         out.println( "<title></title>" );  
         out.println( "</head>" );  
         out.println( "<body>" );  
         out.println( "<table>" );
         List<Exercise> exercises = dao.getAllExercises();
         if (exercises==null || exercises.size()==0)
         {
        	 Exercise e = new Exercise();
        	 e.setName("e1");
        	 dao.addNewExercise(e);
        	 e = new Exercise();
        	 e.setName("e2");
        	 dao.addNewExercise(e);
        	 e = new Exercise();
        	 e.setName("e3");
        	 dao.addNewExercise(e);
        	 exercises = dao.getAllExercises();
         }
         for (Exercise exercise : exercises) {
        	 out.println( "<tr>" );
        	 out.println( "<td>" );
        	 out.println(exercise.getName());
        	 out.println( "</td>" );
        	 out.println( "<td>" );
        	 out.println( "</td>" );
        	 out.println( "</tr>" );
		}
         out.println( "</body></html>" );  
         out.close();  
	}


	public List<Exercise> getAllExercises() {
		// TODO Auto-generated method stub
		return null;
	}


	public void addNewExercise(Exercise exercise) {
		// TODO Auto-generated method stub
		
	}

	public void deleteExercise(String name) {
		// TODO Auto-generated method stub
		
	}

}
