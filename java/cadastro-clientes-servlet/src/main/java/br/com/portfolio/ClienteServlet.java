package br.com.portfolio;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cliente")
public class ClienteServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String idade = request.getParameter("idade");

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"pt-BR\">");
        out.println("<head><meta charset=\"UTF-8\"><title>Cadastro realizado</title></head>");
        out.println("<body>");
        out.println("<h1>Cliente cadastrado!</h1>");
        out.println("<p>Nome: " + escaparHtml(nome) + "</p>");
        out.println("<p>E-mail: " + escaparHtml(email) + "</p>");
        out.println("<p>Idade: " + escaparHtml(idade) + "</p>");
        out.println("</body>");
        out.println("</html>");
    }

    private String escaparHtml(String texto) {
        if (texto == null) {
            return "";
        }

        return texto.replace("&", "&amp;")
                    .replace("<", "&lt;")
                    .replace(">", "&gt;")
                    .replace("\"", "&quot;")
                    .replace("'", "&#39;");
    }
}
