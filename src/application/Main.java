package application;

import view.Frame;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
//
//        String[] opcoes = {"Adicionar", "Remover", "Modificar", "Mostrar"};
//
//        Opcoes[] opcoesEnum = Opcoes.values();
//
//        int option = JOptionPane.showOptionDialog(
//                null,
//                "Clique OK para continuar",
//                "Aviso",
//                JOptionPane.DEFAULT_OPTION,
//                JOptionPane.WARNING_MESSAGE,
//                null, opcoes, null
//        );
//
//        Opcoes escolha = (option >= 0 && option < opcoesEnum.length) ? opcoesEnum[option] : null;
//
//        if (escolha != null) {
//            JOptionPane.showMessageDialog(null, "Você escolheu: " + escolha);
//        } else {
//            JOptionPane.showMessageDialog(null, "Nenhuma opção válida foi selecionada.");
//        }
//
        // =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-


//        Object[] itens = {"Maçã", "Pera", "Banana"};
//        Object selecao = JOptionPane.showInputDialog(
//                null,
//                "Escolha um item",
//                "Opção",
//                JOptionPane.INFORMATION_MESSAGE,
//                null,
//                itens,
//                " "
//        );
//        System.out.println(selecao);
//
//        if (selecao == null) {
//            JOptionPane.showMessageDialog(null, "Operação cancelada");
//        } else {
//            JOptionPane.showMessageDialog(null, "Você escolheu " + selecao);
//        }

        // =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

        Frame frame = new Frame();

    }
}

enum Opcoes {
    ADICIONAR,
    REMOVER,
    MODIFICAR,
    MOSTRAR
}
