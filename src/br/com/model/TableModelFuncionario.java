package br.com.model;

import br.com.entity.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelFuncionario extends AbstractTableModel {

    
    
    
    private final String[] NOME_COLUNA_FUNCIONARIO = {"IdFunc", "Nome", "Idade", "Telefone", "CPF"};
    private List<Funcionario> listaTableFuncionario;

    public TableModelFuncionario() {

        listaTableFuncionario = new ArrayList<>();
        adicionaTabelaFuncionario();

    }

    public void adicionaTabelaFuncionario() {

        FuncionarioDAO dao = new FuncionarioDAO();

        for (Funcionario funci : dao.buscaTableFuncionario()) {

            listaTableFuncionario.add(funci);
        }
    }

    public TableModelFuncionario(int idFunc) {

        listaTableFuncionario = new ArrayList<>();
        adicionaTabelaFuncPorID(idFunc);

    }

    public void adicionaTabelaFuncPorID(int idFunc) {

        FuncionarioDAO dao = new FuncionarioDAO();

        for (Funcionario func : dao.buscaFuncID(idFunc)){

            listaTableFuncionario.add(func);
        }
           fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return listaTableFuncionario.size();
    }

    @Override
    public int getColumnCount() {
        return NOME_COLUNA_FUNCIONARIO.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch (columnIndex) {

            case 0:
                return this.listaTableFuncionario.get(rowIndex).getId();
            case 1:
                return this.listaTableFuncionario.get(rowIndex).getNome();
            case 2:
                return this.listaTableFuncionario.get(rowIndex).getIdade();
            case 3:
                return this.listaTableFuncionario.get(rowIndex).getTelefone();
            case 4:
                return this.listaTableFuncionario.get(rowIndex).getCPF();
            default:
                return this.listaTableFuncionario.get(rowIndex);
        }
    }

    @Override
    public String getColumnName(int indiceColumn) {

        return NOME_COLUNA_FUNCIONARIO[indiceColumn];
    }
}
