/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
import java.text.*;
import java.awt.*;

/**
 *
 * @author Letícia Guanaes Moreira
 */
public class Exercicio_Cadastro extends JFrame{
    // CRIAÇÃO DE VARIÁVEIS DE INSTANCIA
    //Label dos campos
    JLabel foto, rotulo_a, rotulo_b, rotulo_c, rotulo_d, rotulo_e, rotulo_f, rotulo_g, rotulo_h, rotulo_i, rotulo_j, rotulo_k, exibir_resultado, resultado, rotulo_r;

    JRadioButton M, F;
    
    ButtonGroup grupo;
    
    //Campos
    JFormattedTextField g, h, i, j, k;
    
    JTextField  a, b, c, d, f;
    
    //Mascara dos Campos
    MaskFormatter m_g, m_h, m_i, m_j, m_k;
    
    //Botões
    JButton incluir, limpar, sair;
    
    //icone botão
    ImageIcon incluir_icon, limpar_icon, sair_icon;
    
    JComboBox l;
    
    String estados[] = {"Escolha...","Teste um", "Teste dois", "Teste tres", "Teste Quatro"};
    
   // CRIAÇÃO DO MÉTODO CONSTRUTOR
    public Exercicio_Cadastro(){
        // TITULO DA PÁGINA
        super("Cadastro do Cliente");
        
        // CRIAÇÃO DO CONTAINER PARA RECEBER OBJETOS
        Container tela = getContentPane();

        // SERVE PARA AUTORIZAR O USO DO setBounds E DOS OBJETOS - PRECISA ESTAR NULL
        setLayout(null);
        
        // Não redimencionar a tela
        setResizable(false);
        
        // Definindo o título da janela
        JLabel titleLabel = new JLabel("Cadastro do Cliente", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 23));
        titleLabel.setForeground(new Color(225,0,127));
        titleLabel.setBounds(35, 0, 450, 70);
        tela.add(titleLabel);
        
        // Icone da janela 
        ImageIcon icone = new ImageIcon("perfil.png");
        setIconImage(icone.getImage());
        
        // Definindo o Subtítulo da janela
        JLabel subLabel = new JLabel("Preencha os campos abaixo:", SwingConstants.CENTER);
        subLabel.setFont(new Font("Serif", Font.BOLD, 23));
        subLabel.setForeground(new Color(182,149,192));
        subLabel.setBounds(35, 35, 450, 70);
        tela.add(subLabel);
        
        // Fotos
        // Principal
        ImageIcon foto_aluno = new ImageIcon("cadastro.png");
        foto = new JLabel (foto_aluno);
        foto.setBounds(370,50,200,210);
        foto.setVisible(true);
        tela.add(foto);
 
        // JRadio
        M = new JRadioButton ("Masculino");
        F = new JRadioButton ("Feminino");
        M.setBounds (50, 510, 120, 20) ; 
        F. setBounds (50, 530, 120, 20) ; 
        
        grupo = new ButtonGroup ();
        grupo.add (M);
        grupo.add (F);
        
        tela.add(M);
        tela.add(F);
        
        // Adicionando Nomes aos Label's
        rotulo_a = new JLabel ("* Id:");
        rotulo_b = new JLabel("* Nome Empresa:");
        rotulo_c = new JLabel ("* Endereço:");
        rotulo_d = new JLabel ("* Municipio:");
        rotulo_e = new JLabel ("* Pesquisar:");
        rotulo_f = new JLabel ("* Cidade: ");
        rotulo_g = new JLabel ("* CEP:");
        rotulo_h = new JLabel ("* Celular:");
        rotulo_i = new JLabel ("* Telefone:");
        rotulo_j = new JLabel ("* Cnpj:");
        rotulo_k = new JLabel ("* Cpf:");
        rotulo_r = new JLabel ("* Gênero:");
        
        // Mudando a Fonte
        rotulo_a.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_b.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_c.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_d.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_e.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_f.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_g.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_h.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_i.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_j.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_k.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_r.setFont(new Font("Serif", Font.BOLD, 17));
       
        // Campos
        a = new JTextField ();
        b = new JTextField ();
        c = new JTextField ();
        d = new JTextField ();
        f = new JTextField ();
 
        l = new JComboBox (estados);
        // Definindo as Mascaras dos Campos
        try{
            m_g = new MaskFormatter (" #####-###");
            m_h = new MaskFormatter ("+55 (##) #####-####");
            m_i = new MaskFormatter ("(##)###-####");
            m_j = new MaskFormatter ("##.###.###/####-##");
            m_k = new MaskFormatter ("###.###.###-##");
            m_g.setPlaceholderCharacter('_');
            m_h.setPlaceholderCharacter('_');
            m_i.setPlaceholderCharacter('_');
            m_j.setPlaceholderCharacter('_');
            m_k.setPlaceholderCharacter('_');
        }
        catch(ParseException excp){}
        
        // Adicinando as Mascaras aos Campos
        g = new JFormattedTextField (m_g);
        h = new JFormattedTextField (m_h);
        i = new JFormattedTextField (m_i);
        j = new JFormattedTextField (m_j);
        k = new JFormattedTextField (m_k);
        
        // Posicionando os Elementos
        // Rótulos
        rotulo_a.setBounds(50, 103, 350, 30);
        rotulo_b.setBounds(170, 103, 150, 25);
        rotulo_c.setBounds(50, 163, 170, 25);
        rotulo_d.setBounds(50, 290, 210, 25);
        rotulo_e.setBounds(300, 227, 150, 25);
        rotulo_f.setBounds(175, 227, 150, 25);
        rotulo_g.setBounds(50, 227, 150, 25);
        rotulo_h.setBounds(50, 357, 210, 25);
        rotulo_i.setBounds(300, 357, 210, 25);
        rotulo_j.setBounds(50, 420, 300, 25);
        rotulo_k.setBounds(300, 420, 150, 25);
        rotulo_r. setBounds (50, 485, 120, 20); 
        
