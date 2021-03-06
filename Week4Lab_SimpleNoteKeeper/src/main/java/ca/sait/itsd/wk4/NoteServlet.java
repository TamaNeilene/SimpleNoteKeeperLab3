/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sait.itsd.wk4;


import ca.sait.itsd.wk4.javabeans.Note;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author parso
 */

public class NoteServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
        String query = request.getQueryString();
        
        if (query != null && query.contains("edit")){
           
            
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }else {
            
            
            String path = getServletContext().getRealPath("/WEB-INF/note1.txt");
            File f = new File(path);
            FileReader fr =new FileReader(f);
            
            BufferedReader br = new BufferedReader(fr);
        
            String title = br.readLine();
            String contents = br.readLine();
        
            Note note = new Note(title,contents);
        
            request.setAttribute("note",note);
        
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String title = request.getParameter("title");
        
        String contents = request.getParameter("contents");
        
        String path = getServletContext().getRealPath("/WEB-INF/note1.txt");
        
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        
        pw.println(title);
        
        pw.println(contents);
        
        pw.close();
        
        Note note = new Note(title,contents);

        request.setAttribute("note", note);

        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }

  

}
