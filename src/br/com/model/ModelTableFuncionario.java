package br.com.model;

import br.com.entity.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModelTableFuncionario extends AbstractTableModel {

    private List<Funcionario> listaFuncionario;

    private String[] Nome_Coluna = {"Código", "Nome", "Idade", "Telefone", "CPF"};

    public ModelTableFuncionario() {
        listaFuncionario = new ArrayList<>();
        addFunc();
    }

    @Override
    public int getRowCount() {
        return listaFuncionario.size();
    }

    public void addFunc() {
        FuncionarioDAO dao = new FuncionarioDAO();

        for (Funcionario func : dao.getFunc()) {
            listaFuncionario.add(func);
        }
        fireTableDataChanged();
    }

    @Override
    public int getColumnCount() {
        return Nome_Coluna.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return this.listaFuncionario.get(rowIndex).getId();
            case 1:
                return this.listaFuncionario.get(rowIndex).getNome();
            case 2:
                return this.listaFuncionario.get(rowIndex).getIdade();
            case 3:
                return this.listaFuncionario.get(rowIndex).getTelefone();
            case 4:
                return this.listaFuncionario.get(rowIndex).getCPF();
            default:
                return this.listaFuncionario.get(rowIndex);
        }
    }

    @Override
    public String getColumnName(int indiceColuna) {
        return Nome_Coluna[indiceColuna];
    }
}
