import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//Leandro Felix Nunes e João Marcos Teles
public class StudentForm extends JFrame {
   
    private JTextField nameField;
    private JTextField idadeField;
    private JTextField enderecoField;
    private List<Aluno> students;


    public StudentForm() {
        students = new ArrayList<>();
       
        setLayout(new FlowLayout());
       
        add(new JLabel("Nome:"));
        nameField = new JTextField(20);
        add(nameField);


        add(new JLabel("Idade:"));
        idadeField = new JTextField(20);
        add(idadeField);


        add(new JLabel("Endereco:"));
        enderecoField = new JTextField(20);
        add(enderecoField);
       


        JButton okButton = new JButton("Ok");
        okButton.addActionListener(e -> addStudent());
        add(okButton);


        JButton clearButton = new JButton("Limpar");
        clearButton.addActionListener(e -> clearFields());
        add(clearButton);


        JButton showButton = new JButton("Mostrar");
        showButton.addActionListener(e -> showStudents());
        add(showButton);


        JButton exitButton = new JButton("Sair");
        exitButton.addActionListener(e -> System.exit(0));
        add(exitButton);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }


    private void addStudent() {
        String name = nameField.getText();
        UUID id = UUID.randomUUID();
        int idade = Integer.parseInt(idadeField.getText());  
        String endereco = enderecoField.getText();


        students.add(new Aluno(name, idade, endereco, id));




        clearFields();
    }


    private void clearFields() {
        nameField.setText("");
        idadeField.setText("");
        enderecoField.setText("");
    }


    private void showStudents() {
        StringBuilder studentList = new StringBuilder("Lista de Alunos:\n");
        for (Aluno student : students) {
            studentList.append(student.getUuid()).append(" - ").append(student.getNome()).append("\n");
        }
        JOptionPane.showMessageDialog(this, studentList.toString());
    }


    public static void main(String[] args) {
        new StudentForm();
    }
}
