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
public class Exercicio_Formulario extends JFrame{
    // CRIAÇÃO DE VARIÁVEIS DE INSTANCIA
    //Label dos campos
    JLabel foto, rotulo_a, rotulo_b, rotulo_c, rotulo_d, rotulo_f, rotulo_g, rotulo_j, rotulo_k,rotulo_m, exibir_resultado, resultado;

    //Campos
    JFormattedTextField g, j, k;
    
    JTextField  a, b, c, d, f,m, z;
    
    //Mascara dos Campos
    MaskFormatter m_g, m_j, m_k;
    
    //Botões
    JButton incluir, limpar, sair;
    
    //icone botão
    ImageIcon incluir_icon, limpar_icon, sair_icon;

   // CRIAÇÃO DO MÉTODO CONSTRUTOR
    public Exercicio_Formulario(){
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
 
        // Adicionando Nomes aos Label's
        rotulo_a = new JLabel ("* Código:");
        rotulo_b = new JLabel("* Nome Completo:");
        rotulo_c = new JLabel ("* Bairro:");
        rotulo_d = new JLabel ("* Logadouro:");
        rotulo_f = new JLabel ("* Cidade: ");
        rotulo_g = new JLabel ("* Estado:");
        rotulo_m = new JLabel ("* Complemento:");
        
        // Mudando a Fonte
        rotulo_a.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_b.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_c.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_d.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_f.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_g.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_m.setFont(new Font("Serif", Font.BOLD, 17));
       
        // Campos
        a = new JTextField ();
        b = new JTextField ();
        c = new JTextField ();
        d = new JTextField ();
        f = new JTextField ();
        m = new JTextField ();
        z = new JTextField ();

        // Definindo as Mascaras dos Campos
        try{
            m_g = new MaskFormatter ("##");
            m_j = new MaskFormatter ("##/##/####");
            m_k = new MaskFormatter ("##/##/####");
            m_g.setPlaceholderCharacter('_');
           
        }
        catch(ParseException excp){}
        
        // Adicinando as Mascaras aos Campos
        g = new JFormattedTextField (m_g);
        
        // Posicionando os Elementos
        // Rótulos
        rotulo_a.setBounds(50, 103, 350, 30);
        rotulo_b.setBounds(170, 103, 150, 25);
        rotulo_c.setBounds(50, 163, 170, 25);
        rotulo_d.setBounds(50, 290, 210, 25);
        rotulo_f.setBounds(290, 223, 150, 25);
        rotulo_g.setBounds(50, 227, 150, 25);
        rotulo_m.setBounds(290, 290, 150, 25);
        
        // Campos
        a.setBounds(50, 133, 100, 25);
        b.setBounds(170, 133, 200, 25);
        c.setBounds(50, 193, 320, 25);
        d.setBounds(50, 317, 200, 25);
        f.setBounds(290, 253, 200, 25);
        z.setBounds(50, 253, 200, 25);
        m.setBounds(290, 317, 210, 25);
        
        // Adicionando Cor as Mascaras
        g.setForeground(new Color(225,0,127));
       
        
        // Icone dos botões
        incluir_icon = new ImageIcon("incluir.png");
        limpar_icon = new ImageIcon("limpar_icon.png");
        sair_icon = new ImageIcon("sair_icon.png");
        
        // Botões
        incluir = new JButton("Consultar", incluir_icon);
        limpar = new JButton("Limpar", limpar_icon);
        sair = new JButton("Sair", sair_icon);

        // Posicionando os Botões na Tela
        incluir.setBounds(90, 370, 110, 25);
        limpar.setBounds(210, 370, 110, 25);
        sair.setBounds(330, 370, 100, 25);
        
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
                       String cep = z.getText();
                       String complemento = m.getText();
                   
                       // Exibição
                       JOptionPane.showMessageDialog(null, "Cadastro do cliente:\n "
                       + "Nome Completo: "+nome
                       +"\n Estado:  "+cidade
                       +"\n Cidade:"+cep
                       +"\n Bairro:"+endereco
                       +"\n Logadouro:"+bairro
                       +"\n Complemento: "+complemento);
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

                m.setText(null);
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
        tela.add(rotulo_f);
        tela.add(rotulo_g);
        tela.add(rotulo_m);
        tela.add(a);
        tela.add(b);
        tela.add(c);
        tela.add(d);
        tela.add(f);
        tela.add(g);
        tela.add(z);
        tela.add(m);
        tela.add(limpar);
        tela.add(sair);
        tela.add(incluir);
        tela.add(resultado);
        
        // Tela
        setSize(580,500);
        setVisible(true);
        setLocationRelativeTo(null); 
   }
     public static void main(String[] args) {
        // INSTANCIAMENTO DA CLASSE 
        Exercicio_Formulario start = new Exercicio_Formulario();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 