        // Campos
        a.setBounds(50, 133, 100, 25);
        b.setBounds(170, 133, 200, 25);
        c.setBounds(50, 193, 320, 25);
        d.setBounds(50, 317, 460, 25);
        l.setBounds(300, 253, 200, 25);
        f.setBounds(175, 253, 100, 25);
        g.setBounds(50, 253, 100, 25);
        h.setBounds(50, 383, 210, 25);
        i.setBounds(300, 383, 210, 25);
        j.setBounds(50, 450, 215, 25);
        k.setBounds(300, 450, 210, 25);
        
        // Adicionando Cor as Mascaras
        g.setForeground(new Color(225,0,127));
        h.setForeground(new Color(225,0,127));
        i.setForeground(new Color(225,0,127));
        j.setForeground(new Color(225,0,127));
        k.setForeground(new Color(225,0,127));
        
        // Icone dos botões
        incluir_icon = new ImageIcon("incluir.png");
        limpar_icon = new ImageIcon("limpar_icon.png");
        sair_icon = new ImageIcon("sair_icon.png");
        
        // Botões
        incluir = new JButton("Apresentar", incluir_icon);
        limpar = new JButton("Limpar", limpar_icon);
        sair = new JButton("Sair", sair_icon);

        // Posicionando os Botões na Tela
        incluir.setBounds(90, 570, 110, 25);
        limpar.setBounds(210, 570, 110, 25);
        sair.setBounds(330, 570, 100, 25);
        
        // Adicionando Cor aos Botões
        incluir.setBackground(Color.WHITE);
        limpar.setBackground(Color.WHITE);
        sair.setBackground(Color.WHITE);
        
        // Exibindo os Resultados 
        resultado = new JLabel(" ");
        
        // Mudando a fonte dos resultados 
        resultado.setFont(new Font("Serif", Font.CENTER_BASELINE, 17));
        
        // Posicionando os Resultados na Tela
        resultado.setBounds(50, 290, 300, 20);
        
        // Ações que o programa fará
        incluir.addActionListener(
               new ActionListener () {
                   public void actionPerformed (ActionEvent e) {
                       // RECEBIMENTO E CRIAÇÃO DE VARIÁVEIS
                       String nome = b.getText();
                       String endereco = c.getText();
                       String bairro = d.getText();
                       String cidade = f.getText();
                       String estado = (String) l.getSelectedItem();
                       String cep = g.getText();
                       String celular = h.getText();
                       String telefone = i.getText();
                       String data_nascimento = j.getText();
                       String data_cadastro = k.getText();
                   
                       // Exibição
                       if (M.isSelected() == true){
                       JOptionPane.showMessageDialog(null, "Cadastro do cliente:\n "
                       + "Nome Completo: "+nome
                       +"\n Endereço: "+endereco
                       +"\n CEP:"+cep
                       +"\n Bairro: "+bairro
                       +"\n Cidade: "+cidade
                       +"\n Estado: "+estado
                       +"\n Celular: "+celular
                       +"\n Telefone: "+telefone
                       +"\n CNPJ: "+data_nascimento
                       +"\n CPF: "+data_cadastro
                       +"\n Gênero: "+M.getText());
                       }
                      if (F.isSelected() == true){
                       JOptionPane.showMessageDialog(null, "Cadastro do cliente:\n "
                       + "Nome Completo: "+nome
                       +"\n Endereço: "+endereco
                       +"\n CEP:"+cep
                       +"\n Bairro: "+bairro
                       +"\n Cidade: "+cidade
                       +"\n Estado: "+estado
                       +"\n Celular: "+celular
                       +"\n Telefone: "+telefone
                       +"\n Data de Nascimento: "+data_nascimento
                       +"\n Data de Cadastro: "+data_cadastro
                       +"\n Gênero: "+F.getText());
                       }
                   }
               }
        );
            // Método para o botão de Limpar Campos
            limpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                //Para limpar os Campos
                a.setText(null);
                b.setText(null);
                c.setText(null);
                d.setText(null);
                f.setText(null);
                g.setText(null);
                h.setText(null);
                i.setText(null);
                j.setText(null);
                k.setText(null);
                l.setSelectedIndex(0);
            }
        });
            
            // Método para o botão Sair
            sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
   
        // Adicionando na Tela
        tela.add(rotulo_a);
        tela.add(rotulo_b);
        tela.add(rotulo_c);
        tela.add(rotulo_d);
        tela.add(rotulo_e);
        tela.add(rotulo_f);
        tela.add(rotulo_g);
        tela.add(rotulo_h);
        tela.add(rotulo_i);
        tela.add(rotulo_j);
        tela.add(rotulo_k);
        tela.add(rotulo_r);
        tela.add(a);
        tela.add(b);
        tela.add(c);
        tela.add(d);
        tela.add(l);
        tela.add(f);
        tela.add(g);
        tela.add(h);
        tela.add(i);
        tela.add(j);
        tela.add(k);
        tela.add(limpar);
        tela.add(sair);
        tela.add(incluir);
        tela.add(resultado);
        
        // Tela
        setSize(580,680);
        setVisible(true);
        setLocationRelativeTo(null); 
   }
     public static void main(String[] args) {
        // INSTANCIAMENTO DA CLASSE 
        Exercicio_Cadastro start = new Exercicio_Cadastro();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 