/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ldss.lojainformatica.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ldss.lojainformatica.model.Computador;
import ldss.lojainformatica.utils.GerenciadorConexao;

/**
 *
 * @author ldss1
 */
public class ComputadorDAO {

    private static Connection conexao;
    private static String query;
    private static PreparedStatement instrucaoSQL;
    private static boolean status;

    // Inserir Produto
    public static boolean inserirComputador(Computador objComputador) {

        conexao = GerenciadorConexao.abrirConexao();

        query = "INSERT INTO computador (Marca, HD, Processador) VALUES (?, ?, ?)";

        try {

            instrucaoSQL = conexao.prepareStatement(query);

            instrucaoSQL.setString(1, objComputador.getMarca());
            instrucaoSQL.setString(2, objComputador.getHd());
            instrucaoSQL.setString(3, objComputador.getProcessador());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                // System.out.println("Inserção realizada com sucesso!");
                status = true;

            } else {
                // System.out.println("A inserção não foi realizada!");
                status = false;
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return status;
    }

    public static ArrayList<Computador> listarComputadores() {

        ArrayList<Computador> listaComputadores = new ArrayList<Computador>();

        conexao = GerenciadorConexao.abrirConexao();
        if (conexao != null) {

            query = "SELECT * FROM computador";

            try {

                instrucaoSQL = conexao.prepareStatement(query);

                ResultSet rs = instrucaoSQL.executeQuery();

                if (rs != null) {
                    while (rs.next()) {

                        Computador objComputador = new Computador();

                        objComputador.setIdComputador(rs.getInt("idComputador"));
                        objComputador.setMarca(rs.getString("Marca"));
                        objComputador.setHd(rs.getString("HD"));
                        objComputador.setProcessador(rs.getString("Processador"));

                        listaComputadores.add(objComputador);
                    }
                }

            } catch (SQLException e) {
                // TODO Auto-generated catch block
                System.out.println("Erro ao listar computadores");
            }
        }
        return listaComputadores;
    }

    public static Boolean atualizarComputador(Computador computador) {

        conexao = GerenciadorConexao.abrirConexao();

        query = "UPDATE computador SET Marca = ?, HD = ?, Processador = ? WHERE idComputador = ?";

        try {

            instrucaoSQL = conexao.prepareStatement(query);

            instrucaoSQL.setString(1, computador.getMarca());
            instrucaoSQL.setString(2, computador.getHd());
            instrucaoSQL.setString(3, computador.getProcessador());
            instrucaoSQL.setInt(4, computador.getIdComputador());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                // System.out.println("Atualização realizada com sucesso!");
                status = true;

            } else {
                // System.out.println("A atualização não foi realizada!");
                status = false;
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return status;
    }

    public static boolean apagarComputador(int idComputador) {

        conexao = GerenciadorConexao.abrirConexao();

        query = "DELETE FROM computador WHERE idComputador = ?";

        try {

            instrucaoSQL = conexao.prepareStatement(query);

            instrucaoSQL.setInt(1, idComputador);

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                // System.out.println("Exclusão realizada com sucesso!");
                status = true;

            } else {
                // System.out.println("A exclusão não foi realizada!");
                status = false;
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return status;
    }

    public static ArrayList<Computador> listarComputadoresPorProcessador(String processador) {

        ArrayList<Computador> listaComputadores = new ArrayList<Computador>();

        conexao = GerenciadorConexao.abrirConexao();
        if (conexao != null) {

            query = "SELECT * FROM computador WHERE Processador = ?";

            try {

                instrucaoSQL = conexao.prepareStatement(query);

                instrucaoSQL.setString(1, processador);

                ResultSet rs = instrucaoSQL.executeQuery();

                if (rs != null) {
                    while (rs.next()) {

                        Computador objComputador = new Computador();

                        objComputador.setIdComputador(rs.getInt("idComputador"));
                        objComputador.setMarca(rs.getString("Marca"));
                        objComputador.setHd(rs.getString("HD"));
                        objComputador.setProcessador(rs.getString("Processador"));

                        listaComputadores.add(objComputador);
                    }
                }

            } catch (SQLException e) {
                // TODO Auto-generated catch block
                System.out.println("Erro ao listar computadores");
            }
        }
        return listaComputadores;
    }

    public static ArrayList<Computador> listarComputadoresPorMarca(String marca) {

        ArrayList<Computador> listaComputadores = new ArrayList<Computador>();

        conexao = GerenciadorConexao.abrirConexao();
        if (conexao != null) {

            query = "SELECT * FROM computador WHERE Marca LIKE ?";

            try {

                instrucaoSQL = conexao.prepareStatement(query);

                instrucaoSQL.setString(1, marca + "%");

                ResultSet rs = instrucaoSQL.executeQuery();

                if (rs != null) {
                    while (rs.next()) {

                        Computador objComputador = new Computador();

                        objComputador.setIdComputador(rs.getInt("idComputador"));
                        objComputador.setMarca(rs.getString("Marca"));
                        objComputador.setHd(rs.getString("HD"));
                        objComputador.setProcessador(rs.getString("Processador"));

                        listaComputadores.add(objComputador);
                    }
                }

            } catch (SQLException e) {
                // TODO Auto-generated catch block
                System.out.println("Erro ao listar computadores");
            }
        }
        return listaComputadores;
    }

}
